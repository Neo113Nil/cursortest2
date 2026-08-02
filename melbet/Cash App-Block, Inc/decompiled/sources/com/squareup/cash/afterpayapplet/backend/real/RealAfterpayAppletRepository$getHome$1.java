package com.squareup.cash.afterpayapplet.backend.real;

import com.squareup.cash.afterpayapplet.db.AfterpayApplet;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealAfterpayAppletRepository$getHome$1 extends SuspendLambda implements Function4 {
    public /* synthetic */ AfterpayApplet L$0;
    public /* synthetic */ AfterpayAppletResponse L$1;

    public RealAfterpayAppletRepository$getHome$1() {
        super(4, null);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RealAfterpayAppletRepository$getHome$1 realAfterpayAppletRepository$getHome$1 = new RealAfterpayAppletRepository$getHome$1(4, (Continuation) obj4);
        realAfterpayAppletRepository$getHome$1.L$0 = (AfterpayApplet) obj;
        realAfterpayAppletRepository$getHome$1.L$1 = (AfterpayAppletResponse) obj3;
        return realAfterpayAppletRepository$getHome$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AfterpayApplet afterpayApplet = this.L$0;
        AfterpayAppletResponse afterpayAppletResponse = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        return new Pair(afterpayApplet, afterpayAppletResponse);
    }
}
