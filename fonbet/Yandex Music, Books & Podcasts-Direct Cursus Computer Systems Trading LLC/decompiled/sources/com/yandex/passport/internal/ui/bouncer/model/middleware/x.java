package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class x extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ y k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = yVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return y.b(this.k, null, this);
    }
}
