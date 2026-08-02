package com.yandex.plus.core.network.okhttp.interceptor;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class e extends cg6 {
    public com.yandex.plus.core.network.interceptor.e j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, this);
    }
}
