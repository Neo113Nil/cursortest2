package com.yandex.passport.data.network;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class zb extends cg6 {
    public com.yandex.passport.common.network.o j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ac l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(ac acVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = acVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
