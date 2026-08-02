package com.yandex.passport.internal.push;

import com.yandex.passport.api.v2;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class r0 extends cg6 {
    public com.yandex.passport.common.core.f j;
    public v2 k;
    public s0 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ s0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = s0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.f(this, null, null);
    }
}
