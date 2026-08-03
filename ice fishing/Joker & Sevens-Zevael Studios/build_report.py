#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Joker & Sevens (Zevael Studios / org.fortheloss.st)."""

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
BULLET = ParagraphStyle("BULLET", fontName="DJ", fontSize=9.3, leading=13.4, leftIndent=10, spaceAfter=3)

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
    sdk_rows = [
        ("Название приложения", "Joker & Sevens"),
        ("Android Gradle Plugin", "8.13.0"),
        ("minSdk", "26"),
        ("targetSdk", "36"),
        ("Kotlin", "да 2.0.21"),
        ("Web View", "да"),
        ("Custom Tabs", "да"),
        ("Рекламные сети", "нет"),
        ("Аналитика", "OneSignal, Firebase Messaging, Firebase Installations"),
        (
            "Permissions",
            "android.permission.INTERNET, com.google.android.gms.permission.AD_ID, "
            "android.permission.POST_NOTIFICATIONS, com.google.android.c2dm.permission.RECEIVE, "
            "com.sonyericsson.home.permission.BROADCAST_BADGE, "
            "android.permission.ACCESS_NETWORK_STATE, com.android.vending.CHECK_LICENSE",
        ),
        (
            "Libraries",
            "Jetpack Compose (ui/foundation/material3/runtime/animation), "
            "androidx.activity, androidx.appcompat, androidx.browser (Custom Tabs), "
            "androidx.core, androidx.lifecycle, androidx.navigation, androidx.room, "
            "androidx.work, androidx.hilt, androidx.startup, androidx.profileinstaller, "
            "kotlinx-coroutines, Hilt/Dagger 2.52, OneSignal 5.1.35, "
            "Firebase Messaging / Installations, Play Services Ads Identifier, "
            "Play Install Referrer, com.pairip.licensecheck",
        ),
        ("Подозрительные домены", "jokerseven.store"),
        (
            "SharedPreferences",
            "overthink (флаг soundless: открыли внешнюю страницу / вернулись в приложение); "
            "Room-таблица stored_uuid (постоянный номер установки); "
            "служебные настройки OneSignal и Firebase Messaging",
        ),
        ("Есть ли клоака", "да"),
        (
            "Подозрительные слова",
            "GoToWeb, GoToGame, alcove, foreboding, blitzed, fickle, overthink, soundless, "
            "utm_source=google-play&utm_medium=organic, install referrer, "
            "app://recede-reconcile, Custom Tabs, jokerseven.store, advertisingTag, "
            "referrerSnippet, SessionInfo",
        ),
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

    # Таблицы проверки доменов: сначала реальный gate, затем готовые проверки пайплайна
    domain_tables = parse_domain_checks_md(CHECKS_MD)
    order = ["jokerseven.store", "config.ru", "dispatchers.io"]
    by_name = {d: rows for d, rows in domain_tables}
    for domain in order:
        if domain not in by_name:
            continue
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(kv_table(by_name[domain], header=("Параметр / движок", "Значение / вердикт")))

    story.append(Paragraph("Какие данные собираются", H2))
    bullets = [
        "номер установки → случайный служебный номер, который приложение само создаёт "
        "при первом запуске и сохраняет в своей базе; по нему сервер отличает одно "
        "установление программы от другого",
        "рекламный номер устройства → уникальный номер телефона для рекламы (тот, "
        "который выдаёт Google); уходит на проверку, чтобы связать устройство с показом",
        "метка установки из магазина → текст «откуда поставили приложение» "
        "(обычная установка из Google Play или рекламная ссылка); по нему отличают "
        "«чистую» установку из магазина от рекламного перехода",
        "признак нового запуска сессии → новый ли это номер установки прямо сейчас "
        "или уже знакомый; от этого зависит, слать ли полный скрытый запрос",
        "адрес страницы после проверки → ссылка вида https://jokerseven.store/ "
        "плюс номер установки; её потом открывают во внешнем окне браузера внутри оболочки "
        "телефона",
    ]
    for b in bullets:
        story.append(Paragraph("• " + esc(b), BULLET))

    story.append(Paragraph("Как собираются", H2))
    story.append(
        Paragraph(
            esc(
                "Сразу после запуска открывается заставка-развилка. Отдельного окна "
                "с разрешением человек не видит: приложение само, в фоне, читает из своей "
                "базы сохранённый номер установки или создаёт новый из текущего времени "
                "и случайных чисел. Параллельно тихо спрашивает у системы Android рекламный "
                "номер устройства и у сервиса Google Play — метку установки "
                "(откуда поставили программу)."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Эти три значения собираются незаметно, без кнопок и без текста на экране. "
                "Человек в этот момент обычно видит только загрузку. Если метка установки "
                "пустая, равна «null» или похожа на обычную установку из Google Play "
                "(utm_source=google-play и utm_medium=organic), полный скрытый запрос "
                "с шифрованием могут не слать — но адрес страницы всё равно собирают."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Куда отправляются", H2))
    story.append(
        Paragraph(
            esc(
                "Тихий запрос уходит на точный адрес https://jokerseven.store/ методом POST. "
                "Адрес в коде спрятан шифрованием и расшифровывается только во время работы. "
                "Тело запроса — одна форма: поле alcove равно длинной зашифрованной строке. "
                "Внутри этой строки лежат номер установки, рекламный номер устройства и метка "
                "установки. Запасного адреса в коде нет."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Запрос уходит в фоне, без показа человеку. Ответ сервера в этой сборке "
                "по сути не разбирают: приложение всё равно склеивает адрес страницы как "
                "https://jokerseven.store/ плюс номер установки и дальше решает по этой "
                "ссылке. Сам номер установки параллельно хранится в базе приложения "
                "и позже используется для входа в OneSignal."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(
        Paragraph(
            esc(
                "На телефоне видно два фильтра. Первый — метка установки из магазина: "
                "если она пустая, «null» или содержит признак обычной установки из Google Play "
                "(utm_source=google-play и utm_medium=organic), полный шифрованный запрос "
                "не отправляют. Второй — «новый ли это номер установки»: повторному запуску "
                "с уже сохранённым номером полный запрос тоже могут не слать."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Отдельного жёсткого списка стран или языков в коде приложения нет. "
                "Дальше решение «кому боевую страницу, кому обычное приложение» по сути "
                "делает сервер на jokerseven.store: приложение открывает персональную ссылку "
                "с номером установки во внешнем окне браузера телефона. Есть ещё короткий путь "
                "через специальную ссылку app://recede-reconcile — она сразу ведёт в обычное "
                "приложение, минуя заставку-проверку."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Что возвращается", H2))
    story.append(
        Paragraph(
            esc(
                "После фоновой проверки состояние заставки становится либо «открыть сайт» "
                "(GoToWeb) со ссылкой https://jokerseven.store/ плюс номер установки, "
                "либо «открыть игру» (GoToGame), если ссылки нет. В рабочем пути код "
                "почти всегда получает ссылку и выбирает режим сайта."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Тело ответа сервера на POST читают, но в этой сборке на развилку экрана "
                "оно почти не влияет: приложение само собирает ссылку из адреса сервера "
                "и номера установки. «Боевой» вариант для схемы — есть ссылка, открываем "
                "внешнюю страницу. «Белый» вариант — ссылки нет или сработала спецссылка "
                "app://recede-reconcile, и человеку остаётся обычное приложение."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(
        Paragraph(
            esc(
                "Если выбран режим сайта, ссылку открывают не во встроенном окне внутри "
                "игры, а во внешнем браузере телефона через Custom Tabs — это оболочка "
                "Chrome/другого браузера поверх приложения. Перед этим могут спросить "
                "разрешение на уведомления и включить OneSignal. В памяти ставится флаг "
                "soundless: «страницу уже открыли»."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Когда человек возвращается из этой внешней страницы обратно в программу, "
                "приложение замечает флаг soundless и само закрывает главный экран. "
                "То есть после показа внешней страницы обычное приложение человеку "
                "уже не оставляют на виду. Если же ответ «белый» (или сработала "
                "спецссылка app://recede-reconcile) — человеку просто остаётся обычное "
                "приложение, без перехода на внешнюю страницу."
            ),
            BODY,
        )
    )

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
