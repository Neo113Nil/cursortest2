package com.yandex.plus.home.plaque.repository.rest;

import defpackage.cg6;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class m extends cg6 {
    public List j;
    public List k;
    public Map l;
    public com.yandex.plus.home.benchmark.b m;
    public com.yandex.plus.home.plaque.repository.api.model.b n;
    public /* synthetic */ Object o;
    public final /* synthetic */ o p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.i(null, null, null, null, null, null, this);
    }
}
