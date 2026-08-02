package com.yandex.plus.pay.internal.analytics;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public f j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, null, this);
    }
}
