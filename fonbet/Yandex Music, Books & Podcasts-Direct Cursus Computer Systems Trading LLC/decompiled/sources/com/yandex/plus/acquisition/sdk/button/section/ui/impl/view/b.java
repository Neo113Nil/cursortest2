package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class b extends cg6 {
    public com.yandex.plus.acquisition.sdk.pay.common.api.a j;
    public /* synthetic */ Object k;
    public final /* synthetic */ d l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, null, null, null, this);
    }
}
