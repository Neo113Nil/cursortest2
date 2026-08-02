package com.yandex.passport.internal.usecase;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class d2 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ e2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e2 e2Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = e2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.x(null, this);
    }
}
