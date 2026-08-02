package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.plus.home.datasource.openapi.models.g7;
import com.yandex.plus.plaquesdk.plaque.api.models.i0;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class d extends cg6 {
    public g7 j;
    public i0 k;
    public com.yandex.passport.internal.core.accounts.h l;
    public LinkedHashMap m;
    public x n;
    public String o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ com.yandex.passport.internal.core.accounts.h s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.yandex.passport.internal.core.accounts.h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object B = this.s.B(null, null, null, null, this);
        return B == nm6.a ? B : new z7o(B);
    }
}
