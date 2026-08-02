package com.squareup.cash.featureflags;

import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealLoginFeatureFlagsHandler {
    public final CashAccountDatabaseImpl cashDatabase;
    public final CoroutineContext ioDispatcher;

    public RealLoginFeatureFlagsHandler(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.cashDatabase = cashAccountDatabaseImpl;
        this.ioDispatcher = coroutineContext;
    }
}
