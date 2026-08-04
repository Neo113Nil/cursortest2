#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Ice Fishing Deep Catch (Utebaev Askar / com.protoclaw.airfishing)."""

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

SUSPICIOUS_DOMAINS = ["deepaircatch.online"]


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
        "android.permission.INTERNET, "
        "android.permission.ACCESS_NETWORK_STATE, "
        "com.google.android.gms.permission.AD_ID, "
        "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
        "com.samsung.android.mapsagent.permission.READ_APP_INFO, "
        "com.huawei.appmarket.service.commondata.permission.GET_COMMON_DATA, "
        "com.protoclaw.airfishing.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
        "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
        "com.android.vending.CHECK_LICENSE"
    )

    libraries = (
        "AppsFlyer 6.15.2, Play Install Referrer, com.pairip (Play licensing), "
        "androidx.core (+ktx), androidx.lifecycle, androidx.annotation, "
        "androidx.versionedparcelable, androidx.arch.core, androidx.interpolator, "
        "Kotlin stdlib 1.9.10, kotlinx-coroutines"
    )

    sdk_rows = [
        ("Название приложения", "Ice Fishing Deep Catch"),
        ("Android Gradle Plugin", "8.1.4"),
        ("minSdk", "26"),
        ("targetSdk", "35"),
        ("Kotlin", "да 1.9.10"),
        ("Web View", "да"),
        ("Custom Tabs", "нет"),
        ("Рекламные сети", "нет"),
        ("Аналитика", "AppsFlyer 6.15.2, Google Play Install Referrer"),
        ("Permissions", permissions),
        ("Libraries", libraries),
        ("Подозрительные домены", "deepaircatch.online"),
        (
            "SharedPreferences",
            "ac_gs: st_f (флаг «оставить обычное приложение»), dl_v (сохранённая ссылка "
            "после проверки на deepaircatch.online); appsflyer-data (служебные данные AppsFlyer)",
        ),
        ("Есть ли клоака", "да"),
        (
            "Подозрительные слова",
            "deepaircatch.online, shwCntnt, bundle, afid, devkey, referrer, dl_v, st_f, "
            "privacyCanon, loadUrl, NativeActions, accept, play, AppsFlyer, onelink, clickid",
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
    by_name = {d: rows for d, rows in domain_tables}
    for domain in SUSPICIOUS_DOMAINS:
        if domain not in by_name:
            continue
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(kv_table(by_name[domain], header=("Параметр / движок", "Значение / вердикт")))

    story.append(Paragraph("Какие данные собираются", H2))
    bullets = [
        "имя приложения в системе → техническое имя этой программы на телефоне "
        "(com.protoclaw.airfishing); уходит в параметре bundle, чтобы сервер понял, "
        "какое именно приложение открыло страницу проверки",
        "номер установки AppsFlyer → служебный номер этой установки в системе AppsFlyer; "
        "уходит в параметре afid, чтобы отличить одно устройство/установку от другой",
        "ключ разработчика AppsFlyer → секретный ключ приложения в AppsFlyer "
        "(в коде зашит как NNKY5pzzwhMThZnxnTUnCZ); уходит в параметре devkey вместе "
        "с запросом на проверку",
        "метка установки из магазина → текст «откуда поставили программу» "
        "(обычная установка или переход по рекламной ссылке); приложение читает его "
        "через службу Google Play и при наличии добавляет в параметр referrer",
        "строка браузера встроенного окна сайта → как система Android представляется "
        "сайту (обычно содержит версию Android и модель телефона); уходит автоматически "
        "при открытии страницы проверки",
        "язык телефона → язык из настроек системы; встроенное окно сайта передаёт его "
        "в заголовках запроса, и сервер может учесть это при решении, что показать",
    ]
    for b in bullets:
        story.append(Paragraph("• " + esc(b), BULLET))

    story.append(Paragraph("Как собираются", H2))
    story.append(
        Paragraph(
            esc(
                "Сразу при запуске приложение само, без отдельного окна с разрешением, "
                "включает AppsFlyer и подключается к службе меток установки Google Play. "
                "Номер установки AppsFlyer и метка из магазина сохраняются в памяти "
                "программы ещё до того, как человек нажмёт кнопку."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Когда человек нажимает «PLAY NOW» на стартовом экране, приложение "
                "собирает эти сведения в одну ссылку и открывает её во встроенном окне "
                "сайта внутри приложения. Человек обычно видит только экран «Loading...» "
                "и не понимает, что уходит тихая проверка."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Имя приложения берётся из системы Android. Строка браузера и язык "
                "телефона подставляются самим встроенным окном сайта при каждом "
                "обращении в интернет — отдельной кнопки или запроса согласия на это нет."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Куда отправляются", H2))
    story.append(
        Paragraph(
            esc(
                "Проверка уходит на адрес https://deepaircatch.online во встроенном окне "
                "сайта внутри приложения. К адресу добавляются параметры bundle, afid, "
                "devkey и при наличии referrer. Это не обычный показ рекламного баннера "
                "на экране, а тихая проверка «что показать этому человеку»."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Запасных адресов в коде приложения не видно: базовый адрес зашит одной "
                "строкой. Параллельно AppsFlyer шлёт свои служебные данные на свои "
                "серверы аналитики, но развилка «оффер или обычное приложение» завязана "
                "именно на deepaircatch.online."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Если после проверки открывается другой адрес, приложение сохраняет его "
                "в памяти под ключом dl_v. При следующем запуске этот сохранённый адрес "
                "открывают сразу, уже без повторного нажатия «PLAY NOW»."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(
        Paragraph(
            esc(
                "В самом приложении нет жёсткого списка стран или языков: на проверку "
                "уходят имя приложения, номер установки AppsFlyer, ключ разработчика "
                "и метка установки из магазина. Решение «кому показать внешнюю страницу, "
                "а кому оставить обычный режим» делает сервер deepaircatch.online "
                "по этим признакам и по тому, как ответит на запрос."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "На телефоне есть только простой локальный флаг st_f: если он включён "
                "(через служебное сообщение accept), приложение больше не гонит человека "
                "на проверку и открывает локальный экран обычного приложения. В обычном "
                "меню кнопки accept нет — туда уводит нажатие «PLAY NOW», пока флаг "
                "не выставлен и пока нет сохранённой ссылки."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Итого: признаки собирает и отправляет телефон, а кого пустить на "
                "внешнюю страницу решает сервер. В коде нет отдельного фильтра "
                "«бот / магазин / эмулятор» — только отправка признаков и разбор "
                "того, куда сервер в итоге перенаправит встроенное окно сайта."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Что возвращается", H2))
    story.append(
        Paragraph(
            esc(
                "Отдельного текстового ответа вроде «можно» / «нельзя» приложение "
                "не разбирает. Оно открывает страницу проверки и смотрит, останется ли "
                "человек на deepaircatch.online или встроенное окно сайта уйдёт на "
                "другой адрес после переходов."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Если итоговый адрес отличается от стартовой проверки, приложение "
                "считает это «боевым» вариантом: очищает служебные параметры bundle, "
                "afid и devkey и сохраняет получившуюся ссылку в dl_v. Если адрес "
                "остаётся на том же сайте проверки — сохранённой ссылки нет, и "
                "человек видит то, что отдал сервер на deepaircatch.online "
                "(в открытой проверке это страница политики конфиденциальности)."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "При следующем запуске наличие сохранённой ссылки dl_v сразу "
                "говорит приложению открыть именно её, а не стартовое меню."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(
        Paragraph(
            esc(
                "Если после проверки пришла внешняя ссылка — её открывают внутри "
                "приложения во встроенном окне сайта, поверх экрана загрузки. "
                "Человек не уходит в отдельный браузер телефона: всё происходит "
                "в том же окне. Эту ссылку запоминают и при следующих запусках "
                "показывают сразу."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Если сохранённой внешней ссылки нет и сработал локальный флаг "
                "«оставить обычное приложение», человеку просто остаётся обычное "
                "приложение со встроенными экранами меню и игры. Отдельного перехода "
                "на внешнюю рекламную страницу в этом случае нет."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "На самом первом запуске без сохранённой ссылки сначала показывают "
                "локальное меню, а после «PLAY NOW» — тихую проверку на "
                "deepaircatch.online, от результата которой и зависит дальнейший экран."
            ),
            BODY,
        )
    )

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
