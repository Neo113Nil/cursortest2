package com.yandex.plus.home.plaque.feature.internal.presentation;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class d extends cg6 {
    public com.yandex.plus.home.plaque.feature.api.context.b j;
    public com.yandex.plus.home.plaque.repository.api.model.a k;
    public com.yandex.plus.home.plaque.repository.api.model.b l;
    public /* synthetic */ Object m;
    public final /* synthetic */ h n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return h.a(this.n, null, null, null, this);
    }
}
