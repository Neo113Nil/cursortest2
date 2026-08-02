package com.yandex.passport.common.analytics;

import defpackage.cg6;
import defpackage.nm6;

/* loaded from: classes4.dex */
public final class j extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ k k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object f = k.f(this.k, this);
        if (f == nm6.a) {
            return f;
        }
        String str = (String) f;
        if (str != null) {
            return new com.yandex.passport.common.value.b(str);
        }
        return null;
    }
}
