package com.yandex.passport.internal.ui.challenge;

import defpackage.bsh;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class u extends cg6 {
    public bsh j;
    public /* synthetic */ Object k;
    public final /* synthetic */ bsh l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(bsh bshVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = bshVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return bsh.e(this.l, this);
    }
}
