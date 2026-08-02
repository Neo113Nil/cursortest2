package com.squareup.cash.data.contacts;

import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda9;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.SyncDetailsQueries$selectAll$2;
import com.squareup.cash.db2.Sync_details;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class RealContactSyncDetailsRepository {
    public final SessionQueries syncDetailsQueries;

    public RealContactSyncDetailsRepository(CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        this.syncDetailsQueries = cashAccountDatabaseImpl.syncDetailsQueries;
    }

    public final Sync_details fetchDetails() {
        SessionQueries sessionQueries = this.syncDetailsQueries;
        sessionQueries.getClass();
        SyncDetailsQueries$selectAll$2 syncDetailsQueries$selectAll$2 = SyncDetailsQueries$selectAll$2.INSTANCE;
        SqlDriver sqlDriver = sessionQueries.driver;
        InstrumentQueries$$ExternalSyntheticLambda2 instrumentQueries$$ExternalSyntheticLambda2 = new InstrumentQueries$$ExternalSyntheticLambda2(23);
        sqlDriver.getClass();
        return (Sync_details) new SimpleQuery(-708482776, new String[]{"sync_details"}, sqlDriver, "SyncDetails.sq", "selectAll", "SELECT sync_details.rate_limited_time, sync_details.sync_token, sync_details.detailed_sync_token\nFROM sync_details", instrumentQueries$$ExternalSyntheticLambda2).executeAsOneOrNull();
    }

    public final Unit setDetailedSyncToken(String str) {
        SessionQueries sessionQueries = this.syncDetailsQueries;
        sessionQueries.driver.execute(250088201, "UPDATE sync_details\nSET detailed_sync_token = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 0));
        sessionQueries.notifyQueries(250088201, new InstrumentQueries$$ExternalSyntheticLambda2(21, false));
        return Unit.INSTANCE;
    }

    public final Unit setRateLimitedTime(Long l) {
        SessionQueries sessionQueries = this.syncDetailsQueries;
        sessionQueries.driver.execute(-1234375019, "UPDATE sync_details\nSET rate_limited_time = ?", new StorageLinkQueries$$ExternalSyntheticLambda9(1, l));
        sessionQueries.notifyQueries(-1234375019, new InstrumentQueries$$ExternalSyntheticLambda2(20, false));
        return Unit.INSTANCE;
    }
}
