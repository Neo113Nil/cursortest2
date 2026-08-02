package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class m1 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ n1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, Continuation continuation) {
        super(continuation);
        this.l = n1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
