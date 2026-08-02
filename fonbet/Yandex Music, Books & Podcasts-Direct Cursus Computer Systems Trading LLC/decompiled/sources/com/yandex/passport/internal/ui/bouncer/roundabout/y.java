package com.yandex.passport.internal.ui.bouncer.roundabout;

import com.yandex.passport.internal.ui.bouncer.model.r1;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class y extends cg6 {
    public r1 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ a0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = a0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.p(null, this);
    }
}
