package com.squareup.cash.investing.backend.real;

import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.util.cache.Cache;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class PersistentHistoricalDataCache {
    public final CashAccountDatabaseImpl database;
    public final CoroutineContext ioDispatcher;
    public final Cache portfoliosHistoricalDataResponseCache;
    public final ConcurrentHashMap entityMemoryCache = new ConcurrentHashMap();
    public final ConcurrentHashMap bitcoinPortfolio = new ConcurrentHashMap();

    public PersistentHistoricalDataCache(CashAccountDatabaseImpl cashAccountDatabaseImpl, Cache cache, CoroutineContext coroutineContext) {
        this.database = cashAccountDatabaseImpl;
        this.portfoliosHistoricalDataResponseCache = cache;
        this.ioDispatcher = coroutineContext;
    }

    public final RewardSlotQueries getQueries() {
        return this.database.investingPortfolioGraphCacheQueries;
    }
}
