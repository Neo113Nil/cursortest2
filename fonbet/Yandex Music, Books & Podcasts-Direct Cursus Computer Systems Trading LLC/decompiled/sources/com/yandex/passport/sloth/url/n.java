package com.yandex.passport.sloth.url;

import defpackage.cg6;
import defpackage.nm6;

/* loaded from: classes4.dex */
public final class n extends cg6 {
    public com.yandex.passport.sloth.data.y j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v vVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object c = v.c(this.l, null, this);
        return c == nm6.a ? c : new com.yandex.passport.common.url.b((String) c);
    }
}
