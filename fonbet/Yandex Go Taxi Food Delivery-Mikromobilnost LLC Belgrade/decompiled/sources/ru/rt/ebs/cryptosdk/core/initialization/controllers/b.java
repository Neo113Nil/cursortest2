package ru.rt.ebs.cryptosdk.core.initialization.controllers;

import defpackage.uwv;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class b extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ uwv b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(uwv uwvVar, Continuation continuation) {
        super(continuation);
        this.b = uwvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.updateRegistration(this);
    }
}
