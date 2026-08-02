package com.yandex.plus.home;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class q extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ t k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = tVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(this);
    }
}
