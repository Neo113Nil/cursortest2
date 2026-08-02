package com.yandex.passport.internal.autologin.ui;

import defpackage.bw1;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class o extends cg6 {
    public com.yandex.passport.internal.properties.g j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bw1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bw1 bw1Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = bw1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return bw1.a(this.m, null, this);
    }
}
