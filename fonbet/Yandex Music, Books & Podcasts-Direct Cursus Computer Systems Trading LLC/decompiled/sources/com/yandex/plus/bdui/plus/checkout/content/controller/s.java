package com.yandex.plus.bdui.plus.checkout.content.controller;

import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class s extends cg6 {
    public com.yandex.plus.bdui.content.d j;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.f k;
    public /* synthetic */ Object l;
    public final /* synthetic */ u m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, Continuation continuation) {
        super(continuation);
        this.m = uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, null, this);
    }
}
