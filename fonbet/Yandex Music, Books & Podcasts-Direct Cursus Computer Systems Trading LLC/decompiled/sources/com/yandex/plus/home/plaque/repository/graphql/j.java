package com.yandex.plus.home.plaque.repository.graphql;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.a0;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.cg6;
import java.util.Map;

/* loaded from: classes5.dex */
public final class j extends cg6 {
    public a0 j;
    public Map k;
    public String l;
    public x m;
    public /* synthetic */ Object n;
    public final /* synthetic */ com.yandex.passport.internal.entities.j o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.yandex.passport.internal.entities.j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.s(null, null, null, null, this);
    }
}
