package com.yandex.plus.home.auth;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ f k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(this);
    }
}
