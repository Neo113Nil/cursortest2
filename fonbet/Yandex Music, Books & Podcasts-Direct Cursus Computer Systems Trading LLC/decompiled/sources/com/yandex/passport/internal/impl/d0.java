package com.yandex.passport.internal.impl;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class d0 extends cg6 {
    public x j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = f0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object v = this.l.v(null, this);
        return v == nm6.a ? v : new z7o(v);
    }
}
