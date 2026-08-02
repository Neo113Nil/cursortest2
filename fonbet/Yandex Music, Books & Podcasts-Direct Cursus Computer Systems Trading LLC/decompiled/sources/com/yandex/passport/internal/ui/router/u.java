package com.yandex.passport.internal.ui.router;

import defpackage.cg6;
import defpackage.ou7;

/* loaded from: classes4.dex */
public final class u extends cg6 {
    public com.yandex.passport.internal.properties.l j;
    public ou7 k;
    public com.yandex.passport.internal.properties.l l;
    public /* synthetic */ Object m;
    public final /* synthetic */ x n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return x.a(this.n, null, null, this);
    }
}
