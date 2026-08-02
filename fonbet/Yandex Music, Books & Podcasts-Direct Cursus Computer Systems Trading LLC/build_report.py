#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Yandex Music, Books & Podcasts."""

import json
import os

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
CHECKS = os.path.join(BASE, "domain_checks.json")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20,
                    spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12.5, leading=16,
                    spaceBefore=12, spaceAfter=6,
                    textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.3, leading=13.4,
                      alignment=TA_LEFT, spaceAfter=5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
CELL_SM = ParagraphStyle("CELL_SM", fontName="DJ", fontSize=6.6, leading=8.2)
CELL_SM_B = ParagraphStyle("CELL_SM_B", fontName="DJ-B", fontSize=6.6, leading=8.2)
SMALL = ParagraphStyle("SMALL", fontName="DJ", fontSize=8.4, leading=11.6,
                       textColor=colors.HexColor("#444444"), spaceAfter=6)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return (str(text).replace("&", "&amp;").replace("<", "&lt;")
            .replace(">", "&gt;"))


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None, compact=False):
    key_style = CELL_SM_B if compact else CELL_B
    val_style = CELL_SM if compact else CELL
    data = []
    if header:
        data.append([
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]),
                      CELL_SM_B if compact else CELL_B),
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]),
                      CELL_SM_B if compact else CELL_B),
        ])
    for k, v in rows:
        data.append([Paragraph(esc(k), key_style), Paragraph(esc(v), val_style)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 3 if compact else 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 3 if compact else 4),
        ("TOPPADDING", (0, 0), (-1, -1), 2 if compact else 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 2 if compact else 3),
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
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.AUTHENTICATE_ACCOUNTS, "
    "android.permission.BLUETOOTH (maxSdkVersion=30), "
    "android.permission.CAMERA, "
    "android.permission.CHANGE_WIFI_MULTICAST_STATE, "
    "android.permission.DETECT_SCREEN_CAPTURE, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_DATA_SYNC, "
    "android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK, "
    "android.permission.GET_ACCOUNTS (maxSdkVersion=22), "
    "android.permission.INTERNET, "
    "android.permission.MANAGE_ACCOUNTS, "
    "android.permission.MODIFY_AUDIO_SETTINGS, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.READ_SYNC_SETTINGS, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_CREDENTIALS, "
    "android.permission.USE_FINGERPRINT, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "android.permission.WRITE_SYNC_SETTINGS, "
    "com.android.vending.BILLING, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.huawei.appmarket.service.commondata.permission.GET_COMMON_DATA, "
    "com.samsung.android.mapsagent.permission.READ_APP_INFO, "
    "com.yandex.music.RELAY_PERMISSION, "
    "com.yandex.permission.AM_COMMUNICATION, "
    "com.yandex.permission.READ_CREDENTIALS"
)

AD_NETWORKS = "нет"

ANALYTICS = (
    "AppMetrica / Yandex Metrica (io.appmetrica, com.yandex.metrica.push), "
    "AppsFlyer 6.16.2 (атрибуция, OneLink music.onelink.me), "
    "Firebase Crashlytics, Firebase Cloud Messaging / Installations "
    "(firebase_analytics_collection_deactivated=true), "
    "Google Advertising ID / Play Install Referrer, "
    "Facebook SDK (логин / Custom Tabs, не Audience Network)"
)

LIBRARIES = (
    "androidx (appcompat, activity, fragment, browser/Custom Tabs, webkit, "
    "biometric, compose, media3, room, work, lifecycle, datastore, "
    "credentials, glance), "
    "Kotlin 2.2.21 / kotlinx-coroutines 1.10.2, "
    "OkHttp3, Okio, Retrofit2, Moshi, Coil, Timber, "
    "Lottie (com.airbnb.lottie), Glide remnants (com.bumptech), "
    "Google Play Services (ads-identifier, auth, base, basement, "
    "cast, cloud-messaging, location, maps, tasks), "
    "Firebase (messaging, crashlytics, installations, encoders), "
    "Play Billing, Install Referrer, "
    "AppsFlyer, AppMetrica (io.appmetrica), Facebook Login, "
    "com.yandex (passport, plus/plus2, div, messenger, payment, "
    "metrica, alicekit, auth, browser, media, pulse, music.shared), "
    "ru.yandex (music, video, quasar), ru.kinopoisk.sdk.easylogin, "
    "ru.domesticroots, "
    "io.ktor, io.grpc, io.reactivex, io.requery, io.opentelemetry, "
    "org.joda.time, org.freedesktop.gstreamer, "
    "com.connectsdk, com.getkeepsafe.relinker, "
    "de.hdodenhof.circleimageview"
)

