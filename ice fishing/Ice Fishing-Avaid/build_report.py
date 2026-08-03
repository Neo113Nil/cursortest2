#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Chicken Coin Winner (Lombok Silicon Island / com.emeraldpulse.kyra)."""

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
        ("Название приложения", "Chicken Coin Winner"),
        ("Android Gradle Plugin", "8.13.1"),
        ("minSdk", "23"),
        ("targetSdk", "36"),
        ("Kotlin", "да 2.1.20"),
        ("Web View", "да"),
        ("Custom Tabs", "нет"),
        ("Рекламные сети", "нет"),
        ("Аналитика", "нет"),
        (
            "Permissions",
            "android.permission.INTERNET, android.permission.ACCESS_NETWORK_STATE, "
            "com.emeraldpulse.kyra.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
            "com.android.vending.CHECK_LICENSE",
        ),
        (
            "Libraries",
            "Jetpack Compose (ui/foundation/material3/runtime/animation), "
            "androidx.activity, androidx.lifecycle, androidx.core, androidx.window, "
            "androidx.profileinstaller, androidx.startup, kotlinx.coroutines, "
            "com.createyourself.policy, com.pairip (Play licensing), "
            "com.google.common.util.concurrent",
        ),
        ("Подозрительные домены", "emamaldpulse.pro, config.ru"),
        (
            "SharedPreferences",
            "create_yourself_policy (ключ policy_decision: accept/decline); "
            "emerald_pulse_home_store (rooms, supplies, fixes, costs — данные белого экрана)",
        ),
        ("Есть ли клоака", "да"),
        (
            "Подозрительные слова",
            "PolicyGate, policy, accept, decline, CreateYourselfPolicy, bridge, loadUrl, "
            "POLICY_BASE_URL, policy_decision, hasInternetConnection",
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

    domain_tables = parse_domain_checks_md(CHECKS_MD)
    for domain, rows in domain_tables:
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(kv_table(rows, header=("Параметр / движок", "Значение / вердикт")))

    story.append(Paragraph("Какие данные собираются", H2))
    bullets = [
        "строка браузера встроенного окна сайта → как система Android представляется сайту "
        "(обычно содержит версию Android и модель телефона); уходит при открытии страницы проверки",
        "язык телефона → язык из настроек системы; встроенное окно сайта передаёт его в заголовках "
        "запроса, и сервер может по языку решать, что показать",
        "сетевой адрес телефона → адрес, с которого человек выходит в интернет; его видит сервер "
        "при загрузке страницы и может использовать для географии",
        "файлы cookie → небольшие служебные пометки сайта в памяти встроенного окна; "
        "приложение специально разрешает сторонние cookie в режиме совместимости",
        "факт наличия интернета → приложение само проверяет, есть ли сеть, перед показом страницы",
        "признак отладочной сборки → служебный флаг «это тестовая версия»; если он включён, "
        "проверка политики пропускается и сразу открывается обычное приложение",
        "решение по политике (принять / отклонить) → результат, который страница присылает "
        "в приложение и который потом хранится на телефоне",
        "имя пакета приложения → техническое имя com.emeraldpulse.kyra видно системе и "
        "в объявлении глубокой ссылки на emamaldpulse.pro",
    ]
    for b in bullets:
        story.append(Paragraph("• " + esc(b), BULLET))

    story.append(Paragraph("Как собираются", H2))
    story.append(
        Paragraph(
            esc(
                "Сразу при запуске открывается главный экран, и вокруг обычного содержимого "
                "встаёт «ворота политики» (PolicyGate). Отдельного окна с разрешением нет: "
                "приложение само смотрит, есть ли интернет, читает из памяти прошлое решение "
                "accept/decline и проверяет, не стоит ли отладочный флаг. Человек этого обычно "
                "не замечает — на экране либо сразу обычное приложение, либо встроенное окно сайта."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Если решение ещё не принято и сеть есть, приложение поднимает встроенное окно "
                "сайта и открывает страницу проверки. Строка браузера, язык и cookie уходят "
                "сами при загрузке этой страницы — нативный код не собирает отдельный список "
                "полей вручную и не спрашивает рекламный номер устройства. Результат "
                "«принять» или «отклонить» приходит из страницы через мост CreateYourselfPolicy "
                "и записывается в память приложения."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Куда отправляются", H2))
    story.append(
        Paragraph(
            esc(
                "Запрос уходит на точный адрес https://emamaldpulse.pro/policy — это константа "
                "POLICY_BASE_URL в коде. Тот же хост emamaldpulse.pro прописан в объявлении "
                "приложения как адрес глубокой ссылки. Запасного адреса в коде нет: если ссылку "
                "не передали, запасной вариант — показать встроенный HTML «политики» с тем же "
                "базовым адресом, но в этой сборке при запуске как раз передают удалённый url."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Открытие идёт тихо для человека: это не баннер рекламной сети, а полноэкранное "
                "встроенное окно сайта до доступа к обычному приложению. Адрес проверки в коде "
                "зашит целиком, из кусков его не собирают. Решение accept/decline сохраняют "
                "локально в файле настроек create_yourself_policy."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(
        Paragraph(
            esc(
                "В самом приложении на телефоне нет жёсткого списка стран, языков или «ботов». "
                "Видно только отправку признаков через обычную загрузку страницы (язык, строка "
                "браузера со сведениями об устройстве, сетевой адрес на стороне сервера, cookie) "
                "и локальные развилки: нет интернета — экран «Policy unavailable»; отладочная "
                "сборка или уже сохранённый accept — сразу обычное приложение."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Кому показать рекламную страницу внутри того же окна, а кому — кнопки "
                "«принять / отклонить» политики, решает удалённый сайт emamaldpulse.pro: "
                "приложение лишь открывает адрес и ждёт сообщение accept или decline. "
                "Точных правил фильтрации на телефоне в коде нет — решение «кого пустить» "
                "делает сервер по тому, что видит в запросе встроенного окна."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Что возвращается", H2))
    story.append(
        Paragraph(
            esc(
                "Со стороны сайта в приложение приходит короткое текстовое сообщение через "
                "мост CreateYourselfPolicy: «accept» или «decline» (регистр не важен). "
                "Если пришло accept — решение записывают как Accepted и считают, что можно "
                "показать обычное приложение. Если decline — пишут Declined; обычное приложение "
                "при этом не открывают, и при следующем запуске снова показывают окно сайта."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Отдельного поля «ссылка/оффер» в нативном разборе ответа нет: содержимое "
                "боевой страницы рисуется внутри того же встроенного окна (сайт может "
                "открывать новые окна и http/https-адреса). Для «белого» сценария достаточно "
                "сигнала accept. Если страница не загрузилась из‑за отсутствия сети, человеку "
                "показывают экран «Policy unavailable» с предложением подключиться и повторить."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(
        Paragraph(
            esc(
                "Пока решения accept нет, на весь экран открывается встроенное окно сайта "
                "с адресом https://emamaldpulse.pro/policy. Внешний браузер телефона для этой "
                "схемы не используется. Внутри окна сайт может показать свою «политику» "
                "с кнопками или другое содержимое (в проверке домена со сканера видна страница "
                "Policy / Privacy). Новые окна и переходы по ссылкам остаются во встроенном "
                "просмотрщике: для этого включены JavaScript, несколько окон и cookie."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Если страница прислала accept (или это отладочная сборка / решение уже "
                "сохранено раньше), человеку просто остаётся обычное приложение — без перехода "
                "на внешнюю страницу. Если пришло decline или решение ещё не принято, "
                "обычное приложение не показывают и снова держат встроенное окно сайта."
            ),
            BODY,
        )
    )

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
