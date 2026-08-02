package ru.rt.ebs.cryptosdk.core.initialization.controllers;

import defpackage.tje;
import defpackage.tse;
import defpackage.uwv;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class e extends SuspendLambda implements wls {
    public /* synthetic */ Object a;
    public final /* synthetic */ uwv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(uwv uwvVar, Continuation continuation) {
        super(2, continuation);
        this.b = uwvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.b, continuation);
        eVar.a = obj;
        return eVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        e eVar = new e(this.b, (Continuation) obj2);
        eVar.a = (tse) obj;
        return eVar.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.b.b(obj);
        return tje.N((tse) this.a, null, null, new d(this.b, null), 3);
    }
}
