package com.yandex.plus.domain.auth.impl;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class b extends cg6 {
    public int A;
    public Long j;
    public com.yandex.plus.adapter.auth.api.e k;
    public i l;
    public com.yandex.plus.adapter.auth.api.a m;
    public com.yandex.plus.adapter.auth.passport750.i n;
    public oqi o;
    public com.yandex.plus.adapter.auth.passport750.i p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, cg6 cg6Var) {
        super(cg6Var);
        this.z = iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        Object c = this.z.c(null, false, this);
        return c == nm6.a ? c : new z7o(c);
    }
}
