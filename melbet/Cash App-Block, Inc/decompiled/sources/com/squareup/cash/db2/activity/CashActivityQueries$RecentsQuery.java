package com.squareup.cash.db2.activity;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.PaymentState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__IndentKt;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;

/* loaded from: classes.dex */
public final class CashActivityQueries$RecentsQuery extends Query {
    public final BlockState blocked;
    public final PaymentState filterRequestPaymentState;
    public final PaymentState includePaymentState;
    public final long largeLoyaltyMaxNormalCustomers;
    public final long largeLoyaltyThreshold;
    public final long minRecents;
    public final Orientation requestPaymentOrientation;
    public final Role requestPaymentRole;
    public final /* synthetic */ PaymentQueries this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashActivityQueries$RecentsQuery(PaymentQueries paymentQueries, BlockState blockState, PaymentState paymentState, Orientation orientation, Role role, PaymentState paymentState2, ViewTreeObservers$$ExternalSyntheticLambda3 viewTreeObservers$$ExternalSyntheticLambda3) {
        super(viewTreeObservers$$ExternalSyntheticLambda3);
        blockState.getClass();
        this.this$0 = paymentQueries;
        this.blocked = blockState;
        this.includePaymentState = paymentState;
        this.requestPaymentOrientation = orientation;
        this.requestPaymentRole = role;
        this.filterRequestPaymentState = paymentState2;
        this.largeLoyaltyThreshold = 24L;
        this.largeLoyaltyMaxNormalCustomers = 5L;
        this.minRecents = 3L;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        this.this$0.driver.addListener(new String[]{"customer", "contact", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids", "bitcoinTransactionCustomerIds", "payment", "loyaltyProgram", "alias", "contact_alias", "loyaltyAccount", "loyaltyHiddenPaymentTypes"}, listener);
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        PaymentQueries paymentQueries = this.this$0;
        SqlDriver sqlDriver = paymentQueries.driver;
        String str = this.includePaymentState == null ? "IS" : "=";
        String str2 = this.requestPaymentOrientation == null ? "IS" : "=";
        String str3 = this.requestPaymentRole == null ? "IS" : "=";
        String str4 = this.filterRequestPaymentState == null ? "IS NOT" : "!=";
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n    |WITH loyaltyOnlyCustomers AS (\n    |  SELECT activityCustomer.photo, activityCustomer.themed_accent_color, activityCustomer.customer_id, activityCustomer.is_business, activityCustomer.display_name, activityCustomer.merchant_data, activityCustomer.lookup_key, activityCustomer.email, activityCustomer.sms, activityCustomer.blocked, activityCustomer.display_date, activityCustomer.is_loyalty_only, activityCustomer.can_accept_payments, activityCustomer.has_loyalty_data, activityCustomer.isRegular\n    |  FROM activityCustomer\n    |  WHERE is_loyalty_only = 1\n    |),\n    |ignoreIds AS (\n    |  SELECT banking_transaction_customer_ids.id FROM banking_transaction_customer_ids\n    |  UNION SELECT transfer_customer_ids.id FROM transfer_customer_ids\n    |  UNION SELECT referral_customer_ids.id FROM referral_customer_ids\n    |  UNION SELECT customer_id FROM customer\n    |    WHERE is_special_customer = 1\n    |    OR (is_cash_customer = 0 AND merchant_data IS NULL)\n    |),\n    |-- filter to all contacts that are valid\n    |otherValidContacts AS (\n    |SELECT DISTINCT activityCustomer.photo, activityCustomer.themed_accent_color, activityCustomer.customer_id, activityCustomer.is_business, activityCustomer.display_name, activityCustomer.merchant_data, activityCustomer.lookup_key, activityCustomer.email, activityCustomer.sms, activityCustomer.blocked, activityCustomer.display_date, activityCustomer.is_loyalty_only, activityCustomer.can_accept_payments, activityCustomer.has_loyalty_data, activityCustomer.isRegular\n    |FROM activityCustomer\n    |  LEFT JOIN payment\n    |  ON activityCustomer.customer_id = payment.their_id\n    |WHERE blocked != ?\n    |AND\n    |(\n    |  payment.state IS NULL\n    |  OR\n    |  payment.state ", str, " ?\n    |  OR\n    |  (\n    |    payment.orientation ", str2, " ?\n    |    AND\n    |    payment.role ");
        m.append(str3);
        m.append(" ?\n    |    AND\n    |    payment.state ");
        m.append(str4);
        m.append(" ?\n    |  )\n    |)\n    |AND (can_accept_payments = 1 OR merchant_data IS NOT NULL)\n    |AND customer_id NOT IN ignoreIds\n    |),\n    |-- All contacts with the minimum offset\n    |contactsAfterMinimum AS (\n    |SELECT DISTINCT otherValidContacts.photo, otherValidContacts.themed_accent_color, otherValidContacts.customer_id, otherValidContacts.is_business, otherValidContacts.display_name, otherValidContacts.merchant_data, otherValidContacts.lookup_key, otherValidContacts.email, otherValidContacts.sms, otherValidContacts.blocked, otherValidContacts.display_date, otherValidContacts.is_loyalty_only, otherValidContacts.can_accept_payments, otherValidContacts.has_loyalty_data, otherValidContacts.isRegular\n    |FROM otherValidContacts\n    |LIMIT\n    |  CASE WHEN (SELECT count(1) FROM loyaltyOnlyCustomers) < ? - 0\n    |  THEN ? - (SELECT count(1) FROM loyaltyOnlyCustomers)\n    |  ELSE ? - 0\n    |  END\n    |OFFSET (? - 1)\n    |),\n    |-- filter to all valid contacts excluding any contacts that may show up due to being loyaly only\n    |otherCustomers AS (\n    |  SELECT otherValidContacts.photo, otherValidContacts.themed_accent_color, otherValidContacts.customer_id, otherValidContacts.is_business, otherValidContacts.display_name, otherValidContacts.merchant_data, otherValidContacts.lookup_key, otherValidContacts.email, otherValidContacts.sms, otherValidContacts.blocked, otherValidContacts.display_date, otherValidContacts.is_loyalty_only, otherValidContacts.can_accept_payments, otherValidContacts.has_loyalty_data, otherValidContacts.isRegular FROM otherValidContacts\n    |  WHERE is_loyalty_only = 0\n    |  AND EXISTS (SELECT contactsAfterMinimum.photo, contactsAfterMinimum.themed_accent_color, contactsAfterMinimum.customer_id, contactsAfterMinimum.is_business, contactsAfterMinimum.display_name, contactsAfterMinimum.merchant_data, contactsAfterMinimum.lookup_key, contactsAfterMinimum.email, contactsAfterMinimum.sms, contactsAfterMinimum.blocked, contactsAfterMinimum.display_date, contactsAfterMinimum.is_loyalty_only, contactsAfterMinimum.can_accept_payments, contactsAfterMinimum.has_loyalty_data, contactsAfterMinimum.isRegular FROM contactsAfterMinimum)\n    |  ORDER BY display_date DESC\n    |  LIMIT\n    |    CASE WHEN (SELECT count(1) FROM loyaltyOnlyCustomers) < ? - 0\n    |    THEN ? - (SELECT count(1) FROM loyaltyOnlyCustomers)\n    |    ELSE ? - 0\n    |    END\n    |),\n    |recents AS (\n    |  SELECT loyaltyOnlyCustomers.photo, loyaltyOnlyCustomers.themed_accent_color, loyaltyOnlyCustomers.customer_id, loyaltyOnlyCustomers.is_business, loyaltyOnlyCustomers.display_name, loyaltyOnlyCustomers.merchant_data, loyaltyOnlyCustomers.lookup_key, loyaltyOnlyCustomers.email, loyaltyOnlyCustomers.sms, loyaltyOnlyCustomers.blocked, loyaltyOnlyCustomers.display_date, loyaltyOnlyCustomers.is_loyalty_only, loyaltyOnlyCustomers.can_accept_payments, loyaltyOnlyCustomers.has_loyalty_data, loyaltyOnlyCustomers.isRegular FROM loyaltyOnlyCustomers\n    |  UNION ALL\n    |  SELECT otherCustomers.photo, otherCustomers.themed_accent_color, otherCustomers.customer_id, otherCustomers.is_business, otherCustomers.display_name, otherCustomers.merchant_data, otherCustomers.lookup_key, otherCustomers.email, otherCustomers.sms, otherCustomers.blocked, otherCustomers.display_date, otherCustomers.is_loyalty_only, otherCustomers.can_accept_payments, otherCustomers.has_loyalty_data, otherCustomers.isRegular FROM otherCustomers)\n    |SELECT DISTINCT recents.photo, recents.themed_accent_color, recents.customer_id, recents.is_business, recents.display_name, recents.merchant_data, recents.lookup_key, recents.email, recents.sms, recents.blocked, recents.display_date, recents.is_loyalty_only, recents.can_accept_payments, recents.has_loyalty_data, recents.isRegular FROM recents\n    |ORDER BY display_date DESC\n    ");
        return sqlDriver.executeQuery(null, StringsKt__IndentKt.trimMargin$default(m.toString()), function1, 12, new InstrumentQueries$$ExternalSyntheticLambda0(21, paymentQueries, this));
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        listener.getClass();
        this.this$0.driver.removeListener(new String[]{"customer", "contact", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids", "bitcoinTransactionCustomerIds", "payment", "loyaltyProgram", "alias", "contact_alias", "loyaltyAccount", "loyaltyHiddenPaymentTypes"}, listener);
    }

    public final String toString() {
        return "CashActivity.sq:recents";
    }
}
