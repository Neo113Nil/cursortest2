package com.squareup.cash.session.backend;

import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealSessionManager$updateSessionState$newSession$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Object $oldSession;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealSessionManager$updateSessionState$newSession$1(Object obj, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$oldSession = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$oldSession;
        switch (i) {
            case 0:
                return new RealSessionManager$updateSessionState$newSession$1((Session) obj, continuation, 0);
            default:
                return new RealSessionManager$updateSessionState$newSession$1((TextFieldCoreModifierNode) obj, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((RealSessionManager$updateSessionState$newSession$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$oldSession;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return (Session) obj2;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((TextFieldCoreModifierNode) obj2).textFieldSelectionState.textToolbarShown$delegate.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
