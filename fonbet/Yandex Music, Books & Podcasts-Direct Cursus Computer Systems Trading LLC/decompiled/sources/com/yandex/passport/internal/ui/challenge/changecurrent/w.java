package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class w extends cg6 {
    public com.yandex.passport.common.core.f j;
    public /* synthetic */ Object k;
    public final /* synthetic */ y l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = yVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.m(null, this);
    }
}
