package com.yandex.plus.home.plaque.plugin.internal.proxy;

import defpackage.cg6;
import defpackage.oqi;

/* loaded from: classes5.dex */
public final class d extends cg6 {
    public oqi j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(this);
    }
}
