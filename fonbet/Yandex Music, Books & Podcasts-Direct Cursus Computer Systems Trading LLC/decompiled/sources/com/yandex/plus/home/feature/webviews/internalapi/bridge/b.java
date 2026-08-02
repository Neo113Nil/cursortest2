package com.yandex.plus.home.feature.webviews.internalapi.bridge;

import com.yandex.passport.internal.core.accounts.h;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ h k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object Q = this.k.Q(null, this);
        return Q == nm6.a ? Q : new z7o(Q);
    }
}
