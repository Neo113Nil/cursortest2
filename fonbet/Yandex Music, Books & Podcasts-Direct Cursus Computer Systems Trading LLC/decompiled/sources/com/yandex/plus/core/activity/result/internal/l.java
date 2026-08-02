package com.yandex.plus.core.activity.result.internal;

import defpackage.cg6;
import defpackage.oqi;
import defpackage.uh;

/* loaded from: classes4.dex */
public final class l extends cg6 {
    public uh j;
    public Object k;
    public oqi l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ m o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, null, this);
    }
}
