package com.yandex.plus.pay.graphql.invoice;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ e k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
