package com.yandex.passport.internal.sloth.webauthn;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class a extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ c k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object b = this.k.b(null, this);
        return b == nm6.a ? b : new z7o(b);
    }
}
