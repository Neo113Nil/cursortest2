package com.yandex.passport.common.analytics;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class h extends cg6 {
    public a j;
    public /* synthetic */ Object k;
    public final /* synthetic */ k l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return k.a(this.l, null, null, this);
    }
}
