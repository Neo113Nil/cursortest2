package ru.rt.ebs.cryptosdk.core.verification.adapter.controllers;

import defpackage.k70;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class e extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ k70 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k70 k70Var, Continuation continuation) {
        super(continuation);
        this.b = k70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.finishVerification(this);
    }
}
