package com.yandex.plus.bdui.plus.checkout.content.controller;

import defpackage.b6e;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class i0 extends c {
    public final com.yandex.passport.internal.flags.experiments.p c;
    public final com.yandex.plus.bdui.plus.checkout.utils.a d;
    public final com.yandex.plus.log.api.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.yandex.plus.bdui.m mVar, int i, com.yandex.passport.internal.flags.experiments.p pVar, com.yandex.plus.log.api.b bVar) {
        super(mVar, i);
        mVar.getClass();
        bVar.getClass();
        this.c = pVar;
        this.d = com.yandex.plus.bdui.plus.checkout.utils.a.a;
        this.e = bVar;
    }

    public static final String d(i0 i0Var, String str, com.yandex.plus.bdui.action.a aVar, Map map) {
        return "onUpdateStateAsync(); dispatch " + str + " action = " + aVar + " with payload = " + map;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.yandex.plus.bdui.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        h0 h0Var;
        int i;
        com.yandex.plus.bdui.plus.checkout.payment.h hVar;
        com.yandex.plus.bdui.action.a aVar;
        if (continuation instanceof h0) {
            h0Var = (h0) continuation;
            int i2 = h0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = h0Var.k;
                nm6 nm6Var = nm6.a;
                i = h0Var.m;
                com.yandex.plus.log.api.b bVar = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean z = dVar.d;
                    com.yandex.plus.bdui.content.a aVar2 = dVar.b;
                    if (!z) {
                        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar3)) {
                            bVar.c(aVar3, "PlusPayPurchaseContentController", "onUpdateStateAsync(); make payment for productId = " + ((com.yandex.plus.bdui.plus.checkout.content.o) aVar2).a);
                        }
                        com.yandex.plus.bdui.plus.checkout.content.o oVar = (com.yandex.plus.bdui.plus.checkout.content.o) aVar2;
                        String str = oVar.a;
                        com.yandex.plus.pay.inapp.api.h hVar2 = oVar.b;
                        h0Var.j = dVar;
                        h0Var.m = 1;
                        obj = this.c.C(str, hVar2, h0Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = h0Var.j;
                qgg.h0(obj);
                hVar = (com.yandex.plus.bdui.plus.checkout.payment.h) obj;
                this.d.getClass();
                Map a = com.yandex.plus.bdui.plus.checkout.utils.a.a(hVar);
                if (!(hVar instanceof com.yandex.plus.bdui.plus.checkout.payment.g)) {
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar4)) {
                        bVar.c(aVar4, "PlusPayPurchaseContentController", "onUpdateStateAsync(); payment succeeded");
                    }
                    if (bVar.b(aVar4)) {
                        bVar.c(aVar4, "PlusPayPurchaseContentController", d(this, "next", ((com.yandex.plus.bdui.plus.checkout.content.o) dVar.b).c, a));
                    }
                    aVar = ((com.yandex.plus.bdui.plus.checkout.content.o) dVar.b).c;
                } else if (hVar.equals(com.yandex.plus.bdui.plus.checkout.payment.e.a)) {
                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar5)) {
                        bVar.c(aVar5, "PlusPayPurchaseContentController", "onUpdateStateAsync(); payment cancelled");
                    }
                    if (bVar.b(aVar5)) {
                        bVar.c(aVar5, "PlusPayPurchaseContentController", d(this, "cancel", ((com.yandex.plus.bdui.plus.checkout.content.o) dVar.b).d, a));
                    }
                    aVar = ((com.yandex.plus.bdui.plus.checkout.content.o) dVar.b).d;
                } else {
                    if (!(hVar instanceof com.yandex.plus.bdui.plus.checkout.payment.f)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.e;
                    if (bVar.b(aVar6)) {
                        bVar.c(aVar6, "PlusPayPurchaseContentController", "onUpdateStateAsync(); payment failed with error code = ".concat(((com.yandex.plus.bdui.plus.checkout.payment.f) hVar).a));
                    }
                    com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar7)) {
                        bVar.c(aVar7, "PlusPayPurchaseContentController", d(this, "fail", ((com.yandex.plus.bdui.plus.checkout.content.o) dVar.b).e, a));
                    }
                    aVar = ((com.yandex.plus.bdui.plus.checkout.content.o) dVar.b).e;
                }
                this.a.a.a(aVar, new com.yandex.plus.bdui.action.h(dVar.c), a);
                return Unit.a;
            }
        }
        h0Var = new h0(this, continuation);
        Object obj2 = h0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = h0Var.m;
        com.yandex.plus.log.api.b bVar2 = this.e;
        if (i != 0) {
        }
        hVar = (com.yandex.plus.bdui.plus.checkout.payment.h) obj2;
        this.d.getClass();
        Map a2 = com.yandex.plus.bdui.plus.checkout.utils.a.a(hVar);
        if (!(hVar instanceof com.yandex.plus.bdui.plus.checkout.payment.g)) {
        }
        this.a.a.a(aVar, new com.yandex.plus.bdui.action.h(dVar.c), a2);
        return Unit.a;
    }
}
