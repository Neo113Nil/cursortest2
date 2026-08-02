package com.yandex.passport.internal.push;

import com.yandex.passport.api.v2;
import defpackage.cg6;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class f extends cg6 {
    public int A;
    public v2 j;
    public com.yandex.passport.common.core.f k;
    public List l;
    public Set m;
    public List n;
    public Iterator o;
    public com.yandex.passport.internal.l p;
    public Iterator q;
    public v2 r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.z = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.k(this, null, null);
    }
}
