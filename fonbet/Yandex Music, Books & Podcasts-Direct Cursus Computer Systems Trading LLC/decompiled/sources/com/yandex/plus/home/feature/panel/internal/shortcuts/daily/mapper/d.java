package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper;

import defpackage.cg6;
import defpackage.vzt;

/* loaded from: classes5.dex */
public final class d extends cg6 {
    public com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vzt l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vzt vztVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = vztVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(null, this);
    }
}
