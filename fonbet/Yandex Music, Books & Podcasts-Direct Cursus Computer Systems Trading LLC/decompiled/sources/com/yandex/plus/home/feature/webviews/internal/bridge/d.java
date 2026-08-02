package com.yandex.plus.home.feature.webviews.internal.bridge;

import android.webkit.JavascriptInterface;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d implements com.yandex.plus.webview.core.javascript.a {
    public final c a;

    public d(c cVar) {
        cVar.getClass();
        this.a = cVar;
    }

    @Override // com.yandex.plus.webview.core.javascript.a
    public final String a() {
        return "__plusSDKMobileCompat";
    }

    @JavascriptInterface
    public final void onMessage(@NotNull String str) {
        str.getClass();
        this.a.onMessage(str);
    }
}
