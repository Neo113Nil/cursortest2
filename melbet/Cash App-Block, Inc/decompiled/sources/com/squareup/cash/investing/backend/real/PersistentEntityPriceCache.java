package com.squareup.cash.investing.backend.real;

import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class PersistentEntityPriceCache {
    public final CashAccountDatabaseImpl database;
    public final CoroutineContext ioDispatcher;

    public PersistentEntityPriceCache(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.database = cashAccountDatabaseImpl;
        this.ioDispatcher = coroutineContext;
    }
}
