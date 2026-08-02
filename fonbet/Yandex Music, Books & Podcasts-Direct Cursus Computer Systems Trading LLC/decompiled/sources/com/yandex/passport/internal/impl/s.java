package com.yandex.passport.internal.impl;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class s extends cg6 {
    public x j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object d = this.l.d(null, this);
        return d == nm6.a ? d : new z7o(d);
    }
}
