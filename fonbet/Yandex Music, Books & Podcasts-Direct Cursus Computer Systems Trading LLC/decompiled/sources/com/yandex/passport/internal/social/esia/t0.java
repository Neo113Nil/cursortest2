package com.yandex.passport.internal.social.esia;

import defpackage.cg6;
import defpackage.s7e;

/* loaded from: classes4.dex */
public final class t0 extends cg6 {
    public s7e j;
    public /* synthetic */ Object k;
    public final /* synthetic */ w0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(w0 w0Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = w0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
