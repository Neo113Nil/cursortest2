package com.yandex.plus.home.graphql.panel;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ g k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object b = g.b(this.k, null, this);
        return b == nm6.a ? b : new z7o(b);
    }
}
