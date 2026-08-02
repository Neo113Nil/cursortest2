package com.yandex.passport.internal.usecase.vpn;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class g extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ i k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.u(null, this);
    }
}
