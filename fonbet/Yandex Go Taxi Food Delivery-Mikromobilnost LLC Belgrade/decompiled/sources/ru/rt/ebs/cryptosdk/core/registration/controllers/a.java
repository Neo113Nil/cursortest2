package ru.rt.ebs.cryptosdk.core.registration.controllers;

import defpackage.wqi0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class a extends ContinuationImpl {
    public wqi0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wqi0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(wqi0 wqi0Var, Continuation continuation) {
        super(continuation);
        this.c = wqi0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.updateRegistration(this);
    }
}
