package com.yandex.plus.pay.inapp.google.internal.operation;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ com.yandex.plus.home.plaque.animator.internal.utils.a k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.yandex.plus.home.plaque.animator.internal.utils.a aVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = aVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, this);
    }
}
