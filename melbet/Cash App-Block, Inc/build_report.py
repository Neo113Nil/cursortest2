#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Cash App (Block, Inc)."""

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


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None, compact=False):
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
    pad = 2 if compact else 3
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 4),
        ("TOPPADDING", (0, 0), (-1, -1), pad),
        ("BOTTOMPADDING", (0, 0), (-1, -1), pad),
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
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_BACKGROUND_LOCATION, "
    "android.permission.ACCESS_COARSE_LOCATION, "
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.BLUETOOTH, "
    "android.permission.BLUETOOTH_ADMIN, "
    "android.permission.BLUETOOTH_ADVERTISE, "
    "android.permission.BLUETOOTH_CONNECT, "
    "android.permission.BLUETOOTH_SCAN, "
    "android.permission.CAMERA, "
    "android.permission.CHANGE_NETWORK_STATE, "
    "android.permission.DETECT_SCREEN_CAPTURE, "
    "android.permission.DETECT_SCREEN_RECORDING, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.GET_ACCOUNTS, "
    "android.permission.INTERNET, "
    "android.permission.NFC, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_BASIC_PHONE_STATE, "
    "android.permission.READ_CONTACTS, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.READ_PHONE_NUMBERS, "
    "android.permission.READ_PHONE_STATE, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.SEND_DOWNLOAD_COMPLETED_INTENTS, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "com.google.android.apps.aicore.service.BIND_SERVICE, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.huawei.appmarket.service.commondata.permission.GET_COMMON_DATA, "
    "com.samsung.android.mapsagent.permission.READ_APP_INFO, "
    "com.squareup.cash.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

AD_NETWORKS = "нет"

ANALYTICS = (
    "Firebase Analytics, Firebase Cloud Messaging, Firebase Installations, "
    "AppsFlyer (атрибуция и OneLink deeplink), Bugsnag (сбои), "
    "Datadog (наблюдаемость), Braze (push/CRM), "
    "OpenTelemetry, Google Play Install Referrer, "
    "собственная аналитика Cash / app.cash.cdp"
)

LIBRARIES = (
    "com.squareup.cash / app.cash (broadway, molecule, zipline, redwood, cdp, "
    "mooncake, arcade, sqldelight, trifle), xyz.block, "
    "androidx (compose, camera, browser, webkit, room, work, datastore, "
    "navigation, media3, credentials, biometric, glance), "
    "com.google.firebase, com.google.android.gms (measurement, wallet, "
    "tapandpay, maps, auth, mlkit), com.google.android.material, "
    "okhttp3, okio, retrofit2, com.squareup.moshi, com.squareup.wire, "
    "dagger, coil3, timber, papa, radiography, curtains, "
    "com.appsflyer, com.braze / bo.app, com.bugsnag, com.datadog, "
    "io.opentelemetry, com.stripe, sqip, com.plaid, com.withpersona, "
    "com.fillr, com.knotapi, com.netcetera.threeds, com.fidesmo, "
    "com.miteksystems.misnap, com.airbnb.lottie, io.noties.markwon, "
    "com.valentinilk.shimmer, com.mikepenz.markdown, com.robinhood.spark, "
    "com.lyft.kronos, com.jakewharton, org.greenrobot.eventbus, "
    "org.bouncycastle, org.commonmark, nl.dionsegijn.konfetti, "
    "org.chromium.support_lib_boundary, com.nimbusds"
)

SHARED_PREFS = (
    "хранилище «cash» через SharedPreferencesKeyValue: токены сессии "
    "(app-token, customer-token, target-account-token), флаги онбординга "
    "(onboarded, onboarding-token), session-flag:*, UI-флаги "
    "(fps_counter_enabled, скрытие баланса, подсказки, язык), "
    "токены аналитических потоков (WALLET_CARD_FLOW_TOKEN, SHOP_FLOW_TOKEN, "
    "TAP_TO_PAY_FLOW_KEY), Work user_token / selected_merchant_token, "
    "update-required, Fillr eligibility; ключей offer_url / cloak / gate нет"
)

SUSPICIOUS_WORDS = (
    "cloak / cloaking (Persona knownRootCloakingPackages — антирут, не клоака "
    "трафика), blacklist / whitelist (Fillr Unleash списки магазинов для "
    "автозаполнения), bot (Cash Moneybot — ИИ-помощник), offer "
    "(продукт Cash Offers), redirect (deeplink / платежные редиректы), "
    "affiliate (Fillr affiliate / WebViewUseCase.AFFILIATE — шопинг), "
    "deposit / withdraw / payout (банковские операции), landing "
    "(маршруты онбординга /borrow-landing), bridge (TaxWebAppBridge / "
    "Zipline JS-мосты), clickid (параметр AppsFlyer deeplink), "
    "postback (ключ AppsFlyer af_installpostback), webview / loadUrl "
    "(штатные WebView: Afterpay, shopping, support, tax, work)"
)

