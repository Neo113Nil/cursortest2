package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.internal.usecase.a3;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class t extends cg6 {
    public a3 j;
    public s k;
    public s l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ a3 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a3 a3Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = a3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return a3.v(this.o, null, this);
    }
}
