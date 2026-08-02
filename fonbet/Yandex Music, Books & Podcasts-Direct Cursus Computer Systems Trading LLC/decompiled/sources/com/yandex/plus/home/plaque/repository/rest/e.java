package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.plus.home.datasource.openapi.models.r0;
import com.yandex.plus.home.plaque.repository.api.model.s;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class e extends cg6 {
    public r0 j;
    public com.yandex.passport.internal.core.accounts.h k;
    public LinkedHashMap l;
    public s m;
    public x n;
    public String o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ com.yandex.passport.internal.core.accounts.h s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.yandex.passport.internal.core.accounts.h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object A = this.s.A(null, null, null, this);
        return A == nm6.a ? A : new z7o(A);
    }
}
