package com.yandex.passport.internal.provider.communication;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class n extends cg6 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ p l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
