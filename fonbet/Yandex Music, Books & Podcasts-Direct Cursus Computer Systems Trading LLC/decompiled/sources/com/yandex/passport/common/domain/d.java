package com.yandex.passport.common.domain;

import defpackage.cg6;
import defpackage.vqn;

/* loaded from: classes4.dex */
public final class d extends cg6 {
    public e j;
    public Object k;
    public vqn l;
    public /* synthetic */ Object m;
    public final /* synthetic */ e n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return e.z(this.n, null, this);
    }
}
