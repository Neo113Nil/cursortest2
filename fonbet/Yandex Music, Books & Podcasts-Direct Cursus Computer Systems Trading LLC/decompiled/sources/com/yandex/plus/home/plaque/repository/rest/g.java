package com.yandex.plus.home.plaque.repository.rest;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class g extends cg6 {
    public com.yandex.plus.plaquesdk.plaque.api.models.l j;
    public /* synthetic */ Object k;
    public final /* synthetic */ com.yandex.passport.internal.core.accounts.h l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.yandex.passport.internal.core.accounts.h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.O(this, null, null, null);
    }
}
