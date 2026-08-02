package com.yandex.plus.pay.internal.feature.presale;

import com.yandex.plus.pay.internal.model.PlusPayPresale;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class a extends cg6 {
    public PlusPayPresale j;
    public /* synthetic */ Object k;
    public final /* synthetic */ c l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
