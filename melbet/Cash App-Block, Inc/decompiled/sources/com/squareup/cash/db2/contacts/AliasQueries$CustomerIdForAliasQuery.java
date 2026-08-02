package com.squareup.cash.db2.contacts;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes6.dex */
public final class AliasQueries$CustomerIdForAliasQuery extends Query {
    public final /* synthetic */ int $r8$classId;
    public final String alias;
    public final /* synthetic */ InstrumentQueries this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AliasQueries$CustomerIdForAliasQuery(InstrumentQueries instrumentQueries, String str, Function1 function1, int i) {
        super(function1);
        this.$r8$classId = i;
        this.this$0 = instrumentQueries;
        this.alias = str;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.this$0;
        switch (i) {
            case 0:
                instrumentQueries.driver.addListener(new String[]{"alias"}, listener);
                break;
            default:
                instrumentQueries.driver.addListener(new String[]{"alias"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        String str = this.alias;
        InstrumentQueries instrumentQueries = this.this$0;
        switch (i) {
            case 0:
                return instrumentQueries.driver.executeQuery(null, StringsKt__IndentKt.trimMargin$default("\n    |SELECT customer_id\n    |FROM alias\n    |WHERE sms " + (str == null ? "IS" : "=") + " ? OR email " + (str == null ? "IS" : "=") + " ?\n    "), function1, 2, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 21));
            default:
                return instrumentQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT (COUNT(*) > 0)\n    |FROM alias\n    |WHERE customer_id ", str == null ? "IS" : "=", " ?\n    "), function1, 1, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 22));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                instrumentQueries.driver.removeListener(new String[]{"alias"}, listener);
                break;
            default:
                instrumentQueries.driver.removeListener(new String[]{"alias"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "Alias.sq:customerIdForAlias";
            default:
                return "Alias.sq:doesCustomerHaveAlias";
        }
    }
}
