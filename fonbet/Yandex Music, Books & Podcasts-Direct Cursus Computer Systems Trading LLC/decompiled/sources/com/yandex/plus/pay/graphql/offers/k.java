package com.yandex.plus.pay.graphql.offers;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class k extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ m k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
