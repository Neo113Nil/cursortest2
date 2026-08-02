package com.yandex.plus.core.graphql.internal;

import com.yandex.plus.core.graphql.u0;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class b extends cg6 {
    public u0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ c l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object a = this.l.a(null, this);
        return a == nm6.a ? a : new z7o(a);
    }
}
