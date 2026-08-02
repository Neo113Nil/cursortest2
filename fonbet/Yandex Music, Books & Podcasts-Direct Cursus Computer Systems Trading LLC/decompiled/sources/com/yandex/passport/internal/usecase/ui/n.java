package com.yandex.passport.internal.usecase.ui;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class n extends cg6 {
    public com.yandex.passport.common.core.b j;
    public com.yandex.passport.internal.network.client.j k;
    public /* synthetic */ Object l;
    public final /* synthetic */ o m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.x(null, this);
    }
}
