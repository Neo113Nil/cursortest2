package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import com.yandex.plus.pay.internal.model.PlusPaySubmitResult;
import defpackage.cg6;
import defpackage.xqn;

/* loaded from: classes5.dex */
public final class m extends cg6 {
    public xqn j;
    public n k;
    public PlusPaySubmitResult l;
    public com.yandex.plus.pay.inapp.api.f m;
    public com.yandex.plus.pay.inapp.api.f n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ n r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = nVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return n.b(this.r, this);
    }
}
