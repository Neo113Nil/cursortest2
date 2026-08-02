package com.yandex.passport.internal.push;

import defpackage.cg6;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class o extends cg6 {
    public c0 j;
    public com.yandex.passport.common.core.f k;
    public p l;
    public Collection m;
    public Iterator n;
    public int o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ p t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, cg6 cg6Var) {
        super(cg6Var);
        this.t = pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, null, this);
    }
}
