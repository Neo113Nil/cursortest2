package ru.yandex.taxi.web.view;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/web/view/WebViewState$State", "", "Lru/yandex/taxi/web/view/WebViewState$State;", "LOADING", "LOADED", "ERROR", "UNSUPPORTED", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebViewState$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebViewState$State[] $VALUES;
    public static final WebViewState$State ERROR;
    public static final WebViewState$State LOADED;
    public static final WebViewState$State LOADING;
    public static final WebViewState$State UNSUPPORTED;

    static {
        WebViewState$State webViewState$State = new WebViewState$State("LOADING", 0);
        LOADING = webViewState$State;
        WebViewState$State webViewState$State2 = new WebViewState$State("LOADED", 1);
        LOADED = webViewState$State2;
        WebViewState$State webViewState$State3 = new WebViewState$State("ERROR", 2);
        ERROR = webViewState$State3;
        WebViewState$State webViewState$State4 = new WebViewState$State("UNSUPPORTED", 3);
        UNSUPPORTED = webViewState$State4;
        WebViewState$State[] webViewState$StateArr = {webViewState$State, webViewState$State2, webViewState$State3, webViewState$State4};
        $VALUES = webViewState$StateArr;
        $ENTRIES = kotlin.enums.a.a(webViewState$StateArr);
    }

    public static WebViewState$State valueOf(String str) {
        return (WebViewState$State) Enum.valueOf(WebViewState$State.class, str);
    }

    public static WebViewState$State[] values() {
        return (WebViewState$State[]) $VALUES.clone();
    }
}
