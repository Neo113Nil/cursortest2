package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class o0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ q0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = q0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return q0.a(this.k, null, this);
    }
}
