package com.yandex.passport.internal.push;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class u extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ z0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z0 z0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = z0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(this);
    }
}
