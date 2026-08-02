package com.squareup.cash.crypto.db;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.db.SessionQueries;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class CryptoStatementQueries$ForTokenQuery extends Query {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SessionQueries this$0;
    public final String token;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoStatementQueries$ForTokenQuery(SessionQueries sessionQueries, String str, FlowStarter$$ExternalSyntheticLambda0 flowStarter$$ExternalSyntheticLambda0) {
        super(flowStarter$$ExternalSyntheticLambda0);
        str.getClass();
        this.this$0 = sessionQueries;
        this.token = str;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        SessionQueries sessionQueries = this.this$0;
        switch (i) {
            case 0:
                sessionQueries.driver.addListener(new String[]{"crypto_statement"}, listener);
                break;
            default:
                sessionQueries.driver.addListener(new String[]{"crypto_statement"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        SessionQueries sessionQueries = this.this$0;
        switch (i) {
            case 0:
                return sessionQueries.driver.executeQuery(1726663307, "SELECT crypto_statement.token, crypto_statement.category, crypto_statement.title, crypto_statement.document_date, crypto_statement.url, crypto_statement.owner_token\nFROM crypto_statement\nWHERE token = ?", function1, 1, new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 29));
            default:
                return sessionQueries.driver.executeQuery(-642315476, "SELECT crypto_statement.token, crypto_statement.category, crypto_statement.title, crypto_statement.document_date, crypto_statement.url, crypto_statement.owner_token\nFROM crypto_statement\nWHERE category = ?\nORDER BY document_date DESC", function1, 1, new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 28));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        SessionQueries sessionQueries = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                sessionQueries.driver.removeListener(new String[]{"crypto_statement"}, listener);
                break;
            default:
                sessionQueries.driver.removeListener(new String[]{"crypto_statement"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "CryptoStatement.sq:forToken";
            default:
                return "CryptoStatement.sq:forCategory";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoStatementQueries$ForTokenQuery(SessionQueries sessionQueries, String str, FlowStarter$$ExternalSyntheticLambda0 flowStarter$$ExternalSyntheticLambda0, byte b) {
        super(flowStarter$$ExternalSyntheticLambda0);
        this.this$0 = sessionQueries;
        this.token = str;
    }
}
