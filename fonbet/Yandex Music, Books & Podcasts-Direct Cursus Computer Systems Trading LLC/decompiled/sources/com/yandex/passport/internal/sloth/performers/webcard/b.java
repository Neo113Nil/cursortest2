package com.yandex.passport.internal.sloth.performers.webcard;

import com.yandex.passport.common.network.n;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class b extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ n k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = nVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.K(null, this);
    }
}
