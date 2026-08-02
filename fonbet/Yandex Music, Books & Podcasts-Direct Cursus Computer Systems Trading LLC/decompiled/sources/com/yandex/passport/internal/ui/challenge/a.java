package com.yandex.passport.internal.ui.challenge;

import defpackage.b6;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class a extends cg6 {
    public b6 j;
    public e k;
    public /* synthetic */ Object l;
    public final /* synthetic */ e m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return e.r(this.m, null, this);
    }
}
