package ru.rt.ebs.cryptosdk.core.verification.ebs.controllers;

import defpackage.ny61;
import defpackage.qjn;
import defpackage.wls;
import defpackage.yin;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class d extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ yin b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yin yinVar, Continuation continuation) {
        super(2, continuation);
        this.b = yinVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            qjn qjnVar = this.b.a;
            this.a = 1;
            qjnVar.d.removeAll().save();
            qjnVar.b();
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.b.d.removeEbsRedirectUrl();
        return zy11Var;
    }
}
