package com.yandex.passport.internal.ui.router;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class w extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ x k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.H(null, null, this);
    }
}
