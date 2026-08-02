package com.yandex.passport.internal.network;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class i extends cg6 {
    public String j;
    public String k;
    public com.yandex.passport.internal.storage.datastore.f l;
    public /* synthetic */ Object m;
    public final /* synthetic */ l n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, this);
    }
}
