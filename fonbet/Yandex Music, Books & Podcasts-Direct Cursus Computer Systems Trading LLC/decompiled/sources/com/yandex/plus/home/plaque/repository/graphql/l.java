package com.yandex.plus.home.plaque.repository.graphql;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.r1;
import com.yandex.plus.plaquesdk.plaque.api.models.f0;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class l extends cg6 {
    public r1 j;
    public f0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ com.yandex.passport.internal.entities.j m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.yandex.passport.internal.entities.j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.z(null, null, this);
    }
}
