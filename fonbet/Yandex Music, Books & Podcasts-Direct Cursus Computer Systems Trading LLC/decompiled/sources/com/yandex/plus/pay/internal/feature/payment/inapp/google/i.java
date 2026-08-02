package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import com.yandex.plus.pay.api.feature.tarifficator.payment.p;
import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class i extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, Continuation continuation) {
        super(2, continuation);
        this.l = nVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        i iVar = new i(this.l, continuation);
        iVar.k = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((p) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        n nVar = this.l;
        com.yandex.plus.core.benchmark.l lVar = nVar.o;
        p pVar = (p) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            if (com.yandex.plus.bdui.plus.analytics.b.q(pVar)) {
                lVar.d();
                ((com.yandex.plus.core.benchmark.c) nVar.m).c(lVar, null);
                com.yandex.plus.pay.internal.feature.cache.b bVar = nVar.h;
                this.k = pVar;
                this.j = 1;
                if (bVar.a(this) == nm6Var) {
                    return nm6Var;
                }
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        nVar.l.g(com.yandex.plus.pay.common.internal.log.a.b, "Collect in-app payment state: ".concat(com.yandex.plus.bdui.plus.analytics.b.m(pVar)), null);
        return Unit.a;
    }
}
