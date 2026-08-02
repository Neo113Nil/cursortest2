package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class p extends cg6 {
    public PlusPayInvoice j;
    public j k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ r n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return r.a(this.n, null, 0L, null, this);
    }
}
