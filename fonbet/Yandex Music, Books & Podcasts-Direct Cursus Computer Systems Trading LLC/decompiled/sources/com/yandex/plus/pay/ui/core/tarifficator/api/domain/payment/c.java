package com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment;

import defpackage.cg6;
import defpackage.r0o;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a j;
    public com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session.c k;
    public r0o l;
    public Iterator m;
    public h n;
    public h o;
    public Iterator p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ d t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, cg6 cg6Var) {
        super(cg6Var);
        this.t = dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, null, null, this);
    }
}
