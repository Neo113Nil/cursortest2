package com.yandex.plus.pay.ui.webview.paymentwidget.ui;

import android.webkit.JavascriptInterface;
import com.yandex.plus.webview.api.contract.j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public interface a extends com.yandex.plus.webview.api.contract.d, com.yandex.plus.webview.core.javascript.a, com.yandex.plus.webview.api.javascript.a, com.yandex.plus.webview.api.javascript.b, com.yandex.plus.webview.api.contract.c, j {
    @Override // com.yandex.plus.webview.core.javascript.a
    default String a() {
        return "__webviewPaymentWidget";
    }

    @JavascriptInterface
    String getToken();

    @JavascriptInterface
    void onEvent(@NotNull String str);
}
