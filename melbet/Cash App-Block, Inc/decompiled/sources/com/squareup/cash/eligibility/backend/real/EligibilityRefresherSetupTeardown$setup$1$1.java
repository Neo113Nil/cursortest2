package com.squareup.cash.eligibility.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.eligibility.backend.api.EligibilityRefreshAnalyticsData;
import com.squareup.cash.eligibility.backend.api.EligibilityRefresher;
import com.squareup.cash.eligibility.backend.real.EligibilityError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.session.backend.SignoutSideEffectsPerformer;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.access.sync_values.FeatureEligibilityRefreshPolicy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class EligibilityRefresherSetupTeardown$setup$1$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public Long L$1;
    public Integer L$2;
    public Duration L$3;
    public int label;
    public final /* synthetic */ SignoutSideEffectsPerformer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EligibilityRefresherSetupTeardown$setup$1$1(SignoutSideEffectsPerformer signoutSideEffectsPerformer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = signoutSideEffectsPerformer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EligibilityRefresherSetupTeardown$setup$1$1 eligibilityRefresherSetupTeardown$setup$1$1 = new EligibilityRefresherSetupTeardown$setup$1$1(this.this$0, continuation);
        eligibilityRefresherSetupTeardown$setup$1$1.L$0 = obj;
        return eligibilityRefresherSetupTeardown$setup$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EligibilityRefresherSetupTeardown$setup$1$1) create((FeatureEligibilityRefreshPolicy) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e9, code lost:
    
        if (r0 != r4) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Duration duration;
        Object obj2;
        Long l;
        Duration duration2;
        Duration duration3;
        Long l2;
        Integer num2;
        int intValue;
        Object coroutineScope;
        SignoutSideEffectsPerformer signoutSideEffectsPerformer = this.this$0;
        KeyValue keyValue = (KeyValue) signoutSideEffectsPerformer.navigator;
        FeatureEligibilityRefreshPolicy featureEligibilityRefreshPolicy = (FeatureEligibilityRefreshPolicy) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Long l3 = featureEligibilityRefreshPolicy.policy_change_timestamp;
            Long l4 = featureEligibilityRefreshPolicy.refresh_repeat_count;
            num = l4 != null ? new Integer((int) l4.longValue()) : null;
            Long l5 = featureEligibilityRefreshPolicy.refresh_delay_between_requests_in_millis;
            if (l5 != null) {
                Duration.Companion companion = Duration.Companion;
                duration = new Duration(DurationKt.toDuration(l5.longValue(), DurationUnit.MILLISECONDS));
            } else {
                duration = null;
            }
            if (l3 == null || num == null || duration == null) {
                ((ErrorReporter) signoutSideEffectsPerformer.navigatorSwitcher).report(new EligibilityError.MalformedFeatureEligibilityRefreshPolicyError(featureEligibilityRefreshPolicy), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                return Unit.INSTANCE;
            }
            this.L$0 = featureEligibilityRefreshPolicy;
            this.L$1 = l3;
            this.L$2 = num;
            this.L$3 = duration;
            this.label = 1;
            obj2 = keyValue.get(this);
            if (obj2 != coroutineSingletons) {
                Duration duration4 = duration;
                l = l3;
                duration2 = duration4;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            duration2 = this.L$3;
            Integer num3 = this.L$2;
            l = this.L$1;
            SafeTrace.throwOnFailure(obj);
            num = num3;
            obj2 = obj;
        } else {
            if (i != 2) {
                if (i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            duration3 = this.L$3;
            num2 = this.L$2;
            l2 = this.L$1;
            SafeTrace.throwOnFailure(obj);
            EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData = new EligibilityRefreshAnalyticsData(l2.longValue(), null, featureEligibilityRefreshPolicy.origin_description);
            EligibilityRefresher eligibilityRefresher = (EligibilityRefresher) signoutSideEffectsPerformer.signOut;
            intValue = num2.intValue();
            long j = duration3.rawValue;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            OkHttpCall.AnonymousClass1 anonymousClass1 = (OkHttpCall.AnonymousClass1) eligibilityRefresher;
            if (intValue > 0) {
                coroutineScope = Unit.INSTANCE;
            } else {
                coroutineScope = JobKt.coroutineScope(new RealEligibilityRefresher$refreshEligibility$2(intValue, j, eligibilityRefreshAnalyticsData, anonymousClass1, null), this);
                if (coroutineScope != coroutineSingletons) {
                    coroutineScope = Unit.INSTANCE;
                }
            }
        }
        long longValue = ((Number) obj2).longValue();
        if (l != null && longValue == l.longValue()) {
            return Unit.INSTANCE;
        }
        this.L$0 = featureEligibilityRefreshPolicy;
        this.L$1 = l;
        this.L$2 = num;
        this.L$3 = duration2;
        this.label = 2;
        if (keyValue.set(l, this) != coroutineSingletons) {
            duration3 = duration2;
            l2 = l;
            num2 = num;
            EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData2 = new EligibilityRefreshAnalyticsData(l2.longValue(), null, featureEligibilityRefreshPolicy.origin_description);
            EligibilityRefresher eligibilityRefresher2 = (EligibilityRefresher) signoutSideEffectsPerformer.signOut;
            intValue = num2.intValue();
            long j2 = duration3.rawValue;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            OkHttpCall.AnonymousClass1 anonymousClass12 = (OkHttpCall.AnonymousClass1) eligibilityRefresher2;
            if (intValue > 0) {
            }
        }
        return coroutineSingletons;
    }
}
