package com.yandex.passport.internal.ui.challenge;

import defpackage.cg6;
import defpackage.nm6;

/* loaded from: classes4.dex */
public final class r extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ s k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object e = this.k.e(this, null, null);
        if (e == nm6.a) {
            return e;
        }
        String str = (String) e;
        if (str != null) {
            return new com.yandex.passport.common.url.b(str);
        }
        return null;
    }
}
