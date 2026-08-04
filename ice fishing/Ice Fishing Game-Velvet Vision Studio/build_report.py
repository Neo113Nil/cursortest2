#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF-отчёт: Ice Fishing Game (Velvet Vision Studio / com.gamericefishpro.space)."""

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
    permissions = (
        "android.permission.VIBRATE, android.permission.INTERNET, "
        "android.permission.POST_NOTIFICATIONS, com.google.android.gms.permission.AD_ID, "
        "com.gamericefishpro.space.permission.C2D_MESSAGE, android.permission.WAKE_LOCK, "
        "com.google.android.c2dm.permission.RECEIVE, android.permission.RECEIVE_BOOT_COMPLETED, "
        "com.sec.android.provider.badge.permission.READ, "
        "com.sec.android.provider.badge.permission.WRITE, "
        "com.htc.launcher.permission.READ_SETTINGS, "
        "com.htc.launcher.permission.UPDATE_SHORTCUT, "
        "com.sonyericsson.home.permission.BROADCAST_BADGE, "
        "com.sonymobile.home.permission.PROVIDER_INSERT_BADGE, "
        "com.anddoes.launcher.permission.UPDATE_COUNT, "
        "com.majeur.launcher.permission.UPDATE_BADGE, "
        "com.huawei.android.launcher.permission.CHANGE_BADGE, "
        "com.huawei.android.launcher.permission.READ_SETTINGS, "
        "com.huawei.android.launcher.permission.WRITE_SETTINGS, "
        "android.permission.READ_APP_BADGE, "
        "com.oppo.launcher.permission.READ_SETTINGS, "
        "com.oppo.launcher.permission.WRITE_SETTINGS, "
        "me.everything.badger.permission.BADGE_COUNT_READ, "
        "me.everything.badger.permission.BADGE_COUNT_WRITE, "
        "android.permission.ACCESS_NETWORK_STATE, "
        "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
        "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
        "android.permission.ACCESS_ADSERVICES_AD_ID, "
        "com.samsung.android.mapsagent.permission.READ_APP_INFO, "
        "com.huawei.appmarket.service.commondata.permission.GET_COMMON_DATA, "
        "android.permission.FOREGROUND_SERVICE, "
        "com.gamericefishpro.space.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
        "com.android.vending.CHECK_LICENSE"
    )

    libraries = (
        "Jetpack Compose (ui/foundation/material3/runtime/animation), "
        "androidx.activity (+compose/ktx), androidx.appcompat, androidx.browser (Custom Tabs), "
        "androidx.core (+ktx, splashscreen, viewtree), androidx.lifecycle, "
        "androidx.navigation (+compose), androidx.room, androidx.datastore, "
        "androidx.work, androidx.startup, androidx.profileinstaller, "
        "androidx.privacysandbox.ads, Kotlin 2.0.21 + kotlinx-coroutines, "
        "Koin (DI), AppsFlyer, OneSignal, Firebase Analytics / Messaging / Installations, "
        "Google Play Services (ads-identifier, measurement, basemement, tasks, appset), "
        "Play Install Referrer, Play Integrity, Play License Check (com.pairip)"
    )

    sdk_rows = [
        ("Название приложения", "Ice Fishing Game"),
        ("Android Gradle Plugin", "8.13.2"),
        ("minSdk", "26"),
        ("targetSdk", "36"),
        ("Kotlin", "да 2.0.21"),
        ("Web View", "да"),
        ("Custom Tabs", "да"),
        ("Рекламные сети", "нет"),
        (
            "Аналитика",
            "AppsFlyer, Firebase Analytics / Measurement, Firebase Cloud Messaging, "
            "Firebase Installations, OneSignal (App ID 9fe1abaf-2409-4644-a3f8-f1524d43f2c6), "
            "Google Play Install Referrer",
        ),
        ("Permissions", permissions),
        ("Libraries", libraries),
        ("Подозрительные домены", "icegamerfishingpro.online"),
        (
            "SharedPreferences",
            "Room-таблица ice_startup_params (iceId, fishSource, fishData, fishId, "
            "iceFishingApp, isOnboarded, флаги запроса уведомлений); "
            "DataStore настроек игры; служебные prefs OneSignal (GT_PLAYER_ID и др.), "
            "AppsFlyer, Firebase Messaging / Installations",
        ),
        ("Есть ли клоака", "да"),
        (
            "Подозрительные слова",
            "start_ice, profish_onboarding, iceId, fishSource, fishData, fishId, "
            "IceFishingApp, isOnboarded, onNavigateToWebView, onNavigateToDashboard, "
            "player_id, install_time, organic, icegamerfishingpro.online, loadUrl, "
            "WebView, advertising id / GAID, AppsFlyer conversion data",
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
    for domain in ["icegamerfishingpro.online"]:
        if domain not in by_name:
            continue
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(kv_table(by_name[domain], header=("Параметр / движок", "Значение / вердикт")))

    story.append(Paragraph("Какие данные собираются", H2))
    bullets = [
        "рекламный номер устройства → уникальный номер телефона для рекламы, который "
        "выдаёт Google; в приложении он лежит в поле iceId и уходит на страницу проверки, "
        "чтобы отличить одно устройство от другого",
        "метка установки из магазина → текст «откуда поставили программу» "
        "(обычная установка или переход по рекламной ссылке); лежит в поле fishSource, "
        "если метки нет — пишут organic",
        "данные о рекламном источнике установки → длинная служебная строка от AppsFlyer "
        "(в ней бывают player_id, install_time, media_source и похожие поля); "
        "лежит в поле fishData и помогает понять, как человек попал в приложение",
        "номер AppsFlyer → служебный номер этой установки в системе AppsFlyer; "
        "лежит в поле fishId",
        "номер экземпляра приложения Firebase → служебный номер этой копии программы "
        "в аналитике Google; лежит в поле IceFishingApp",
        "случайный номер для уведомлений → новый номер, который приложение само создаёт "
        "при первом запуске и передаёт в OneSignal как внешний идентификатор человека",
    ]
    for b in bullets:
        story.append(Paragraph("• " + esc(b), BULLET))

    story.append(Paragraph("Как собираются", H2))
    story.append(
        Paragraph(
            esc(
                "Сразу после запуска открывается заставка. Отдельного окна с разрешением "
                "на сбор данных человек не видит: приложение само, в фоне, читает из своей "
                "базы сохранённые параметры запуска. Если записи ещё нет — параллельно "
                "собирает всё заново."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Рекламный номер устройства тихо спрашивают у сервисов Google на телефоне. "
                "Метку установки берут через сервис Google Play (Install Referrer), "
                "с ожиданием до примерно десяти секунд. Номер AppsFlyer и данные о "
                "рекламном источнике ждут от уже запущенного AppsFlyer. Номер экземпляра "
                "Firebase берут из аналитики Google. Случайный номер для уведомлений "
                "создают сами и сразу передают в OneSignal. Человек в этот момент обычно "
                "видит только заставку с названием игры."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "После сбора все пять основных полей сохраняют в локальную базу "
                "приложения (таблица параметров запуска), чтобы при следующих открытиях "
                "не собирать их заново с нуля."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Куда отправляются", H2))
    story.append(
        Paragraph(
            esc(
                "Собранные сведения не уходят отдельным «тихим» POST на скрытый шлюз. "
                "Их дописывают прямо в адрес встроенного окна сайта: "
                "https://icegamerfishingpro.online/profish_onboarding? "
                "плюс параметры iceId, fishSource, fishData, fishId и IceFishingApp. "
                "Запасного адреса для этой проверки в коде нет."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Открытие происходит незаметно для человека как часть заставки: "
                "сначала крутится загрузка, затем либо остаётся обычное приложение, "
                "либо показывается внешняя страница внутри программы. Параллельно "
                "AppsFlyer и OneSignal сами обмениваются данными со своими серверами, "
                "но развилку «оффер или обычное приложение» ведёт именно адрес "
                "icegamerfishingpro.online."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(
        Paragraph(
            esc(
                "На телефоне видно один явный локальный признак развилки: флаг "
                "«уже прошёл онбординг» (isOnboarded) в базе приложения. Если флаг "
                "уже стоит — человеку сразу оставляют обычное приложение и внешнюю "
                "страницу больше не открывают."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Если флага ещё нет, приложение открывает страницу проверки и передаёт "
                "туда рекламный номер устройства, метку установки, данные AppsFlyer, "
                "номер AppsFlyer и номер экземпляра Firebase. Отдельного жёсткого списка "
                "стран, языков или «ботов» в коде на телефоне нет: само решение "
                "«кому показать рекламную страницу, а кому вернуть в обычное приложение» "
                "делает удалённая страница по этим признакам."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Обратный сигнал «можно обычное приложение» приходит не текстом ответа "
                "сервера в привычном виде, а специальной командой из встроенного окна "
                "сайта: страница пишет в консоль браузера слово start_ice. После этого "
                "приложение ставит флаг «уже прошёл онбординг» и переключает человека "
                "на обычный режим."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Что возвращается", H2))
    story.append(
        Paragraph(
            esc(
                "В коде нет разбора ответа вида «пустая ссылка / поле url / allow». "
                "Вместо этого приложение всегда открывает один и тот же адрес проверки "
                "с параметрами устройства. Дальше поведение зависит от того, что "
                "показывает и «говорит» эта страница."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "«Боевой» для схемы вариант — страница остаётся на экране во встроенном "
                "окне сайта и показывает человеку внешний контент (рекламный лендинг / "
                "оффер). «Белый» вариант — страница присылает команду start_ice; "
                "приложение воспринимает это как разрешение перейти в обычный режим, "
                "сохраняет флаг в базе и больше не возвращает человека на эту проверку "
                "при следующих запусках."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(
        Paragraph(
            esc(
                "Если человек ещё не отмечен как прошедший проверку, сразу после заставки "
                "открывают встроенное окно сайта внутри приложения и загружают "
                "https://icegamerfishingpro.online/profish_onboarding с параметрами "
                "устройства. В этом окне включены обычные возможности сайта "
                "(скрипты, хранилище, cookies), а строка «как представился браузер» "
                "чуть подчищена, чтобы меньше выдавать встроенное окно."
            ),
            BODY,
        )
    )
    story.append(
        Paragraph(
            esc(
                "Пока команда start_ice не пришла, человек остаётся на этой внешней "
                "странице — это и есть показ оффера. Если страница присылает start_ice, "
                "приложение помечает проверку как пройденную и переводит человека "
                "в обычное приложение. При следующих запусках заставка уже видит "
                "сохранённый флаг и сразу оставляет обычное приложение, без повторного "
                "открытия внешней страницы."
            ),
            BODY,
        )
    )

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    main()
