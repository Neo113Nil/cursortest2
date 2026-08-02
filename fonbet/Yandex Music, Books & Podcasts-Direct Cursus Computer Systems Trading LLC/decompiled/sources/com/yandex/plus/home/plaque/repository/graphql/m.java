package com.yandex.plus.home.plaque.repository.graphql;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w1;
import defpackage.cg6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class m extends cg6 {
    public w1 j;
    public Map k;
    public Map l;
    public Map m;
    public List n;
    public Collection o;
    public Collection p;
    public Iterator q;
    public Iterator r;
    public int s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ com.yandex.passport.internal.entities.j w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.yandex.passport.internal.entities.j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.w = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.D(null, null, this);
    }
}
