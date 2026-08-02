package com.squareup.cash.clientsync.persistence;

import app.cash.local.views.map.LocalMapPinKt$$ExternalSyntheticLambda5;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class ShadowedSyncEntityStore extends SyncEntityStore {
    public final RealClientSyncErrorReporter errorReporter;
    public final SyncEntityStore mainStore;
    public final SyncEntityStore shadowStore;
    public final ClientSyncTransactor transactor;

    public ShadowedSyncEntityStore(SyncEntityStore syncEntityStore, SyncEntityStore syncEntityStore2, RealClientSyncErrorReporter realClientSyncErrorReporter, ClientSyncTransactor clientSyncTransactor) {
        syncEntityStore.getClass();
        syncEntityStore2.getClass();
        realClientSyncErrorReporter.getClass();
        clientSyncTransactor.getClass();
        this.mainStore = syncEntityStore;
        this.shadowStore = syncEntityStore2;
        this.errorReporter = realClientSyncErrorReporter;
        this.transactor = clientSyncTransactor;
        if (Intrinsics.areEqual(syncEntityStore, syncEntityStore2)) {
            a$$ExternalSyntheticBUOutline0.m$3("The main store and the shadow store must be different.");
            throw null;
        }
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final long deleteAllEntities() {
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        this.transactor.transaction(new BadgedBoxKt$$ExternalSyntheticLambda0(8, ref$LongRef, this));
        return ref$LongRef.element;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final void deleteEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        this.transactor.transaction(new ShadowedSyncEntityStore$$ExternalSyntheticLambda1(this, str, syncEntityType, 1));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllEntities(long j) {
        return (List) this.transactor.transactionWithResult(new LocalMapPinKt$$ExternalSyntheticLambda5(this, j, 8));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllEntitiesOfType(SyncEntityType syncEntityType) {
        return (List) this.transactor.transactionWithResult(new BadgedBoxKt$$ExternalSyntheticLambda0(5, this, syncEntityType));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final Flow getAllEntitiesOfTypeFlow(SyncEntityType syncEntityType) {
        return new RealActivityInvitePresenter(7, this.mainStore.getAllEntitiesOfTypeFlow(syncEntityType), this, syncEntityType);
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllValuesOfType(SyncValueType syncValueType) {
        return (List) this.transactor.transactionWithResult(new BadgedBoxKt$$ExternalSyntheticLambda0(7, this, syncValueType));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final Flow getAllValuesOfTypeFlow(SyncValueType syncValueType) {
        return new RealActivityInvitePresenter(8, this.mainStore.getAllValuesOfTypeFlow(syncValueType), this, syncValueType);
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final SyncEntity getEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        return (SyncEntity) this.transactor.transactionWithResult(new ShadowedSyncEntityStore$$ExternalSyntheticLambda1(this, str, syncEntityType, 0));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final void insertEntity(SyncEntity syncEntity) {
        syncEntity.getClass();
        this.transactor.transaction(new BadgedBoxKt$$ExternalSyntheticLambda0(6, this, syncEntity));
    }
}
