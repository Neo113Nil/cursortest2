package com.yandex.plus.home.dailyquests.repository.rest;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public Long j;
    public Object k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ c n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return c.a(this.n, null, null, this);
    }
}
