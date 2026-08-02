package com.yandex.plus.home.graphql.experiments;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class f extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ com.yandex.plus.experiments.impl.cooldown.c k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.yandex.plus.experiments.impl.cooldown.c cVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
