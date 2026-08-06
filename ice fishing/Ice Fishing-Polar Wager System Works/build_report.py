#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Ice Fishing / Corsair's Ledger (Polar Wager System Works / com.combinations.spin.balbi)."""

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
        "com.combinations.spin.balbi.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
        "com.android.vending.CHECK_LICENSE"
    )

    libraries = (
        "Kotlin 2.1+ / kotlin-stdlib (в т.ч. concurrent.atomics builtins), "
        "kotlinx-coroutines 1.9.0, "
        "Jetpack Compose (ui/runtime/foundation/animation/material-ripple 1.10.4–1.11.0, "
        "material3 1.4.0), "
        "AndroidX (activity/activity-compose/activity-ktx 1.13.0, core/core-ktx 1.19.0, "
        "lifecycle 2.11.0, navigation 2.9.5, navigationevent 1.0.0, "
        "datastore/datastore-preferences 1.1.7, room 2.8.4, sqlite 2.6.2, "
        "emoji2 1.4.0, fragment 1.5.1, profileinstaller 1.4.0, savedstate 1.4.0, "
        "startup 1.1.1, window 1.5.0, hilt-navigation-compose 1.2.0), "
        "Hilt / Dagger 2.60.1, "
        "Google Play PairIP licensecheck (com.pairip.application / com.pairip.licensecheck), "
        "libandroidx.graphics.path.so, libdatastore_shared_counter.so"
    )

    sdk_rows = [
        ("Название приложения", "Ice Fishing (в самом приложении: Corsair's Ledger)"),
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
        ("Подозрительные домены", "config.ru, dispatchers.io, lineheightstyle.alignment.top"),
        (
            "SharedPreferences",
            "DataStore Preferences settings.preferences_pb — локальные настройки игры; "
            "прогресс в Room (corsair_ledger.db)",
        ),
        ("Есть ли клоака", "нет"),
        ("Подозрительные слова", "offer, redirect, slots, license check"),
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
                "а как имя языкового сплита Google Play (русский язык): в splits0.xml есть "
                "запись split=\"config.ru\". Разрешения INTERNET в манифесте нет, "
                "встроенного окна сайта и сетевых клиентов тоже нет — приложение этот хост "
                "не открывает."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "По готовой проверке VirusTotal домен без вредоносных срабатываний (0/91), "
                "редиректа нет, страница по таймауту не открылась, регистратор — "
                "RU-CENTER-RU. Для этой сборки это ложное срабатывание пайплайна по имени "
                "сплита."
            ),
            BODY,
        )
    )

    story.append(Paragraph(esc("dispatchers.io"), H2))
    story.append(
        Paragraph(
            esc(
                "Строка dispatchers.io появилась из служебного текста библиотеки Kotlin "
                "Coroutines — «Dispatchers.IO» (пул фоновых задач). Это не адрес сайта и не "
                "сетевой запрос: WebView, Custom Tabs, HttpURLConnection и OkHttp в сборке "
                "отсутствуют, разрешения на интернет нет."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "VirusTotal по готовой проверке показывает 6/91 (часть движков помечает "
                "домен как вредоносный), но редиректа нет и страница не открылась по "
                "таймауту. В контексте этой APK запись относится к ложному совпадению "
                "строки, а не к реальному хосту оффера."
            ),
            BODY,
        )
    )

    story.append(Paragraph(esc("lineheightstyle.alignment.top"), H2))
    story.append(
        Paragraph(
            esc(
                "Строка lineheightstyle.alignment.top взята из имени класса оформления "
                "текста Jetpack Compose — LineHeightStyle.Alignment.Top. Это настройка "
                "высоты строк в интерфейсе, а не домен и не удалённый адрес: приложение "
                "ничего с такого хоста не загружает."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "По готовой проверке детекции 0/91, DNS не резолвится, редиректа нет, "
                "данных о парковке нет. Для отчёта это ложное срабатывание пайплайна по "
                "имени класса Compose."
            ),
            BODY,
        )
    )

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=14 * mm,
        rightMargin=14 * mm,
        topMargin=12 * mm,
        bottomMargin=12 * mm,
        title="Ice Fishing — Polar Wager System Works — APK report",
    )
    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
