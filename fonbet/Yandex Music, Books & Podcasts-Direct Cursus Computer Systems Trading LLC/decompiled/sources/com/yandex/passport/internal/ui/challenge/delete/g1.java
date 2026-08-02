package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.cg6;
import defpackage.x0q;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class g1 extends cg6 {
    public x0q j;
    public /* synthetic */ Object k;
    public final /* synthetic */ h1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, Continuation continuation) {
        super(continuation);
        this.l = h1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.k0(null, this);
    }
}
