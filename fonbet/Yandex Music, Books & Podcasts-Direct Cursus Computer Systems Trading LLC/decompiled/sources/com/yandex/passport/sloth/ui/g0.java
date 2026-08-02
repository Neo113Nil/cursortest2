package com.yandex.passport.sloth.ui;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class g0 extends cg6 {
    public com.yandex.passport.sloth.p j;
    public com.yandex.passport.sloth.p k;
    public com.yandex.passport.common.core.f l;
    public /* synthetic */ Object m;
    public final /* synthetic */ com.yandex.passport.internal.ui.challenge.changecurrent.y n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.yandex.passport.internal.ui.challenge.changecurrent.y yVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = yVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.l(null, this);
    }
}