DOMAIN_NOTES = {
    "click.cash.app": (
        "Собственный хост Cash App для AppsFlyer OneLink: в манифесте "
        "указан как host глубоких ссылок, в коде — в списке HOSTS клиента "
        "AppsFlyer. Нужен, чтобы открывать рекламные и маркетинговые ссылки "
        "внутри экосистемы Cash App и атрибутировать установку. При прямой "
        "проверке отвечает «Access Denied» (403) без редиректа; VirusTotal "
        "0/91. На вид безопасный служебный домен Block, не внешний оффер."
    ),
    "clicks.cash.app": (
        "Парный OneLink-хост для разрешения глубоких ссылок AppsFlyer "
        "(рядом с click.cash.app в манифесте и коде). Используется при "
        "разборе входящих ссылок, а не как «ворота» клоаки. Прямой запрос "
        "даёт 404 openresty без редиректа; VirusTotal 0/91. Штатный "
        "маркетинговый хост приложения."
    ),
    "affiliate.fillr.com": (
        "Хост Fillr (автозаполнение форм покупок внутри Cash App): из "
        "виджета грузится iframe с картинкой и clickURL для партнёрских "
        "креативов магазинов. Это шопинг-автозаполнение, а не скрытая "
        "подмена экрана. VirusTotal 0/91; страница без читаемого контента "
        "при голом запросе. На вид безопасный партнёрский домен Fillr."
    ),
    "afterpay.com": (
        "Официальный сайт Afterpay (BNPL-сервис Block): в приложении — "
        "allowlist cookie/checkout и встроенные окна оплаты «купи сейчас, "
        "плати потом». Редирект ведёт на выбор страны/языка Afterpay. "
        "VirusTotal 0/91. Легитимный платёжный продукт той же компании."
    ),
    "ag.orvis.com": (
        "Появляется в картах CSS-селекторов Fillr для автозаполнения "
        "оформления заказа в магазине Orvis (не как «gate» оффера). "
        "Нужен, чтобы подсказать поля формы на сайте продавца. VirusTotal "
        "без вредоносных меток. Служебная привязка к конкретному ритейлеру."
    ),
    "aliexpress.com": (
        "В списках Fillr Unleash whitelist магазинов, для которых включают "
        "скрапер корзины/товара и автозаполнение. Это известный маркетплейс, "
        "а не неизвестный рекламный лендинг. VirusTotal 0/91. Нужен для "
        "шопинг-фичи Cash App."
    ),
    "aosom.com": (
        "Магазин Aosom в скриптах Fillr Widget1.js (селекторы корзины "
        "www.aosom.com). Используется для распознавания страницы покупки "
        "и подстановки данных. Одна из проверок VT пометила домен как "
        "suspicious (1/91), но в приложении это просто ритейлер из списка "
        "автозаполнения, не сервер клоаки."
    ),
    "api.fillr.com": (
        "Базовый API Fillr: аффилиаты, трекинг, профиль, события страниц. "
        "Приложение ходит сюда за правилами автозаполнения и статистикой "
        "виджета. VirusTotal 0/91. Служебный бэкенд SDK автозаполнения, "
        "на вид безопасен и не решает «оффер vs обычное приложение»."
    ),
}


def load_checks():
    with open(CHECKS, "r", encoding="utf-8") as f:
        return json.load(f)


CHECKS_DATA = load_checks()
CHECKED_DOMAINS = [c["domain"] for c in CHECKS_DATA.get("checked", [])]

MAIN_ROWS = [
    (
        "Название приложения",
        "Cash App (com.squareup.cash), versionName 5.58.0 "
        "(versionCode 5580007; meta.json указывает 5.62.0), "
        "разработчик Block, Inc",
    ),
    ("Android Gradle Plugin", "9.2.0"),
    ("minSdk", "29"),
    ("targetSdk", "35"),
    ("Kotlin", "да 2.3.21"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    (
        "Подозрительные домены",
        ", ".join(CHECKED_DOMAINS) if CHECKED_DOMAINS else "нет",
    ),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]


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
        title="Отчёт по анализу APK — Cash App",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(
        Paragraph(
            "Cash App &mdash; Block, Inc &mdash; com.squareup.cash "
            "(versionName 5.58.0 / versionCode 5580007)",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Разобраны: com.squareup.cash.xapk, apk/com.squareup.cash.apk, "
            "apk/config.arm64_v8a.apk, apk/config.xxhdpi.apk, apk/config.en.apk, "
            "meta.json, domain_checks.json / domain_checks.md, "
            "decompiled/resources/AndroidManifest.xml, res/values/strings.xml и "
            "декомпилированные исходники (com.squareup.cash, app.cash, "
            "com.appsflyer, com.braze, com.fillr, com.datadog, androidx, "
            "okhttp3, retrofit2 и др.). Точка входа: CashApp Application → "
            "MainActivity (заставка → обычный fintech UI / онбординг). "
            "Тихой серверной развилки «оффер vs белое приложение» нет.",
            SMALL,
        )
    )

    story.append(Paragraph("SDK / стек", H2))
    story.append(
        kv_table(
            MAIN_ROWS,
            widths=(42 * mm, 128 * mm),
            header=("Параметр", "Значение"),
            compact=True,
        )
    )

    if CHECKED_DOMAINS:
        story.append(Paragraph("Проверка подозрительных доменов", H2))
        story.append(
            Paragraph(
                "Данные ниже взяты как есть из готовых проверок пайплайна "
                "(domain_checks.json / domain_checks.md): сводка VirusTotal, "
                "полный список Security vendors' analysis и три дополнительных "
                "пункта в конце.",
                SMALL,
            )
        )

        for dom in CHECKED_DOMAINS:
            rec = by_domain.get(dom)
            if not rec:
                continue
            rows = [(r["param"], r["value"]) for r in rec.get("table_rows", [])]
            story.append(Paragraph("Проверка домена: %s" % esc(dom), H2))
            story.append(
                kv_table(
                    rows,
                    widths=(62 * mm, 108 * mm),
                    header=("Параметр / движок", "Значение / вердикт"),
                )
            )
            note = DOMAIN_NOTES.get(dom)
            if note:
                story.append(Paragraph(esc(note), BODY))
            story.append(Spacer(1, 3 * mm))

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
