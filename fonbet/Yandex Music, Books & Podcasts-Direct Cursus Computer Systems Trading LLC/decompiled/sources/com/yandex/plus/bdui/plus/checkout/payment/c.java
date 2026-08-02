package com.yandex.plus.bdui.plus.checkout.payment;

import com.yandex.passport.internal.flags.experiments.p;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class c extends cg6 {
    public String j;
    public com.yandex.plus.pay.inapp.api.h k;
    public /* synthetic */ Object l;
    public final /* synthetic */ p m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.H(null, null, this);
    }
}
