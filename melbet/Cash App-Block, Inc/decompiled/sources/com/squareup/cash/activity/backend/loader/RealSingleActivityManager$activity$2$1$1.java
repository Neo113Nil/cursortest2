package com.squareup.cash.activity.backend.loader;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealSingleActivityManager$activity$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealSingleActivityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealSingleActivityManager$activity$2$1$1(RealSingleActivityManager realSingleActivityManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realSingleActivityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealSingleActivityManager realSingleActivityManager = this.this$0;
        switch (i) {
            case 0:
                return new RealSingleActivityManager$activity$2$1$1(realSingleActivityManager, continuation, 0);
            default:
                return new RealSingleActivityManager$activity$2$1$1(realSingleActivityManager, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealSingleActivityManager$activity$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealSingleActivityManager realSingleActivityManager = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSingleActivityManager.fetch(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                KeysetHandle keysetHandle = realSingleActivityManager.requestHandler;
                ActivitiesManager.ActivityContext activityContext = realSingleActivityManager.activityContext;
                ActivityItemGlobalId activityItemGlobalId = realSingleActivityManager.target;
                this.label = 1;
                Object requestItem = keysetHandle.requestItem(activityContext, activityItemGlobalId, this);
                return requestItem == coroutineSingletons2 ? coroutineSingletons2 : requestItem;
        }
    }
}
