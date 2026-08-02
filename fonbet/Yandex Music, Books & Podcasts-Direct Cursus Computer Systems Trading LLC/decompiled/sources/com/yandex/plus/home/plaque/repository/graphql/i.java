package com.yandex.plus.home.plaque.repository.graphql;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0;
import com.yandex.plus.plaquesdk.plaque.api.models.i0;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.cg6;
import java.util.Map;

/* loaded from: classes5.dex */
public final class i extends cg6 {
    public g0 j;
    public Map k;
    public i0 l;
    public String m;
    public x n;
    public /* synthetic */ Object o;
    public final /* synthetic */ com.yandex.passport.internal.entities.j p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.yandex.passport.internal.entities.j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.t(null, null, null, null, null, this);
    }
}
