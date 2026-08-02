package com.yandex.plus.home.datasource.local.preferences;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class h extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ j k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object f = this.k.f(null, null, this);
        return f == nm6.a ? f : new z7o(f);
    }
}
