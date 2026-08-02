package com.yandex.plus.core.activity.result.internal;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class d extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ h k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object u = this.k.u(null, null, this);
        return u == nm6.a ? u : new z7o(u);
    }
}
