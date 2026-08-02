package com.yandex.plus.bdui.plus.webview;

import android.webkit.JavascriptInterface;
import defpackage.hrg;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a extends com.yandex.plus.webview.api.contract.b implements com.yandex.plus.webview.core.javascript.a {
    public final com.yandex.plus.bdui.m b;
    public final com.yandex.plus.bdui.action.h c;
    public final Map d;
    public final com.yandex.plus.log.api.b e;

    public a(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.action.h hVar, Map map, com.yandex.plus.log.api.b bVar) {
        mVar.getClass();
        hVar.getClass();
        bVar.getClass();
        this.b = mVar;
        this.c = hVar;
        this.d = map;
        this.e = bVar;
    }

    @Override // com.yandex.plus.webview.core.javascript.a
    public final String a() {
        return "actionDispatcher";
    }

    @JavascriptInterface
    public final void onAction(String str) {
        com.yandex.plus.log.api.b bVar = this.e;
        if (str == null) {
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.d;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "ActionDispatcherContract", "onAction(); action name is empty!");
                return;
            }
            return;
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "ActionDispatcherContract", "onAction(); action name = ".concat(str));
        }
        com.yandex.plus.bdui.action.a aVar3 = (com.yandex.plus.bdui.action.a) this.d.get(str);
        com.yandex.plus.bdui.action.h hVar = this.c;
        com.yandex.plus.bdui.m mVar = this.b;
        if (aVar3 == null) {
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "ActionDispatcherContract", hrg.q("onAction(); action with name = \"", str, "\" not found in web actions, try shared action"));
            }
            mVar.a.a(new com.yandex.plus.bdui.plus.action.q(str), hVar, null);
            return;
        }
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "ActionDispatcherContract", "onAction(); dispatch web action = " + aVar3);
        }
        mVar.a.a(aVar3, hVar, null);
    }
}
