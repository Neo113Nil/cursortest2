package com.yandex.plus.pay.internal.feature.presale;

import defpackage.cg6;
import defpackage.xqn;

/* loaded from: classes5.dex */
public final class i extends cg6 {
    public String j;
    public xqn k;
    public /* synthetic */ Object l;
    public final /* synthetic */ k m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(null, null, this);
    }
}
