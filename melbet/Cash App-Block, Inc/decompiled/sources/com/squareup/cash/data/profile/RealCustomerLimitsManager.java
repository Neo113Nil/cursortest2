package com.squareup.cash.data.profile;

import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.app.AppService;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class RealCustomerLimitsManager implements CustomerLimitsManager {
    public final AppService appService;
    public final AndroidClock clock;
    public final CoroutineContext ioDispatcher;
    public long lastRefresh;
    public final InstrumentQueries limitsQueries;

    public RealCustomerLimitsManager(CashAccountDatabaseImpl cashAccountDatabaseImpl, AppService appService, AndroidClock androidClock, CoroutineContext coroutineContext, CoroutineScope coroutineScope, Flow flow) {
        this.appService = appService;
        this.clock = androidClock;
        this.ioDispatcher = coroutineContext;
        this.limitsQueries = cashAccountDatabaseImpl.customerLimitsQueries;
        JobKt.launch$default(coroutineScope, coroutineContext, null, new RealBoostSelector.AnonymousClass1(flow, this, null, 6), 2);
    }
}
