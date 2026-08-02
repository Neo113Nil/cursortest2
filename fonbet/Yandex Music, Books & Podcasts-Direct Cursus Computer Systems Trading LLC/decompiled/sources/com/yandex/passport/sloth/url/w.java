package com.yandex.passport.sloth.url;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class w extends cg6 {
    public x j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
