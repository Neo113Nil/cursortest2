package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite;

import com.yandex.plus.home.repository.api.model.webconfig.a0;
import com.yandex.plus.home.repository.api.model.webconfig.z;
import defpackage.cg6;
import defpackage.xqn;

/* loaded from: classes5.dex */
public final class h extends cg6 {
    public a0 j;
    public String k;
    public String l;
    public String m;
    public xqn n;
    public z o;
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ com.yandex.plus.home.plaque.feature.internal.presentation.b r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.yandex.plus.home.plaque.feature.internal.presentation.b bVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.e(null, null, null, null, this);
    }
}
