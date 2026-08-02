package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class r extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ com.yandex.passport.internal.social.esia.o k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.yandex.passport.internal.social.esia.o oVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object q = this.k.q(null, 0, this);
        return q == nm6.a ? q : new z7o(q);
    }
}
