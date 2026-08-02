package com.squareup.cash.data.profile;

import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class RealProfileSyncSetupTeardown implements UiSetupTeardown {
    public final ErrorReporter errorReporter;
    public final StateFlowImpl isDone = FlowKt.MutableStateFlow(Boolean.FALSE);
    public final RealProfileSyncer profileSyncer;
    public final SessionManager sessionManager;

    public RealProfileSyncSetupTeardown(RealProfileSyncer realProfileSyncer, SessionManager sessionManager, ErrorReporter errorReporter) {
        this.profileSyncer = realProfileSyncer;
        this.sessionManager = sessionManager;
        this.errorReporter = errorReporter;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealBoostSelector.AnonymousClass1((Continuation) null, this, 7), 1);
        return StateFlowKt.noOpTeardown;
    }
}
