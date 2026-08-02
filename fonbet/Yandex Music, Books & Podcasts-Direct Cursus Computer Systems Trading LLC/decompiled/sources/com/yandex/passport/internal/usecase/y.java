package com.yandex.passport.internal.usecase;

import com.yandex.passport.data.network.f9;
import defpackage.cg6;
import defpackage.xqn;

/* loaded from: classes4.dex */
public final class y extends cg6 {
    public z j;
    public x k;
    public f9 l;
    public com.yandex.passport.common.core.g m;
    public com.yandex.passport.common.core.f n;
    public xqn o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ z r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = zVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return z.u(this.r, null, this);
    }
}
