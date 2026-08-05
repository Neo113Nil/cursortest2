#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Ice Fishing / Hybrid TURMAN Watch face (HOPSON ADVISORY LIMITED / com.watchfacestudio.turman)."""

import os

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import Paragraph, SimpleDocTemplate, Table, TableStyle

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20, spaceAfter=8, textColor=colors.HexColor("#12263f"))
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


def main():
    permissions = "com.watchfacestudio.turman.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"

    libraries = (
        "Kotlin 2.0.21 / kotlinx-coroutines 1.9.0, "
        "AndroidX (appcompat 1.7.1, activity 1.8.0, fragment 1.5.4, "
        "core/core-ktx 1.16.0, lifecycle, constraintlayout 2.2.1, "
        "coordinatorlayout 1.1.0, recyclerview 1.2.1, cardview 1.0.0, "
        "viewpager2 1.0.0, emoji2 1.3.0, profileinstaller 1.4.0, "
        "startup 1.1.1, savedstate 1.2.1, transition 1.5.0, "
        "wear-remote-interactions 1.2.0, wear-core 1.0.0), "
        "Material Components 1.14.0, "
        "Google Play services (wearable 20.0.1, base 18.5.0, "
        "basement 18.10.0, tasks 18.2.0)"
    )

    sdk_rows = [
        ("Название приложения", "Ice Fishing"),
        ("Android Gradle Plugin", "8.6.1"),
        ("minSdk", "25"),
        ("targetSdk", "35"),
        ("Kotlin", "да, 2.0.21"),
        ("Web View", "нет"),
        ("Custom Tabs", "нет"),
        ("Рекламные сети", "нет"),
        ("Аналитика", "нет"),
        ("Permissions", permissions),
        ("Libraries", libraries),
        ("Подозрительные домены", "нет"),
        ("SharedPreferences", "нет"),
        ("Есть ли клоака", "нет"),
        ("Подозрительные слова", "нет"),
    ]

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=14 * mm,
        rightMargin=14 * mm,
        topMargin=14 * mm,
        bottomMargin=14 * mm,
    )
    story = []
    story.append(Paragraph("SDK / стек", H1))
    story.append(kv_table(sdk_rows, header=("Параметр", "Значение")))
    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
