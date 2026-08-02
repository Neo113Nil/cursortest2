package com.yandex.passport.internal.push;

import defpackage.cg6;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class c extends cg6 {
    public Set j;
    public Set k;
    public Iterator l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ g o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.f(null, null, null, this);
    }
}
