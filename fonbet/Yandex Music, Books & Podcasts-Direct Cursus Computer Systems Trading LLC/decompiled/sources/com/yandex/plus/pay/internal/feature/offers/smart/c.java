package com.yandex.plus.pay.internal.feature.offers.smart;

import defpackage.cg6;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public Set j;
    public com.yandex.plus.pay.api.analytics.c k;
    public Function1 l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ f o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, null, null, null, false, null, this);
    }
}
