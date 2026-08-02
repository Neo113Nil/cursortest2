package com.squareup.cash.observability.backend.real.bugsnag;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.localization.RealRegionProvider$1$1$1;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.worker.ApplicationWorker;
import com.squareup.preferences.StringPreference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class ErrorReportingWorker implements ApplicationWorker {
    public final BugsnagClient bugsnagClient;
    public final SessionManager sessionManager;
    public final StringPreference temporaryErrorReporterUserIdentifier;

    public ErrorReportingWorker(BugsnagClient bugsnagClient, SessionManager sessionManager, StringPreference stringPreference) {
        this.bugsnagClient = bugsnagClient;
        this.sessionManager = sessionManager;
        this.temporaryErrorReporterUserIdentifier = stringPreference;
    }

    @Override // com.squareup.cash.worker.ApplicationWorker
    public final Object work(Continuation continuation) {
        Object collect = FlowKt.distinctUntilChanged(new FinishSetupTileBadgeCounter(18, this.sessionManager.getSessionState(), this)).collect(new RealRegionProvider$1$1$1(this, 29), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }
}
