package com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class i extends cg6 {
    public com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.d j;
    public /* synthetic */ Object k;
    public final /* synthetic */ m l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.O(null, null, this);
    }
}
