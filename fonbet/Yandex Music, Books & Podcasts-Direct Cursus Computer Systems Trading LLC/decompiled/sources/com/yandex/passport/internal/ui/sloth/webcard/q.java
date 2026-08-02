package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class q extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ com.yandex.passport.internal.social.esia.o k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.yandex.passport.internal.social.esia.o oVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.m(this);
    }
}
