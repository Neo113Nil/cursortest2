package com.squareup.cash.db2.activity;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.entities.PaymentQueries;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes6.dex */
public final class CashActivityQueries$ActivityQuery extends Query {
    public final long limit;
    public final long offset;
    public final boolean outstanding;
    public final Collection paymentTypeIgnoreList;
    public final Collection rollUpIgnoreList;
    public final /* synthetic */ PaymentQueries this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashActivityQueries$ActivityQuery(PaymentQueries paymentQueries, boolean z, EmptyList emptyList, EmptyList emptyList2, long j, long j2, CashActivityQueries$$ExternalSyntheticLambda1 cashActivityQueries$$ExternalSyntheticLambda1) {
        super(cashActivityQueries$$ExternalSyntheticLambda1);
        emptyList.getClass();
        emptyList2.getClass();
        this.this$0 = paymentQueries;
        this.outstanding = z;
        this.rollUpIgnoreList = emptyList;
        this.paymentTypeIgnoreList = emptyList2;
        this.limit = j;
        this.offset = j2;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        this.this$0.driver.addListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "contact", "alias", "contact_alias", "itemizedReceipt", "loyaltyHiddenPaymentTypes", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids"}, listener);
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        Collection collection = this.rollUpIgnoreList;
        int size = collection.size();
        PaymentQueries paymentQueries = this.this$0;
        paymentQueries.getClass();
        String createArguments = TransacterImpl.createArguments(size);
        Collection collection2 = this.paymentTypeIgnoreList;
        String createArguments2 = TransacterImpl.createArguments(collection2.size());
        return paymentQueries.driver.executeQuery(null, StringsKt__IndentKt.trimMargin$default("\n          |SELECT cashActivity.their_id, cashActivity.is_outstanding, cashActivity._id, cashActivity.token, cashActivity.payment_render_data, cashActivity.sender_render_data, cashActivity.recipient_render_data, cashActivity.loyalty_render_data, cashActivity.state, cashActivity.role, cashActivity.amount, cashActivity.amount_currency, cashActivity.is_badged, cashActivity.is_bitcoin, cashActivity.is_scheduled, cashActivity.scheduled_for, cashActivity.scheduled_payment_token, cashActivity.photo, cashActivity.themed_accent_color, cashActivity.lookup_key, cashActivity.display_name, cashActivity.merchant_data, cashActivity.email, cashActivity.sms, cashActivity.threaded_customer_id, cashActivity.is_cash_customer, cashActivity.can_accept_payments, cashActivity.is_business, cashActivity.display_date, cashActivity.receipt_render_data, cashActivity.rollup_type, cashActivity.investment_order_type, cashActivity.payment_type, cashActivity.gifted_investment_entity_token, cashActivity.lending_loan_token, cashActivity.associated_payment_token, cashActivity.sync_entity_version, cashActivity.loyalty_activity, cashActivity.isRegular, cashActivity.is_hidden, cashActivity.orientation, cashActivity.transaction_type\n          |FROM cashActivity\n          |WHERE is_outstanding = ?\n          |AND is_scheduled = 0\n          |AND (? OR is_hidden = 0)\n          |AND coalesce(rollup_type, '') NOT IN " + createArguments + "\n          |AND coalesce(payment_type, '') NOT IN " + createArguments2 + "\n          |LIMIT ?\n          |OFFSET ?\n          "), function1, collection2.size() + collection.size() + 4, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 14));
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        listener.getClass();
        this.this$0.driver.removeListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "contact", "alias", "contact_alias", "itemizedReceipt", "loyaltyHiddenPaymentTypes", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids"}, listener);
    }

    public final String toString() {
        return "CashActivity.sq:activity";
    }
}
