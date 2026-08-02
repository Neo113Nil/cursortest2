package com.yandex.passport.internal.badges;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class d extends cg6 {
    public e j;
    public /* synthetic */ Object k;
    public final /* synthetic */ e l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return e.u(this.l, this);
    }
}
