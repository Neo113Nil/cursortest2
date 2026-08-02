package com.yandex.passport.internal.ui.router;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class p extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ q l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = qVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, false, this);
    }
}
