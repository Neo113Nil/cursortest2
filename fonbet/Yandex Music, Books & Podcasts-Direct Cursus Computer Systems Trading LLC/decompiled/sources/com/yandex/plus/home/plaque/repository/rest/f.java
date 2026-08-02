package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.plus.plaquesdk.plaque.api.models.f0;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class f extends cg6 {
    public f0 j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ com.yandex.passport.internal.core.accounts.h m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.yandex.passport.internal.core.accounts.h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.P(null, null, this);
    }
}
