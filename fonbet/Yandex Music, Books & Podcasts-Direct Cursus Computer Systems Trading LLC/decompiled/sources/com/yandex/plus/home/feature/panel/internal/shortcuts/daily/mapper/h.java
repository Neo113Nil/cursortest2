package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class h extends cg6 {
    public e j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ i n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.d(null, null, 0, this);
    }
}
