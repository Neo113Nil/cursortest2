package com.yandex.plus.bdui.plus.checkout.payment;

import com.yandex.passport.internal.flags.experiments.p;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class b extends cg6 {
    public String j;
    public com.yandex.plus.pay.inapp.api.h k;
    public p l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ p p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.C(null, null, this);
    }
}
