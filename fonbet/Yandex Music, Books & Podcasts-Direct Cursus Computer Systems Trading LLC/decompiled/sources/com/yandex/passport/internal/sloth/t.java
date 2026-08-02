package com.yandex.passport.internal.sloth;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class t extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ w k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = wVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object d = this.k.d(null, null, null, null, this);
        return d == nm6.a ? d : new z7o(d);
    }
}
