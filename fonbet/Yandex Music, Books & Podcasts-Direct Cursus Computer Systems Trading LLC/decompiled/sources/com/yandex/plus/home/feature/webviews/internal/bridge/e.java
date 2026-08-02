package com.yandex.plus.home.feature.webviews.internal.bridge;

import android.webkit.JavascriptInterface;
import defpackage.brr;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e extends com.yandex.plus.webview.api.contract.b implements com.yandex.plus.webview.core.javascript.a {
    public final brr b;
    public final boolean c;

    public e(brr brrVar, boolean z) {
        brrVar.getClass();
        this.b = brrVar;
        this.c = z;
    }

    @Override // com.yandex.plus.webview.core.javascript.a
    public final String a() {
        return "__webviewPaymentWidget";
    }

    @JavascriptInterface
    public final String getToken() {
        if (this.c) {
            return null;
        }
        return (String) this.b.get();
    }

    @JavascriptInterface
    public final void onEvent(@NotNull String str) {
        str.getClass();
        com.yandex.plus.core.analytics.logging.e.b(com.yandex.plus.core.analytics.logging.b.c, "onEvent() " + str + " ignored");
    }
}
