package com.yandex.passport.data.network.core;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class w extends cg6 {
    public v j;
    public Object k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ x n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.x(null, this);
    }
}
