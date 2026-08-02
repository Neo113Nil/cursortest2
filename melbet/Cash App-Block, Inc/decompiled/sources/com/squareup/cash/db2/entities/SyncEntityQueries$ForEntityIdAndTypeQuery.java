package com.squareup.cash.db2.entities;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class SyncEntityQueries$ForEntityIdAndTypeQuery extends Query {
    public final String entity_id;
    public final /* synthetic */ InstrumentQueries this$0;

    /* renamed from: type, reason: collision with root package name */
    public final int f1122type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncEntityQueries$ForEntityIdAndTypeQuery(InstrumentQueries instrumentQueries, String str, int i, SyncEntityQueries$$ExternalSyntheticLambda1 syncEntityQueries$$ExternalSyntheticLambda1) {
        super(syncEntityQueries$$ExternalSyntheticLambda1);
        str.getClass();
        this.this$0 = instrumentQueries;
        this.entity_id = str;
        this.f1122type = i;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        this.this$0.driver.addListener(new String[]{"sync_entity"}, listener);
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        InstrumentQueries instrumentQueries = this.this$0;
        return instrumentQueries.driver.executeQuery(1027390467, "SELECT sync_entity.entity_id, sync_entity.type, sync_entity.entity, sync_entity.entity_processor_version, sync_entity.sync_value_type, sync_entity.sync_entity_version, sync_entity.topic\nFROM sync_entity\nWHERE entity_id = ?\nAND type = ?", function1, 2, new ProfileQueries$$ExternalSyntheticLambda13(1, this, instrumentQueries));
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        listener.getClass();
        this.this$0.driver.removeListener(new String[]{"sync_entity"}, listener);
    }

    public final String toString() {
        return "SyncEntity.sq:forEntityIdAndType";
    }
}
