package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class j extends cg6 {
    public com.yandex.passport.internal.l j;
    public /* synthetic */ Object k;
    public final /* synthetic */ o l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.i(null, this);
    }
}
