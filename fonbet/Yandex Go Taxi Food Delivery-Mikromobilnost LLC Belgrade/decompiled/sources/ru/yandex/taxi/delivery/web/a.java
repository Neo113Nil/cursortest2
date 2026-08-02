package ru.yandex.taxi.delivery.web;

import defpackage.fi7;
import defpackage.tls;
import defpackage.wwh;
import ru.yandex.taxi.web.WebContentView;
import ru.yandex.taxi.web.calljsinterface.CallJsInterfaceApi;

/* loaded from: classes5.dex */
public final class a extends fi7 {
    public final tls a;

    public a(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.fi7
    public final void a(WebContentView webContentView, CallJsInterfaceApi callJsInterfaceApi) {
        callJsInterfaceApi.addMethod("requestHideWebView", new DeliveryCallApiJsPlugin$apply$1(2, new wwh(this.a), wwh.class, "hideWebView", "hideWebView(Ljava/lang/String;)Lru/yandex/taxi/web/calljsinterface/CallJsInterfaceApi$MethodResult;", 4));
    }
}
