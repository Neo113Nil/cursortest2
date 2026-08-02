package com.yandex.passport.internal.push;

import com.yandex.passport.api.v2;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class p0 extends cg6 {
    public com.yandex.passport.internal.l j;
    public v2 k;
    public String l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ s0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = s0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.d(null, null, null, false, false, false, this);
    }
}
