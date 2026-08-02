package com.yandex.plus.home.feature.webviews.internal.purchase.subscription;

import com.yandex.passport.data.network.l;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public String j;
    public String k;
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ l n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.z(null, null, null, this);
    }
}
