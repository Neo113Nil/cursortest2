package com.yandex.passport.sloth.url;

import defpackage.cg6;
import defpackage.nm6;

/* loaded from: classes4.dex */
public final class h extends cg6 {
    public com.yandex.passport.common.core.f j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ v m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v vVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object k = this.m.k(this, null, null);
        if (k == nm6.a) {
            return k;
        }
        String str = (String) k;
        if (str != null) {
            return new com.yandex.passport.common.url.b(str);
        }
        return null;
    }
}
