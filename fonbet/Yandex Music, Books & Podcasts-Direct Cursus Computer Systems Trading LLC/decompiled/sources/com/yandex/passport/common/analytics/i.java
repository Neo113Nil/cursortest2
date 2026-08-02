package com.yandex.passport.common.analytics;

import defpackage.cg6;
import defpackage.nm6;

/* loaded from: classes4.dex */
public final class i extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ k k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object e = k.e(this.k, this);
        if (e == nm6.a) {
            return e;
        }
        String str = (String) e;
        if (str != null) {
            return new com.yandex.passport.common.value.a(str);
        }
        return null;
    }
}
