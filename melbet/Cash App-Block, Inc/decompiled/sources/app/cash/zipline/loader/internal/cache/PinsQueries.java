package app.cash.zipline.loader.internal.cache;

import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import bo.app.yf$$ExternalSyntheticLambda10;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.activity.CashActivityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.contacts.AliasQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class PinsQueries extends TransacterImpl {
    public final void delete_application_pins(String str) {
        str.getClass();
        this.driver.execute(-547381248, "DELETE FROM pins WHERE application_name = ?", new IconKt$$ExternalSyntheticLambda0(str, 29));
        notifyQueries(-547381248, new yf$$ExternalSyntheticLambda10(22));
    }

    public final class Get_pinQuery extends Query {
        public final /* synthetic */ int $r8$classId = 2;
        public final Object application_name;
        public final long file_id;
        public final /* synthetic */ TransacterImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Get_pinQuery(PaymentQueries paymentQueries, Collection collection, CashActivityQueries$$ExternalSyntheticLambda1 cashActivityQueries$$ExternalSyntheticLambda1) {
            super(cashActivityQueries$$ExternalSyntheticLambda1);
            collection.getClass();
            this.this$0 = paymentQueries;
            this.application_name = collection;
            this.file_id = 2147483647L;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(Query.Listener listener) {
            int i = this.$r8$classId;
            TransacterImpl transacterImpl = this.this$0;
            switch (i) {
                case 0:
                    ((PinsQueries) transacterImpl).driver.addListener(new String[]{"pins"}, listener);
                    break;
                case 1:
                    ((FilesQueries) transacterImpl).driver.addListener(new String[]{"files", "pins"}, listener);
                    break;
                case 2:
                    ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"expressivePaymentsBackgroundConfig"}, listener);
                    break;
                case 3:
                    ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"expressivePaymentsStickerConfig"}, listener);
                    break;
                case 4:
                    ((PaymentQueries) transacterImpl).driver.addListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "contact", "alias", "contact_alias", "itemizedReceipt", "loyaltyHiddenPaymentTypes", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids"}, listener);
                    break;
                default:
                    ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"alias"}, listener);
                    break;
            }
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult execute(Function1 function1) {
            int i = this.$r8$classId;
            int i2 = 11;
            Object obj = this.application_name;
            TransacterImpl transacterImpl = this.this$0;
            switch (i) {
                case 0:
                    return ((PinsQueries) transacterImpl).driver.executeQuery(615810059, "SELECT pins.file_id, pins.application_name FROM pins WHERE file_id = ? AND application_name = ?", function1, 2, new xg$$ExternalSyntheticLambda9(this, i2));
                case 1:
                    return ((FilesQueries) transacterImpl).driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT\n    |id,\n    |sha256_hex,\n    |manifest_for_application_name,\n    |file_state,\n    |size_bytes,\n    |last_used_at_epoch_ms,\n    |fresh_at_epoch_ms\n    |FROM files f\n    |LEFT JOIN pins p ON (\n    |  f.id = p.file_id AND\n    |  f.manifest_for_application_name = p.application_name\n    |)\n    |WHERE f.manifest_for_application_name ", ((String) obj) == null ? "IS" : "=", " ? AND f.id != ?\n    |ORDER BY id DESC\n    |LIMIT 1\n    "), function1, 2, new xg$$ExternalSyntheticLambda9(this, 9));
                case 2:
                    LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) transacterImpl;
                    return localTabContentQueries.driver.executeQuery(-492542342, "SELECT expressivePaymentsBackgroundConfig.main_url, expressivePaymentsBackgroundConfig.preview_url\nFROM expressivePaymentsBackgroundConfig\nWHERE expressivePaymentsBackgroundConfig.release_state = ?\nORDER BY priority ASC LIMIT ?", function1, 2, new InstrumentQueries$$ExternalSyntheticLambda0(i2, localTabContentQueries, this));
                case 3:
                    InstrumentQueries instrumentQueries = (InstrumentQueries) transacterImpl;
                    return instrumentQueries.driver.executeQuery(1259262604, "SELECT expressivePaymentsStickerConfig.main_url, expressivePaymentsStickerConfig.preview_url\nFROM expressivePaymentsStickerConfig\nWHERE expressivePaymentsStickerConfig.release_state = ?\nORDER BY priority ASC LIMIT ?", function1, 2, new InstrumentQueries$$ExternalSyntheticLambda0(12, instrumentQueries, this));
                case 4:
                    PaymentQueries paymentQueries = (PaymentQueries) transacterImpl;
                    Collection collection = (Collection) obj;
                    int size = collection.size();
                    paymentQueries.getClass();
                    return paymentQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n          |SELECT cashActivity.their_id, cashActivity.is_outstanding, cashActivity._id, cashActivity.token, cashActivity.payment_render_data, cashActivity.sender_render_data, cashActivity.recipient_render_data, cashActivity.loyalty_render_data, cashActivity.state, cashActivity.role, cashActivity.amount, cashActivity.amount_currency, cashActivity.is_badged, cashActivity.is_bitcoin, cashActivity.is_scheduled, cashActivity.scheduled_for, cashActivity.scheduled_payment_token, cashActivity.photo, cashActivity.themed_accent_color, cashActivity.lookup_key, cashActivity.display_name, cashActivity.merchant_data, cashActivity.email, cashActivity.sms, cashActivity.threaded_customer_id, cashActivity.is_cash_customer, cashActivity.can_accept_payments, cashActivity.is_business, cashActivity.display_date, cashActivity.receipt_render_data, cashActivity.rollup_type, cashActivity.investment_order_type, cashActivity.payment_type, cashActivity.gifted_investment_entity_token, cashActivity.lending_loan_token, cashActivity.associated_payment_token, cashActivity.sync_entity_version, cashActivity.loyalty_activity, cashActivity.isRegular, cashActivity.is_hidden, cashActivity.orientation, cashActivity.transaction_type\n          |FROM cashActivity\n          |WHERE is_hidden = 0\n          |AND coalesce(payment_type, '') IN ", TransacterImpl.createArguments(size), "\n          |LIMIT ?\n          |OFFSET ?\n          "), function1, collection.size() + 2, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 15));
                default:
                    InstrumentQueries instrumentQueries2 = (InstrumentQueries) transacterImpl;
                    Collection collection2 = (Collection) obj;
                    int size2 = collection2.size();
                    instrumentQueries2.getClass();
                    return instrumentQueries2.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n          |SELECT hashed_alias, sync_state\n          |FROM alias\n          |WHERE sync_state IN ", TransacterImpl.createArguments(size2), "\n          |LIMIT ?\n          "), function1, collection2.size() + 1, new InstrumentQueries$$ExternalSyntheticLambda0(25, this, instrumentQueries2));
            }
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(Query.Listener listener) {
            int i = this.$r8$classId;
            TransacterImpl transacterImpl = this.this$0;
            listener.getClass();
            switch (i) {
                case 0:
                    ((PinsQueries) transacterImpl).driver.removeListener(new String[]{"pins"}, listener);
                    break;
                case 1:
                    ((FilesQueries) transacterImpl).driver.removeListener(new String[]{"files", "pins"}, listener);
                    break;
                case 2:
                    ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"expressivePaymentsBackgroundConfig"}, listener);
                    break;
                case 3:
                    ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"expressivePaymentsStickerConfig"}, listener);
                    break;
                case 4:
                    ((PaymentQueries) transacterImpl).driver.removeListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "contact", "alias", "contact_alias", "itemizedReceipt", "loyaltyHiddenPaymentTypes", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids"}, listener);
                    break;
                default:
                    ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"alias"}, listener);
                    break;
            }
        }

        public final String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "Pins.sq:get_pin";
                case 1:
                    return "Files.sq:selectPinnedManifestNotFileId";
                case 2:
                    return "ExpressivePaymentsBackgroundConfig.sq:loadCacheableBackgrounds";
                case 3:
                    return "ExpressivePaymentsStickerConfig.sq:loadCacheableStickers";
                case 4:
                    return "CashActivity.sq:allActivityByPaymentType";
                default:
                    return "Alias.sq:selectForSyncState";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Get_pinQuery(InstrumentQueries instrumentQueries, ReleaseState releaseState, SessionQueries$$ExternalSyntheticLambda1 sessionQueries$$ExternalSyntheticLambda1) {
            super(sessionQueries$$ExternalSyntheticLambda1);
            releaseState.getClass();
            this.this$0 = instrumentQueries;
            this.application_name = releaseState;
            this.file_id = 9L;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Get_pinQuery(LocalTabContentQueries localTabContentQueries, ReleaseState releaseState, SessionQueries$$ExternalSyntheticLambda1 sessionQueries$$ExternalSyntheticLambda1) {
            super(sessionQueries$$ExternalSyntheticLambda1);
            releaseState.getClass();
            this.this$0 = localTabContentQueries;
            this.application_name = releaseState;
            this.file_id = 5L;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Get_pinQuery(InstrumentQueries instrumentQueries, Collection collection, AliasQueries$$ExternalSyntheticLambda0 aliasQueries$$ExternalSyntheticLambda0) {
            super(aliasQueries$$ExternalSyntheticLambda0);
            this.this$0 = instrumentQueries;
            this.application_name = collection;
            this.file_id = 1000L;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Get_pinQuery(FilesQueries filesQueries, String str, long j, FilesQueries$$ExternalSyntheticLambda4 filesQueries$$ExternalSyntheticLambda4) {
            super(filesQueries$$ExternalSyntheticLambda4);
            this.this$0 = filesQueries;
            this.application_name = str;
            this.file_id = j;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Get_pinQuery(PinsQueries pinsQueries, long j, String str, yf$$ExternalSyntheticLambda10 yf__externalsyntheticlambda10) {
            super(yf__externalsyntheticlambda10);
            str.getClass();
            this.this$0 = pinsQueries;
            this.file_id = j;
            this.application_name = str;
        }
    }
}
