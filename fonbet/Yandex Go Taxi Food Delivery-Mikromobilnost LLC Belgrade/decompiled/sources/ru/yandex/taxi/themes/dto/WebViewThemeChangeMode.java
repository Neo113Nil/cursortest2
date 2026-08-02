package ru.yandex.taxi.themes.dto;

import defpackage.gs21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ru41;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/themes/dto/WebViewThemeChangeMode;", "", "Companion", "ru41", "PREFERS_COLOR_SCHEME", "SUPPORT_NATIVE_JS_CALLBACK", "NOT_SUPPORTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WebViewThemeChangeMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebViewThemeChangeMode[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ru41 Companion;
    public static final WebViewThemeChangeMode NOT_SUPPORTED;
    public static final WebViewThemeChangeMode PREFERS_COLOR_SCHEME;
    public static final WebViewThemeChangeMode SUPPORT_NATIVE_JS_CALLBACK;

    static {
        WebViewThemeChangeMode webViewThemeChangeMode = new WebViewThemeChangeMode("PREFERS_COLOR_SCHEME", 0);
        PREFERS_COLOR_SCHEME = webViewThemeChangeMode;
        WebViewThemeChangeMode webViewThemeChangeMode2 = new WebViewThemeChangeMode("SUPPORT_NATIVE_JS_CALLBACK", 1);
        SUPPORT_NATIVE_JS_CALLBACK = webViewThemeChangeMode2;
        WebViewThemeChangeMode webViewThemeChangeMode3 = new WebViewThemeChangeMode("NOT_SUPPORTED", 2);
        NOT_SUPPORTED = webViewThemeChangeMode3;
        WebViewThemeChangeMode[] webViewThemeChangeModeArr = {webViewThemeChangeMode, webViewThemeChangeMode2, webViewThemeChangeMode3};
        $VALUES = webViewThemeChangeModeArr;
        $ENTRIES = a.a(webViewThemeChangeModeArr);
        Companion = new ru41();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gs21(28));
    }

    public static WebViewThemeChangeMode valueOf(String str) {
        return (WebViewThemeChangeMode) Enum.valueOf(WebViewThemeChangeMode.class, str);
    }

    public static WebViewThemeChangeMode[] values() {
        return (WebViewThemeChangeMode[]) $VALUES.clone();
    }
}
