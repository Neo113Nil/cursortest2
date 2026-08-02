package com.yandex.passport.data.network.core;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class a extends cg6 {
    public b j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ b m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return b.w(this.m, null, this);
    }
}
