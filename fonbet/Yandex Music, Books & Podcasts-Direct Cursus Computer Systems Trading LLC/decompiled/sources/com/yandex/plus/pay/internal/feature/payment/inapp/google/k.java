package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import defpackage.aur;
import defpackage.gld;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class k extends aur implements pyc {
    public final /* synthetic */ n j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Continuation continuation) {
        super(3, continuation);
        this.j = nVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new k(this.j, (Continuation) obj3).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        gld.L(this.j.q, null);
        return Unit.a;
    }
}
