package com.yandex.passport.common.network;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class i0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ j0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = j0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object B = j0.B(this.k, null, this);
        return B == nm6.a ? B : new z7o(B);
    }
}
