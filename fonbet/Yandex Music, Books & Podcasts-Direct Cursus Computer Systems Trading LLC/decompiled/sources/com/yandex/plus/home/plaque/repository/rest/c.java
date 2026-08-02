package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.plus.home.datasource.openapi.models.e8;
import com.yandex.plus.plaquesdk.plaque.api.models.c0;
import com.yandex.plus.plaquesdk.plaque.api.models.display.x;
import defpackage.cg6;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public final /* synthetic */ com.yandex.passport.internal.core.accounts.h A;
    public int B;
    public e8 j;
    public Map k;
    public Map l;
    public Set m;
    public Map n;
    public String o;
    public c0 p;
    public Object q;
    public Object r;
    public String s;
    public c0 t;
    public com.yandex.plus.plaquesdk.plaque.api.models.a u;
    public x v;
    public Collection w;
    public int x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.yandex.passport.internal.core.accounts.h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.A = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.h(null, null, null, null, null, this);
    }
}
