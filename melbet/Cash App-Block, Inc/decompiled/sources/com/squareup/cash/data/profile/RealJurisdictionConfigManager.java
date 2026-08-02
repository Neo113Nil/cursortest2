package com.squareup.cash.data.profile;

import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import com.squareup.cash.boost.backend.RealBoostRepository$getAllOrderedBoosts$$inlined$map$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.protos.franklin.common.SyncValueType;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes.dex */
public final class RealJurisdictionConfigManager {
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final InstrumentQueries profileQueries;
    public final SyncValueReader syncValueReader;

    public RealJurisdictionConfigManager(SyncValueReader syncValueReader, CashAccountDatabaseImpl cashAccountDatabaseImpl, FeatureFlagManager featureFlagManager, CoroutineContext coroutineContext) {
        this.syncValueReader = syncValueReader;
        this.featureFlagManager = featureFlagManager;
        this.ioDispatcher = coroutineContext;
        this.profileQueries = cashAccountDatabaseImpl.profileQueries;
    }

    public final ChannelFlowTransformLatest select() {
        return Trace.selectClientSyncValues(this.featureFlagManager, SyncValueType.JURISDICTION_CONFIG, new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(this.profileQueries.select$2()), this.ioDispatcher), 9), new RealBoostRepository$getAllOrderedBoosts$$inlined$map$1(FlowKt.flatMapConcat(new DataStoreImpl$data$1.AnonymousClass2(18), this.syncValueReader.getAllValues(AndroidSyncValueSpecs.JurisdictionConfig)), 1));
    }
}
