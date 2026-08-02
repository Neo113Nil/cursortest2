package com.yandex.passport.internal.ui.challenge;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class q extends cg6 {
    public com.yandex.passport.common.core.f j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ s m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, null, null, this);
    }
}
