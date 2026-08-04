#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Pro Pilkki 2 - Ice Fishing (Procyon Products / com.procyon.propilkki)."""

import os
import re

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import Paragraph, SimpleDocTemplate, Spacer, Table, TableStyle

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS_MD = os.path.join(BASE, "domain_checks.md")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20, spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12.5, leading=16, spaceBefore=12, spaceAfter=6, textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.3, leading=13.4, alignment=TA_LEFT, spaceAfter=5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")

DOMAIN_ORDER = [
    "178.128.137.111",
    "config.ru",
    "kalassa.net",
    "propilkki.fi",
]

DOMAIN_NOTES = {
    "178.128.137.111": (
        "Этот адрес зашит в нативной библиотеке игры как запасной сервер списка "
        "сетевых хостов (P2_hostlist.php). С него игра берёт перечень комнат "
        "для мультиплеера, а не рекламную страницу. На вид это инфраструктура "
        "самого Pro Pilkki 2: страница с Host List / Network records и ссылкой "
        "на скачивание, без подмены на оффер."
    ),
    "config.ru": (
        "В пайплайне строка попала как «домен», но в приложении это не сетевой "
        "хост: в splits0.xml так называется языковой сплит Android App Bundle "
        "для русского (ключ language=ru → split=config.ru). Отдельного обращения "
        "к сайту config.ru в коде нет. Проверка VirusTotal по этому имени дала "
        "0/91, страница по таймауту не открылась — для клоаки это ложное срабатывание."
    ),
    "kalassa.net": (
        "Финский рыболовный сайт Kalassa.net; в игре на него ведут ссылки доната "
        "(lahjoitus / in-english/donate) и картинки меню kalassa_net.pcx. Это "
        "партнёрский/информационный ресурс вокруг Pro Pilkki, не gate для оффера. "
        "Пять движков VirusTotal пометили домен как malicious/phishing, но живая "
        "страница отдаёт обычный рыболовный портал без редиректа на казино."
    ),
    "propilkki.fi": (
        "Официальный сайт разработчика Procyon Products. Из нативного кода игра "
        "открывает отсюда лицензии, release notes, список хостов, рекорды и "
        "картинки озёр. VirusTotal: 0/91, без редиректа, контент совпадает с "
        "домашней страницей Pro Pilkki 2. Для схемы «оффер vs белая версия» "
        "не используется."
    ),
}


def esc(text):
    return str(text).replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append(
            [
                Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B),
                Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B),
            ]
        )
    for k, v in rows:
        data.append([Paragraph(esc(k), CELL_B), Paragraph(esc(v), CELL)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 5),
        ("RIGHTPADDING", (0, 0), (-1, -1), 5),
        ("TOPPADDING", (0, 0), (-1, -1), 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 3),
    ]
    if header:
        style += [("BACKGROUND", (0, 0), (-1, 0), HEAD_BG)]
        start = 1
    else:
        start = 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


def parse_domain_checks_md(path):
    text = open(path, encoding="utf-8").read()
    parts = re.split(r"(?m)^## Проверка домена:\s*", text)
    domains = []
    for part in parts[1:]:
        lines = part.strip().splitlines()
        domain = lines[0].strip()
        rows = []
        for line in lines:
            m = re.match(r"^\|\s*(.*?)\s*\|\s*(.*?)\s*\|$", line)
            if not m:
                continue
            k, v = m.group(1).strip(), m.group(2).strip()
            if k.startswith("---") or k in ("Параметр / движок",):
                continue
            rows.append((k, v))
        domains.append((domain, rows))
    return domains


def main():
    permissions = (
        "android.permission.INTERNET, android.permission.VIBRATE, "
        "com.android.vending.BILLING, android.permission.REORDER_TASKS, "
        "com.procyon.propilkki.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
        "android.permission.ACCESS_NETWORK_STATE"
    )

    libraries = (
        "androidx.activity 1.2.3, androidx.core 1.16.0 (+ktx, viewtree), "
        "androidx.fragment 1.1.0, androidx.lifecycle, androidx.loader 1.0.0, "
        "androidx.customview 1.0.0, androidx.viewpager 1.0.0, "
        "androidx.savedstate 1.2.1, androidx.startup 1.1.1, "
        "androidx.profileinstaller 1.3.0, androidx.tracing 1.2.0, "
        "androidx.arch.core, androidx.interpolator 1.0.0, "
        "androidx.annotation-experimental 1.4.1, "
        "Google Play Billing Library 7.1.1, "
        "Google Play Services (base/common/tasks/auth/games scopes, datatransport/cct), "
        "firebase-encoders (json/proto, транзитивно), "
        "Kotlin 1.8.22 + kotlinx-coroutines 1.7.1, "
        "native liblib_main.so (NativeActivity / C++ game engine)"
    )

    sdk_rows = [
        ("Название приложения", "Pro Pilkki 2 - Ice Fishing"),
        ("Android Gradle Plugin", "8.11.0"),
        ("minSdk", "23"),
        ("targetSdk", "36"),
        ("Kotlin", "да 1.8.22"),
        ("Web View", "нет"),
        ("Custom Tabs", "нет"),
        ("Рекламные сети", "нет"),
        ("Аналитика", "нет"),
        ("Permissions", permissions),
        ("Libraries", libraries),
        (
            "Подозрительные домены",
            "178.128.137.111, config.ru, kalassa.net, propilkki.fi",
        ),
        ("SharedPreferences", "нет"),
        ("Есть ли клоака", "нет"),
        ("Подозрительные слова", "bot, offer, redirect, license check"),
    ]

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=14 * mm,
        rightMargin=14 * mm,
        topMargin=14 * mm,
        bottomMargin=14 * mm,
        title="Отчёт по анализу APK — Pro Pilkki 2 - Ice Fishing",
        author="Анализ Android APK",
    )
    story = []
    story.append(Paragraph("SDK / стек", H1))
    story.append(kv_table(sdk_rows, header=("Параметр", "Значение")))

    domain_tables = parse_domain_checks_md(CHECKS_MD)
    by_name = {d: rows for d, rows in domain_tables}
    for domain in DOMAIN_ORDER:
        if domain not in by_name:
            continue
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(
            kv_table(
                by_name[domain],
                widths=(62 * mm, 108 * mm),
                header=("Параметр / движок", "Значение / вердикт"),
            )
        )
        note = DOMAIN_NOTES.get(domain)
        if note:
            story.append(Paragraph(esc(note), BODY))
        story.append(Spacer(1, 2 * mm))

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
