package com.squareup.cash.instruments.backend.real;

import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.SyncValueType;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes.dex */
public final class RealBalanceSnapshotManager {
    public final FeatureFlagManager featureFlagManager;
    public final InstrumentQueries instrumentQueries;
    public final CoroutineContext ioDispatcher;
    public final RealProfileManager profileManager;
    public final SyncValueReader syncValueReader;

    public RealBalanceSnapshotManager(CashAccountDatabaseImpl cashAccountDatabaseImpl, FeatureFlagManager featureFlagManager, SyncValueReader syncValueReader, RealProfileManager realProfileManager, CoroutineContext coroutineContext) {
        this.featureFlagManager = featureFlagManager;
        this.syncValueReader = syncValueReader;
        this.profileManager = realProfileManager;
        this.ioDispatcher = coroutineContext;
        this.instrumentQueries = cashAccountDatabaseImpl.instrumentQueries;
    }

    public static final BalanceSnapshot access$asBalanceSnapshot(RealBalanceSnapshotManager realBalanceSnapshotManager, com.squareup.protos.franklin.ui.BalanceSnapshot balanceSnapshot) {
        String str = balanceSnapshot.instrument_token;
        str.getClass();
        Money money = balanceSnapshot.balance;
        money.getClass();
        return new BalanceSnapshot(str, new Money(money.amount, money.currency_code, 4), balanceSnapshot.version);
    }

    public final ChannelFlowTransformLatest select() {
        SyncValueType syncValueType = SyncValueType.BALANCE_SNAPSHOT;
        int i = 0;
        SupportHomePresenter$models$lambda$5$$inlined$map$1 supportHomePresenter$models$lambda$5$$inlined$map$1 = new SupportHomePresenter$models$lambda$5$$inlined$map$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(this.profileManager.currencyCode(), this.syncValueReader.getAllValues(AndroidSyncValueSpecs.BalanceSnapshot), new RealBalanceSnapshotManager$syncValueBased$1(this, null, i), i), 5);
        CashInstrumentType cashInstrumentType = CashInstrumentType.CASH_BALANCE;
        ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5 composableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5 = new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(19);
        InstrumentQueries instrumentQueries = this.instrumentQueries;
        instrumentQueries.getClass();
        cashInstrumentType.getClass();
        return Trace.selectClientSyncValues(this.featureFlagManager, syncValueType, DBUtil.mapToOneOrNull(DBUtil.toFlow(new RewardQueries.ForIdsQuery(instrumentQueries, cashInstrumentType, new InstrumentQueries$$ExternalSyntheticLambda0(i, composableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5, instrumentQueries), 17)), this.ioDispatcher), supportHomePresenter$models$lambda$5$$inlined$map$1);
    }
}
