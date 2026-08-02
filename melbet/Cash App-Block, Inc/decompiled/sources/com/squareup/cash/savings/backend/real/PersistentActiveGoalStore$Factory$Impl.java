package com.squareup.cash.savings.backend.real;

import com.squareup.cash.clientrouting.LiteClientRouteRouter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.observability.types.ErrorReporter;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public final class PersistentActiveGoalStore$Factory$Impl {
    public final LiteClientRouteRouter.MetroFactory delegateFactory;

    public PersistentActiveGoalStore$Factory$Impl(LiteClientRouteRouter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final PersistentActiveGoalStore create$1(StateFlow stateFlow) {
        stateFlow.getClass();
        LiteClientRouteRouter.MetroFactory metroFactory = this.delegateFactory;
        CoroutineScope coroutineScope = (CoroutineScope) metroFactory.wrappedFactory.value;
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.allowlistProvider.invoke();
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) metroFactory.errorReporter.invoke();
        ErrorReporter errorReporter = (ErrorReporter) metroFactory.stringManager.invoke();
        coroutineScope.getClass();
        coroutineContext.getClass();
        cashAccountDatabaseImpl.getClass();
        errorReporter.getClass();
        return new PersistentActiveGoalStore(coroutineScope, coroutineContext, cashAccountDatabaseImpl, errorReporter, stateFlow);
    }
}
