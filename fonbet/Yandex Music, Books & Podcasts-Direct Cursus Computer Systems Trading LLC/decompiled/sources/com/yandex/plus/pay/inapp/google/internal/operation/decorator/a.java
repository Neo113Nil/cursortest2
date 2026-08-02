package com.yandex.plus.pay.inapp.google.internal.operation.decorator;

import com.yandex.passport.internal.flags.experiments.p;
import defpackage.cg6;
import defpackage.pz2;

/* loaded from: classes5.dex */
public final class a extends cg6 {
    public pz2 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ p l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p pVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.A(this);
    }
}
