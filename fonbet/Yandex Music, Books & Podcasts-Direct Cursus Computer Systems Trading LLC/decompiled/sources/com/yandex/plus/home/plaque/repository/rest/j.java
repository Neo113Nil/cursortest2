package com.yandex.plus.home.plaque.repository.rest;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class j extends cg6 {
    public Long j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ o m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(this);
    }
}
