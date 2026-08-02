package com.yandex.passport.sloth.url;

import defpackage.cg6;
import defpackage.nm6;

/* loaded from: classes4.dex */
public final class o extends cg6 {
    public com.yandex.passport.common.core.f j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v vVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object r = this.l.r(null, null, null, this);
        return r == nm6.a ? r : new com.yandex.passport.common.url.b((String) r);
    }
}
