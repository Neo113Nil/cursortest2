package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class j extends cg6 {
    public Context j;
    public com.yandex.passport.internal.properties.g k;
    public z7o l;
    public /* synthetic */ Object m;
    public final /* synthetic */ k n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        Object g = this.n.g(null, null, this);
        return g == nm6.a ? g : new z7o(g);
    }
}
