package com.yandex.passport.common.analytics;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class d extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ f k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, this);
    }
}
