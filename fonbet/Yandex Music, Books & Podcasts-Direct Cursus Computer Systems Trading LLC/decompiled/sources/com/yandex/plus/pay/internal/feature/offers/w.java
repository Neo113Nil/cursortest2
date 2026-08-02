package com.yandex.plus.pay.internal.feature.offers;

import defpackage.cg6;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class w extends cg6 {
    public String j;
    public Set k;
    public Map l;
    public com.yandex.plus.pay.api.analytics.c m;
    public com.yandex.plus.pay.log.impl.b n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ x q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, null, null, null, false, null, this);
    }
}
