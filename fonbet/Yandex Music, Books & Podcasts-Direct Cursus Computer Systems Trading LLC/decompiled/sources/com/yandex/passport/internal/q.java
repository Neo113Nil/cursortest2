package com.yandex.passport.internal;

import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class q extends cg6 {
    public com.yandex.passport.internal.entities.a0 j;
    public boolean k;
    public boolean l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ com.yandex.passport.common.mvi.c o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.yandex.passport.common.mvi.c cVar, Continuation continuation) {
        super(continuation);
        this.o = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
