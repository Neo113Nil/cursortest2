package com.yandex.passport.internal.autologin.ui;

import defpackage.bw1;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class s extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ bw1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(bw1 bw1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = bw1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object n = this.k.n(null, null, this);
        return n == nm6.a ? n : new z7o(n);
    }
}
