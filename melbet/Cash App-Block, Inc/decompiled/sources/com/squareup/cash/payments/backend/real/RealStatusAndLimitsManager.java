package com.squareup.cash.payments.backend.real;

import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.BalanceDataQueries$select$2;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class RealStatusAndLimitsManager {
    public final InstrumentQueries balanceDataQueries;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final Signal signOut;
    public final SyncValueReader syncValueReader;

    public RealStatusAndLimitsManager(SyncValueReader syncValueReader, CashAccountDatabaseImpl cashAccountDatabaseImpl, FeatureFlagManager featureFlagManager, Signal signal, CoroutineContext coroutineContext) {
        this.ioDispatcher = coroutineContext;
        this.featureFlagManager = featureFlagManager;
        this.signOut = signal;
        this.syncValueReader = syncValueReader;
        this.balanceDataQueries = cashAccountDatabaseImpl.balanceDataQueries;
    }

    public final Flow addCashEnabled() {
        SyncValueType syncValueType = SyncValueType.STATUS_AND_LIMITS;
        InstrumentQueries instrumentQueries = this.balanceDataQueries;
        instrumentQueries.getClass();
        BalanceDataQueries$select$2 balanceDataQueries$select$2 = BalanceDataQueries$select$2.INSTANCE;
        SqlDriver sqlDriver = instrumentQueries.driver;
        OfflineQueries$$ExternalSyntheticLambda0 offlineQueries$$ExternalSyntheticLambda0 = new OfflineQueries$$ExternalSyntheticLambda0(instrumentQueries, (byte) 0);
        sqlDriver.getClass();
        return StateFlowKt.runUntil(FlowKt.distinctUntilChanged(new RealDrawerOpener$getDrawerScreen$$inlined$map$1(Trace.selectClientSyncValues(this.featureFlagManager, syncValueType, new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(-2051632653, new String[]{"balanceData"}, sqlDriver, "BalanceData.sq", "select", "SELECT balanceData.cash_balance_home_screen_button_enabled, balanceData.cash_balance_home_screen_button_priority, balanceData.adding_cash_enabled, balanceData.enable_cryptocurrency_transfer_out_status, balanceData.enable_cryptocurrency_transfer_out_button_text, balanceData.balance_limit_groups, balanceData.scheduled_reload_data, balanceData.scheduled_reload_enabled, balanceData.enable_cryptocurrency_transfer_in_status, balanceData.enable_cryptocurrency_transfer_in_button_text, balanceData.check_deposits_enabled, balanceData.direct_deposit, balanceData.deposit_check, balanceData.dda_form, balanceData.bitcoin_p2p_enabled\nFROM balanceData", offlineQueries$$ExternalSyntheticLambda0)), this.ioDispatcher), 21), new MoneyTabPresenter$models$lambda$31$$inlined$map$1(this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.StatusAndLimits), 28)), 14)), this.signOut);
    }

    public final Flow hasPassedIdv() {
        return StateFlowKt.runUntil(FlowKt.distinctUntilChanged(new MoneyTabPresenter$models$lambda$31$$inlined$map$1(this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.IdvState), 29)), this.signOut);
    }
}
