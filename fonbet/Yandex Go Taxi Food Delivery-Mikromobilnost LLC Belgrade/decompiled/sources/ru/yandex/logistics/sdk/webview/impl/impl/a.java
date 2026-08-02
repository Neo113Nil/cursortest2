package ru.yandex.logistics.sdk.webview.impl.impl;

import defpackage.gi7;
import defpackage.tls;
import ru.yandex.taxi.logistics.sdk.webview.api.js.CallJsInterfaceApi;

/* loaded from: classes5.dex */
public final class a extends gi7 {
    public final tls a;

    public a(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.gi7
    public final void a(CallJsInterfaceApi callJsInterfaceApi) {
        callJsInterfaceApi.addMethod("requestHideWebView", new DeliveryCallJsInterfaceFactory$applyPlugins$1(2, this, a.class, "hideWebView", "hideWebView(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/webview/api/js/CallJsInterfaceApi$MethodResult;", 4));
    }
}
