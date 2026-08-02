package ru.yandex.taxi.web.calljsinterface;

import ru.yandex.taxi.web.WebContentView;

/* loaded from: classes12.dex */
public final class a {
    public final WebContentView a;

    public a(WebContentView webContentView) {
        this.a = webContentView;
    }

    public final void a(CallJsInterfaceApi callJsInterfaceApi) {
        callJsInterfaceApi.addMethod("requestReload", new CommonCallApiJsPlugin$apply$1(2, this, a.class, "requestReload", "requestReload(Ljava/lang/String;)Lru/yandex/taxi/web/calljsinterface/CallJsInterfaceApi$MethodResult;", 4));
    }
}
