package com.yandex.plus.bdui.flex.factory;

import defpackage.cg6;
import defpackage.q2a;

/* loaded from: classes4.dex */
public final class k extends cg6 {
    public q2a j;
    public /* synthetic */ Object k;
    public final /* synthetic */ l l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, null, false, false, false, null, this);
    }
}
