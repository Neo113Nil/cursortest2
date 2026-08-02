package com.yandex.plus.home.payment.google;

import defpackage.cg6;
import defpackage.oqi;

/* loaded from: classes5.dex */
public final class f extends cg6 {
    public a j;
    public oqi k;
    public g l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ g o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
