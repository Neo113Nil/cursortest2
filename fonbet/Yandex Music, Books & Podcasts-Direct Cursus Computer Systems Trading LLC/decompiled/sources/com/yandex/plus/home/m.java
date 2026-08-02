package com.yandex.plus.home;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class m extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ t l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(t tVar, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = tVar;
        this.m = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new m(this.l, this.m, continuation, 0);
            default:
                return new m(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((m) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.experiments.impl.providers.h a = this.l.f.a();
                    this.k = 1;
                    if (a.d(this.m, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.graphql.configuration.j jVar = (com.yandex.plus.home.graphql.configuration.j) this.l.f.u.getValue();
                    this.k = 1;
                    Object j0 = x97.y(jVar.e, jVar.f, null, new com.yandex.plus.home.graphql.configuration.e(jVar, this.m, null), 2).j0(this);
                    if (j0 != nm6Var2) {
                        j0 = Unit.a;
                    }
                    if (j0 == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
