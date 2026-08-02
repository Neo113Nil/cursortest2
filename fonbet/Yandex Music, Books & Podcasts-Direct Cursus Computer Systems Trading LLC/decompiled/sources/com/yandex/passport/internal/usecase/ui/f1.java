package com.yandex.passport.internal.usecase.ui;

import defpackage.cg6;
import defpackage.w4i;

/* loaded from: classes4.dex */
public final class f1 extends cg6 {
    public com.yandex.passport.internal.ui.domik.d j;
    public w4i k;
    public com.yandex.passport.internal.ui.f l;
    public /* synthetic */ Object m;
    public final /* synthetic */ i1 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(i1 i1Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = i1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.w(null, null, null, this);
    }
}
