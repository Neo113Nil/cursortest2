package com.yandex.plus.home.plaque.repository.graphql;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w1;
import defpackage.cg6;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class n extends cg6 {
    public w1 j;
    public Map k;
    public Map l;
    public Collection m;
    public Iterator n;
    public int o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ com.yandex.passport.internal.entities.j t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.yandex.passport.internal.entities.j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.t = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.E(null, null, this);
    }
}
