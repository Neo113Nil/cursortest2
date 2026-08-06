#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Ice Fishing / Xenoloop (FILTO TOV / com.combinations.level.experts)."""

import os
import re

from reportlab.lib import colors
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import Paragraph, SimpleDocTemplate, Spacer, Table, TableStyle

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
DOMAIN_MD = os.path.join(BASE, "domain_checks.md")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20, spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12, leading=16, spaceBefore=10, spaceAfter=6, textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.2, leading=13, spaceAfter=6)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


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


def parse_domain_checks(path):
    text = open(path, encoding="utf-8").read()
    sections = re.split(r"\n## Проверка домена:\s*", text)
    out = []
    for sec in sections[1:]:
        lines = sec.strip().splitlines()
        domain = lines[0].strip()
        rows = []
        for line in lines:
            m = re.match(r"^\|\s*(.*?)\s*\|\s*(.*?)\s*\|$", line)
            if not m:
                continue
            k, v = m.group(1).strip(), m.group(2).strip()
            if k in ("Параметр / движок", "---") or set(k) <= {"-"}:
                continue
            rows.append((k, v))
        out.append((domain, rows))
    return out


def main():
    permissions = (
        "android.permission.VIBRATE, "
        "com.combinations.level.experts.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
        "com.android.vending.CHECK_LICENSE"
    )

    libraries = (
        "Kotlin 2.1+ / kotlin-stdlib (в т.ч. concurrent.atomics builtins), "
        "kotlinx-coroutines 1.9.0, "
        "Jetpack Compose (ui/foundation/animation/runtime/material-ripple 1.11.4, "
        "material3 1.4.0, material-icons-core 1.7.8), "
        "AndroidX (activity/activity-compose/activity-ktx 1.13.0, appcompat 1.7.1, "
        "core/core-ktx 1.19.0, datastore/datastore-preferences 1.2.1, emoji2 1.4.0, "
        "fragment 1.8.9, lifecycle 2.11.0, navigation 2.9.8, navigationevent 1.0.0, "
        "profileinstaller 1.4.0, savedstate 1.4.0, startup 1.1.1, window 1.5.0, "
        "graphics-path, vectordrawable, transition, tracing), "
        "Koin (DI), "
        "Google Play PairIP licensecheck (com.pairip.application / com.pairip.licensecheck), "
        "libandroidx.graphics.path.so, libdatastore_shared_counter.so"
    )

    sdk_rows = [
        ("Название приложения", "Ice Fishing"),
        ("Android Gradle Plugin", "9.2.1"),
        ("minSdk", "32"),
        ("targetSdk", "36"),
        ("Kotlin", "да, 2.1+"),
        ("Web View", "нет"),
        ("Custom Tabs", "нет"),
        ("Рекламные сети", "нет"),
        ("Аналитика", "нет"),
        ("Permissions", permissions),
        ("Libraries", libraries),
        ("Подозрительные домены", "config.ru"),
        (
            "SharedPreferences",
            "не SharedPreferences API; AndroidX DataStore Preferences "
            "(файл datastore/xenoloop.preferences_pb) — прогресс кампании "
            "(результаты уровней/звёзды, подсказки-сканы) и настройки "
            "(вибрация, анимация поворота, таймер)",
        ),
        ("Есть ли клоака", "нет"),
        ("Подозрительные слова", "license check"),
    ]

    story = []
    story.append(Paragraph("SDK / стек", H1))
    story.append(kv_table(sdk_rows, header=("Параметр", "Значение")))
    story.append(Spacer(1, 8))

    for domain, rows in parse_domain_checks(DOMAIN_MD):
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(kv_table(rows, header=("Параметр / движок", "Значение / вердикт")))
        story.append(Spacer(1, 6))

    story.append(Paragraph(esc("config.ru"), H2))
    story.append(
        Paragraph(
            esc(
                "Строка config.ru попала в проверку не как адрес сайта из сетевого кода, "
                "а как имя языкового сплита Google Play (русский язык): в манифесте сплитов "
                "есть запись split=\"config.ru\". Приложение не открывает этот хост и вообще "
                "не запрашивает разрешение на интернет."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "По готовой проверке VirusTotal домен без вредоносных срабатываний (0/91), "
                "редиректа нет, страница по таймауту не открылась, регистратор указан как "
                "RU-CENTER-RU. Для этой сборки это ложное срабатывание пайплайна по имени "
                "сплита, а не рабочий «гейт» или рекламный лендинг."
            ),
            BODY,
        )
    )

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=14 * mm,
        rightMargin=14 * mm,
        topMargin=14 * mm,
        bottomMargin=14 * mm,
        title="Ice Fishing — FILTO TOV — APK report",
    )
    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
