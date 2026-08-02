package com.yandex.passport.internal.report.diary;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class v0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ w0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = w0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return w0.v(this.k, 0L, 0L, null, this);
    }
}
