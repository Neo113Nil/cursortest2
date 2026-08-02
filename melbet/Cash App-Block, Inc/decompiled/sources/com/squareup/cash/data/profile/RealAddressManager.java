package com.squareup.cash.data.profile;

import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.protos.franklin.common.SyncValueType;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes6.dex */
public final class RealAddressManager {
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioContext;
    public final InstrumentQueries profileQueries;
    public final SyncValueReader syncValueReader;

    public RealAddressManager(SyncValueReader syncValueReader, CashAccountDatabaseImpl cashAccountDatabaseImpl, FeatureFlagManager featureFlagManager, CoroutineContext coroutineContext) {
        this.syncValueReader = syncValueReader;
        this.featureFlagManager = featureFlagManager;
        this.ioContext = coroutineContext;
        this.profileQueries = cashAccountDatabaseImpl.profileQueries;
    }

    public final ChannelFlowTransformLatest address() {
        return Trace.selectClientSyncValues(this.featureFlagManager, SyncValueType.ADDRESS, new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(this.profileQueries.select$2()), this.ioContext), 8), this.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.Address, null, new FlowStarter$$ExternalSyntheticLambda0(28)));
    }
}
