package com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details;

import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a j;
    public j k;
    public c l;
    public /* synthetic */ Object m;
    public final /* synthetic */ c n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, this);
    }
}
