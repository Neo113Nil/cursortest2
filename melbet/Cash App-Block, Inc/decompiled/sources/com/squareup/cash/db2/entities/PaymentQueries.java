package com.squareup.cash.db2.entities;

import androidx.compose.ui.node.NodeChain;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.PaymentState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__IndentKt;
import okio.ByteString;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;

/* loaded from: classes.dex */
public final class PaymentQueries extends TransacterImpl {
    public final ComponentRegistry.Builder customerAdapter;
    public final NodeChain paymentAdapter;

    public final class RecentsQuery extends Query {
        public final BlockState filterBlocked;
        public final PaymentState filterRequestPaymentState;
        public final PaymentState includePaymentState;
        public final long limit;
        public final Orientation requestPaymentOrientation;
        public final Role requestPaymentRole;

        public RecentsQuery(BlockState blockState, PaymentState paymentState, Orientation orientation, Role role, PaymentState paymentState2, long j, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
            super(storageLinkQueries$$ExternalSyntheticLambda8);
            this.filterBlocked = blockState;
            this.includePaymentState = paymentState;
            this.requestPaymentOrientation = orientation;
            this.requestPaymentRole = role;
            this.filterRequestPaymentState = paymentState2;
            this.limit = j;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(Query.Listener listener) {
            PaymentQueries.this.driver.addListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "payment"}, listener);
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult execute(Function1 function1) {
            PaymentQueries paymentQueries = PaymentQueries.this;
            SqlDriver sqlDriver = paymentQueries.driver;
            String str = this.includePaymentState == null ? "IS" : "=";
            String str2 = this.requestPaymentRole == null ? "IS" : "=";
            String str3 = this.filterRequestPaymentState == null ? "IS NOT" : "!=";
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n    |SELECT activityRecipient.contact_display_name, activityRecipient.lookup_key, activityRecipient.already_invited, activityRecipient.has_multiple_customers, activityRecipient.customer_id, activityRecipient.threaded_customer_id, activityRecipient.cashtag, activityRecipient.is_cash_customer, activityRecipient.is_verified, activityRecipient.is_business, activityRecipient.email, activityRecipient.sms, activityRecipient.photo, activityRecipient.customer_display_name, activityRecipient.email_addresses, activityRecipient.sms_numbers, activityRecipient.can_accept_payments, activityRecipient.is_square, activityRecipient.credit_card_fee, activityRecipient.blocked, activityRecipient.merchant_data, activityRecipient.themed_accent_color, activityRecipient.region, activityRecipient.category, activityRecipient.investment_entity_token, activityRecipient.render_data\n    |FROM activityRecipient\n    |JOIN payment ON (customer_id = their_id)\n    |WHERE can_accept_payments\n    |AND blocked != ?\n    |AND is_cash_customer\n    |AND\n    |(\n    |  payment.state ", str, " ?\n    |  OR\n    |  (\n    |    payment.orientation = ?\n    |    AND\n    |    payment.role ", str2, " ?\n    |    AND\n    |    payment.state ");
            m.append(str3);
            m.append(" ?\n    |  )\n    |)\n    |\n    |GROUP BY customer_id HAVING display_date = max(display_date)\n    |ORDER BY display_date DESC\n    |LIMIT ?\n    ");
            return sqlDriver.executeQuery(null, StringsKt__IndentKt.trimMargin$default(m.toString()), function1, 6, new ViewTreeObservers$$ExternalSyntheticLambda3(5, paymentQueries, this));
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(Query.Listener listener) {
            listener.getClass();
            PaymentQueries.this.driver.removeListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "payment"}, listener);
        }

        public final String toString() {
            return "Payment.sq:recents";
        }
    }

    public PaymentQueries(AndroidSqliteDriver androidSqliteDriver, NodeChain nodeChain, ComponentRegistry.Builder builder) {
        super(androidSqliteDriver);
        this.paymentAdapter = nodeChain;
        this.customerAdapter = builder;
    }

    public PaymentQueries(AndroidSqliteDriver androidSqliteDriver, NodeChain nodeChain, ByteString.Companion companion, ComponentRegistry.Builder builder) {
        super(androidSqliteDriver);
        this.paymentAdapter = nodeChain;
        this.customerAdapter = builder;
    }

    /* loaded from: classes6.dex */
    public final class ForTokenQuery extends Query {
        public final /* synthetic */ int $r8$classId = 0;
        public final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForTokenQuery(PaymentQueries paymentQueries, String str, PaymentQueries$$ExternalSyntheticLambda3 paymentQueries$$ExternalSyntheticLambda3) {
            super(paymentQueries$$ExternalSyntheticLambda3);
            str.getClass();
            PaymentQueries.this = paymentQueries;
            this.token = str;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(Query.Listener listener) {
            int i = this.$r8$classId;
            PaymentQueries paymentQueries = PaymentQueries.this;
            switch (i) {
                case 0:
                    paymentQueries.driver.addListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "itemizedReceipt"}, listener);
                    break;
                default:
                    paymentQueries.driver.addListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "itemizedReceipt"}, listener);
                    break;
            }
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult execute(Function1 function1) {
            int i = this.$r8$classId;
            PaymentQueries paymentQueries = PaymentQueries.this;
            switch (i) {
                case 0:
                    return paymentQueries.driver.executeQuery(1636751799, "SELECT\n  payment.token,\n  payment.amount,\n  payment.amount_currency,\n  payment.their_id,\n  payment.role,\n  payment.orientation,\n  payment.payment_render_data,\n  payment.sender_render_data,\n  payment.recipient_render_data,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.loyalty_render_data,\n  payment.boost_amount,\n  payment.lending_loan_token\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON itemizedReceipt.transaction_token = payment.token\nWHERE payment.token = ?", function1, 1, new OfflineQueries$$ExternalSyntheticLambda0(this, 5));
                default:
                    return paymentQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT\n    |  payment.token,\n    |  payment.amount,\n    |  payment.amount_currency,\n    |  payment.their_id,\n    |  payment.role,\n    |  payment.orientation,\n    |  payment.payment_render_data,\n    |  payment.sender_render_data,\n    |  payment.recipient_render_data,\n    |  itemizedReceipt.render_json AS receipt_render_data,\n    |  payment.loyalty_render_data,\n    |  payment.boost_amount,\n    |  payment.lending_loan_token\n    |FROM payments_model AS payment\n    |LEFT JOIN itemizedReceipt ON itemizedReceipt.transaction_token = payment.token\n    |WHERE external_id ", this.token == null ? "IS" : "=", " ?\n    "), function1, 1, new OfflineQueries$$ExternalSyntheticLambda0(this, 4));
            }
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(Query.Listener listener) {
            int i = this.$r8$classId;
            PaymentQueries paymentQueries = PaymentQueries.this;
            listener.getClass();
            switch (i) {
                case 0:
                    paymentQueries.driver.removeListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "itemizedReceipt"}, listener);
                    break;
                default:
                    paymentQueries.driver.removeListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "itemizedReceipt"}, listener);
                    break;
            }
        }

        public final String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "Payment.sq:forToken";
                default:
                    return "Payment.sq:forExternalId";
            }
        }

        public ForTokenQuery(String str, PaymentQueries$$ExternalSyntheticLambda3 paymentQueries$$ExternalSyntheticLambda3, byte b) {
            super(paymentQueries$$ExternalSyntheticLambda3);
            this.token = str;
        }
    }
}
