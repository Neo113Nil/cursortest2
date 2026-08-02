package com.squareup.cash.crypto.backend.autoinvest;

import androidx.room.util.DBUtil;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries$selectForType$2;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries.SelectForTypeQuery;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealCryptoAutoInvestRepo implements CryptoAutoInvestRepo {
    public final CashAccountDatabaseImpl database;
    public final CoroutineContext ioDispatcher;

    public RealCryptoAutoInvestRepo(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.database = cashAccountDatabaseImpl;
        this.ioDispatcher = coroutineContext;
    }

    public final FlowQuery$mapToList$$inlined$map$1 getPreferenceQuery() {
        RecurringPreferenceQueries recurringPreferenceQueries = this.database.recurringPreferenceQueries;
        ScheduledTransactionPreference.Type type2 = ScheduledTransactionPreference.Type.BTC_BUY;
        recurringPreferenceQueries.getClass();
        type2.getClass();
        int i = RecurringPreferenceQueries$selectForType$2.$r8$clinit;
        return DBUtil.mapToOneOrNull(DBUtil.toFlow(recurringPreferenceQueries.new SelectForTypeQuery(type2, new RecurringPreferenceQueries$$ExternalSyntheticLambda5(recurringPreferenceQueries, 0))), this.ioDispatcher);
    }
}
