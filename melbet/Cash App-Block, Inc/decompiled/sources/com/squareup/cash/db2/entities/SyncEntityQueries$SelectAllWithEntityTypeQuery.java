package com.squareup.cash.db2.entities;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db2.InstrumentQueries;
import kotlin.jvm.functions.Function1;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;

/* loaded from: classes.dex */
public final class SyncEntityQueries$SelectAllWithEntityTypeQuery extends Query {
    public final long limit;
    public final long offset;
    public final /* synthetic */ InstrumentQueries this$0;

    /* renamed from: type, reason: collision with root package name */
    public final int f1123type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncEntityQueries$SelectAllWithEntityTypeQuery(InstrumentQueries instrumentQueries, int i, long j, long j2, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        super(storageLinkQueries$$ExternalSyntheticLambda8);
        this.this$0 = instrumentQueries;
        this.f1123type = i;
        this.limit = j;
        this.offset = j2;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        this.this$0.driver.addListener(new String[]{"sync_entity"}, listener);
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        InstrumentQueries instrumentQueries = this.this$0;
        return instrumentQueries.driver.executeQuery(-917082993, "SELECT sync_entity.entity_id, sync_entity.type, sync_entity.entity, sync_entity.entity_processor_version, sync_entity.sync_value_type, sync_entity.sync_entity_version, sync_entity.topic\nFROM sync_entity\nWHERE type = ?\nLIMIT ?\nOFFSET ?", function1, 3, new ViewTreeObservers$$ExternalSyntheticLambda3(6, instrumentQueries, this));
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        listener.getClass();
        this.this$0.driver.removeListener(new String[]{"sync_entity"}, listener);
    }

    public final String toString() {
        return "SyncEntity.sq:selectAllWithEntityType";
    }
}
