package ru.yandex.logistics.care.ui;

import defpackage.gi7;
import defpackage.wt8;
import ru.yandex.taxi.logistics.sdk.webview.api.js.CallJsInterfaceApi;

/* loaded from: classes4.dex */
public final class j extends gi7 {
    public final /* synthetic */ l a;
    public final /* synthetic */ wt8 b;

    public j(l lVar, wt8 wt8Var) {
        this.a = lVar;
        this.b = wt8Var;
    }

    @Override // defpackage.gi7
    public final void a(CallJsInterfaceApi callJsInterfaceApi) {
        callJsInterfaceApi.addMethod("requestHideWebView", new CareWebViewViewModelImpl$getCallJsInterfaceFactory$1$applyPlugins$1(this.a, this.b, null));
    }
}
