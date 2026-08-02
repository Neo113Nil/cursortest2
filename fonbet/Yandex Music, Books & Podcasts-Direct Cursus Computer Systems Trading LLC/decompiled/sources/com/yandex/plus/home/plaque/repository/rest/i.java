package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.plus.home.datasource.openapi.models.j5;
import defpackage.cg6;
import defpackage.oqi;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class i extends cg6 {
    public j5 j;
    public Map k;
    public com.yandex.plus.home.benchmark.b l;
    public a m;
    public oqi n;
    public Object o;
    public o p;
    public oqi q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ o w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, Continuation continuation) {
        super(continuation);
        this.w = oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return o.f(this.w, null, false, null, null, this);
    }
}
