package com.yandex.plus.home.feature.webviews.internal.webview;

import android.webkit.JavascriptInterface;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public interface g extends com.yandex.plus.webview.api.contract.d, com.yandex.plus.webview.core.javascript.a, com.yandex.plus.webview.api.javascript.a, com.yandex.plus.webview.api.javascript.b {
    @Override // com.yandex.plus.webview.core.javascript.a
    default String a() {
        return "__plusSDKMobileCompat";
    }

    @Override // com.yandex.plus.webview.api.javascript.a
    @JavascriptInterface
    void onMessage(@NotNull String str);
}
