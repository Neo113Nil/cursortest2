package com.yandex.passport.internal.ui.sloth.plusdevices;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class i extends cg6 {
    public com.yandex.passport.internal.properties.o j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ j m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return j.a(this.m, null, this);
    }
}
