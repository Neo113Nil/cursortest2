package com.squareup.cash.appmessages.badging;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AppMessageBadgeCounter$collect$3 extends SuspendLambda implements Function4 {
    public /* synthetic */ long J$0;
    public /* synthetic */ long J$1;
    public /* synthetic */ long J$2;

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        long longValue3 = ((Number) obj3).longValue();
        AppMessageBadgeCounter$collect$3 appMessageBadgeCounter$collect$3 = new AppMessageBadgeCounter$collect$3(4, (Continuation) obj4);
        appMessageBadgeCounter$collect$3.J$0 = longValue;
        appMessageBadgeCounter$collect$3.J$1 = longValue2;
        appMessageBadgeCounter$collect$3.J$2 = longValue3;
        return appMessageBadgeCounter$collect$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j = this.J$0;
        long j2 = this.J$1;
        long j3 = this.J$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        return new Long(j + j2 + j3);
    }
}
