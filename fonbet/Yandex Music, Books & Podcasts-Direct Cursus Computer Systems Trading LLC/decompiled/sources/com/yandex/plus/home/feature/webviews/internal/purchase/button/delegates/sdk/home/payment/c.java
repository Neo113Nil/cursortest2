package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment;

import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
import com.yandex.plus.pay.adapter.api.j;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public String j;
    public a0 k;
    public j l;
    public /* synthetic */ Object m;
    public final /* synthetic */ m n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m mVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.C(null, null, null, this);
    }
}
