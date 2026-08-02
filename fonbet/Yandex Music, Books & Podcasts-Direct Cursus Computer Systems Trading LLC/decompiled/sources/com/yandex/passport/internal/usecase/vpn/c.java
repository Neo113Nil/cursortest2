package com.yandex.passport.internal.usecase.vpn;

import defpackage.cg6;
import defpackage.qqi;

/* loaded from: classes4.dex */
public final class c extends cg6 {
    public com.yandex.passport.internal.sloth.b j;
    public qqi k;
    public /* synthetic */ Object l;
    public final /* synthetic */ e m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return e.a(this.m, this);
    }
}
