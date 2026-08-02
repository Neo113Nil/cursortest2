package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a1 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ com.yandex.passport.internal.s l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.yandex.passport.internal.s sVar, Continuation continuation) {
        super(continuation);
        this.l = sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
