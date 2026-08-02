package com.yandex.plus.pay.internal.feature.mailing;

import com.yandex.plus.pay.internal.model.mappers.h;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public com.yandex.plus.pay.log.impl.b j;
    public h k;
    public /* synthetic */ Object l;
    public final /* synthetic */ d m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(this);
    }
}
