package com.yandex.plus.home.feature.webviews.internal.stories;

import android.webkit.JavascriptInterface;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a extends com.yandex.plus.webview.api.contract.b implements com.yandex.plus.webview.core.javascript.a {
    public final Function0 b;

    public a(Function0 function0) {
        function0.getClass();
        this.b = function0;
    }

    @Override // com.yandex.plus.webview.core.javascript.a
    public final String a() {
        return "__plusSDKInitialStoryState";
    }

    @JavascriptInterface
    public final String getData() {
        return (String) this.b.invoke();
    }
}
