package com.yandex.passport.sloth.command.performers;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class f0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ g0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = g0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.n(null, this);
    }
}
