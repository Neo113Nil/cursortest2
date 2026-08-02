package com.yandex.passport.internal.report.diary;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class y extends cg6 {
    public String j;
    public String k;
    public com.yandex.passport.internal.properties.j0 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = b0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.y(null, null, null, this);
    }
}
