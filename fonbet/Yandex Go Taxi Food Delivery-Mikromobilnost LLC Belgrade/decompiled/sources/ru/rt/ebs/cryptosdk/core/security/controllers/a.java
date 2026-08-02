package ru.rt.ebs.cryptosdk.core.security.controllers;

import defpackage.a7q0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class a extends SuspendLambda implements wls {
    public final /* synthetic */ a7q0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a7q0 a7q0Var, Continuation continuation) {
        super(2, continuation);
        this.a = a7q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.a, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        a aVar = new a(this.a, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        aVar.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        this.a.verifyImmediately();
        return zy11.a;
    }
}
