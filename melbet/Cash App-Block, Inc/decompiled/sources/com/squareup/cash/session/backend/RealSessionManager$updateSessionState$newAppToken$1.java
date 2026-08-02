package com.squareup.cash.session.backend;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealSessionManager$updateSessionState$newAppToken$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $oldAppToken;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealSessionManager$updateSessionState$newAppToken$1(String str, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$oldAppToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RealSessionManager$updateSessionState$newAppToken$1(this.$oldAppToken, continuation, 0);
            case 1:
                return new RealSessionManager$updateSessionState$newAppToken$1(this.$oldAppToken, continuation, 1);
            default:
                return new RealSessionManager$updateSessionState$newAppToken$1(this.$oldAppToken, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((RealSessionManager$updateSessionState$newAppToken$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$oldAppToken;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
        }
        return str;
    }
}
