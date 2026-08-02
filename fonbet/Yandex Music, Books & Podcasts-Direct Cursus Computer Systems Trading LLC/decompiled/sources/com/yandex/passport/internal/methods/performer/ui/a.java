package com.yandex.passport.internal.methods.performer.ui;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class a extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ b k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object a = b.a(this.k, null, null, this);
        return a == nm6.a ? a : new z7o(a);
    }
}
