package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class j1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ k1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = k1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object G = this.k.G(null, 0, this);
        return G == nm6.a ? G : new z7o(G);
    }
}
