package com.yandex.passport.internal.usecase;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class t extends cg6 {
    public u j;
    public s k;
    public /* synthetic */ Object l;
    public final /* synthetic */ u m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return u.u(this.m, null, this);
    }
}
