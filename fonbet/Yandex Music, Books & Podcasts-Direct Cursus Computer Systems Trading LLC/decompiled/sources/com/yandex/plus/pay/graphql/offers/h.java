package com.yandex.plus.pay.graphql.offers;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class h extends cg6 {
    public f j;
    public /* synthetic */ Object k;
    public final /* synthetic */ j l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, null, null, null, false, this);
    }
}
