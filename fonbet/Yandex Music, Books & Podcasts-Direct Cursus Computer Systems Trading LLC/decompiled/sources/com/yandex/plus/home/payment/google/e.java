package com.yandex.plus.home.payment.google;

import defpackage.cg6;
import defpackage.oqi;

/* loaded from: classes5.dex */
public final class e extends cg6 {
    public a j;
    public oqi k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ g n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
