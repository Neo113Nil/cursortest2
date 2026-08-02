package com.squareup.cash.clientsync.readers;

import androidx.datastore.core.DataStoreImpl$data$1;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.clientsync.util.coroutines.ClientSyncDispatchers;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.encryption.RealClientSyncEntityDecryptor;
import com.stripe.android.uicore.utils.StateFlowsKt$mapAsStateFlow$$inlined$map$1;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;

/* loaded from: classes6.dex */
public final class RealSyncValueReaderV2 extends SyncValueReader {
    public final RealClientSyncEntityDecryptor entityDecryptor;
    public final SyncEntityStore entityStore;
    public final RealClientSyncErrorReporter errorReporter;
    public boolean hasReportedSyncValuesWithoutType;
    public final CoroutineDispatcher ioDispatcher;
    public final CoroutineScope scope;
    public final ReadonlyStateFlow syncValuesByType;

    public RealSyncValueReaderV2(RealClientSyncEntityDecryptor realClientSyncEntityDecryptor, SyncEntityStore syncEntityStore, RealClientSyncErrorReporter realClientSyncErrorReporter, CoroutineScope coroutineScope) {
        DefaultIoScheduler defaultIoScheduler = ClientSyncDispatchers.IO;
        defaultIoScheduler.getClass();
        this.entityDecryptor = realClientSyncEntityDecryptor;
        this.entityStore = syncEntityStore;
        this.errorReporter = realClientSyncErrorReporter;
        this.scope = coroutineScope;
        this.ioDispatcher = defaultIoScheduler;
        RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$1 = new RealTransferManager$addCash$$inlined$map$1(syncEntityStore.getAllEntitiesOfTypeFlow(new SyncEntityType(14)), this, 14);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.syncValuesByType = FlowKt.stateIn(realTransferManager$addCash$$inlined$map$1, coroutineScope, SharingStarted.Companion.Eagerly, emptyMap);
    }

    @Override // com.squareup.cash.clientsync.readers.SyncValueReader
    public final Object awaitReady(SuspendLambda suspendLambda) {
        Object first = FlowKt.first(this.syncValuesByType, new DataStoreImpl$data$1.AnonymousClass2(2, null, 17), suspendLambda);
        return first == CoroutineSingletons.COROUTINE_SUSPENDED ? first : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.clientsync.readers.SyncValueReader
    public final StateFlow getAllValues(SyncValueSpec syncValueSpec, Function1 function1) {
        syncValueSpec.getClass();
        return getValues(syncValueSpec, new CaptureCheckFaceKt$$ExternalSyntheticLambda11(20, function1, this, syncValueSpec));
    }

    @Override // com.squareup.cash.clientsync.readers.SyncValueReader
    public final StateFlow getFirstValueOrDefault(SyncValueSpec syncValueSpec, Boolean bool, Function1 function1) {
        return getValues(syncValueSpec, new RealSyncValueReaderV2$$ExternalSyntheticLambda1(bool, function1, this, syncValueSpec, 1));
    }

    @Override // com.squareup.cash.clientsync.readers.SyncValueReader
    public final StateFlow getSingleValueOrDefault(SyncValueSpec syncValueSpec, Object obj, Function1 function1) {
        syncValueSpec.getClass();
        return getValues(syncValueSpec, new RealSyncValueReaderV2$$ExternalSyntheticLambda1(obj, function1, this, syncValueSpec, 0));
    }

    public final ReadonlyStateFlow getValues(SyncValueSpec syncValueSpec, Function1 function1) {
        Flow flowOn = FlowKt.flowOn(new StateFlowsKt$mapAsStateFlow$$inlined$map$1(this.entityStore.getAllValuesOfTypeFlow((SyncValueType) syncValueSpec.valueType), function1, 1), this.ioDispatcher);
        StartedWhileSubscribed startedWhileSubscribed = new StartedWhileSubscribed(0L, Long.MAX_VALUE);
        Object obj = (List) ((Map) this.syncValuesByType.$$delegate_0.getValue()).get((SyncValueType) syncValueSpec.valueType);
        if (obj == null) {
            obj = EmptyList.INSTANCE;
        }
        return FlowKt.stateIn(flowOn, this.scope, startedWhileSubscribed, function1.invoke(obj));
    }
}
