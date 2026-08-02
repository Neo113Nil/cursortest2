package com.yandex.passport.internal.push;

import com.yandex.passport.api.v2;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class d extends cg6 {
    public com.yandex.passport.common.core.f j;
    public v2[] k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ g p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.h(null, this);
    }
}
