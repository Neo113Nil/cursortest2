package com.yandex.plus.pay.internal.feature.offers.smart;

import defpackage.cg6;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class d extends cg6 {
    public com.yandex.plus.pay.api.analytics.c j;
    public Function1 k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ f n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, null, null, null, false, null, this);
    }
}
