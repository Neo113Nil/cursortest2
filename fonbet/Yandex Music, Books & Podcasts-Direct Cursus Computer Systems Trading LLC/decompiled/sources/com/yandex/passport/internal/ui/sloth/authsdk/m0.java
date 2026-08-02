package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class m0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ n0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = n0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
