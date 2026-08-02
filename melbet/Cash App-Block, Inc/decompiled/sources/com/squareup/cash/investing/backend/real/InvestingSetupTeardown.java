package com.squareup.cash.investing.backend.real;

import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class InvestingSetupTeardown implements IoSetupTeardown {
    public final CashAccountDatabaseImpl database;
    public final CoroutineContext ioDispatcher;
    public final SessionManager sessionManager;
    public final RealInvestingSyncer syncer;

    public InvestingSetupTeardown(CashAccountDatabaseImpl cashAccountDatabaseImpl, RealInvestingSyncer realInvestingSyncer, CoroutineContext coroutineContext, SessionManager sessionManager) {
        this.database = cashAccountDatabaseImpl;
        this.syncer = realInvestingSyncer;
        this.ioDispatcher = coroutineContext;
        this.sessionManager = sessionManager;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealBoostSelector.AnonymousClass1((Continuation) null, this, 20), 1);
        return StateFlowKt.noOpTeardown;
    }
}
