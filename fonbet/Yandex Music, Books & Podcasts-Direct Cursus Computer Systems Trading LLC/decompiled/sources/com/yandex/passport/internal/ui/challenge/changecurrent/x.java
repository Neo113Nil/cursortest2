package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class x extends cg6 {
    public p j;
    public y k;
    public /* synthetic */ Object l;
    public final /* synthetic */ y m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = yVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.o(null, this);
    }
}
