package com.squareup.cash.mri.android;

import app.cash.badging.backend.Badger$collect$$inlined$combine$2$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSignals;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealMRIFactory$buildMRIContext$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Boolean $screenIsBeingRecorded;
    public final /* synthetic */ ThreeDsSignals $threeDsSignals;
    public final /* synthetic */ MRIUseCase $useCase;
    public int label;
    public final /* synthetic */ RealMRIFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealMRIFactory$buildMRIContext$2(RealMRIFactory realMRIFactory, Boolean bool, ThreeDsSignals threeDsSignals, MRIUseCase mRIUseCase, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realMRIFactory;
        this.$screenIsBeingRecorded = bool;
        this.$threeDsSignals = threeDsSignals;
        this.$useCase = mRIUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RealMRIFactory$buildMRIContext$2(this.this$0, this.$screenIsBeingRecorded, this.$threeDsSignals, this.$useCase, continuation, 0);
            default:
                return new RealMRIFactory$buildMRIContext$2(this.this$0, this.$screenIsBeingRecorded, this.$threeDsSignals, this.$useCase, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealMRIFactory$buildMRIContext$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealMRIFactory realMRIFactory = this.this$0;
                CoroutineContext coroutineContext = realMRIFactory.ioContext;
                RealMRIFactory$buildMRIContext$2 realMRIFactory$buildMRIContext$2 = new RealMRIFactory$buildMRIContext$2(realMRIFactory, this.$screenIsBeingRecorded, this.$threeDsSignals, this.$useCase, null, 1);
                this.label = 1;
                Object withContext = JobKt.withContext(coroutineContext, realMRIFactory$buildMRIContext$2, this);
                return withContext == coroutineSingletons ? coroutineSingletons : withContext;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Boolean bool = this.$screenIsBeingRecorded;
                ThreeDsSignals threeDsSignals = this.$threeDsSignals;
                RealMRIFactory realMRIFactory2 = this.this$0;
                RealMRIFactory$buildMRIContext$2$1$1 realMRIFactory$buildMRIContext$2$1$1 = new RealMRIFactory$buildMRIContext$2$1$1(realMRIFactory2, bool, threeDsSignals, null);
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$3 = new Badger$collect$$inlined$combine$2$3(realMRIFactory2, this.$useCase, (Continuation) null);
                this.label = 1;
                Object runWithRetries = StateFlowKt.runWithRetries(3, 500L, realMRIFactory$buildMRIContext$2$1$1, badger$collect$$inlined$combine$2$3, this);
                return runWithRetries == coroutineSingletons2 ? coroutineSingletons2 : runWithRetries;
        }
    }
}
