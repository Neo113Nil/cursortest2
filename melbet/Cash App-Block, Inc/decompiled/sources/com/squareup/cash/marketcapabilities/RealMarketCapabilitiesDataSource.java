package com.squareup.cash.marketcapabilities;

import androidx.room.util.DBUtil;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.marketcapabilities.db.MarketCapabilitiesConfigQueries$select$2;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealMarketCapabilitiesDataSource {
    public final CoroutineContext ioDispatcher;
    public final GpsConfigQueries marketCapabilitiesConfigQueries;
    public final AppLockMonitor$special$$inlined$map$2 protoMarketCapabilitiesFlow;

    public RealMarketCapabilitiesDataSource(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.ioDispatcher = coroutineContext;
        GpsConfigQueries gpsConfigQueries = cashAccountDatabaseImpl.marketCapabilitiesConfigQueries;
        this.marketCapabilitiesConfigQueries = gpsConfigQueries;
        gpsConfigQueries.getClass();
        MarketCapabilitiesConfigQueries$select$2 marketCapabilitiesConfigQueries$select$2 = MarketCapabilitiesConfigQueries$select$2.INSTANCE;
        SqlDriver sqlDriver = gpsConfigQueries.driver;
        StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(gpsConfigQueries);
        sqlDriver.getClass();
        this.protoMarketCapabilitiesFlow = new AppLockMonitor$special$$inlined$map$2(DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(-1344882128, new String[]{"marketCapabilitiesConfig"}, sqlDriver, "MarketCapabilitiesConfig.sq", "select", "SELECT marketCapabilitiesConfig.id, marketCapabilitiesConfig.capabilities FROM marketCapabilitiesConfig", storageLinkQueries$$ExternalSyntheticLambda8)), coroutineContext), 13);
    }
}
