package com.yandex.passport.internal.push;

import com.yandex.passport.api.v2;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class q0 extends cg6 {
    public com.yandex.passport.internal.l j;
    public v2 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ s0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, cg6 cg6Var) {
        super(cg6Var);
        this.p = s0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.e(null, null, null, false, false, false, this);
    }
}
