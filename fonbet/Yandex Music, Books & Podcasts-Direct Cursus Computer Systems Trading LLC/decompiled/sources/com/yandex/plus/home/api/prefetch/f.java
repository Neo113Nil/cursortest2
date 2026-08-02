package com.yandex.plus.home.api.prefetch;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class f extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ l l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, this);
    }
}
