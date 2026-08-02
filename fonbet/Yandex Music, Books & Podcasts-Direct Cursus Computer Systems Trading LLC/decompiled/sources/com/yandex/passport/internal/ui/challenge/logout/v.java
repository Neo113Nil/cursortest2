package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class v extends cg6 {
    public com.yandex.passport.common.core.f j;
    public com.yandex.passport.internal.social.esia.o k;
    public /* synthetic */ Object l;
    public final /* synthetic */ com.yandex.passport.internal.social.esia.o m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.yandex.passport.internal.social.esia.o oVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.n(null, null, null, this);
    }
}
