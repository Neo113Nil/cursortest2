package com.yandex.passport.internal.ui.challenge;

import defpackage.bsh;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class v extends cg6 {
    public bsh j;
    public c0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bsh m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(bsh bshVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = bshVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g0(null, this);
    }
}
