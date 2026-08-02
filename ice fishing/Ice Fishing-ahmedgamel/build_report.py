#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Ice Fishing (ahmedgamel)."""

import json
import os

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import (
    KeepTogether,
    PageBreak,
    Paragraph,
    SimpleDocTemplate,
    Spacer,
    Table,
    TableStyle,
)

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle(
    "H1",
    fontName="DJ-B",
    fontSize=16,
    leading=20,
    spaceAfter=8,
    textColor=colors.HexColor("#12263f"),
)
H2 = ParagraphStyle(
    "H2",
    fontName="DJ-B",
    fontSize=12.5,
    leading=16,
    spaceBefore=12,
    spaceAfter=6,
    textColor=colors.HexColor("#12263f"),
)
BODY = ParagraphStyle(
    "BODY",
    fontName="DJ",
    fontSize=9.3,
    leading=13.4,
    alignment=TA_LEFT,
    spaceAfter=5,
)
BULLET = ParagraphStyle("BULLET", parent=BODY, leftIndent=10, spaceAfter=3.5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
SMALL = ParagraphStyle(
    "SMALL",
    fontName="DJ",
    fontSize=8.4,
    leading=11.6,
    textColor=colors.HexColor("#444444"),
    spaceAfter=6,
)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return (
        str(text)
        .replace("&", "&amp;")
        .replace("<", "&lt;")
        .replace(">", "&gt;")
    )


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append(
            [
                Paragraph(
                    '<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B
                ),
                Paragraph(
                    '<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B
                ),
            ]
        )
    for k, v in rows:
        data.append([Paragraph(esc(k), CELL_B), Paragraph(esc(v), CELL)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 4),
        ("TOPPADDING", (0, 0), (-1, -1), 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 3),
    ]
    if header:
        style.append(("BACKGROUND", (0, 0), (-1, 0), HEAD_BG))
    start = 1 if header else 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


PERMISSIONS = (
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.INTERNET, "
    "com.google.android.gms.permission.AD_ID, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "com.IceFishing.LiveIceFishing.permission.C2D_MESSAGE, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.WAKE_LOCK, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "android.permission.VIBRATE, "
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
    "android.permission.FOREGROUND_SERVICE, "
    "com.IceFishing.LiveIceFishing.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "com.android.vending.CHECK_LICENSE"
)

AD_NETWORKS = (
    "AdMob / Google Mobile Ads, TopOn / AnyThink, Meta Audience Network, "
    "Google User Messaging Platform, IAB Open Measurement (toponad), "
    "локальные баннеры Qureka (ads_qureka*)"
)

ANALYTICS = (
    "Firebase Cloud Messaging / Installations / Datatransport, "
    "OneSignal (App ID f2a35f4f-9ae4-41ac-b40d-ed960fc01377), "
    "Google Play Services Measurement, OpenTelemetry (TopOn/AnyThink)"
)

LIBRARIES = (
    "androidx.appcompat, androidx.activity (+ktx), androidx.fragment (+ktx), "
    "androidx.core (+ktx, viewtree), androidx.browser (Custom Tabs), "
    "androidx.cardview, androidx.constraintlayout, androidx.coordinatorlayout, "
    "androidx.lifecycle (livedata, process, runtime, viewmodel, service), "
    "androidx.navigation, androidx.recyclerview, androidx.viewpager/viewpager2, "
    "androidx.work (+ktx), androidx.room, androidx.sqlite, androidx.datastore, "
    "androidx.startup, androidx.emoji2, androidx.exifinterface, "
    "androidx.swiperefreshlayout, androidx.drawerlayout, androidx.dynamicanimation, "
    "androidx.legacy, androidx.localbroadcastmanager, androidx.databinding "
    "(viewbinding 8.9.0), com.google.android.material, "
    "Kotlin stdlib + kotlinx-coroutines 1.8.0, "
    "Volley (очередь HTTP-запросов), OkHttp (в составе SDK), "
    "Glide (com.bumptech.glide), Lottie (com.airbnb.lottie), "
    "GifDrawable (pl.droidsonroids.gif), "
    "Google Play Services (ads, ads-identifier, appset, base, basement, "
    "cloud-messaging, measurement, tasks), "
    "Firebase (common, messaging, installations, datatransport, iid), "
    "OneSignal, TopOn/AnyThink SDK, Meta Audience Network, "
    "Google UMP / consent SDK, pairip (com.pairip.application.Application), "
    "Instagram viewpoint / OM helpers (com.instagram.common.viewpoint)"
)

SHARED_PREFS = (
    "MyPref — полный ответ удалённых настроек (ключ response), флаги и id рекламы "
    "(adposition, interstitial_id, AppOpenID, app_AppOpenAdStatus и поля из "
    "JSON: splash_inter / splash_redirect / link_redirect / link1–3 / topon_* / "
    "Admob_* / FB_*). HeartRate — флаг первого запуска IsFirstTimeLaunch. "
    "Отдельно хранятся настройки согласия UMP (consent_status, consent_type, "
    "stored_info и др.) и служебные ключи OneSignal / Firebase Messaging."
)

SUSPICIOUS_WORDS = (
    "splash_redirect, link_redirect, link1, link2, link3, livetv, "
    "splash_inter, redirect, offer (anythink_myoffer_*), qureka, "
    "ads_qureka, gamezop, gamescritique, criczop, umogames, djdvk, "
    "s.djdvk.com, ApplinkActivity, CustomTabs, loadUrl, "
    "raw.githubusercontent.com/smtpatel9211/2026, "
    "black_white_screen (anythink_myoffer_feedback_black_white_screen), "
    "landing (intro/dashboard у оффер-доменов)"
)

# Только кастомные/неочевидные из domain_checks (без known SDK anythink и VT-шум alphamountain)
SUSPICIOUS_DOMAINS = [
    "10761.play.gamezop.com",
    "10761.play.umogames.com",
    "1086.mark.qureka.com",
    "25.go.gamescritique.com",
    "9455.read.criczop.com",
]

MAIN_ROWS = [
    ("Название приложения", "Ice Fishing"),
    ("Android Gradle Plugin", "8.9.0"),
    ("minSdk", "24"),
    ("targetSdk", "35"),
    ("Kotlin", "да (Kotlin + kotlinx-coroutines 1.8.0)"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", ", ".join(SUSPICIOUS_DOMAINS)),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "да"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]

DATA_ITEMS = [
    (
        "имя приложения в системе",
        "техническое имя пакета com.IceFishing.LiveIceFishing уже вписано в "
        "адрес тихого запроса; по нему скачивается файл настроек именно этой "
        "программы. Других полей (язык, страна, рекламный номер, модель, "
        "версия Android) в параметрах и теле этого запроса проверки нет — "
        "уходит только получение файла по готовому адресу",
    ),
]

HOW_COLLECTED = (
    "Сразу после запуска открывается экран-заставка (SplashActivity). Сначала "
    "приложение проверяет, есть ли интернет, затем при необходимости показывает "
    "окно согласия на рекламу (стандартный механизм Google). Как только это "
    "пройдено, без спроса у человека запускается тихий запрос: скачивается "
    "текстовый файл настроек с адреса на GitHub, в котором уже зашито имя этой "
    "программы."
    "<br/><br/>"
    "Отдельные поля вроде языка телефона, модели или рекламного номера в этот "
    "запрос проверки не дописываются — уходит простое получение файла. Человек "
    "этого обычно не замечает: никакого окна «разрешить сбор данных для "
    "проверки» нет, на экране крутится обычная заставка."
    "<br/><br/>"
    "Ответ целиком кладётся в память приложения (файл настроек MyPref, ключ "
    "response). Оттуда же потом читаются флаги splash_redirect / link_redirect "
    "и три ссылки. Флаг первого запуска хранится отдельно и решает, показать ли "
    "короткое знакомство или сразу основной экран — но это уже после проверки."
)

WHERE_SENT = (
    "Тихий запрос уходит на точный адрес "
    "https://raw.githubusercontent.com/smtpatel9211/2026/refs/heads/main/"
    "com.IceFishing.LiveIceFishing — это не страница магазина и не обычная "
    "рекламная сеть, а удалённый файл настроек, который разработчик может "
    "менять без обновления программы в магазине."
    "<br/><br/>"
    "Запасных адресов для этой проверки в коде не видно: адрес зашит одной "
    "строкой в экране ApplinkActivity, от которого наследуется заставка. "
    "Сам ответ потом живёт в памяти приложения (MyPref), чтобы при следующих "
    "запусках и показах рекламы уже не ждать сеть заново."
    "<br/><br/>"
    "Отдельно, уже не как «проверка кого пускать», а как обычная игра-витрина, "
    "приложение открывает встроенные игры Gamezop по адресам вида "
    "https://10761.play.gamezop.com/g/… во встроенном окне сайта. Это белый "
    "контент витрины, а не тихий gate."
)

HOW_FILTERED = (
    "В самом приложении нет жёсткого списка стран, языков или «ботов», по "
    "которому решают «этому человеку оффер, а этому — нет». Экраны выбора "
    "страны, языка, возраста и пола — обычные шаги знакомства после первого "
    "запуска, а не скрытый фильтр трафика для оффера."
    "<br/><br/>"
    "Решение «кому показать внешнюю страницу» зашито в удалённом файле на "
    "GitHub: разработчик выставляет splash_redirect и link_redirect в 0 или 1 "
    "и подставляет актуальные link1 / link2 / link3. Приложение лишь читает "
    "эти числа и ссылки. То есть фильтр по сути делает тот, кто правит файл "
    "на сервере, а не код на телефоне по гео или «боту»."
    "<br/><br/>"
    "Дополнительно при открытии оффера приложение случайно выбирает одну из "
    "трёх присланных ссылок (случайное число 0–2). Это не фильтр пользователей, "
    "а ротация адресов. Если флаги выключены — внешняя страница со старта не "
    "открывается, человеку остаётся обычное приложение."
)

WHAT_RETURNS = (
    "С адреса на GitHub приходит текстовый ответ в виде списка полей. "
    "Приложение читает из него, в частности: splash_inter (показывать ли "
    "полноэкранную рекламу на заставке), link_redirect и splash_redirect "
    "(включатели внешних переходов), link1 / link2 / link3 (три внешние "
    "ссылки), livetv, ключи TopOn / AdMob / Facebook и статусы, какие сети "
    "рекламы включать."
    "<br/><br/>"
    "На момент разбора в файле стояло: splash_inter = 1, splash_redirect = 1, "
    "link_redirect = 0; link1 = https://25.go.gamescritique.com/dashboard "
    "(PrankPulse), link2 = http://1086.mark.qureka.com/intro/question "
    "(викторина Qureka), link3 = https://s.djdvk.com/ucode; livetv вёл на "
    "criczop. Весь ответ сохраняется как есть; дальше решают числа-флаги и "
    "непустые ссылки."
    "<br/><br/>"
    "«Боевой» вариант схемы — splash_redirect = 1 и ссылки заполнены: тогда "
    "открывают внешнюю страницу. «Белый» вариант — редирект выключен или "
    "ссылок нет: заставка заканчивается переходом в обычное приложение без "
    "принудительного ухода на оффер."
)

HOW_SHOWN = (
    "После загрузки настроек на заставке сначала может показаться "
    "полноэкранная реклама сети (если splash_inter = 1). Затем, если "
    "splash_redirect = 1, приложение само выбирает случайную из трёх ссылок "
    "link1/link2/link3 и открывает её во внешнем браузере Chrome через "
    "встроенные вкладки браузера (Custom Tabs). Если Chrome недоступен — "
    "делается обычный системный переход по ссылке. Те же три ссылки "
    "открываются при нажатии на локальные баннеры Qureka внутри приложения."
    "<br/><br/>"
    "По смыслу это не обычный рекламный блок сети внутри игры, а целевые "
    "внешние страницы: промо PrankPulse на gamescritique, викторина/"
    "регистрация Qureka и третий адрес s.djdvk.com. Отдельно внутри "
    "приложения есть встроенное окно сайта (экран MWebActivity): в нём "
    "открывают HTML5-игры Gamezop по заранее прописанным адресам — это "
    "содержимое обычной витрины, а не оффер после проверки."
    "<br/><br/>"
    "Если оффер по флагам не нужен — человеку просто остаётся обычное "
    "приложение с витриной игр и стандартной рекламой сетей, без "
    "принудительного перехода на внешнюю оффер-страницу."
)


def domain_rows_from_check(entry):
    rows = []
    for item in entry.get("table_rows") or []:
        rows.append((item.get("param", ""), item.get("value", "")))
    if rows:
        return rows
    # fallback if table_rows missing
    vt = entry.get("virustotal") or {}
    rows = [
        ("Домен", entry.get("domain", "")),
        ("VirusTotal URL", vt.get("vt_url", "")),
        ("Детекции", vt.get("detections", "")),
        ("Security vendors' analysis", "ниже построчно, как на VirusTotal"),
    ]
    engines = vt.get("engines") or vt.get("results") or {}
    if isinstance(engines, dict):
        for name, verdict in engines.items():
            rows.append((name, verdict))
    rows.append(("Куда редиректит", entry.get("redirects_to", "нет")))
    rows.append(("Что выводит (кратко)", entry.get("page_output", "нет")))
    rows.append(("Где припаркован", entry.get("parked_at", "нет")))
    return rows


def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=18 * mm,
        rightMargin=18 * mm,
        topMargin=15 * mm,
        bottomMargin=15 * mm,
        title="Отчёт по анализу APK — Ice Fishing",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(
        Paragraph(
            "Ice Fishing &mdash; ahmedgamel &mdash; "
            "com.icefishing.icefishingmoney "
            "(разобранный бинарник: com.IceFishing.LiveIceFishing)",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Разобраны: сплиты LiveIceFishing / xapk, apk/com.icefishing."
            "icefishingmoney.apk и связанные APK, meta.json, domain_checks, "
            "AndroidManifest.xml, strings.xml и decompiled/sources "
            "(точка входа SplashActivity / ApplinkActivity, Y0.p, MWebActivity, "
            "рекламный стек TopOn/AdMob/Facebook, OneSignal).",
            SMALL,
        )
    )

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(MAIN_ROWS, header=("Параметр", "Значение")))

    story.append(PageBreak())
    story.append(Paragraph("Проверка подозрительных доменов", H2))

    for domain in SUSPICIOUS_DOMAINS:
        entry = by_domain.get(domain)
        if not entry:
            continue
        block = [
            Paragraph("Проверка домена: %s" % esc(domain), H2),
            kv_table(
                domain_rows_from_check(entry),
                header=("Параметр / движок", "Значение / вердикт"),
            ),
            Spacer(1, 4 * mm),
        ]
        story.append(KeepTogether(block))

    story.append(PageBreak())
    story.append(Paragraph("Какие данные собираются", H2))
    for title, desc in DATA_ITEMS:
        story.append(
            Paragraph("• %s → %s" % (esc(title), esc(desc)), BULLET)
        )

    story.append(Paragraph("Как собираются", H2))
    story.append(Paragraph(HOW_COLLECTED, BODY))

    story.append(Paragraph("Куда отправляются", H2))
    story.append(Paragraph(WHERE_SENT, BODY))

    story.append(Paragraph("Как фильтруются пользователи", H2))
    story.append(Paragraph(HOW_FILTERED, BODY))

    story.append(Paragraph("Что возвращается", H2))
    story.append(Paragraph(WHAT_RETURNS, BODY))

    story.append(Paragraph("Как показывается оффер или белая версия", H2))
    story.append(Paragraph(HOW_SHOWN, BODY))

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
