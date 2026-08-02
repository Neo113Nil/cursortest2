package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.cg6;
import defpackage.oqi;

/* loaded from: classes5.dex */
public final class w extends cg6 {
    public PlusPayInvoice j;
    public oqi k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ x n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
