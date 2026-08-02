package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.UtilsKt;
import com.squareup.cash.clientsync.errors.SyncEntityIdConsistencyException;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ClientsyncObservabilityIdAuditor;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.franklin.common.SyncEntityType;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public final class MatchingIdsSyncEntityAuditor extends ClientSyncStorageObserver.Typed {
    public final Map audited;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;

    public MatchingIdsSyncEntityAuditor(ErrorReporter errorReporter, FeatureFlagManager featureFlagManager) {
        this.errorReporter = errorReporter;
        this.featureFlagManager = featureFlagManager;
        ResourceFileSystem.Companion companion = SyncEntityType.Companion;
        AuditConfig auditConfig = AuditConfig.CUSTOMER;
        Pair pair = new Pair(2, auditConfig);
        Pair pair2 = new Pair(5, auditConfig);
        AuditConfig auditConfig2 = AuditConfig.PAYMENT;
        this.audited = MapsKt__MapsKt.mapOf(pair, pair2, new Pair(3, auditConfig2), new Pair(4, auditConfig2), new Pair(19, AuditConfig.LOAN_ACTIVITY), new Pair(31, auditConfig2), new Pair(11, AuditConfig.INVESTMENT_HOLDING));
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public final void onBeforeUpdateEntity(UpdateEntity updateEntity) {
        updateEntity.getClass();
        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ClientsyncObservabilityIdAuditor.INSTANCE)).enabled()) {
            SyncEntity entity = updateEntity.getEntity();
            AuditConfig auditConfig = (AuditConfig) this.audited.get(Integer.valueOf(entity.getEntityType().value));
            if (auditConfig != null) {
                com.squareup.protos.franklin.common.SyncEntity syncEntity = (com.squareup.protos.franklin.common.SyncEntity) entity.getEntityProto();
                syncEntity.getClass();
                String str = (String) auditConfig.payloadId.invoke(syncEntity);
                if (Intrinsics.areEqual(auditConfig.payloadIdTransform.invoke(str), syncEntity.entity_id)) {
                    return;
                }
                SyncEntityType type2 = UtilsKt.type(syncEntity);
                type2.getClass();
                this.errorReporter.report(new SyncEntityIdConsistencyException(type2, new SyncEntityIdConsistencyException.IdExpectation(UtilsKt.metadata(syncEntity), auditConfig.payloadIdField, str)), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            }
        }
    }
}
