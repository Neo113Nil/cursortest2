#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Ice Fishing / Drizzle Board (Eta Corn Software Inc / com.kolosta.rejin.jilosa)."""

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

SUSPICIOUS_DOMAINS = ["dispatchers.io"]

DOMAIN_NOTES = {
    "dispatchers.io": (
        "В пайплайне строка попала как «домен», но в приложении это не сетевой хост: "
        "в коде Kotlin Coroutines есть служебное имя Dispatchers.IO (пул фоновых задач). "
        "Разрешения на интернет в манифесте нет, обращений к сайту dispatchers.io нет. "
        "VirusTotal помечает сам домен как вредоносный у части движков, но для этой "
        "программы это ложное срабатывание сканера строк, а не используемый адрес."
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
        "com.kolosta.rejin.jilosa.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
        "com.android.vending.CHECK_LICENSE"
    )

    libraries = (
        "Kotlin / kotlinx-coroutines 1.9.0, "
        "AndroidX (appcompat 1.7.1, activity, fragment, core, lifecycle, "
        "navigation 2.9.8, room 2.8.4, recyclerview, constraintlayout, "
        "coordinatorlayout, viewpager2, emoji2, profileinstaller, startup, "
        "sqlite, savedstate, window), "
        "Material Components 1.14.0, "
        "Hilt/Dagger 2.60.1, "
        "Pairip licensecheck (com.pairip.application / licensecheck)"
    )

    sdk_rows = [
        ("Название приложения", "Ice Fishing"),
        ("Android Gradle Plugin", "9.3.1"),
        ("minSdk", "32"),
        ("targetSdk", "37"),
        ("Kotlin", "да, 2.1+"),
        ("Web View", "нет"),
        ("Custom Tabs", "нет"),
        ("Рекламные сети", "нет"),
        ("Аналитика", "нет"),
        ("Permissions", permissions),
        ("Libraries", libraries),
        ("Подозрительные домены", "dispatchers.io"),
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

    domain_tables = parse_domain_checks_md(CHECKS_MD)
    by_name = {d: rows for d, rows in domain_tables}
    for domain in SUSPICIOUS_DOMAINS:
        if domain not in by_name:
            continue
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(
            kv_table(by_name[domain], header=("Параметр / движок", "Значение / вердикт"))
        )
        note = DOMAIN_NOTES.get(domain)
        if note:
            story.append(Spacer(1, 3 * mm))
            story.append(Paragraph(esc(note), BODY))

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
