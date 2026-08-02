package com.yandex.plus.bdui.plus.action;

import com.yandex.passport.sloth.command.data.k0;
import com.yandex.plus.bdui.plus.content.serializer.h2;
import defpackage.btf;
import defpackage.jyr;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class k implements com.yandex.plus.bdui.action.d {
    public final /* synthetic */ int a = 1;
    public final com.yandex.plus.log.api.b b;
    public final Object c;
    public final Object d;

    public k(com.yandex.plus.bdui.plus.analytics.c cVar, com.yandex.plus.log.api.b bVar) {
        cVar.getClass();
        bVar.getClass();
        this.c = cVar;
        this.b = bVar;
        this.d = btf.b(new k0(20));
    }

    @Override // com.yandex.plus.bdui.action.d
    public final void a(com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.i iVar) {
        switch (this.a) {
            case 0:
                j jVar = (j) aVar;
                jVar.getClass();
                Map map = iVar.d;
                com.yandex.plus.bdui.action.a c = ((com.yandex.plus.bdui.a) ((Function0) this.d).invoke()).c((com.yandex.plus.bdui.plus.content.j) ((h2) this.c).invoke(jVar.a));
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                com.yandex.plus.log.api.b bVar = this.b;
                if (bVar.b(aVar2)) {
                    bVar.c(aVar2, "PlusFailureActionHandler", "handle(); dispatch failure action = " + c + " with payload = " + map + ' ');
                }
                iVar.a.a.a(c, iVar.b, map);
                break;
            default:
                p pVar = (p) aVar;
                pVar.getClass();
                List<c> list = pVar.a;
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                com.yandex.plus.log.api.b bVar2 = this.b;
                if (bVar2.b(aVar3)) {
                    bVar2.c(aVar3, "PlusSendAnalyticsActionHandler", "handle(); events size = " + list);
                }
                for (c cVar : list) {
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar4)) {
                        bVar2.c(aVar4, "PlusSendAnalyticsActionHandler", "handle(); event = " + cVar);
                    }
                    String str = cVar.a;
                    if (str != null && !StringsKt.U(str)) {
                        Object value = ((jyr) this.d).getValue();
                        value.getClass();
                        if (!((Set) value).add(cVar.a)) {
                            com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.d;
                            if (bVar2.b(aVar5)) {
                                bVar2.c(aVar5, "PlusSendAnalyticsActionHandler", "handle(); event duplicated!");
                            }
                        }
                    }
                    if (bVar2.b(aVar4)) {
                        bVar2.c(aVar4, "PlusSendAnalyticsActionHandler", "handle(); send event");
                    }
                    ((com.yandex.plus.bdui.plus.analytics.c) this.c).a(cVar.b, new com.yandex.plus.bdui.flex.factory.p(3, this, cVar, iVar));
                }
                break;
        }
    }

    public k(h2 h2Var, Function0 function0, com.yandex.plus.log.api.b bVar) {
        function0.getClass();
        bVar.getClass();
        this.c = h2Var;
        this.d = function0;
        this.b = bVar;
    }
}
