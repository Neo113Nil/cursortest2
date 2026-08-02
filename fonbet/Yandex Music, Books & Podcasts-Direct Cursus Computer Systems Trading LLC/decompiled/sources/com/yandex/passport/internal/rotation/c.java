package com.yandex.passport.internal.rotation;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class c extends cg6 {
    public d j;
    public a k;
    public com.yandex.passport.internal.credentials.f l;
    public com.yandex.passport.common.account.a m;
    public g n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ d q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return d.u(this.q, null, this);
    }
}
