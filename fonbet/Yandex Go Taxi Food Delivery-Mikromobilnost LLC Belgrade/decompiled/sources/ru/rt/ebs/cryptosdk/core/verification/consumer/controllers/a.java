package ru.rt.ebs.cryptosdk.core.verification.consumer.controllers;

import defpackage.i9e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class a extends ContinuationImpl {
    public i9e a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i9e c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i9e i9eVar, Continuation continuation) {
        super(continuation);
        this.c = i9eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.verifyResSecret(this);
    }
}
