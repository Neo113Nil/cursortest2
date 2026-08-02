package com.yandex.passport.sloth.ui;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class h0 extends cg6 {
    public com.yandex.passport.sloth.p j;
    public /* synthetic */ Object k;
    public final /* synthetic */ com.yandex.passport.internal.ui.challenge.changecurrent.y l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.yandex.passport.internal.ui.challenge.changecurrent.y yVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = yVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.n(null, this);
    }
}
