package com.yandex.plus.pay.inapp.google.internal;

import defpackage.cg6;
import defpackage.ptm;

/* loaded from: classes5.dex */
public final class f extends cg6 {
    public ptm j;
    public com.yandex.plus.pay.inapp.api.h k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, this);
    }
}
