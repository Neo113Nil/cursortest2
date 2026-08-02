package com.squareup.cash.investing.backend.real.categories;

import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.education.stories.db.StoryQueries;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.investing.db.categories.CategoryQueries;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;

/* loaded from: classes.dex */
public final class InvestmentCategorySyncEntityStorageObserver extends SyncEntityStorageObserver {
    public final CategoryQueries categoryQueries;
    public final CashAccountDatabaseImpl database;
    public final CategoryQueries entityInCategoryQueries;
    public final StoryQueries filtersForCategoryQueries;

    public InvestmentCategorySyncEntityStorageObserver(CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        super(AndroidSyncValueSpecs.InvestmentCategory);
        this.database = cashAccountDatabaseImpl;
        this.categoryQueries = cashAccountDatabaseImpl.categoryQueries;
        this.entityInCategoryQueries = cashAccountDatabaseImpl.entityInCategoryQueries;
        this.filtersForCategoryQueries = cashAccountDatabaseImpl.filtersForCategoryQueries;
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteAllEntities() {
        this.database.transactionWithWrapper(new GpsConfigQueries$$ExternalSyntheticLambda2(this, 17));
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        this.database.transactionWithWrapper(new GLSceneScope$$ExternalSyntheticLambda10(20, this, str));
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onUpdateEntity(String str, SyncEntityType syncEntityType, Object obj) {
        SyncInvestmentCategory syncInvestmentCategory = (SyncInvestmentCategory) obj;
        str.getClass();
        syncEntityType.getClass();
        syncInvestmentCategory.getClass();
        this.database.transactionWithWrapper(new GpsConfigQueries$$ExternalSyntheticLambda3(16, this, syncInvestmentCategory, str));
    }
}
