package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent;

import defpackage.aur;
import defpackage.b6e;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xdr;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = lVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new k(this.l, continuation, 0);
            default:
                return new k(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((k) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    l lVar = this.l;
                    lVar.G(false);
                    lVar.t.b();
                    Unit a = lVar.o.a();
                    if (a != nm6Var) {
                        a = Unit.a;
                    }
                    if (a == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                l lVar2 = this.l;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.c cVar = lVar2.t;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = lVar2.k.a.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar = a2.b;
                    cVar.b();
                    xdr xdrVar = lVar2.u;
                    h hVar = new h(lVar2.a(jVar));
                    xdrVar.getClass();
                    xdrVar.m(null, hVar);
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d dVar = lVar2.m;
                    com.yandex.plus.bdui.templating.render.a aVar = new com.yandex.plus.bdui.templating.render.a(15, lVar2, a2);
                    com.yandex.plus.pay.internal.d dVar2 = new com.yandex.plus.pay.internal.d(9, lVar2, a2);
                    this.k = 1;
                    obj = dVar.a(a2, aVar, dVar2, this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 == 1) {
                    qgg.h0(obj);
                } else if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.h hVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.h) obj;
                if (!(hVar2 instanceof com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.g)) {
                    if (!(hVar2 instanceof com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.f)) {
                        if (!(hVar2 instanceof com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.e)) {
                            b6e.s();
                            break;
                        } else {
                            lVar2.G(true);
                            cVar.b();
                            lVar2.p.a();
                        }
                    } else {
                        this.k = 2;
                        lVar2.G(false);
                        cVar.b();
                        Unit a3 = lVar2.o.a();
                        if (a3 != nm6Var2) {
                            a3 = Unit.a;
                        }
                        if (a3 == nm6Var2) {
                        }
                    }
                } else {
                    cVar.b();
                    lVar2.n.e();
                }
                break;
        }
        return Unit.a;
    }
}
