package com.squareup.cash.crypto.backend.settings;

import androidx.room.util.DBUtil;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.gps.db.GpsConfigQueries;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes6.dex */
public final class RealBitcoinConfigRepo {
    public final RealDisclosureProvider$special$$inlined$map$1 bitcoinInvestmentEntityToken;
    public final RealDisclosureProvider$special$$inlined$map$1 customOrderConfiguration;
    public final CoroutineContext ioDispatcher;
    public final RealDisclosureProvider$special$$inlined$map$1 minimumScheduledBitcoinBuyAmount;

    public RealBitcoinConfigRepo(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.ioDispatcher = coroutineContext;
        GpsConfigQueries gpsConfigQueries = cashAccountDatabaseImpl.investingSettingsQueries;
        this.bitcoinInvestmentEntityToken = new RealDisclosureProvider$special$$inlined$map$1(DBUtil.mapToOneNotNull(DBUtil.toFlow(gpsConfigQueries.select$2()), coroutineContext), 3);
        this.customOrderConfiguration = new RealDisclosureProvider$special$$inlined$map$1(DBUtil.mapToOneNotNull(DBUtil.toFlow(gpsConfigQueries.select$2()), coroutineContext), 4);
        this.minimumScheduledBitcoinBuyAmount = new RealDisclosureProvider$special$$inlined$map$1(DBUtil.mapToOneNotNull(DBUtil.toFlow(gpsConfigQueries.select$2()), coroutineContext), 5);
    }
}
