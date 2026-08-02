package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.x0q;
import defpackage.z7o;
import defpackage.zh;

/* loaded from: classes4.dex */
public final class f extends cg6 {
    public Context j;
    public com.yandex.passport.internal.properties.g k;
    public zh l;
    public x0q m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ k q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object e = this.q.e(null, null, null, null, this);
        return e == nm6.a ? e : new z7o(e);
    }
}
