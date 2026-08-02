package com.yandex.passport.internal.usecase.ui;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class m1 extends cg6 {
    public j1 j;
    public com.yandex.passport.common.core.b k;
    public String l;
    public String m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ n1 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, cg6 cg6Var) {
        super(cg6Var);
        this.p = n1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.x(null, this);
    }
}
