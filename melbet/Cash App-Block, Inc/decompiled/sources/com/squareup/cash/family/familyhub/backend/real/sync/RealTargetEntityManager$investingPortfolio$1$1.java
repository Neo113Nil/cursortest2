package com.squareup.cash.family.familyhub.backend.real.sync;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealTargetEntityManager$investingPortfolio$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ SharedFlowImpl $events;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $triggerCount$delegate;
    public int label;
    public final /* synthetic */ RealTargetEntityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealTargetEntityManager$investingPortfolio$1$1(SharedFlowImpl sharedFlowImpl, RealTargetEntityManager realTargetEntityManager, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$events = sharedFlowImpl;
        this.this$0 = realTargetEntityManager;
        this.$triggerCount$delegate = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RealTargetEntityManager$investingPortfolio$1$1(this.$events, this.this$0, this.$triggerCount$delegate, continuation, 0);
            default:
                return new RealTargetEntityManager$investingPortfolio$1$1(this.$events, this.this$0, this.$triggerCount$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealTargetEntityManager$investingPortfolio$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$triggerCount$delegate;
        RealTargetEntityManager realTargetEntityManager = this.this$0;
        SharedFlowImpl sharedFlowImpl = this.$events;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealTargetEntityManager$syncValues$1$1$1 realTargetEntityManager$syncValues$1$1$1 = new RealTargetEntityManager$syncValues$1$1$1(realTargetEntityManager, parcelableSnapshotMutableIntState, 1);
                this.label = 1;
                sharedFlowImpl.collect(realTargetEntityManager$syncValues$1$1$1, this);
                return coroutineSingletons;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealTargetEntityManager$syncValues$1$1$1 realTargetEntityManager$syncValues$1$1$12 = new RealTargetEntityManager$syncValues$1$1$1(realTargetEntityManager, parcelableSnapshotMutableIntState, 2);
                this.label = 1;
                sharedFlowImpl.collect(realTargetEntityManager$syncValues$1$1$12, this);
                return coroutineSingletons2;
        }
    }
}
