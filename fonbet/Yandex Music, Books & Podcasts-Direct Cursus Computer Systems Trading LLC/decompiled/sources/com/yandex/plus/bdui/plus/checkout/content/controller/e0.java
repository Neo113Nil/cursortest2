package com.yandex.plus.bdui.plus.checkout.content.controller;

import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class e0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ f0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, Continuation continuation) {
        super(continuation);
        this.k = f0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, null, this);
    }
}
