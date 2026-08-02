package com.squareup.cash.featureflags;

import androidx.compose.runtime.AbstractApplier;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.protos.franklin.common.FeatureFlagSource;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealFeatureFlagManager$experimentValues$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractApplier $flag;
    public final /* synthetic */ boolean $trackExposures;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ RealFeatureFlagManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFeatureFlagManager$experimentValues$2(RealFeatureFlagManager realFeatureFlagManager, AbstractApplier abstractApplier, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realFeatureFlagManager;
        this.$flag = abstractApplier;
        this.$trackExposures = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealFeatureFlagManager$experimentValues$2 realFeatureFlagManager$experimentValues$2 = new RealFeatureFlagManager$experimentValues$2(this.this$0, this.$flag, this.$trackExposures, continuation);
        realFeatureFlagManager$experimentValues$2.L$0 = obj;
        return realFeatureFlagManager$experimentValues$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealFeatureFlagManager$experimentValues$2) create((RealFeatureFlagManager.FlagValue) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RealFeatureFlagManager.FlagValue flagValue = (RealFeatureFlagManager.FlagValue) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        String identifier = ((FeatureFlag$Option) flagValue.value).getIdentifier();
        RealFeatureFlagManager realFeatureFlagManager = this.this$0;
        Iterator it = realFeatureFlagManager.interceptors.iterator();
        while (it.hasNext()) {
            FeatureFlagInterceptor featureFlagInterceptor = (FeatureFlagInterceptor) it.next();
            AbstractApplier abstractApplier = this.$flag;
            String str = (String) abstractApplier.root;
            featureFlagInterceptor.intercept(str, identifier, this.$trackExposures && realFeatureFlagManager.featureFlagSources.get(str) == FeatureFlagSource.AMPLITUDE, flagValue.isDefaultValue, (FeatureFlagSource) realFeatureFlagManager.featureFlagSources.get((String) abstractApplier.root));
        }
        return Unit.INSTANCE;
    }
}
