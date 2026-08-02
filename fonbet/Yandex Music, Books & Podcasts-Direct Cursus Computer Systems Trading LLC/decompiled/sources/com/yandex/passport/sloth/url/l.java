package com.yandex.passport.sloth.url;

import defpackage.cg6;
import defpackage.nm6;

/* loaded from: classes4.dex */
public final class l extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ v k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object a = v.a(this.k, null, null, this);
        if (a == nm6.a) {
            return a;
        }
        String str = (String) a;
        if (str != null) {
            return new com.yandex.passport.common.url.b(str);
        }
        return null;
    }
}
