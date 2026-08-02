package com.squareup.cash.db;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class StorageLinkQueries$SelectByIdQuery extends Query {
    public final /* synthetic */ int $r8$classId;
    public final long id;
    public final /* synthetic */ TransacterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StorageLinkQueries$SelectByIdQuery(TransacterImpl transacterImpl, long j, Function1 function1, int i) {
        super(function1);
        this.$r8$classId = i;
        this.this$0 = transacterImpl;
        this.id = j;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                ((SessionQueries) transacterImpl).driver.addListener(new String[]{"storage_link"}, listener);
                break;
            case 1:
                ((SessionQueries) transacterImpl).driver.addListener(new String[]{"analytics_message"}, listener);
                break;
            default:
                ((SessionQueries) transacterImpl).driver.addListener(new String[]{"analytics_message"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                return ((SessionQueries) transacterImpl).driver.executeQuery(-218223673, "SELECT storage_link.account_token, storage_link.id, storage_link.signin_group_id, storage_link.created_at_ms FROM storage_link WHERE id = ?", function1, 1, new StorageLinkQueries$$ExternalSyntheticLambda8(this, 12));
            case 1:
                return ((SessionQueries) transacterImpl).driver.executeQuery(2085665642, "SELECT message_uuid AS id, recorded_at, payload FROM analytics_message\nORDER BY recorded_at ASC\nLIMIT ?", function1, 1, new CashApp$$ExternalSyntheticLambda2(this, 19));
            default:
                return ((SessionQueries) transacterImpl).driver.executeQuery(601122540, "SELECT message_uuid AS id, recorded_at, payload FROM analytics_message\nORDER BY recorded_at ASC\nLIMIT ?", function1, 1, new CashApp$$ExternalSyntheticLambda2(this, 21));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                ((SessionQueries) transacterImpl).driver.removeListener(new String[]{"storage_link"}, listener);
                break;
            case 1:
                ((SessionQueries) transacterImpl).driver.removeListener(new String[]{"analytics_message"}, listener);
                break;
            default:
                ((SessionQueries) transacterImpl).driver.removeListener(new String[]{"analytics_message"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
        }
        return "AnalyticsMessage.sq:selectOldest";
    }
}
