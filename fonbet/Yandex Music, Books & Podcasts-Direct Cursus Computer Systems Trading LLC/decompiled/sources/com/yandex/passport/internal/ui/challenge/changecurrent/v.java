package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class v extends cg6 {
    public com.yandex.passport.common.core.f j;
    public y k;
    public y l;
    public /* synthetic */ Object m;
    public final /* synthetic */ y n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = yVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.k(null, null, this);
    }
}
