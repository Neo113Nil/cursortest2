package com.yandex.passport.internal.filter;

import defpackage.cg6;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class i extends cg6 {
    public com.yandex.passport.internal.entities.k j;
    public Collection k;
    public Iterator l;
    public Object m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ l q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, null, this);
    }
}
