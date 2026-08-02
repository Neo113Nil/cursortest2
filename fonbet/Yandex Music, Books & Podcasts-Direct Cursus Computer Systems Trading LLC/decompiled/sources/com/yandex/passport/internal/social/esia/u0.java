package com.yandex.passport.internal.social.esia;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class u0 extends cg6 {
    public s0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ w0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = w0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, null, null, null, this);
    }
}
