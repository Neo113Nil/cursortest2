package com.yandex.plus.home.internal.di;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class g extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(l lVar, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = lVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new g(this.l, continuation, 0);
            default:
                return new g(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.domain.auth.impl.i iVar = this.l.g;
                    this.k = 1;
                    obj = iVar.e(this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((com.yandex.plus.domain.auth.api.e) obj).getId();
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.payment.google.d dVar = (com.yandex.plus.home.payment.google.d) this.l.z.getValue();
                    this.k = 1;
                    obj = dVar.c.a(new com.yandex.plus.home.payment.google.a(dVar, null, 0), this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar = (com.yandex.plus.home.feature.webviews.internalapi.payment.a) obj;
                return new com.yandex.plus.core.graphql.target.b(aVar.a, aVar.b);
        }
    }
}
