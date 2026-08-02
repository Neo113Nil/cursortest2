package com.yandex.passport.internal.push;

import defpackage.cg6;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class e extends cg6 {
    public boolean j;
    public Set k;
    public Map l;
    public Iterator m;
    public com.yandex.passport.internal.l n;
    public String o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ g t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.t = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.j(false, this);
    }
}
