package com.yandex.passport.internal.impl;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class t extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ x k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object y = this.k.y(null, this);
        return y == nm6.a ? y : new z7o(y);
    }
}
