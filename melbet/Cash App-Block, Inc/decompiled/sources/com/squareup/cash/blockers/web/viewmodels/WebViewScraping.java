package com.squareup.cash.blockers.web.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class WebViewScraping {
    public static final /* synthetic */ WebViewScraping[] $VALUES;
    public static final WebViewScraping DISABLED;

    /* JADX INFO: Fake field, exist only in values array */
    WebViewScraping EF0;

    static {
        WebViewScraping webViewScraping = new WebViewScraping("ENABLED", 0);
        WebViewScraping webViewScraping2 = new WebViewScraping("DISABLED", 1);
        DISABLED = webViewScraping2;
        $VALUES = new WebViewScraping[]{webViewScraping, webViewScraping2};
    }

    public static WebViewScraping valueOf(String str) {
        return (WebViewScraping) Enum.valueOf(WebViewScraping.class, str);
    }

    public static WebViewScraping[] values() {
        return (WebViewScraping[]) $VALUES.clone();
    }
}
