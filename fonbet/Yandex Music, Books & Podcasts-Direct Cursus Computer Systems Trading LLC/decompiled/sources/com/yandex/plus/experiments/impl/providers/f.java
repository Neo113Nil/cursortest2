package com.yandex.plus.experiments.impl.providers;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class f extends cg6 {
    public com.yandex.plus.experiments.api.a j;
    public /* synthetic */ Object k;
    public final /* synthetic */ h l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return h.b(this.l, this);
    }
}
