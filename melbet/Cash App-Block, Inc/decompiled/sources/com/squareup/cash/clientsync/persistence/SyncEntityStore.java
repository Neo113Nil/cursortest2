package com.squareup.cash.clientsync.persistence;

import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncValueType;
import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public abstract class SyncEntityStore {
    public abstract long deleteAllEntities();

    public abstract void deleteEntity(String str, SyncEntityType syncEntityType);

    public abstract List getAllEntities(long j);

    public abstract List getAllEntitiesOfType(SyncEntityType syncEntityType);

    public abstract Flow getAllEntitiesOfTypeFlow(SyncEntityType syncEntityType);

    public abstract List getAllValuesOfType(SyncValueType syncValueType);

    public abstract Flow getAllValuesOfTypeFlow(SyncValueType syncValueType);

    public abstract SyncEntity getEntity(String str, SyncEntityType syncEntityType);

    public abstract void insertEntity(SyncEntity syncEntity);
}
