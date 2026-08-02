package com.yandex.plus.home.dailyquests.repository.rest.prefs;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class c0 extends cg6 {
    public Long j;
    public y k;
    public /* synthetic */ Object l;
    public final /* synthetic */ d0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = d0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, this);
    }
}
