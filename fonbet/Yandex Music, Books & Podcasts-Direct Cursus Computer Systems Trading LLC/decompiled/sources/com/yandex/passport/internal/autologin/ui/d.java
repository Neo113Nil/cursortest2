package com.yandex.passport.internal.autologin.ui;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class d extends cg6 {
    public com.yandex.passport.internal.properties.g j;
    public k k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ k n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        Object c = this.n.c(null, null, null, this);
        return c == nm6.a ? c : new z7o(c);
    }
}
