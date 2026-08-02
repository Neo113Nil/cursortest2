package com.yandex.passport.internal.sloth.credentialmanager;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class g extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ k k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object b = this.k.b(null, null, this);
        return b == nm6.a ? b : new z7o(b);
    }
}
