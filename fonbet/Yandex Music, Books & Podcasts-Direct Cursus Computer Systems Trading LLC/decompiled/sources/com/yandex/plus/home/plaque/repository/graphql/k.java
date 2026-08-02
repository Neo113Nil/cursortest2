package com.yandex.plus.home.plaque.repository.graphql;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.c6;
import com.yandex.plus.plaquesdk.plaque.api.models.display.x;
import defpackage.cg6;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class k extends cg6 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ com.yandex.passport.internal.entities.j D;
    public int E;
    public c6 j;
    public Map k;
    public Map l;
    public Map m;
    public Set n;
    public x o;
    public com.yandex.plus.plaquesdk.plaque.api.models.a p;
    public Serializable q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Serializable w;
    public com.yandex.plus.plaquesdk.plaque.api.models.a x;
    public x y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.yandex.passport.internal.entities.j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.D = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.u(null, null, null, null, null, this);
    }
}
