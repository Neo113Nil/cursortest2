package com.yandex.plus.adapter.auth.passport750;

import com.yandex.passport.api.z1;
import com.yandex.passport.common.network.n;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class h extends cg6 {
    public n j;
    public i k;
    public z1 l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ i p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        Object j = this.p.j(null, this);
        return j == nm6.a ? j : new z7o(j);
    }
}
