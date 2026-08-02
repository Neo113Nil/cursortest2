package com.yandex.plus.home.graphql.plusstate;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public com.yandex.plus.core.openapi.f j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object a = f.a(this.l, this);
        return a == nm6.a ? a : new z7o(a);
    }
}
