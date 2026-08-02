package com.yandex.plus.pay.inapp.google.common.internal.operation;

import defpackage.cg6;
import defpackage.wqn;

/* loaded from: classes5.dex */
public final class g extends cg6 {
    public Object j;
    public wqn k;
    public int l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ h q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.g(null, this);
    }
}
