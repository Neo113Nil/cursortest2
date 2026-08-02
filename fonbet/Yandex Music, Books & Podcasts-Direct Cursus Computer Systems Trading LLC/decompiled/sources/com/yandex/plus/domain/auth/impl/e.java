package com.yandex.plus.domain.auth.impl;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class e extends cg6 {
    public com.yandex.plus.adapter.auth.api.e j;
    public Object k;
    public oqi l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ i r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        Object f = this.r.f(null, this);
        return f == nm6.a ? f : new z7o(f);
    }
}
