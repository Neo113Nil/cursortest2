package com.squareup.cash.exchangedata.real;

import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.app.AppService;
import java.util.LinkedHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class RealExchangeDataSyncerFactory {
    public final AppService appService;
    public final AndroidClock clock;
    public final CoroutineContext ioContext;
    public final GpsConfigQueries queries;
    public final CoroutineScope scope;
    public final LinkedHashMap syncers = new LinkedHashMap();

    public RealExchangeDataSyncerFactory(AppService appService, CoroutineContext coroutineContext, AndroidClock androidClock, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineScope coroutineScope) {
        this.appService = appService;
        this.ioContext = coroutineContext;
        this.clock = androidClock;
        this.scope = coroutineScope;
        this.queries = cashAccountDatabaseImpl.exchangeDataQueries;
    }
}
