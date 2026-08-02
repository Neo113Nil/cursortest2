package com.yandex.plus.pay.internal.feature.offers.smart;

import defpackage.cg6;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class h extends cg6 {
    public String j;
    public String k;
    public Set l;
    public Set m;
    public Set n;
    public Set o;
    public Map p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ l s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return l.a(this.s, null, false, null, null, null, null, null, null, this);
    }
}
