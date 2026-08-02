package com.squareup.cash.blockers.presenters.onboarding;

import android.os.Debug;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchingMetadata;
import com.squareup.cash.account.backend.RealAccountSwitchAnalytics;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.cdf.account.AccountSwitchAccountAccountSwitched;
import com.squareup.cash.cdf.account.AccountSwitchSource;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.RealProfileSyncSetupTeardown;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.session.backend.SessionManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class WelcomePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ WelcomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WelcomePresenter$models$2$1(WelcomePresenter welcomePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = welcomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        WelcomePresenter welcomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new WelcomePresenter$models$2$1(welcomePresenter, continuation, 0);
            case 1:
                return new WelcomePresenter$models$2$1(welcomePresenter, continuation, 1);
            case 2:
                return new WelcomePresenter$models$2$1(welcomePresenter, continuation, 2);
            default:
                return new WelcomePresenter$models$2$1(welcomePresenter, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((WelcomePresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0173, code lost:
    
        if (com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter.access$handleIntegrityCheckResult(r3, (com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter.IntegrityCheckResult) r2, r22) == r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0167, code lost:
    
        if (r2 == r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0150, code lost:
    
        if (r4.updateOnboardedState(true, r22) == r1) goto L76;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        AccountSwitchSource accountSwitchSource;
        Object withContext;
        int i = this.$r8$classId;
        int i2 = 2;
        WelcomePresenter welcomePresenter = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AccountSwitcher$AccountSwitchingMetadata accountSwitcher$AccountSwitchingMetadata = welcomePresenter.accountSwitchMetadata;
                    if (accountSwitcher$AccountSwitchingMetadata != null) {
                        RealAccountSwitchAnalytics realAccountSwitchAnalytics = welcomePresenter.accountSwitchAnalytics;
                        String str = welcomePresenter.args.blockersData.flowToken;
                        str.getClass();
                        realAccountSwitchAnalytics.memoryInfoReader.getClass();
                        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
                        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
                        Analytics analytics = realAccountSwitchAnalytics.analytics;
                        String str2 = accountSwitcher$AccountSwitchingMetadata.loggedInAccountToken;
                        String str3 = accountSwitcher$AccountSwitchingMetadata.loggedOutAccountToken;
                        j = 0;
                        long j2 = accountSwitcher$AccountSwitchingMetadata.startElapsedRealtimeMillis;
                        long elapsedRealtime = j2 >= 0 ? realAccountSwitchAnalytics.clock.elapsedRealtime() - j2 : -1L;
                        AccountSwitcher$AccountSwitchingMetadata.SwitchSource switchSource = accountSwitcher$AccountSwitchingMetadata.source;
                        int i4 = switchSource == null ? -1 : RealAccountSwitchAnalytics.WhenMappings.$EnumSwitchMapping$0[switchSource.ordinal()];
                        if (i4 == -1) {
                            accountSwitchSource = null;
                        } else if (i4 == 1) {
                            accountSwitchSource = AccountSwitchSource.ACCOUNT_SWITCH_FLOW;
                        } else if (i4 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            accountSwitchSource = AccountSwitchSource.ACCOUNT_CREATION_FLOW;
                        }
                        analytics.track(new AccountSwitchAccountAccountSwitched(str, str3, str2, Long.valueOf(elapsedRealtime), accountSwitchSource, Long.valueOf(freeMemory), Long.valueOf(nativeHeapAllocatedSize)), null);
                    } else {
                        j = 0;
                    }
                    if (((Boolean) welcomePresenter.simplifiedIntegrityChecksEnabled$delegate.getValue()).booleanValue()) {
                        SessionManager sessionManager = welcomePresenter.sessionManager;
                        this.label = 1;
                        break;
                    }
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    j = 0;
                } else if (i3 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                    this.label = 3;
                    break;
                } else if (i3 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                welcomePresenter.referralSyncState.lastAttemptedRefresh = j;
                CoroutineContext coroutineContext = welcomePresenter.ioContext;
                PlaidLinkView.AnonymousClass2 anonymousClass2 = new PlaidLinkView.AnonymousClass2(welcomePresenter, continuation, 6);
                this.label = 2;
                withContext = JobKt.withContext(coroutineContext, anonymousClass2, this);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppConfigManager appConfigManager = welcomePresenter.appConfig;
                    this.label = 1;
                    if (((RealAppConfigManager) appConfigManager).update(true, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileSyncSetupTeardown realProfileSyncSetupTeardown = welcomePresenter.profileSyncWorker;
                    this.label = 1;
                    Object first = FlowKt.first(realProfileSyncSetupTeardown.isDone, new SessionWorkerKt$runSession$5(2, null, 17), this);
                    if (first != obj2) {
                        first = Unit.INSTANCE;
                    }
                    if (first == obj2) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(90, DurationUnit.SECONDS);
                    WelcomePresenter$models$2$1 welcomePresenter$models$2$1 = new WelcomePresenter$models$2$1(welcomePresenter, continuation, i2);
                    this.label = 1;
                    if (JobKt.m4185withTimeoutOrNullKLykuaI(duration, welcomePresenter$models$2$1, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i7 != 1) {
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
