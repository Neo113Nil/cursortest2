package com.squareup.cash.aiedge;

import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class MLKitTitleGenerator$isAvailable$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FeatureFlag$EnabledDisabledFeatureFlag$Options L$0;
    public /* synthetic */ boolean Z$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MLKitTitleGenerator$isAvailable$1() {
        super(3, null);
        this.$r8$classId = 1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        Boolean bool = (Boolean) obj;
        switch (this.$r8$classId) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                MLKitTitleGenerator$isAvailable$1 mLKitTitleGenerator$isAvailable$1 = new MLKitTitleGenerator$isAvailable$1(i, (Continuation) obj3, 0);
                mLKitTitleGenerator$isAvailable$1.Z$0 = booleanValue;
                mLKitTitleGenerator$isAvailable$1.L$0 = (FeatureFlag$EnabledDisabledFeatureFlag$Options) obj2;
                return mLKitTitleGenerator$isAvailable$1.invokeSuspend(Unit.INSTANCE);
            default:
                boolean booleanValue2 = bool.booleanValue();
                MLKitTitleGenerator$isAvailable$1 mLKitTitleGenerator$isAvailable$12 = new MLKitTitleGenerator$isAvailable$1(i, (Continuation) obj3, 1);
                mLKitTitleGenerator$isAvailable$12.Z$0 = booleanValue2;
                mLKitTitleGenerator$isAvailable$12.L$0 = (FeatureFlag$EnabledDisabledFeatureFlag$Options) obj2;
                return mLKitTitleGenerator$isAvailable$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                boolean z = this.Z$0;
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(z && featureFlag$EnabledDisabledFeatureFlag$Options.enabled());
            default:
                boolean z2 = this.Z$0;
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options2 = this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(z2 ? true : featureFlag$EnabledDisabledFeatureFlag$Options2.enabled());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MLKitTitleGenerator$isAvailable$1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }
}
