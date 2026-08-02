package com.squareup.cash.db2.activity;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.ui.PaymentState;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes6.dex */
public final class InvestmentActivityQueries$IsFirstDayOfTradingQuery extends Query {
    public final long marketOpenForToday;
    public final Role role;
    public final PaymentState state;
    public final /* synthetic */ RewardSlotQueries this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentActivityQueries$IsFirstDayOfTradingQuery(RewardSlotQueries rewardSlotQueries, long j, Role role, PaymentState paymentState, WebLoginConfigQueries$$ExternalSyntheticLambda2 webLoginConfigQueries$$ExternalSyntheticLambda2) {
        super(webLoginConfigQueries$$ExternalSyntheticLambda2);
        this.this$0 = rewardSlotQueries;
        this.marketOpenForToday = j;
        this.role = role;
        this.state = paymentState;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        this.this$0.driver.addListener(new String[]{"payment", "customer", "investment_entity"}, listener);
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        RewardSlotQueries rewardSlotQueries = this.this$0;
        return rewardSlotQueries.driver.executeQuery(null, StringsKt__IndentKt.trimMargin$default("\n    |SELECT count(CASE created_at < ? WHEN 0 THEN NULL ELSE 1 END) == 0 AND count(*) > 0\n    |FROM payment\n    |LEFT JOIN customer ON their_id = customer_id\n    |WHERE\n    |  (\n    |    investment_entity_token IN (SELECT token FROM investment_entity)\n    |    OR\n    |    (\n    |      gifted_investment_entity_token IN (SELECT token FROM investment_entity)\n    |      AND\n    |      role " + (this.role == null ? "IS" : "=") + " ?\n    |      AND\n    |      payment.state " + (this.state == null ? "IS" : "=") + " ?\n    |    )\n    |  )\n    "), function1, 3, new InstrumentQueries$$ExternalSyntheticLambda0(22, this, rewardSlotQueries));
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        listener.getClass();
        this.this$0.driver.removeListener(new String[]{"payment", "customer", "investment_entity"}, listener);
    }

    public final String toString() {
        return "InvestmentActivity.sq:isFirstDayOfTrading";
    }
}
