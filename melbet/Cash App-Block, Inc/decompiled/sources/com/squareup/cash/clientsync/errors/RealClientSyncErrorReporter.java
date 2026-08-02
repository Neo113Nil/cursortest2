package com.squareup.cash.clientsync.errors;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientsync.MultiplatformEntitySyncer;
import com.squareup.cash.clientsync.errors.ClientSyncError;
import com.squareup.cash.clientsync.models.ResetTrigger;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.persistence.SqlComponentMigrationStore;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ClientsyncIllegalVersionsEnhancedObservability;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.franklin.common.EncryptedSyncEntity;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.util.android.StrictModes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes.dex */
public final class RealClientSyncErrorReporter {
    public final SqlComponentMigrationStore componentMigrationStore;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final Lazy illegalStateHandler;

    public RealClientSyncErrorReporter(ErrorReporter errorReporter, SqlComponentMigrationStore sqlComponentMigrationStore, FeatureFlagManager featureFlagManager, Lazy lazy) {
        this.errorReporter = errorReporter;
        this.componentMigrationStore = sqlComponentMigrationStore;
        this.featureFlagManager = featureFlagManager;
        this.illegalStateHandler = lazy;
    }

    public static ClientSyncMultiplatformError asAndroidReportedError(ClientSyncError clientSyncError) {
        Map map;
        SyncValue syncValue;
        if (!(clientSyncError instanceof SyncValuesWithoutType)) {
            String message = clientSyncError.getMessage();
            String groupingIdentifier = clientSyncError.getGroupingIdentifier();
            ClientSyncError.Metadata metadata = clientSyncError.getMetadata();
            if (metadata == null || (map = BalanceFeedKt$$ExternalSyntheticOutline0.m("Client Sync", metadata.toMap())) == null) {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
            return new ClientSyncMultiplatformError(message, clientSyncError, groupingIdentifier, map);
        }
        SyncValuesWithoutType syncValuesWithoutType = (SyncValuesWithoutType) clientSyncError;
        String message2 = syncValuesWithoutType.getMessage();
        String groupingIdentifier2 = syncValuesWithoutType.getGroupingIdentifier();
        List<SyncEntity> values = syncValuesWithoutType.getMetadata().getValues();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (SyncEntity syncEntity : values) {
            Object entityProto = syncEntity.getEntityProto();
            Integer num = null;
            com.squareup.protos.franklin.common.SyncEntity syncEntity2 = entityProto instanceof com.squareup.protos.franklin.common.SyncEntity ? (com.squareup.protos.franklin.common.SyncEntity) entityProto : null;
            EncryptedSyncEntity encryptedSyncEntity = syncEntity2 != null ? syncEntity2.encrypted_sync_entity : null;
            String entityId = syncEntity.getEntityId();
            Pair pair = new Pair("entityType", Integer.valueOf(syncEntity.getEntityType().value));
            SyncValueType valueType = syncEntity.getValueType();
            Pair pair2 = new Pair("valueType", valueType != null ? Integer.valueOf(valueType.value) : null);
            Pair pair3 = new Pair("valueType (from proto)", (syncEntity2 == null || (syncValue = syncEntity2.sync_value) == null) ? null : syncValue.f1393type);
            Pair pair4 = new Pair("valueType (from proto as int)", syncEntity2 != null ? StrictModes.getSyncValueTypeAsInt(syncEntity2) : null);
            Pair pair5 = new Pair("valueType (from encrypted)", encryptedSyncEntity != null ? encryptedSyncEntity.sync_value_type : null);
            if (encryptedSyncEntity != null) {
                num = StrictModes.getSyncValueTypeAsInt(encryptedSyncEntity);
            }
            linkedHashMap.put(entityId, MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, new Pair("valueType (from encrypted as int)", num)));
        }
        return new ClientSyncMultiplatformError(message2, clientSyncError, groupingIdentifier2, MapsKt__MapsJVMKt.mapOf(new Pair("Client Sync", linkedHashMap)));
    }

    public final void reportFatal(ClientSyncError clientSyncError) {
        ClientSyncMultiplatformError asAndroidReportedError = asAndroidReportedError(clientSyncError);
        if (!(clientSyncError instanceof IllegalSyncValueCardinality)) {
            throw asAndroidReportedError;
        }
        MultiplatformEntitySyncer multiplatformEntitySyncer = (MultiplatformEntitySyncer) this.illegalStateHandler.getValue();
        multiplatformEntitySyncer.getClass();
        ((RealClientSyncer) multiplatformEntitySyncer.clientSyncer.getValue()).reset(ResetTrigger.IllegalStateRecovery);
        throw asAndroidReportedError;
    }

    public final void reportNonFatal(ClientSyncError clientSyncError) {
        boolean z;
        if (clientSyncError instanceof StorageOperationEntityVersionDowngrade) {
            z = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ClientsyncIllegalVersionsEnhancedObservability.INSTANCE)).enabled();
        } else {
            z = true;
        }
        if (z) {
            this.errorReporter.report(asAndroidReportedError(clientSyncError), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        }
        boolean z2 = clientSyncError instanceof SyncRangeShadowDivergence;
        SqlComponentMigrationStore sqlComponentMigrationStore = this.componentMigrationStore;
        if (z2) {
            sqlComponentMigrationStore.deleteMigrationVersion("sync_range_store");
        } else if (clientSyncError instanceof SyncEntityShadowDivergence) {
            sqlComponentMigrationStore.deleteMigrationVersion("sync_entity_store");
        }
    }
}
