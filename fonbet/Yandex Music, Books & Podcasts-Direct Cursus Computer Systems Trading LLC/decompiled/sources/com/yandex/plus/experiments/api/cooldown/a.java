package com.yandex.plus.experiments.api.cooldown;

import com.yandex.plus.experiments.api.cache.c;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class a extends cg6 {
    public c j;
    public long k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ c n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return c.i(this.n, 0L, this);
    }
}
