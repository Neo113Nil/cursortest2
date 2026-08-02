package com.yandex.plus.home.dailyquests.repository.rest.prefs;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class b0 extends cg6 {
    public Long j;
    public Object k;
    public d0 l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ d0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, cg6 cg6Var) {
        super(cg6Var);
        this.p = d0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.c(null, this);
    }
}
