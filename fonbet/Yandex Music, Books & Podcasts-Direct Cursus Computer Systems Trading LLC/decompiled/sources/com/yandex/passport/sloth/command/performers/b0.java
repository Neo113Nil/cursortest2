package com.yandex.passport.sloth.command.performers;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class b0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ c0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = c0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
