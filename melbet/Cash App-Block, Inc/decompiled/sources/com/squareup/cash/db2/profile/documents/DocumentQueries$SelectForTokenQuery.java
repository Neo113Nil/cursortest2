package com.squareup.cash.db2.profile.documents;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class DocumentQueries$SelectForTokenQuery extends Query {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ InstrumentQueries this$0;
    public final String token;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentQueries$SelectForTokenQuery(InstrumentQueries instrumentQueries, String str, DocumentQueries$$ExternalSyntheticLambda5 documentQueries$$ExternalSyntheticLambda5) {
        super(documentQueries$$ExternalSyntheticLambda5);
        str.getClass();
        this.this$0 = instrumentQueries;
        this.token = str;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.this$0;
        switch (i) {
            case 0:
                instrumentQueries.driver.addListener(new String[]{"document"}, listener);
                break;
            default:
                instrumentQueries.driver.addListener(new String[]{"document"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.this$0;
        switch (i) {
            case 0:
                return instrumentQueries.driver.executeQuery(-883223480, "SELECT document.entity_id, document.token, document.category, document.title, document.display_date, document.client_route, document.url, document.version_data, document.owner_token\nFROM document\nWHERE token = ?", function1, 1, new RecipientQueries$$ExternalSyntheticLambda0(this, 5));
            default:
                return instrumentQueries.driver.executeQuery(-33931830, "SELECT document.entity_id, document.token, document.category, document.title, document.display_date, document.client_route, document.url, document.version_data, document.owner_token\nFROM document\nWHERE category = ?\nORDER BY display_date DESC", function1, 1, new RecipientQueries$$ExternalSyntheticLambda0(this, 4));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                instrumentQueries.driver.removeListener(new String[]{"document"}, listener);
                break;
            default:
                instrumentQueries.driver.removeListener(new String[]{"document"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "Document.sq:selectForToken";
            default:
                return "Document.sq:selectForCategoryId";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentQueries$SelectForTokenQuery(InstrumentQueries instrumentQueries, String str, DocumentQueries$$ExternalSyntheticLambda5 documentQueries$$ExternalSyntheticLambda5, byte b) {
        super(documentQueries$$ExternalSyntheticLambda5);
        str.getClass();
        this.this$0 = instrumentQueries;
        this.token = str;
    }
}
