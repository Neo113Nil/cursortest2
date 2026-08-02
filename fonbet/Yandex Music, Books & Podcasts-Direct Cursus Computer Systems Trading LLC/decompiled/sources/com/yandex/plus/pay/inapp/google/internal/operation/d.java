package com.yandex.plus.pay.inapp.google.internal.operation;

import com.yandex.passport.internal.flags.experiments.p;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class d extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ p k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.z(null, this);
    }
}
