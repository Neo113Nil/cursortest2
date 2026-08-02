package com.yandex.plus.bdui.flex.ui.content;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import com.yandex.plus.bdui.flex.factory.p;
import com.yandex.plus.bdui.flex.ui.h;
import com.yandex.plus.bdui.flex.ui.i;
import com.yandex.plus.bdui.flex.ui.n;
import com.yandex.plus.bdui.flex.ui.o;
import defpackage.aw5;
import defpackage.b6e;
import defpackage.btf;
import defpackage.ee6;
import defpackage.gld;
import defpackage.jyr;
import defpackage.lxe;
import defpackage.os7;
import defpackage.tf6;
import defpackage.ub6;

/* loaded from: classes4.dex */
public final class e extends ub6 {
    public final jyr b;

    public e(com.yandex.plus.bdui.flex.utils.b bVar, com.yandex.plus.bdui.ui.a aVar, os7 os7Var) {
        aVar.getClass();
        this.b = btf.b(new p(1, os7Var, aVar, bVar));
    }

    @Override // defpackage.p9
    public final void A(View view) {
        view.getClass();
        com.yandex.plus.bdui.flex.ui.b bVar = (com.yandex.plus.bdui.flex.ui.b) this.b.getValue();
        bVar.getClass();
        com.yandex.plus.log.api.b bVar2 = bVar.o;
        String str = bVar.p;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar2.b(aVar)) {
            bVar2.c(aVar, str, "onDestroyView()");
        }
        bVar.c();
    }

    @Override // defpackage.p9
    public final void B(Object obj) {
        ((com.yandex.plus.bdui.flex.ui.b) this.b.getValue()).b((ee6) obj);
    }

    @Override // defpackage.ub6
    public final void G(aw5 aw5Var) {
        com.yandex.plus.bdui.flex.ui.b bVar = (com.yandex.plus.bdui.flex.ui.b) this.b.getValue();
        h0 h0Var = new h0(this, aw5Var);
        bVar.getClass();
        com.yandex.plus.log.api.b bVar2 = bVar.o;
        String str = bVar.p;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar2.b(aVar)) {
            bVar2.c(aVar, str, "onRenderingFinished()");
        }
        tf6 tf6Var = bVar.q;
        if (tf6Var == null || !gld.T(tf6Var)) {
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
            if (bVar2.b(aVar2)) {
                bVar2.c(aVar2, str, "onRenderingFinished(); update scope is not active!");
                return;
            }
            return;
        }
        if (bVar2.b(aVar)) {
            bVar2.c(aVar, str, "onRenderingFinished(); update scope is active");
        }
        o oVar = bVar.f;
        com.yandex.plus.log.api.b bVar3 = oVar.b;
        if (bVar3.b(aVar)) {
            bVar3.c(aVar, "PlusUiControllerUpdateSchedulerImpl", "scheduleAfterUpdate()");
        }
        n nVar = (n) oVar.c.get(bVar);
        if (nVar == null) {
            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
            if (bVar3.b(aVar3)) {
                bVar3.c(aVar3, "PlusUiControllerUpdateSchedulerImpl", "scheduleAfterUpdate(); coordinator for controller not found, ignore action");
                return;
            }
            return;
        }
        com.yandex.passport.internal.ui.challenge.vpn.c cVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, h0Var, lxe.class, "suspendConversion1", "scheduleAfterUpdate$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 10);
        com.yandex.plus.log.api.b bVar4 = nVar.i;
        if (bVar4.b(aVar)) {
            bVar4.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "scheduleAfterUpdate()");
        }
        i iVar = nVar.j;
        if (iVar.equals(com.yandex.plus.bdui.flex.ui.g.c)) {
            if (bVar4.b(aVar)) {
                bVar4.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "scheduleAfterUpdate(); update not started yet, store action for future use");
            }
            nVar.l = cVar;
            return;
        }
        if (iVar instanceof h) {
            if (bVar4.b(aVar)) {
                bVar4.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "scheduleAfterUpdate(); update already started, schedule action");
            }
            nVar.i(((h) iVar).a, cVar);
        } else if (iVar.equals(com.yandex.plus.bdui.flex.ui.g.b)) {
            if (bVar4.b(aVar)) {
                bVar4.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "scheduleAfterUpdate(); update finished, execute action immediately");
            }
            nVar.e(cVar);
        } else {
            if (!iVar.equals(com.yandex.plus.bdui.flex.ui.g.a)) {
                b6e.s();
                return;
            }
            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.d;
            if (bVar4.b(aVar4)) {
                bVar4.c(aVar4, "PlusUiControllerUpdateCoordinatorImpl", "scheduleAfterUpdate(); update has been cancelled!");
            }
        }
    }

    @Override // defpackage.p9
    public final View z(ViewGroup viewGroup) {
        viewGroup.getClass();
        return ((com.yandex.plus.bdui.flex.ui.b) this.b.getValue()).a(viewGroup);
    }
}
