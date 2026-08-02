package com.yandex.plus.pay.inapp.google.internal.operation;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class g extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ com.yandex.plus.home.plaque.feature.internal.presentation.b k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.yandex.plus.home.plaque.feature.internal.presentation.b bVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, this);
    }
}
