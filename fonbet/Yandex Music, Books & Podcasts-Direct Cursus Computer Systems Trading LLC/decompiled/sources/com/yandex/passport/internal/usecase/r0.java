package com.yandex.passport.internal.usecase;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class r0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ s0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = s0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return s0.w(this.k, null, this);
    }
}
