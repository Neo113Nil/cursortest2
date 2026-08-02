package com.yandex.passport.data.network;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class x6 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ y6 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(y6 y6Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = y6Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.s(null, this);
    }
}
