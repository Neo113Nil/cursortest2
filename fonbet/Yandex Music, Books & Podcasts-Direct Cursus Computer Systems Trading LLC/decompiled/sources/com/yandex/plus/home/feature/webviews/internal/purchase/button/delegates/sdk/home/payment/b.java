package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment;

import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ m k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(null, null, null, this);
    }
}
