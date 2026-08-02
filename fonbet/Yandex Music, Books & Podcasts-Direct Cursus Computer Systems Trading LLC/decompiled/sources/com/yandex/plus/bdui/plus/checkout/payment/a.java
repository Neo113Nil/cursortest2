package com.yandex.plus.bdui.plus.checkout.payment;

import com.yandex.passport.internal.flags.experiments.p;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class a extends cg6 {
    public String j;
    public p k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ p o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p pVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.v(null, this);
    }
}
