package com.squareup.cash.db2.contacts;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class CustomerQueries$ForIdQuery extends Query {
    public final /* synthetic */ int $r8$classId = 1;
    public final String customer_id;
    public final /* synthetic */ RewardSlotQueries this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerQueries$ForIdQuery(RewardSlotQueries rewardSlotQueries, String str, CustomerQueries$$ExternalSyntheticLambda7 customerQueries$$ExternalSyntheticLambda7, byte b) {
        super(customerQueries$$ExternalSyntheticLambda7);
        str.getClass();
        this.this$0 = rewardSlotQueries;
        this.customer_id = str;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        RewardSlotQueries rewardSlotQueries = this.this$0;
        switch (i) {
            case 0:
                rewardSlotQueries.driver.addListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias"}, listener);
                break;
            case 1:
                rewardSlotQueries.driver.addListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias"}, listener);
                break;
            case 2:
                rewardSlotQueries.driver.addListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "payment"}, listener);
                break;
            default:
                rewardSlotQueries.driver.addListener(new String[]{"customer"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        RewardSlotQueries rewardSlotQueries = this.this$0;
        switch (i) {
            case 0:
                return rewardSlotQueries.driver.executeQuery(1481965021, "SELECT activityRecipient.contact_display_name, activityRecipient.lookup_key, activityRecipient.already_invited, activityRecipient.has_multiple_customers, activityRecipient.customer_id, activityRecipient.threaded_customer_id, activityRecipient.cashtag, activityRecipient.is_cash_customer, activityRecipient.is_verified, activityRecipient.is_business, activityRecipient.email, activityRecipient.sms, activityRecipient.photo, activityRecipient.customer_display_name, activityRecipient.email_addresses, activityRecipient.sms_numbers, activityRecipient.can_accept_payments, activityRecipient.is_square, activityRecipient.credit_card_fee, activityRecipient.blocked, activityRecipient.merchant_data, activityRecipient.themed_accent_color, activityRecipient.region, activityRecipient.category, activityRecipient.investment_entity_token, activityRecipient.render_data\nFROM activityRecipient\nWHERE customer_id = ?\nLIMIT 1", function1, 1, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 28));
            case 1:
                return rewardSlotQueries.driver.executeQuery(131128750, "WITH recipient(id, display_name) AS (\n  SELECT customer_id, coalesce(customer_display_name, contact_display_name, '')\n  FROM activityRecipient\n)\nSELECT ifnull(\n  nullif(substr(display_name, 1, instr(display_name, ' ') - 1), ''),\n  display_name\n)\nFROM recipient\nWHERE id = ?\nLIMIT 1", function1, 1, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 25));
            case 2:
                return rewardSlotQueries.driver.executeQuery(148252951, "SELECT activityRecipient.contact_display_name, activityRecipient.lookup_key, activityRecipient.already_invited, activityRecipient.has_multiple_customers, activityRecipient.customer_id, activityRecipient.threaded_customer_id, activityRecipient.cashtag, activityRecipient.is_cash_customer, activityRecipient.is_verified, activityRecipient.is_business, activityRecipient.email, activityRecipient.sms, activityRecipient.photo, activityRecipient.customer_display_name, activityRecipient.email_addresses, activityRecipient.sms_numbers, activityRecipient.can_accept_payments, activityRecipient.is_square, activityRecipient.credit_card_fee, activityRecipient.blocked, activityRecipient.merchant_data, activityRecipient.themed_accent_color, activityRecipient.region, activityRecipient.category, activityRecipient.investment_entity_token, activityRecipient.render_data\nFROM payment\nINNER JOIN activityRecipient\n  ON payment.token = ?\n  AND payment.their_id = customer_id\nORDER BY payment.display_date\nLIMIT 1", function1, 1, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 26));
            default:
                return rewardSlotQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT customer_id\n    |FROM customer\n    |WHERE investment_entity_token ", this.customer_id == null ? "IS" : "=", " ?\n    "), function1, 1, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 27));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        RewardSlotQueries rewardSlotQueries = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                rewardSlotQueries.driver.removeListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias"}, listener);
                break;
            case 1:
                rewardSlotQueries.driver.removeListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias"}, listener);
                break;
            case 2:
                rewardSlotQueries.driver.removeListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "payment"}, listener);
                break;
            default:
                rewardSlotQueries.driver.removeListener(new String[]{"customer"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "Customer.sq:forId";
            case 1:
                return "Customer.sq:customerFirstNameForId";
            case 2:
                return "Customer.sq:customerForPaymentToken";
            default:
                return "Customer.sq:customerIdForInvestmentToken";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerQueries$ForIdQuery(RewardSlotQueries rewardSlotQueries, String str, CustomerQueries$$ExternalSyntheticLambda7 customerQueries$$ExternalSyntheticLambda7) {
        super(customerQueries$$ExternalSyntheticLambda7);
        str.getClass();
        this.this$0 = rewardSlotQueries;
        this.customer_id = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerQueries$ForIdQuery(RewardSlotQueries rewardSlotQueries, String str, ContactQueries$$ExternalSyntheticLambda1 contactQueries$$ExternalSyntheticLambda1) {
        super(contactQueries$$ExternalSyntheticLambda1);
        str.getClass();
        this.this$0 = rewardSlotQueries;
        this.customer_id = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerQueries$ForIdQuery(RewardSlotQueries rewardSlotQueries, String str, ContactQueries$$ExternalSyntheticLambda1 contactQueries$$ExternalSyntheticLambda1, byte b) {
        super(contactQueries$$ExternalSyntheticLambda1);
        this.this$0 = rewardSlotQueries;
        this.customer_id = str;
    }
}
