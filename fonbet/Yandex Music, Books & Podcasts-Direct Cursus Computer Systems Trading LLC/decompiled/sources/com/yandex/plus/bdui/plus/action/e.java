package com.yandex.plus.bdui.plus.action;

import defpackage.l1p;
import defpackage.tf6;
import defpackage.x97;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class e implements com.yandex.plus.bdui.action.d {
    public final /* synthetic */ int a = 1;
    public final com.yandex.plus.log.api.b b;
    public final Object c;
    public final Object d;
    public final Object e;

    public e(com.yandex.plus.home.internal.di.y yVar, com.yandex.plus.pay.ui.core.api.domain.a aVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar) {
        yVar.getClass();
        aVar.getClass();
        bVar.getClass();
        this.c = yVar;
        this.d = aVar;
        this.e = tf6Var;
        this.b = bVar;
    }

    public static final void b(e eVar, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.i iVar) {
        iVar.a.a.a(aVar, iVar.b, iVar.d);
    }

    @Override // com.yandex.plus.bdui.action.d
    public final void a(com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.i iVar) {
        switch (this.a) {
            case 0:
                d dVar = (d) aVar;
                dVar.getClass();
                x97.y((tf6) this.e, null, null, new l1p(this, dVar, iVar, null, 25), 3);
                break;
            case 1:
                ((n) aVar).getClass();
                Map map = iVar.d;
                com.yandex.plus.bdui.query.e eVar = (com.yandex.plus.bdui.query.e) ((com.yandex.plus.bdui.plus.scenario.e) this.c).b.d;
                com.yandex.plus.log.api.b bVar = this.b;
                if (eVar == null) {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
                    if (bVar.b(aVar2)) {
                        bVar.c(aVar2, "PlusReloadDocumentActionHandler", "handle(); last query not found!");
                        break;
                    }
                } else {
                    com.yandex.plus.bdui.action.a d = ((com.yandex.plus.bdui.a) ((Function0) this.e).invoke()).d(eVar, false, (com.yandex.plus.bdui.document.e) ((com.yandex.plus.bdui.plus.scenario.h) this.d).invoke(eVar));
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar3)) {
                        bVar.c(aVar3, "PlusReloadDocumentActionHandler", "handle(); dispatch load action = " + d + " with payload = " + map);
                    }
                    iVar.a.a.a(d, iVar.b, map);
                    break;
                }
                break;
            default:
                com.yandex.plus.bdui.plus.checkout.action.f fVar = (com.yandex.plus.bdui.plus.checkout.action.f) aVar;
                fVar.getClass();
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                com.yandex.plus.log.api.b bVar2 = this.b;
                if (bVar2.b(aVar4)) {
                    bVar2.c(aVar4, "PlusPayOpenUrlActionHandler", "handle(); opening url = " + fVar.a + ", authorize = " + fVar.b);
                }
                x97.y((tf6) this.e, null, null, new com.yandex.passport.internal.ui.sloth.q(fVar, this, (Continuation) null, 28), 3);
                break;
        }
    }

    public e(com.yandex.plus.bdui.plus.scenario.e eVar, com.yandex.plus.bdui.plus.scenario.h hVar, Function0 function0, com.yandex.plus.log.api.b bVar) {
        function0.getClass();
        bVar.getClass();
        this.c = eVar;
        this.d = hVar;
        this.e = function0;
        this.b = bVar;
    }

    public e(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j jVar, com.yandex.plus.bdui.plus.auth.a aVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.c = jVar;
        this.d = aVar;
        this.e = tf6Var;
        this.b = bVar;
    }
}
