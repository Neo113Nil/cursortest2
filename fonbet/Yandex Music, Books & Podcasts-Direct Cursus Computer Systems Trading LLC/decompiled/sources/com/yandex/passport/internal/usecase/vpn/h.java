package com.yandex.passport.internal.usecase.vpn;

import com.yandex.passport.internal.entities.a0;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class h extends cg6 {
    public f j;
    public Object k;
    public a0 l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ i p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.x(null, this);
    }
}
