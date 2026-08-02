package com.yandex.plus.home.plaque.repository.graphql;

import defpackage.cg6;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class o extends cg6 {
    public Map j;
    public Map k;
    public Map l;
    public Collection m;
    public Iterator n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ com.yandex.passport.internal.entities.j s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.yandex.passport.internal.entities.j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.G(null, null, this);
    }
}
