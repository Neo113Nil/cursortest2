package ru.yandex.taxi.logistics.sdk.webview.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/webview/api/WebViewState;", "", "LOADING", "READY", "ERROR", "sdk-webview"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebViewState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebViewState[] $VALUES;
    public static final WebViewState ERROR;
    public static final WebViewState LOADING;
    public static final WebViewState READY;

    static {
        WebViewState webViewState = new WebViewState("LOADING", 0);
        LOADING = webViewState;
        WebViewState webViewState2 = new WebViewState("READY", 1);
        READY = webViewState2;
        WebViewState webViewState3 = new WebViewState("ERROR", 2);
        ERROR = webViewState3;
        WebViewState[] webViewStateArr = {webViewState, webViewState2, webViewState3};
        $VALUES = webViewStateArr;
        $ENTRIES = a.a(webViewStateArr);
    }

    public static WebViewState valueOf(String str) {
        return (WebViewState) Enum.valueOf(WebViewState.class, str);
    }

    public static WebViewState[] values() {
        return (WebViewState[]) $VALUES.clone();
    }
}
