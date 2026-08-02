package com.yandex.plus.bdui.plus.content.controller;

import com.yandex.plus.bdui.plus.content.serializer.t0;
import defpackage.b6e;
import defpackage.hrg;
import defpackage.ouj;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {
    public final com.yandex.plus.bdui.m a;
    public final i b;
    public final com.yandex.plus.bdui.plus.checkout.o c;
    public final com.yandex.plus.log.api.b d;

    public d(com.yandex.plus.bdui.m mVar, i iVar, com.yandex.plus.bdui.plus.checkout.o oVar, com.yandex.plus.log.api.b bVar) {
        mVar.getClass();
        bVar.getClass();
        this.a = mVar;
        this.b = iVar;
        this.c = oVar;
        this.d = bVar;
    }

    public final void a(JSONObject jSONObject, String str, String str2, Map map) {
        Object cVar;
        com.yandex.plus.bdui.content.d dVar = (com.yandex.plus.bdui.content.d) this.b.invoke();
        if (dVar != null) {
            com.yandex.plus.bdui.shared.b bVar = dVar.c;
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
            com.yandex.plus.log.api.b bVar2 = this.d;
            if (bVar2.b(aVar)) {
                bVar2.c(aVar, "CustomViewActionDispatcher", ouj.k('\"', "dispatchAction(); name = \"", str));
            }
            if (bVar2.b(aVar)) {
                bVar2.c(aVar, "CustomViewActionDispatcher", "getAction(); props = " + jSONObject);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("actions");
            if (optJSONObject == null) {
                cVar = new c("\"actions\" dictionary not found in customProps!");
            } else {
                String F = com.yandex.plus.bdui.flex.ui.a.F(str, optJSONObject);
                if (F == null) {
                    cVar = new c(hrg.q("custom action named \"", str, "\" not found in \"actions\" dictionary!"));
                } else {
                    com.yandex.plus.bdui.action.a aVar2 = (com.yandex.plus.bdui.action.a) ((t0) ((com.yandex.plus.bdui.plus.content.i) dVar.b)).b.get(F);
                    cVar = aVar2 == null ? new c(hrg.q("action named \"", F, "\" not found in layout actions!")) : new b(aVar2);
                }
            }
            boolean z = cVar instanceof b;
            com.yandex.plus.bdui.m mVar = this.a;
            if (z) {
                mVar.a.a(((b) cVar).a, new com.yandex.plus.bdui.action.h(bVar.c(new com.yandex.plus.bdui.plus.shared.f(str2))), map);
                return;
            }
            if (!(cVar instanceof c)) {
                b6e.s();
                return;
            }
            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
            boolean b = bVar2.b(aVar3);
            String str3 = ((c) cVar).a;
            if (b) {
                bVar2.c(aVar3, "CustomViewActionDispatcher", "dispatchOnErrorAction(); ".concat(str3));
            }
            com.yandex.plus.bdui.action.a a = this.c.a(new IllegalStateException("PlusDivContent: ".concat(str3)));
            if (bVar2.b(aVar)) {
                bVar2.c(aVar, "CustomViewActionDispatcher", "dispatchOnErrorAction(); dispatch onErrorAction = " + a);
            }
            mVar.a.a(a, new com.yandex.plus.bdui.action.h(bVar), null);
        }
    }
}
