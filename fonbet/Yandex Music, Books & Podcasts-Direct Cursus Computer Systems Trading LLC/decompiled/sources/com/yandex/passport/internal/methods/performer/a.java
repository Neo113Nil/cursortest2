package com.yandex.passport.internal.methods.performer;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class a extends cg6 {
    public com.yandex.passport.common.core.f j;
    public String k;
    public String l;
    public com.yandex.passport.internal.credentials.f m;
    public com.yandex.passport.internal.l n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ c r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        Object a = c.a(this.r, null, null, null, this);
        return a == nm6.a ? a : new z7o(a);
    }
}
