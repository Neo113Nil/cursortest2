package com.squareup.cash.session.backend;

import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAppDatabaseImpl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.session.backend.RealSessionManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes.dex */
public final class DbSessionManager implements SessionManager {
    public final Analytics analytics;
    public final StateFlowImpl dbSessionState;
    public final MutexImpl dbSessionStateLock;
    public final ErrorReporter errorReporter;
    public final CoroutineContext ioContext;
    public final RealOnboardingFlowTokenManager onboardingFlowTokenManager;
    public final CoroutineScope scope;
    public final SessionQueries sessionQueries;
    public final DerivedStateFlow sessionState;

    public DbSessionManager(CashAppDatabaseImpl cashAppDatabaseImpl, RealOnboardingFlowTokenManager realOnboardingFlowTokenManager, Analytics analytics, ErrorReporter errorReporter, com.squareup.cash.db.Session session, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.onboardingFlowTokenManager = realOnboardingFlowTokenManager;
        this.analytics = analytics;
        this.errorReporter = errorReporter;
        this.ioContext = coroutineContext;
        this.scope = coroutineScope;
        this.sessionQueries = cashAppDatabaseImpl.sessionQueries;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(session);
        this.dbSessionState = MutableStateFlow;
        this.dbSessionStateLock = new MutexImpl();
        this.sessionState = StateFlowKt.mapState(MutableStateFlow, new RealSheetState$$ExternalSyntheticLambda0(1));
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object delete(SessionManager.DeletionMode deletionMode, ContinuationImpl continuationImpl) {
        Object updateDb = updateDb(RealSessionManager.StateChangeReason.DATA_DELETION, new CalloutKt$$ExternalSyntheticLambda0(21, deletionMode, this), continuationImpl);
        return updateDb == CoroutineSingletons.COROUTINE_SUSPENDED ? updateDb : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final StateFlow getOnboardedAccountStatus() {
        return StateFlowKt.mapState(this.dbSessionState, new CalloutKt$$ExternalSyntheticLambda1(29));
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final StateFlow getSessionState() {
        return this.sessionState;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateActiveAccountToken(String str, ContinuationImpl continuationImpl) {
        Object updateDb = updateDb(RealSessionManager.StateChangeReason.ACTIVE_ACCOUNT_TOKEN_UPDATED, new InfoSectionKt$$ExternalSyntheticLambda7(str, 25), continuationImpl);
        return updateDb == CoroutineSingletons.COROUTINE_SUSPENDED ? updateDb : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateAppToken(String str, ContinuationImpl continuationImpl) {
        Object updateDb = updateDb(RealSessionManager.StateChangeReason.APP_TOKEN_UPDATED, new InfoSectionKt$$ExternalSyntheticLambda7(str, 27), continuationImpl);
        return updateDb == CoroutineSingletons.COROUTINE_SUSPENDED ? updateDb : Unit.INSTANCE;
    }

    public final Object updateDb(RealSessionManager.StateChangeReason stateChangeReason, Function2 function2, ContinuationImpl continuationImpl) {
        return JobKt.withContext(this.ioContext, new DbSessionManager$updateDb$2(this, function2, stateChangeReason, (Continuation) null), continuationImpl);
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateOnboardedState(boolean z, ContinuationImpl continuationImpl) {
        Object updateDb = updateDb(RealSessionManager.StateChangeReason.ONBOARDED_STATE_UPDATED, new SheetKt$$ExternalSyntheticLambda6(this, 10), continuationImpl);
        return updateDb == CoroutineSingletons.COROUTINE_SUSPENDED ? updateDb : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateSession(ResponseContext responseContext, String str, Exception exc, Continuation continuation) {
        Object updateDb = updateDb(RealSessionManager.StateChangeReason.RESPONSE_CONTEXT, new LifecycleKt$$ExternalSyntheticLambda0(responseContext, this, exc, str, 4), (ContinuationImpl) continuation);
        return updateDb == CoroutineSingletons.COROUTINE_SUSPENDED ? updateDb : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateSessionFinishAccountSwitchCall(ContinuationImpl continuationImpl) {
        Object updateDb = updateDb(RealSessionManager.StateChangeReason.ACCOUNT_SWITCH_FINISHED, new ShareSheetPresenter$$ExternalSyntheticLambda0(13), continuationImpl);
        return updateDb == CoroutineSingletons.COROUTINE_SUSPENDED ? updateDb : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateSessionForAccountSwitchOnboarding(String str, ContinuationImpl continuationImpl) {
        Object updateDb = updateDb(RealSessionManager.StateChangeReason.ACCOUNT_SWITCH_STARTED, new InfoSectionKt$$ExternalSyntheticLambda7(str, 26), continuationImpl);
        return updateDb == CoroutineSingletons.COROUTINE_SUSPENDED ? updateDb : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateSession(Session session, String str, ContinuationImpl continuationImpl) {
        Object updateDb = updateDb(RealSessionManager.StateChangeReason.SESSION_UPDATED, new BasicShieetScope$$ExternalSyntheticLambda1(8, this, session, str), continuationImpl);
        return updateDb == CoroutineSingletons.COROUTINE_SUSPENDED ? updateDb : Unit.INSTANCE;
    }
}
