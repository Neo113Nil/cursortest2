package com.yandex.plus.home.plaque.plugin.internal.proxy;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class e extends cg6 {
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(0, 0, this);
    }
}
