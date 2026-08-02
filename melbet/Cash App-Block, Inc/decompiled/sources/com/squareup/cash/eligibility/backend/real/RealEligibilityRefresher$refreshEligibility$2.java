package com.squareup.cash.eligibility.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.eligibility.backend.api.EligibilityRefreshAnalyticsData;
import com.squareup.cash.eligibility.backend.api.EligibilityRefresher;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import retrofit2.OkHttpCall;

/* loaded from: classes6.dex */
public final class RealEligibilityRefresher$refreshEligibility$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ EligibilityRefreshAnalyticsData $analyticsData;
    public final /* synthetic */ long $delayBetweenAttempts;
    public final /* synthetic */ int $repeatCount;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public long J$0;
    public EligibilityRefreshAnalyticsData L$0;
    public OkHttpCall.AnonymousClass1 L$1;
    public int label;
    public final /* synthetic */ OkHttpCall.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealEligibilityRefresher$refreshEligibility$2(int i, long j, EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData, OkHttpCall.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(2, continuation);
        this.$repeatCount = i;
        this.$delayBetweenAttempts = j;
        this.$analyticsData = eligibilityRefreshAnalyticsData;
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealEligibilityRefresher$refreshEligibility$2(this.$repeatCount, this.$delayBetweenAttempts, this.$analyticsData, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealEligibilityRefresher$refreshEligibility$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00a8 -> B:6:0x00ac). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        OkHttpCall.AnonymousClass1 anonymousClass1;
        EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData;
        long j;
        int i2;
        EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData2;
        OkHttpCall.AnonymousClass1 anonymousClass12;
        int i3;
        int i4;
        int i5;
        int i6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.label;
        if (i7 == 0) {
            SafeTrace.throwOnFailure(obj);
            i = this.$repeatCount;
            if (i > 10) {
                i = 10;
            }
            Duration duration = new Duration(this.$delayBetweenAttempts);
            EligibilityRefresher.Companion.getClass();
            Duration duration2 = new Duration(EligibilityRefresher.Companion.MAX_DELAY_BETWEEN_ATTEMPTS);
            if (duration.compareTo(duration2) > 0) {
                duration = duration2;
            }
            long j2 = duration.rawValue;
            EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData3 = this.$analyticsData;
            anonymousClass1 = this.this$0;
            eligibilityRefreshAnalyticsData = eligibilityRefreshAnalyticsData3;
            j = j2;
            i2 = 0;
            if (i2 < i) {
            }
        } else {
            if (i7 == 1) {
                int i8 = this.I$3;
                int i9 = this.I$2;
                int i10 = this.I$1;
                long j3 = this.J$0;
                i3 = this.I$0;
                anonymousClass12 = this.L$1;
                eligibilityRefreshAnalyticsData2 = this.L$0;
                SafeTrace.throwOnFailure(obj);
                i5 = i8;
                i6 = i10;
                j = j3;
                i4 = i9;
                this.L$0 = eligibilityRefreshAnalyticsData2;
                this.L$1 = anonymousClass12;
                this.I$0 = i3;
                this.J$0 = j;
                this.I$1 = i6;
                this.I$2 = i4;
                this.I$3 = i5;
                this.label = 2;
                if (JobKt.m4182delayVtjQ1oo(j, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i7 != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i6 = this.I$1;
            long j4 = this.J$0;
            int i11 = this.I$0;
            OkHttpCall.AnonymousClass1 anonymousClass13 = this.L$1;
            EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData4 = this.L$0;
            SafeTrace.throwOnFailure(obj);
            anonymousClass1 = anonymousClass13;
            eligibilityRefreshAnalyticsData = eligibilityRefreshAnalyticsData4;
            long j5 = j4;
            i2 = i6 + 1;
            i = i11;
            j = j5;
            if (i2 < i) {
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$1 = new EarningsHomePresenter$models$3$1(i2, eligibilityRefreshAnalyticsData, (Continuation) null, anonymousClass1);
                this.L$0 = eligibilityRefreshAnalyticsData;
                this.L$1 = anonymousClass1;
                this.I$0 = i;
                this.J$0 = j;
                this.I$1 = i2;
                this.I$2 = i2;
                this.I$3 = 0;
                this.label = 1;
                if (JobKt.coroutineScope(earningsHomePresenter$models$3$1, this) != coroutineSingletons) {
                    eligibilityRefreshAnalyticsData2 = eligibilityRefreshAnalyticsData;
                    anonymousClass12 = anonymousClass1;
                    i3 = i;
                    i6 = i2;
                    i4 = i6;
                    i5 = 0;
                    this.L$0 = eligibilityRefreshAnalyticsData2;
                    this.L$1 = anonymousClass12;
                    this.I$0 = i3;
                    this.J$0 = j;
                    this.I$1 = i6;
                    this.I$2 = i4;
                    this.I$3 = i5;
                    this.label = 2;
                    if (JobKt.m4182delayVtjQ1oo(j, this) != coroutineSingletons) {
                        j4 = j;
                        i11 = i3;
                        anonymousClass1 = anonymousClass12;
                        eligibilityRefreshAnalyticsData = eligibilityRefreshAnalyticsData2;
                        long j52 = j4;
                        i2 = i6 + 1;
                        i = i11;
                        j = j52;
                        if (i2 < i) {
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
    }
}
