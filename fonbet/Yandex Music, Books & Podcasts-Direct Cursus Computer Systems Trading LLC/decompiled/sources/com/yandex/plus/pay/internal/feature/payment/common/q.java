package com.yandex.plus.pay.internal.feature.payment.common;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class q extends cg6 {
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ r l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return r.b(this.l, 0L, this);
    }
}
