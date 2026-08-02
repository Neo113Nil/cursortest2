package com.yandex.passport.internal.impl;

import android.content.Context;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class e0 extends cg6 {
    public Context j;
    public com.yandex.passport.internal.properties.g k;
    public x l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ f0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, cg6 cg6Var) {
        super(cg6Var);
        this.p = f0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        Object w = this.p.w(null, null, this);
        return w == nm6.a ? w : new z7o(w);
    }
}
