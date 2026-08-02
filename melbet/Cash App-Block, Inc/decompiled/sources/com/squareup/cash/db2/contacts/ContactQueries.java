package com.squareup.cash.db2.contacts;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ContactQueries extends TransacterImpl {
    public final ComponentRegistry.Builder customerAdapter;

    /* loaded from: classes6.dex */
    public final class ContactByIdQuery extends Query {
        public final /* synthetic */ int $r8$classId;
        public final String customerId;
        public final /* synthetic */ ContactQueries this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ContactByIdQuery(ContactQueries contactQueries, String str, Function1 function1, int i) {
            super(function1);
            this.$r8$classId = i;
            this.this$0 = contactQueries;
            this.customerId = str;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(Query.Listener listener) {
            int i = this.$r8$classId;
            ContactQueries contactQueries = this.this$0;
            switch (i) {
                case 0:
                    contactQueries.driver.addListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "invitationEntity", "payment"}, listener);
                    break;
                default:
                    contactQueries.driver.addListener(new String[]{"contact", "contact_alias", "alias"}, listener);
                    break;
            }
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult execute(Function1 function1) {
            int i = this.$r8$classId;
            String str = this.customerId;
            ContactQueries contactQueries = this.this$0;
            switch (i) {
                case 0:
                    return contactQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT recipients.contact_display_name, recipients.lookup_key, recipients.already_invited, recipients.has_multiple_customers, recipients.customer_id, recipients.threaded_customer_id, recipients.cashtag, recipients.is_cash_customer, recipients.is_verified, recipients.is_business, recipients.email, recipients.sms, recipients.photo, recipients.customer_display_name, recipients.email_addresses, recipients.sms_numbers, recipients.can_accept_payments, recipients.is_square, recipients.credit_card_fee, recipients.blocked, recipients.merchant_data, recipients.themed_accent_color, recipients.region, recipients.category, recipients.joined_on, recipients.is_recent\n    |FROM recipients\n    |WHERE (customer_id ", str != null ? "==" : "IS", " ?)\n    |LIMIT 1\n    "), function1, 1, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 23));
                default:
                    return contactQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT DISTINCT contact.lookup_key\n    |FROM contact\n    |LEFT JOIN contact_alias USING (lookup_key)\n    |LEFT JOIN alias USING (hashed_alias)\n    |WHERE alias.customer_id ", str != null ? "=" : "IS", " ?\n    "), function1, 1, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 24));
            }
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(Query.Listener listener) {
            int i = this.$r8$classId;
            ContactQueries contactQueries = this.this$0;
            listener.getClass();
            switch (i) {
                case 0:
                    contactQueries.driver.removeListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "invitationEntity", "payment"}, listener);
                    break;
                default:
                    contactQueries.driver.removeListener(new String[]{"contact", "contact_alias", "alias"}, listener);
                    break;
            }
        }

        public final String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "Contact.sq:contactById";
                default:
                    return "Contact.sq:lookupKeysForCustomerId";
            }
        }
    }

    public /* synthetic */ ContactQueries(AndroidSqliteDriver androidSqliteDriver, ComponentRegistry.Builder builder) {
        super(androidSqliteDriver);
        this.customerAdapter = builder;
    }
}
