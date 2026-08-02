package com.yandex.passport.internal.impl;

import android.os.Bundle;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class q extends cg6 {
    public Bundle j;
    public x k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ x n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x xVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        Object v = this.n.v(null, null, this);
        return v == nm6.a ? v : new z7o(v);
    }
}
