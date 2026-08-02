package com.squareup.cash.session.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class DoubleWriteSessionManager$conditionalDoubleWrite$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function2 $block;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ DoubleWriteSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DoubleWriteSessionManager$conditionalDoubleWrite$2$1$1(Function2 function2, DoubleWriteSessionManager doubleWriteSessionManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$block = function2;
        this.this$0 = doubleWriteSessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        DoubleWriteSessionManager doubleWriteSessionManager = this.this$0;
        Function2 function2 = this.$block;
        switch (i) {
            case 0:
                return new DoubleWriteSessionManager$conditionalDoubleWrite$2$1$1(function2, doubleWriteSessionManager, continuation, 0);
            default:
                return new DoubleWriteSessionManager$conditionalDoubleWrite$2$1$1(function2, doubleWriteSessionManager, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((DoubleWriteSessionManager$conditionalDoubleWrite$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        DoubleWriteSessionManager doubleWriteSessionManager = this.this$0;
        Function2 function2 = this.$block;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSessionManager realSessionManager = doubleWriteSessionManager.primary;
                    this.label = 1;
                    if (function2.invoke(realSessionManager, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DbSessionManager dbSessionManager = doubleWriteSessionManager.secondary;
                    dbSessionManager.getClass();
                    this.label = 1;
                    if (function2.invoke(dbSessionManager, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
