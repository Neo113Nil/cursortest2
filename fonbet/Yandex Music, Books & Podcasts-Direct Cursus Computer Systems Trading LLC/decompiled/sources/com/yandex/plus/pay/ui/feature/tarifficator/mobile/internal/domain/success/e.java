package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class e extends cg6 {
    public com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
