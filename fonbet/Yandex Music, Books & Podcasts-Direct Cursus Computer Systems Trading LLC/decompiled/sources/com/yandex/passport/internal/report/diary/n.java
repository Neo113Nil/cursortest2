package com.yandex.passport.internal.report.diary;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class n extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ b0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b0 b0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = b0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.n(null, null, this);
    }
}
