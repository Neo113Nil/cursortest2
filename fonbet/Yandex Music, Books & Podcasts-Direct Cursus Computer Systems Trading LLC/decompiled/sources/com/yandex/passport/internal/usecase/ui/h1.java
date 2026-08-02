package com.yandex.passport.internal.usecase.ui;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class h1 extends cg6 {
    public e1 j;
    public com.yandex.passport.common.core.b k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ i1 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = i1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        Object z = this.n.z(null, this);
        return z == nm6.a ? z : new z7o(z);
    }
}