SHARED_PREFS = (
    "Основное хранилище «Yandex_Music»: флаг онбординга (onboarding), "
    "первый запуск / version_code, тема, путь скачивания, состояние плеера "
    "(shuffle/repeat/lyrics), KEY_CLID (источник установки, напр. google-play). "
    "Отдельно: prefs.pushService / prefs.notifications, metrica_settings, "
    "Passport (yandex_am_storage, passport_init, passport_sso_pref, "
    "white_list_pref / blacklisted_apps), эксперименты Plus Pay, "
    "daily_quests / plaque_definition, prefs Firebase/Crashlytics/Facebook. "
    "Ключей offer_url / cloak / gate / white-page нет."
)

SUSPICIOUS_WORDS = (
    "offer (подписки Yandex Plus / paywall, не рекламный оффер клоаки), "
    "landing (экраны каталога музыки ru.yandex.music.landing), "
    "redirect (DeepLink Redirected в UrlActivity), "
    "whitelist (схемы deeplink, URL WebView, Safe Browsing, форматы видео), "
    "blacklist (BLACKLISTED в Plus Pay; blacklisted_apps Passport; CDN), "
    "clickid (зарезервированные ключи AppsFlyer DeepLink), "
    "slots (A/B-слоты / JobScheduler, не казино), "
    "gate / gateway (хост egw.home-gateway.plus.yandex.net — API Plus Home), "
    "webview / loadUrl (Plus Home, Passport, промокоды — штатные экраны)"
)

DOMAIN_NOTES = {
    "egw.home-gateway.plus.tst.yandex.net": (
        "Тестовый шлюз Yandex Plus Home (com.yandex.plus.home.network.hosts). "
        "В коде рядом с боевым egw.home-gateway.plus.yandex.net — через него "
        "приложение ходит за данными домашнего экрана Plus, а не за «оффером» "
        "клоаки. При проверке соединение оборвалось по таймауту; VirusTotal "
        "0/91. Служебный стенд Яндекса, на вид безопасный."
    ),
    "egw.home-gateway.plus.yandex.net": (
        "Боевой API-шлюз Yandex Plus Home: зашит как "
        "https://egw.home-gateway.plus.yandex.net. Отвечает "
        "{\"code\":\"NOT_FOUND\"} на «голый» запрос без авторизации — это "
        "ожидаемо для закрытого шлюза. VirusTotal 0/91. Нужен для подписки "
        "Plus и веб-экранов дома/сторис, не для фильтрации трафика."
    ),
    "am.applink.pay.yandex.ru": (
        "Глубокая ссылка Passport на оплату (pathPrefix /open-payment) в "
        "списке разрешённых хостов рядом с passport.yandex.ru. При прямой "
        "проверке Яндекс показал капчу «Вы не робот?» — типичная защита "
        "от ботов на платёжном applink. VirusTotal 0/91. Штатный платёжный "
        "контур, не внешний рекламный лендинг."
    ),
    "am.applink.sandbox.pay.yandex.ru": (
        "Песочница того же платёжного applink Passport (sandbox). В коде "
        "рядом с боевым am.applink.pay.yandex.ru. Прямой запрос тоже упирается "
        "в капчу; VirusTotal 0/91. Тестовый стенд оплаты Яндекса, безопасен "
        "на вид и не связан с клоакой."
    ),
    "aomedia.org": (
        "Ссылка стандарта Alliance for Open Media (схема emsg/ID3 в "
        "медиаплеере). Это не сервер приложения, а идентификатор формата "
        "метаданных в потоке. VirusTotal 0/91; сайт открывает официальную "
        "страницу Alliance for Open Media. Безопасно."
    ),
    "api.messenger.yandex.net": (
        "Бэкенд встроенного Yandex Messenger "
        "(https://api.messenger.yandex.net/api/ и logout_client). Нужен для "
        "чатов/сообщений внутри экосистемы Яндекса. При проверке — таймаут; "
        "VirusTotal 0/91. Обычный служебный API, не gate оффера."
    ),
    "api.music.yandex.net": (
        "Основной API Яндекс Музыки: каталог, плейлисты, стриминг-метаданные. "
        "Прямой ответ — JSON invocationInfo с hostname production music. "
        "VirusTotal 0/91. Это штатный музыкальный бэкенд приложения."
    ),
    "appmetrica.yandex.com": (
        "Кабинет/документация AppMetrica; в SDK встречается в текстах ошибок "
        "и списках редиректов плюс-веба. Браузерный запрос уводит на вход "
        "в Yandex ID. VirusTotal без вредоносных меток. Аналитический хост "
        "Яндекса, не cloaking-домен."
    ),
}


