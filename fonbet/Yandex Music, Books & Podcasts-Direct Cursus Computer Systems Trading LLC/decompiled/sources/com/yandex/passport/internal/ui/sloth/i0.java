package com.yandex.passport.internal.ui.sloth;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class i0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ j0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = j0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
