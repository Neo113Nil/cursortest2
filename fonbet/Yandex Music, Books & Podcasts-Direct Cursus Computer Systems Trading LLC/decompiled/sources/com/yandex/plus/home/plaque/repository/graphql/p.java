package com.yandex.plus.home.plaque.repository.graphql;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class p extends cg6 {
    public com.yandex.plus.plaquesdk.plaque.api.models.l j;
    public /* synthetic */ Object k;
    public final /* synthetic */ com.yandex.passport.internal.entities.j l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.yandex.passport.internal.entities.j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.H(this, null, null, null);
    }
}
