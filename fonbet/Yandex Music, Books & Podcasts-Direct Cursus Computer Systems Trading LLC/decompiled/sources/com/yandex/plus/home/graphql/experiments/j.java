package com.yandex.plus.home.graphql.experiments;

import com.yandex.plus.home.datasource.openapi.models.m2;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class j extends cg6 {
    public m2 j;
    public Object k;
    public com.yandex.plus.core.openapi.f l;
    public /* synthetic */ Object m;
    public final /* synthetic */ k n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        Object a = this.n.a(this);
        return a == nm6.a ? a : new z7o(a);
    }
}
