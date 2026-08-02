package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class q extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ s k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.h0(this);
    }
}
