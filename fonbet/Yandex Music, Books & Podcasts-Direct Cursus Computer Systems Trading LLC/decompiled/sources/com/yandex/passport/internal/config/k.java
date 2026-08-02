package com.yandex.passport.internal.config;

import com.yandex.passport.data.network.y5;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class k extends cg6 {
    public com.yandex.passport.common.core.b j;
    public Object k;
    public y5 l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ l o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.x(null, this);
    }
}
