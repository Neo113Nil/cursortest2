package com.yandex.plus.pay.internal.feature.payment.common;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class t extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, Continuation continuation) {
        super(2, continuation);
        this.l = vVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        t tVar = new t(this.l, continuation);
        tVar.k = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((com.yandex.plus.pay.api.feature.tarifficator.payment.p) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        v vVar = this.l;
        com.yandex.plus.core.benchmark.l lVar = vVar.g;
        com.yandex.plus.pay.api.feature.tarifficator.payment.p pVar = (com.yandex.plus.pay.api.feature.tarifficator.payment.p) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            if (com.yandex.plus.bdui.plus.analytics.b.q(pVar)) {
                lVar.d();
                ((com.yandex.plus.core.benchmark.c) vVar.f).c(lVar, null);
                com.yandex.plus.pay.internal.feature.cache.b bVar = vVar.c;
                this.k = null;
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
        return Unit.a;
    }
}
