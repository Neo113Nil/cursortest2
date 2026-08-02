package com.yandex.passport.internal.autologin;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class f extends cg6 {
    public e j;
    public com.yandex.passport.internal.l k;
    public /* synthetic */ Object l;
    public final /* synthetic */ k m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.u(null, this);
    }
}
