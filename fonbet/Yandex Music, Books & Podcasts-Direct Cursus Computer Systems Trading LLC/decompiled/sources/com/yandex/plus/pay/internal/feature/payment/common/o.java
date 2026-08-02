package com.yandex.plus.pay.internal.feature.payment.common;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class o extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ r k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(this);
    }
}
