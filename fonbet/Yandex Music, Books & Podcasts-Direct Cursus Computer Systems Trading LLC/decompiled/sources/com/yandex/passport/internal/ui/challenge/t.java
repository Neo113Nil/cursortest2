package com.yandex.passport.internal.ui.challenge;

import defpackage.bsh;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class t extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ bsh k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(bsh bshVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = bshVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return bsh.c(this.k, this);
    }
}
