package com.yandex.passport.internal.ui.router;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class v extends cg6 {
    public com.yandex.passport.internal.properties.l j;
    public x k;
    public /* synthetic */ Object l;
    public final /* synthetic */ x m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.G(null, null, this);
    }
}