def load_checks():
    with open(CHECKS, "r", encoding="utf-8") as f:
        return json.load(f)


CHECKS_DATA = load_checks()
CHECKED_DOMAINS = [c["domain"] for c in CHECKS_DATA.get("checked", [])]

MAIN_ROWS = [
    ("Название приложения",
     "Yandex Music, Books & Podcasts (ru.yandex.music), версия "
     "2026.07.4 #157gpr (versionCode 24026391), разработчик "
     "Direct Cursus Computer Systems Trading LLC"),
    ("Android Gradle Plugin", "9.0.0"),
    ("minSdk", "29"),
    ("targetSdk", "36"),
    ("Kotlin", "да, 2.2.21"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены",
     ", ".join(CHECKED_DOMAINS) if CHECKED_DOMAINS else "нет"),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]


def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT, pagesize=A4,
        leftMargin=18 * mm, rightMargin=18 * mm,
        topMargin=15 * mm, bottomMargin=15 * mm,
        title="Отчёт по анализу APK — Yandex Music, Books & Podcasts",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "Yandex Music, Books &amp; Podcasts &mdash; "
        "Direct Cursus Computer Systems Trading LLC &mdash; "
        "ru.yandex.music (версия 2026.07.4 #157gpr)", BODY))
    story.append(Paragraph(
        "Разобраны: ru.yandex.music.xapk, apk/ru.yandex.music.apk, "
        "apk/config.mdpi.apk, apk/config.ru.apk, apk/config.armeabi_v7a.apk, "
        "apk/config.en.apk, meta.json, domain_checks.json / domain_checks.md, "
        "decompiled/resources/AndroidManifest.xml, res/values/strings.xml и "
        "декомпилированные исходники (ru.yandex.music, com.yandex.*, "
        "com.appsflyer, io.appmetrica, androidx, okhttp3, retrofit2 и др.). "
        "Точка входа: YMApplication → MainScreenActivity "
        "(онбординг / GDPR → обычный музыкальный UI).", SMALL))

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(
        MAIN_ROWS, widths=(42 * mm, 128 * mm),
        header=("Параметр", "Значение"), compact=True))

    if CHECKED_DOMAINS:
        story.append(Paragraph("Проверка подозрительных доменов", H2))
        story.append(Paragraph(
            "Данные ниже взяты как есть из готовых проверок пайплайна "
            "(domain_checks.json / domain_checks.md): сводка VirusTotal, полный "
            "список Security vendors' analysis и три дополнительных пункта "
            "в конце.", SMALL))

        for dom in CHECKED_DOMAINS:
            rec = by_domain.get(dom)
            if not rec:
                continue
            rows = [(r["param"], r["value"]) for r in rec.get("table_rows", [])]
            story.append(Paragraph("Проверка домена: %s" % esc(dom), H2))
            story.append(kv_table(
                rows, widths=(62 * mm, 108 * mm),
                header=("Параметр / движок", "Значение / вердикт")))
            note = DOMAIN_NOTES.get(dom)
            if note:
                story.append(Paragraph(esc(note), BODY))
            story.append(Spacer(1, 3 * mm))

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
