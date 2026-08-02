package com.yandex.plus.pay.graphql.offers;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class g extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ j k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, null, null, null, null, false, false, null, this);
    }
}
