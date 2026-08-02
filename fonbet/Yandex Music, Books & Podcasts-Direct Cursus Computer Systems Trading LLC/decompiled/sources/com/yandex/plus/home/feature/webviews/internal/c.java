package com.yandex.plus.home.feature.webviews.internal;

import android.webkit.JavascriptInterface;
import defpackage.brr;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c extends com.yandex.plus.webview.api.contract.b implements com.yandex.plus.webview.core.javascript.a {
    public final brr b;

    public c(brr brrVar) {
        this.b = brrVar;
    }

    @Override // com.yandex.plus.webview.core.javascript.a
    public final String a() {
        return "__webviewPaymentCard";
    }

    @JavascriptInterface
    @NotNull
    public final String getPaymentCardId() {
        String str = (String) this.b.get();
        return str == null ? "" : str;
    }
}
