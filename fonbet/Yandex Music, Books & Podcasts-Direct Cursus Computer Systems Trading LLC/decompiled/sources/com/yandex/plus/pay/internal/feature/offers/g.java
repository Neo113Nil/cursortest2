package com.yandex.plus.pay.internal.feature.offers;

import defpackage.cg6;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class g extends cg6 {
    public Iterator j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ j m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, null, null, this);
    }
}
