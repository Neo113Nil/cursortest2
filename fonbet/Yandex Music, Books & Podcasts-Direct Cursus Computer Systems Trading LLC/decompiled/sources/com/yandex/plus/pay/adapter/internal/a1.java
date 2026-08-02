package com.yandex.plus.pay.adapter.internal;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class a1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ c1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = c1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(this);
    }
}
