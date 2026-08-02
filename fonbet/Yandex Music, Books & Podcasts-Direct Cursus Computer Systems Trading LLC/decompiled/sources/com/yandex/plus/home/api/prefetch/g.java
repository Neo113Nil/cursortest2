package com.yandex.plus.home.api.prefetch;

import defpackage.aur;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class g extends cg6 {
    public String j;
    public aur k;
    public /* synthetic */ Object l;
    public final /* synthetic */ l m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(null, null, null, this);
    }
}
