package com.yandex.plus.domain.auth.impl;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class d extends cg6 {
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ i l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(this);
    }
}
