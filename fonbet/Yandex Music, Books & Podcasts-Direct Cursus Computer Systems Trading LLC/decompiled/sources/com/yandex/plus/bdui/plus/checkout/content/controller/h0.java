package com.yandex.plus.bdui.plus.checkout.content.controller;

import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class h0 extends cg6 {
    public com.yandex.plus.bdui.content.d j;
    public /* synthetic */ Object k;
    public final /* synthetic */ i0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Continuation continuation) {
        super(continuation);
        this.l = i0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, null, this);
    }
}
