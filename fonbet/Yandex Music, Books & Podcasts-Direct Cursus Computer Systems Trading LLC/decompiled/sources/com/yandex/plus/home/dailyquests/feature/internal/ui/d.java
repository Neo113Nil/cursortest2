package com.yandex.plus.home.dailyquests.feature.internal.ui;

import com.yandex.plus.home.dailyquests.repository.api.dailyquests.l;
import defpackage.cg6;
import defpackage.rjf;

/* loaded from: classes5.dex */
public final class d extends cg6 {
    public l j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rjf l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rjf rjfVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = rjfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return rjf.a(this.l, null, this);
    }
}
