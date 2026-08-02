package com.yandex.passport.internal.social.esia;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class m extends cg6 {
    public com.yandex.passport.internal.report.reporters.x j;
    public a0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ o m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(null, null, this);
    }
}
