package com.squareup.cash.db2.activity;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.entities.PaymentQueries;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class CashActivityQueries$CountActivityByRollupTypeQuery extends Query {
    public final Collection allowList;
    public final boolean outstanding;
    public final /* synthetic */ PaymentQueries this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashActivityQueries$CountActivityByRollupTypeQuery(PaymentQueries paymentQueries, Collection collection, WebLoginConfigQueries$$ExternalSyntheticLambda2 webLoginConfigQueries$$ExternalSyntheticLambda2) {
        super(webLoginConfigQueries$$ExternalSyntheticLambda2);
        this.this$0 = paymentQueries;
        this.outstanding = true;
        this.allowList = collection;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        this.this$0.driver.addListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "contact", "alias", "contact_alias", "itemizedReceipt", "loyaltyHiddenPaymentTypes", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids"}, listener);
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        Collection collection = this.allowList;
        int size = collection.size();
        PaymentQueries paymentQueries = this.this$0;
        paymentQueries.getClass();
        return paymentQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n          |SELECT count(*)\n          |FROM cashActivity\n          |WHERE is_outstanding = ?\n          |AND is_scheduled = 0\n          |AND (? OR is_hidden = 0)\n          |AND coalesce(rollup_type, '') IN ", TransacterImpl.createArguments(size), "\n          "), function1, collection.size() + 2, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 16));
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        listener.getClass();
        this.this$0.driver.removeListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "contact", "alias", "contact_alias", "itemizedReceipt", "loyaltyHiddenPaymentTypes", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids"}, listener);
    }

    public final String toString() {
        return "CashActivity.sq:countActivityByRollupType";
    }
}
