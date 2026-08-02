package com.squareup.cash.account.backend;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.lifecycle.BlockRunner$cancel$1;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchingMetadata;
import com.squareup.cash.account.backend.AccountSwitcher$Result;
import com.squareup.cash.account.types.PrincipalAccountToken;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.account.AccountSwitchAccountAccountSwitchError;
import com.squareup.cash.cdf.account.AccountSwitchAccountAccountSwitchServerRequestComplete;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.RealOnSessionChangeActionsExecutor;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SwitchingState;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.janus.api.AuthorizationContext;
import com.squareup.protos.cash.janus.api.AuthorizedPrincipal;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.cash.janus.api.SwitchAccountRequest;
import com.squareup.protos.cash.janus.api.SwitchAccountResponse;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealAccountSwitcher {
    public final RealAccountSwitchAnalytics accountSwitchAnalytics;
    public final AccountSwitchScreenStateRelay accountSwitchScreenStateRelay;
    public final AcceptableScrim activityScrim;
    public final JanusService appService;
    public final AndroidClock clock;
    public final FlowStarter flowStarter;
    public final RealOnSessionChangeActionsExecutor.MetroFactory onSessionChangeActionsExecutorProvider;
    public final KeyValue principalAccountToken;
    public final SessionManager sessionManager;

    public RealAccountSwitcher(JanusService janusService, SessionManager sessionManager, FlowStarter flowStarter, RealAccountSwitchAnalytics realAccountSwitchAnalytics, AndroidClock androidClock, RealSessionFlags realSessionFlags, AccountSwitchScreenStateRelay accountSwitchScreenStateRelay, RealOnSessionChangeActionsExecutor.MetroFactory metroFactory, AcceptableScrim acceptableScrim, KeyValue keyValue) {
        this.appService = janusService;
        this.sessionManager = sessionManager;
        this.flowStarter = flowStarter;
        this.accountSwitchAnalytics = realAccountSwitchAnalytics;
        this.clock = androidClock;
        this.accountSwitchScreenStateRelay = accountSwitchScreenStateRelay;
        this.onSessionChangeActionsExecutorProvider = metroFactory;
        this.activityScrim = acceptableScrim;
        this.principalAccountToken = keyValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0188, code lost:
    
        if (r35.principalAccountToken.set(r3, r4) == r5) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [app.cash.api.ApiResult, app.cash.broadway.navigation.Navigator, com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchContinuation, com.squareup.cash.session.backend.SessionState] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object finish(AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation, Navigator navigator, ContinuationImpl continuationImpl) {
        RealAccountSwitcher$finish$1 realAccountSwitcher$finish$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        SessionManager sessionManager;
        SessionState sessionState;
        Navigator navigator2;
        AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation2;
        Object obj;
        int i2;
        ApiResult apiResult;
        SessionState sessionState2;
        AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation3;
        Navigator navigator3;
        AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation4;
        int i3;
        PrincipalAccountToken some;
        Object obj2;
        boolean z;
        ?? r11;
        AccountSwitcher$AccountSwitchingMetadata.SwitchSource switchSource;
        AccountSwitcher$AccountSwitchingMetadata.SwitchSource switchSource2;
        RedactedString redactedString;
        ResponseContext responseContext;
        AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation5 = accountSwitcher$AccountSwitchContinuation;
        Analytics analytics = this.accountSwitchAnalytics.analytics;
        if (continuationImpl instanceof RealAccountSwitcher$finish$1) {
            realAccountSwitcher$finish$1 = (RealAccountSwitcher$finish$1) continuationImpl;
            int i4 = realAccountSwitcher$finish$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountSwitcher$finish$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj3 = realAccountSwitcher$finish$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountSwitcher$finish$1.label;
                sessionManager = this.sessionManager;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    SessionState sessionState3 = (SessionState) sessionManager.getSessionState().getValue();
                    if (!(sessionState3 instanceof SwitchingState)) {
                        a$$ExternalSyntheticBUOutline0.m$3("Account switching cannot be finished without target and origin account tokens");
                        return null;
                    }
                    String str = accountSwitcher$AccountSwitchContinuation5.flowToken;
                    SwitchAccountRequest switchAccountRequest = new SwitchAccountRequest(null, ((SwitchingState) sessionState3).targetAccountToken, null, ByteString.EMPTY);
                    realAccountSwitcher$finish$1.L$0 = accountSwitcher$AccountSwitchContinuation5;
                    realAccountSwitcher$finish$1.L$1 = navigator;
                    realAccountSwitcher$finish$1.L$2 = accountSwitcher$AccountSwitchContinuation5;
                    realAccountSwitcher$finish$1.L$3 = sessionState3;
                    realAccountSwitcher$finish$1.I$0 = 0;
                    realAccountSwitcher$finish$1.label = 1;
                    Object switchAccount = this.appService.switchAccount(str, switchAccountRequest, realAccountSwitcher$finish$1);
                    if (switchAccount != coroutineSingletons) {
                        sessionState = sessionState3;
                        navigator2 = navigator;
                        accountSwitcher$AccountSwitchContinuation2 = accountSwitcher$AccountSwitchContinuation5;
                        obj = switchAccount;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    int i5 = realAccountSwitcher$finish$1.I$0;
                    SessionState sessionState4 = realAccountSwitcher$finish$1.L$3;
                    accountSwitcher$AccountSwitchContinuation2 = realAccountSwitcher$finish$1.L$2;
                    navigator2 = realAccountSwitcher$finish$1.L$1;
                    AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation6 = realAccountSwitcher$finish$1.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    i2 = i5;
                    accountSwitcher$AccountSwitchContinuation5 = accountSwitcher$AccountSwitchContinuation6;
                    sessionState = sessionState4;
                    obj = obj3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AccountSwitcher$Result accountSwitcher$Result = (AccountSwitcher$Result) realAccountSwitcher$finish$1.L$5;
                            SafeTrace.throwOnFailure(obj3);
                            return accountSwitcher$Result;
                        }
                        i3 = realAccountSwitcher$finish$1.I$0;
                        some = (PrincipalAccountToken) realAccountSwitcher$finish$1.L$5;
                        apiResult = realAccountSwitcher$finish$1.L$4;
                        sessionState2 = realAccountSwitcher$finish$1.L$3;
                        accountSwitcher$AccountSwitchContinuation3 = realAccountSwitcher$finish$1.L$2;
                        Navigator navigator4 = realAccountSwitcher$finish$1.L$1;
                        AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation7 = realAccountSwitcher$finish$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        accountSwitcher$AccountSwitchContinuation4 = accountSwitcher$AccountSwitchContinuation7;
                        navigator3 = navigator4;
                        AccountSwitcher$AccountSwitchType accountSwitcher$AccountSwitchType = some instanceof PrincipalAccountToken.Some ? AccountSwitcher$AccountSwitchType.TO_MANAGED_ACCOUNT : accountSwitcher$AccountSwitchContinuation4.initiationSource == AccountSwitcher$AccountSwitchInitiationSource.MANAGED_ACCOUNT_BACK ? AccountSwitcher$AccountSwitchType.BACK_TO_SPONSOR : AccountSwitcher$AccountSwitchType.REGULAR;
                        boolean z2 = accountSwitcher$AccountSwitchType == AccountSwitcher$AccountSwitchType.TO_MANAGED_ACCOUNT || accountSwitcher$AccountSwitchType == AccountSwitcher$AccountSwitchType.BACK_TO_SPONSOR;
                        String str2 = ((SwitchingState) sessionState2).targetAccountToken;
                        String str3 = accountSwitcher$AccountSwitchContinuation4.originAccountToken;
                        RedactedString redactedString2 = new RedactedString(accountSwitcher$AccountSwitchContinuation4.targetAccountCashtag);
                        int ordinal = accountSwitcher$AccountSwitchContinuation4.initiationSource.ordinal();
                        if (ordinal == 0) {
                            switchSource = AccountSwitcher$AccountSwitchingMetadata.SwitchSource.SWITCH;
                        } else {
                            if (ordinal != 1) {
                                redactedString = redactedString2;
                                switchSource2 = null;
                                long j = accountSwitcher$AccountSwitchContinuation4.startElapsedRealtimeMillis;
                                AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource = accountSwitcher$AccountSwitchContinuation4.initiationSource;
                                AccountSwitchScreenStateRelay accountSwitchScreenStateRelay = this.accountSwitchScreenStateRelay;
                                String str4 = accountSwitchScreenStateRelay.managedAccountWelcomeMessage;
                                int i6 = i3;
                                accountSwitchScreenStateRelay.managedAccountWelcomeMessage = null;
                                accountSwitchScreenStateRelay.accountSwitchingMetadata = new AccountSwitcher$AccountSwitchingMetadata(str2, str3, redactedString, switchSource2, j, accountSwitcher$AccountSwitchInitiationSource, accountSwitcher$AccountSwitchType, str4);
                                responseContext = ((SwitchAccountResponse) ((ApiResult.Success) apiResult).response).response_context;
                                String str5 = accountSwitcher$AccountSwitchContinuation3.flowToken;
                                RealFlowStarter realFlowStarter = (RealFlowStarter) this.flowStarter;
                                str5.getClass();
                                String persistedOnboardingFlowToken = realFlowStarter.persistedOnboardingFlowToken();
                                BlockersData startFlow$default = FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.ONBOARDING, PaymentScreens$HomeScreens$Home.INSTANCE, null, ClientScenario.RETURNING_CUSTOMER_LOGIN, persistedOnboardingFlowToken != null ? str5 : persistedOnboardingFlowToken, null, null, null, null, 980);
                                if (responseContext != null) {
                                    startFlow$default = startFlow$default.updateFromResponseContext(responseContext, false);
                                }
                                r11 = 0;
                                navigator3.goTo(realFlowStarter.blockersDataNavigator.getNext(null, startFlow$default));
                                obj2 = AccountSwitcher$Result.Success.INSTANCE;
                                i3 = i6;
                                z = z2;
                                if (!z) {
                                    DataStoreImpl$data$1.AnonymousClass2 anonymousClass2 = new DataStoreImpl$data$1.AnonymousClass2(8);
                                    realAccountSwitcher$finish$1.L$0 = r11;
                                    realAccountSwitcher$finish$1.L$1 = r11;
                                    realAccountSwitcher$finish$1.L$2 = r11;
                                    realAccountSwitcher$finish$1.L$3 = r11;
                                    realAccountSwitcher$finish$1.L$4 = r11;
                                    realAccountSwitcher$finish$1.L$5 = obj2;
                                    realAccountSwitcher$finish$1.I$0 = i3;
                                    realAccountSwitcher$finish$1.label = 4;
                                    if (this.activityScrim.interact(anonymousClass2, realAccountSwitcher$finish$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                return obj2;
                            }
                            switchSource = AccountSwitcher$AccountSwitchingMetadata.SwitchSource.CREATE;
                        }
                        switchSource2 = switchSource;
                        redactedString = redactedString2;
                        long j2 = accountSwitcher$AccountSwitchContinuation4.startElapsedRealtimeMillis;
                        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource2 = accountSwitcher$AccountSwitchContinuation4.initiationSource;
                        AccountSwitchScreenStateRelay accountSwitchScreenStateRelay2 = this.accountSwitchScreenStateRelay;
                        String str42 = accountSwitchScreenStateRelay2.managedAccountWelcomeMessage;
                        int i62 = i3;
                        accountSwitchScreenStateRelay2.managedAccountWelcomeMessage = null;
                        accountSwitchScreenStateRelay2.accountSwitchingMetadata = new AccountSwitcher$AccountSwitchingMetadata(str2, str3, redactedString, switchSource2, j2, accountSwitcher$AccountSwitchInitiationSource2, accountSwitcher$AccountSwitchType, str42);
                        responseContext = ((SwitchAccountResponse) ((ApiResult.Success) apiResult).response).response_context;
                        String str52 = accountSwitcher$AccountSwitchContinuation3.flowToken;
                        RealFlowStarter realFlowStarter2 = (RealFlowStarter) this.flowStarter;
                        str52.getClass();
                        String persistedOnboardingFlowToken2 = realFlowStarter2.persistedOnboardingFlowToken();
                        BlockersData startFlow$default2 = FlowStarter.startFlow$default(realFlowStarter2, BlockersData.Flow.ONBOARDING, PaymentScreens$HomeScreens$Home.INSTANCE, null, ClientScenario.RETURNING_CUSTOMER_LOGIN, persistedOnboardingFlowToken2 != null ? str52 : persistedOnboardingFlowToken2, null, null, null, null, 980);
                        if (responseContext != null) {
                        }
                        r11 = 0;
                        navigator3.goTo(realFlowStarter2.blockersDataNavigator.getNext(null, startFlow$default2));
                        obj2 = AccountSwitcher$Result.Success.INSTANCE;
                        i3 = i62;
                        z = z2;
                        if (!z) {
                        }
                        return obj2;
                    }
                    i3 = realAccountSwitcher$finish$1.I$0;
                    apiResult = realAccountSwitcher$finish$1.L$4;
                    sessionState2 = realAccountSwitcher$finish$1.L$3;
                    AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation8 = realAccountSwitcher$finish$1.L$2;
                    navigator3 = realAccountSwitcher$finish$1.L$1;
                    accountSwitcher$AccountSwitchContinuation4 = realAccountSwitcher$finish$1.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    accountSwitcher$AccountSwitchContinuation3 = accountSwitcher$AccountSwitchContinuation8;
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        String obj4 = apiResult.toString();
                        obj4.getClass();
                        analytics.track(new AccountSwitchAccountAccountSwitchError(obj4), null);
                        obj2 = AccountSwitcher$Result.Failure.INSTANCE;
                        z = false;
                        r11 = 0;
                        if (!z) {
                        }
                        return obj2;
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    AuthorizationContext authorizationContext = ((SwitchAccountResponse) ((ApiResult.Success) apiResult).response).authorization_context;
                    AuthorizedPrincipal authorizedPrincipal = authorizationContext != null ? authorizationContext.authorized_principal : null;
                    String str6 = authorizedPrincipal != null ? authorizedPrincipal.customer_token : null;
                    some = str6 == null ? PrincipalAccountToken.None.INSTANCE : new PrincipalAccountToken.Some(str6, authorizedPrincipal.switching_identifier);
                    realAccountSwitcher$finish$1.L$0 = accountSwitcher$AccountSwitchContinuation4;
                    realAccountSwitcher$finish$1.L$1 = navigator3;
                    realAccountSwitcher$finish$1.L$2 = accountSwitcher$AccountSwitchContinuation3;
                    realAccountSwitcher$finish$1.L$3 = sessionState2;
                    realAccountSwitcher$finish$1.L$4 = apiResult;
                    realAccountSwitcher$finish$1.L$5 = some;
                    realAccountSwitcher$finish$1.I$0 = i3;
                    realAccountSwitcher$finish$1.label = 3;
                }
                apiResult = (ApiResult) obj;
                String str7 = accountSwitcher$AccountSwitchContinuation2.flowToken;
                String str8 = accountSwitcher$AccountSwitchContinuation5.originAccountToken;
                String str9 = ((SwitchingState) sessionState).targetAccountToken;
                AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation9 = accountSwitcher$AccountSwitchContinuation2;
                long elapsedRealtime = this.clock.elapsedRealtime() - accountSwitcher$AccountSwitchContinuation5.startElapsedRealtimeMillis;
                ApiResult.Failure failure = !(apiResult instanceof ApiResult.Failure) ? (ApiResult.Failure) apiResult : null;
                String obj5 = failure == null ? failure.toString() : null;
                re$$ExternalSyntheticOutline0.m1432m(str7, str8, str9);
                analytics.track(new AccountSwitchAccountAccountSwitchServerRequestComplete(str7, str8, str9, Long.valueOf(elapsedRealtime), obj5 != null ? AccountSwitchAccountAccountSwitchServerRequestComplete.AccountSwitchResult.SUCCESS : AccountSwitchAccountAccountSwitchServerRequestComplete.AccountSwitchResult.FAILURE, obj5), null);
                realAccountSwitcher$finish$1.L$0 = accountSwitcher$AccountSwitchContinuation5;
                realAccountSwitcher$finish$1.L$1 = navigator2;
                realAccountSwitcher$finish$1.L$2 = accountSwitcher$AccountSwitchContinuation9;
                realAccountSwitcher$finish$1.L$3 = sessionState;
                realAccountSwitcher$finish$1.L$4 = apiResult;
                realAccountSwitcher$finish$1.I$0 = i2;
                realAccountSwitcher$finish$1.label = 2;
                if (sessionManager.updateSessionFinishAccountSwitchCall(realAccountSwitcher$finish$1) != coroutineSingletons) {
                    sessionState2 = sessionState;
                    accountSwitcher$AccountSwitchContinuation3 = accountSwitcher$AccountSwitchContinuation9;
                    navigator3 = navigator2;
                    accountSwitcher$AccountSwitchContinuation4 = accountSwitcher$AccountSwitchContinuation5;
                    i3 = i2;
                    if (!(apiResult instanceof ApiResult.Failure)) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realAccountSwitcher$finish$1 = new RealAccountSwitcher$finish$1(this, continuationImpl);
        Object obj32 = realAccountSwitcher$finish$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountSwitcher$finish$1.label;
        sessionManager = this.sessionManager;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj;
        String str72 = accountSwitcher$AccountSwitchContinuation2.flowToken;
        String str82 = accountSwitcher$AccountSwitchContinuation5.originAccountToken;
        String str92 = ((SwitchingState) sessionState).targetAccountToken;
        AccountSwitcher$AccountSwitchContinuation accountSwitcher$AccountSwitchContinuation92 = accountSwitcher$AccountSwitchContinuation2;
        long elapsedRealtime2 = this.clock.elapsedRealtime() - accountSwitcher$AccountSwitchContinuation5.startElapsedRealtimeMillis;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        if (failure == null) {
        }
        re$$ExternalSyntheticOutline0.m1432m(str72, str82, str92);
        analytics.track(new AccountSwitchAccountAccountSwitchServerRequestComplete(str72, str82, str92, Long.valueOf(elapsedRealtime2), obj5 != null ? AccountSwitchAccountAccountSwitchServerRequestComplete.AccountSwitchResult.SUCCESS : AccountSwitchAccountAccountSwitchServerRequestComplete.AccountSwitchResult.FAILURE, obj5), null);
        realAccountSwitcher$finish$1.L$0 = accountSwitcher$AccountSwitchContinuation5;
        realAccountSwitcher$finish$1.L$1 = navigator2;
        realAccountSwitcher$finish$1.L$2 = accountSwitcher$AccountSwitchContinuation92;
        realAccountSwitcher$finish$1.L$3 = sessionState;
        realAccountSwitcher$finish$1.L$4 = apiResult;
        realAccountSwitcher$finish$1.I$0 = i2;
        realAccountSwitcher$finish$1.label = 2;
        if (sessionManager.updateSessionFinishAccountSwitchCall(realAccountSwitcher$finish$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00af A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initiate(String str, String str2, String str3, AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource, TargetDestination targetDestination, ContinuationImpl continuationImpl) {
        RealAccountSwitcher$initiate$1 realAccountSwitcher$initiate$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        SessionManager sessionManager;
        String activeAccountToken;
        String str4;
        String str5;
        String str6;
        TargetDestination targetDestination2;
        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource2;
        String str7;
        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource3;
        String str8;
        String str9;
        TargetDestination targetDestination3;
        if (continuationImpl instanceof RealAccountSwitcher$initiate$1) {
            realAccountSwitcher$initiate$1 = (RealAccountSwitcher$initiate$1) continuationImpl;
            int i2 = realAccountSwitcher$initiate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountSwitcher$initiate$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAccountSwitcher$initiate$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountSwitcher$initiate$1.label;
                sessionManager = this.sessionManager;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activeAccountToken = PlatformKt.activeAccountToken(sessionManager);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    BlockRunner$cancel$1 blockRunner$cancel$1 = new BlockRunner$cancel$1(this, continuation, 23);
                    str4 = str;
                    realAccountSwitcher$initiate$1.L$0 = str4;
                    str5 = str2;
                    realAccountSwitcher$initiate$1.L$1 = str5;
                    str6 = str3;
                    realAccountSwitcher$initiate$1.L$2 = str6;
                    realAccountSwitcher$initiate$1.L$3 = accountSwitcher$AccountSwitchInitiationSource;
                    targetDestination2 = targetDestination;
                    realAccountSwitcher$initiate$1.L$4 = targetDestination2;
                    realAccountSwitcher$initiate$1.L$5 = activeAccountToken;
                    realAccountSwitcher$initiate$1.label = 1;
                    if (JobKt.withContext(defaultIoScheduler, blockRunner$cancel$1, realAccountSwitcher$initiate$1) == coroutineSingletons) {
                        return;
                    } else {
                        accountSwitcher$AccountSwitchInitiationSource2 = accountSwitcher$AccountSwitchInitiationSource;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                throw Recorder$$ExternalSyntheticOutline2.m(obj);
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return;
                        }
                        String str10 = realAccountSwitcher$initiate$1.L$5;
                        TargetDestination targetDestination4 = realAccountSwitcher$initiate$1.L$4;
                        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource4 = realAccountSwitcher$initiate$1.L$3;
                        String str11 = realAccountSwitcher$initiate$1.L$2;
                        String str12 = realAccountSwitcher$initiate$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        str7 = str10;
                        targetDestination3 = targetDestination4;
                        accountSwitcher$AccountSwitchInitiationSource3 = accountSwitcher$AccountSwitchInitiationSource4;
                        str9 = str11;
                        str8 = str12;
                        this.accountSwitchScreenStateRelay.accountSwitchContinuation = new AccountSwitcher$AccountSwitchContinuation(str8, accountSwitcher$AccountSwitchInitiationSource3, str7, str9, this.clock.elapsedRealtime(), targetDestination3);
                        realAccountSwitcher$initiate$1.L$0 = null;
                        realAccountSwitcher$initiate$1.L$1 = null;
                        realAccountSwitcher$initiate$1.L$2 = null;
                        realAccountSwitcher$initiate$1.L$3 = null;
                        realAccountSwitcher$initiate$1.L$4 = null;
                        realAccountSwitcher$initiate$1.L$5 = null;
                        realAccountSwitcher$initiate$1.label = 3;
                        JobKt.awaitCancellation(realAccountSwitcher$initiate$1);
                        return;
                    }
                    String str13 = realAccountSwitcher$initiate$1.L$5;
                    TargetDestination targetDestination5 = realAccountSwitcher$initiate$1.L$4;
                    accountSwitcher$AccountSwitchInitiationSource2 = realAccountSwitcher$initiate$1.L$3;
                    String str14 = realAccountSwitcher$initiate$1.L$2;
                    str5 = realAccountSwitcher$initiate$1.L$1;
                    String str15 = realAccountSwitcher$initiate$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str6 = str14;
                    str4 = str15;
                    activeAccountToken = str13;
                    targetDestination2 = targetDestination5;
                }
                realAccountSwitcher$initiate$1.L$0 = str4;
                realAccountSwitcher$initiate$1.L$1 = null;
                realAccountSwitcher$initiate$1.L$2 = str6;
                realAccountSwitcher$initiate$1.L$3 = accountSwitcher$AccountSwitchInitiationSource2;
                realAccountSwitcher$initiate$1.L$4 = targetDestination2;
                realAccountSwitcher$initiate$1.L$5 = activeAccountToken;
                realAccountSwitcher$initiate$1.label = 2;
                if (sessionManager.updateSessionForAccountSwitchOnboarding(str5, realAccountSwitcher$initiate$1) != coroutineSingletons) {
                    return;
                }
                str7 = activeAccountToken;
                accountSwitcher$AccountSwitchInitiationSource3 = accountSwitcher$AccountSwitchInitiationSource2;
                str8 = str4;
                str9 = str6;
                targetDestination3 = targetDestination2;
                this.accountSwitchScreenStateRelay.accountSwitchContinuation = new AccountSwitcher$AccountSwitchContinuation(str8, accountSwitcher$AccountSwitchInitiationSource3, str7, str9, this.clock.elapsedRealtime(), targetDestination3);
                realAccountSwitcher$initiate$1.L$0 = null;
                realAccountSwitcher$initiate$1.L$1 = null;
                realAccountSwitcher$initiate$1.L$2 = null;
                realAccountSwitcher$initiate$1.L$3 = null;
                realAccountSwitcher$initiate$1.L$4 = null;
                realAccountSwitcher$initiate$1.L$5 = null;
                realAccountSwitcher$initiate$1.label = 3;
                JobKt.awaitCancellation(realAccountSwitcher$initiate$1);
                return;
            }
        }
        realAccountSwitcher$initiate$1 = new RealAccountSwitcher$initiate$1(this, continuationImpl);
        Object obj2 = realAccountSwitcher$initiate$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountSwitcher$initiate$1.label;
        sessionManager = this.sessionManager;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        realAccountSwitcher$initiate$1.L$0 = str4;
        realAccountSwitcher$initiate$1.L$1 = null;
        realAccountSwitcher$initiate$1.L$2 = str6;
        realAccountSwitcher$initiate$1.L$3 = accountSwitcher$AccountSwitchInitiationSource2;
        realAccountSwitcher$initiate$1.L$4 = targetDestination2;
        realAccountSwitcher$initiate$1.L$5 = activeAccountToken;
        realAccountSwitcher$initiate$1.label = 2;
        if (sessionManager.updateSessionForAccountSwitchOnboarding(str5, realAccountSwitcher$initiate$1) != coroutineSingletons) {
        }
    }
}
