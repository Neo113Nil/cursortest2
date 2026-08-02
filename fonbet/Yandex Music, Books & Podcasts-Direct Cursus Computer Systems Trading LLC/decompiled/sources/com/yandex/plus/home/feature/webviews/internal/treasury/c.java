package com.yandex.plus.home.feature.webviews.internal.treasury;

import defpackage.cg6;
import defpackage.oqi;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public String j;
    public oqi k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ e n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
