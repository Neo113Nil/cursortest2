package com.yandex.passport.internal.methods.requester;

import androidx.core.app.n0;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class h extends cg6 {
    public f j;
    public /* synthetic */ Object k;
    public final /* synthetic */ n0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n0 n0Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = n0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object r = this.l.r(null, this);
        return r == nm6.a ? r : new z7o(r);
    }
}
