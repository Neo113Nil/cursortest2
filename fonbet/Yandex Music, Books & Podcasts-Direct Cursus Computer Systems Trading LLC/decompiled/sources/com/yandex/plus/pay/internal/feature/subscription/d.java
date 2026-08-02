package com.yandex.plus.pay.internal.feature.subscription;

import defpackage.cg6;
import java.util.Set;

/* loaded from: classes5.dex */
public final class d extends cg6 {
    public String j;
    public Set k;
    public f l;
    public int m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ e r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, null, this);
    }
}
