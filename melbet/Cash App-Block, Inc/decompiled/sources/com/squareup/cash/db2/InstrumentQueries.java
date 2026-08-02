package com.squareup.cash.db2;

import app.cash.local.db.Local_tab_content;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda1;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import bo.app.re$$ExternalSyntheticOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.contacts.AliasSyncState;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.payment.PendingPaymentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.PendingPaymentQueries$pendingRequest$2;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.db2.profile.ProfileQueries$profileToken$2;
import com.squareup.cash.db2.profile.ProfileQueries$select$2;
import com.squareup.cash.db2.profile.ProfileQueries$selectRegion$2;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibilityQueries$EligibilityQuery;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibilityQueries$eligibility$2;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.FeatureFlag;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__IndentKt;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;

/* loaded from: classes.dex */
public final class InstrumentQueries extends TransacterImpl {
    public final /* synthetic */ int $r8$classId;
    public final Object instrumentAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentQueries(AndroidSqliteDriver androidSqliteDriver, Local_tab_content.Adapter adapter) {
        super(androidSqliteDriver);
        this.$r8$classId = 26;
        adapter.getClass();
        this.instrumentAdapter = adapter;
    }

    public void deleteByType(UiAlias.Type type2) {
        this.driver.execute(1175790222, "DELETE FROM profileAlias\nWHERE type = ?", new ProfileQueries$$ExternalSyntheticLambda13(7, this, type2));
        notifyQueries(1175790222, new ProfileQueries$$ExternalSyntheticLambda4(4));
    }

    public SingleAccountHolderEligibilityQueries$EligibilityQuery eligibility(String str) {
        str.getClass();
        SingleAccountHolderEligibilityQueries$eligibility$2 singleAccountHolderEligibilityQueries$eligibility$2 = SingleAccountHolderEligibilityQueries$eligibility$2.INSTANCE;
        byte b = 0;
        return new SingleAccountHolderEligibilityQueries$EligibilityQuery(this, str, new OfflineQueries$$ExternalSyntheticLambda0(this, b, b));
    }

    public QueryResult insert(UiAlias.Type type2, String str, boolean z) {
        str.getClass();
        type2.getClass();
        QueryResult execute = this.driver.execute(-2018109173, "INSERT INTO profileAlias\nVALUES (?, ?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(str, z, (TransacterImpl) this, type2, 10));
        notifyQueries(-2018109173, new ProfileQueries$$ExternalSyntheticLambda4(2));
        return execute;
    }

    public QueryResult insertOrReplace(String str, GetProfileDetailsResponse getProfileDetailsResponse) {
        str.getClass();
        getProfileDetailsResponse.getClass();
        QueryResult execute = this.driver.execute(-1709742821, "INSERT OR REPLACE INTO extendedProfileDetails\nVALUES (?, ?)", new CaptureCheckFaceKt$$ExternalSyntheticLambda11(29, str, this, getProfileDetailsResponse));
        notifyQueries(-1709742821, new OfflineQueries$$ExternalSyntheticLambda1(25));
        return execute;
    }

    public void insertOrReplaceAlias(String str, String str2, String str3, String str4) {
        AliasSyncState aliasSyncState = AliasSyncState.SYNCED;
        this.driver.execute(-1321549509, "INSERT OR REPLACE INTO alias\nVALUES (?, ?, ?, ?, ?, ?)", new OverlayKt$$ExternalSyntheticLambda3(str, str2, str3, str4, this));
        notifyQueries(-1321549509, new WebLoginConfigQueries$$ExternalSyntheticLambda2(9, false));
    }

    public void insertRemote(String str, FeatureFlag featureFlag) {
        this.driver.execute(-2074172357, "INSERT OR REPLACE INTO featureFlags\nVALUES (?, ?, 0)", new MoleculeKt$$ExternalSyntheticLambda1(8, str, this, featureFlag));
        notifyQueries(-2074172357, new WebLoginConfigQueries$$ExternalSyntheticLambda0(6));
    }

    public RewardQueries.ForIdsQuery pendingRequest(String str) {
        str.getClass();
        PendingPaymentQueries$pendingRequest$2 pendingPaymentQueries$pendingRequest$2 = PendingPaymentQueries$pendingRequest$2.INSTANCE;
        return new RewardQueries.ForIdsQuery(this, str, new PendingPaymentQueries$$ExternalSyntheticLambda0(this, 2));
    }

    public SimpleQuery profileToken() {
        ProfileQueries$profileToken$2 profileQueries$profileToken$2 = ProfileQueries$profileToken$2.INSTANCE;
        WebLoginConfigQueries$$ExternalSyntheticLambda0 webLoginConfigQueries$$ExternalSyntheticLambda0 = new WebLoginConfigQueries$$ExternalSyntheticLambda0(7);
        SqlDriver sqlDriver = this.driver;
        sqlDriver.getClass();
        return new SimpleQuery(-993807862, new String[]{"profile"}, sqlDriver, "Profile.sq", "profileToken", "SELECT profile_token\nFROM profile", webLoginConfigQueries$$ExternalSyntheticLambda0);
    }

    public Query select$2() {
        switch (this.$r8$classId) {
            case 7:
                ReactionConfigQueries$select$2 reactionConfigQueries$select$2 = ReactionConfigQueries$select$2.INSTANCE;
                StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(this, (byte) 0);
                SqlDriver sqlDriver = this.driver;
                sqlDriver.getClass();
                return new SimpleQuery(-2057012467, new String[]{"reactionConfig"}, sqlDriver, "ReactionConfig.sq", "select", "SELECT reactionConfig.maxEmojisPerReaction, reactionConfig.extendedReactions\nFROM reactionConfig", storageLinkQueries$$ExternalSyntheticLambda8);
            default:
                ProfileQueries$select$2 profileQueries$select$2 = ProfileQueries$select$2.INSTANCE;
                ProfileQueries$$ExternalSyntheticLambda1 profileQueries$$ExternalSyntheticLambda1 = new ProfileQueries$$ExternalSyntheticLambda1(this, 1);
                SqlDriver sqlDriver2 = this.driver;
                sqlDriver2.getClass();
                return new SimpleQuery(1614035126, new String[]{"profile"}, sqlDriver2, "Profile.sq", "select", "SELECT profile.profile_id, profile.full_name, profile.photo_url, profile.require_passcode_confirmation, profile.has_passcode, profile.nearby_visibility, profile.cashtag, profile.cashtag_url, profile.cashtag_url_display_text, profile.cashtag_url_enabled, profile.rate_plan, profile.can_upgrade_to_business, profile.is_verified_account, profile.app_message_notifications_enabled, profile.verification_instrument_token, profile.deposit_preference, profile.address, profile.deposit_preference_data, profile.request_minimum_note_length, profile.country_code, profile.default_currency, profile.customer_since, profile.profile_token, profile.incoming_request_policy, profile.has_passed_idv, profile.cashtag_qr_image_url, profile.cashtag_with_currency_symbol, profile.available_p2p_target_regions, profile.printable_cashtag_qr_image_url, profile.region, profile.direct_deposit_account_enabled, profile.bitcoin_display_units, profile.bitcoin_amount_entry_currency_preference\nFROM profile", profileQueries$$ExternalSyntheticLambda1);
        }
    }

    public SimpleQuery selectRegion() {
        int i = ProfileQueries$selectRegion$2.$r8$clinit;
        ProfileQueries$$ExternalSyntheticLambda1 profileQueries$$ExternalSyntheticLambda1 = new ProfileQueries$$ExternalSyntheticLambda1(this, 0);
        SqlDriver sqlDriver = this.driver;
        sqlDriver.getClass();
        return new SimpleQuery(-209360054, new String[]{"profile"}, sqlDriver, "Profile.sq", "selectRegion", "SELECT region\nFROM profile", profileQueries$$ExternalSyntheticLambda1);
    }

    public void updateHashedAliasId(String str, String str2) {
        str2.getClass();
        this.driver.execute(2130323794, "UPDATE alias\nSET hashed_alias_id = ?\nWHERE hashed_alias = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str, str2, 14));
        notifyQueries(2130323794, new WebLoginConfigQueries$$ExternalSyntheticLambda2(15, false));
    }

    public final class ForCurrencyQuery extends Query {
        public final /* synthetic */ int $r8$classId = 0;
        public final CurrencyCode balance_currency;
        public final Enum cash_instrument_type;
        public final /* synthetic */ TransacterImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForCurrencyQuery(InstrumentQueries instrumentQueries, CashInstrumentType cashInstrumentType, CurrencyCode currencyCode, ViewTreeObservers$$ExternalSyntheticLambda3 viewTreeObservers$$ExternalSyntheticLambda3) {
            super(viewTreeObservers$$ExternalSyntheticLambda3);
            this.this$0 = instrumentQueries;
            this.cash_instrument_type = cashInstrumentType;
            this.balance_currency = currencyCode;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(Query.Listener listener) {
            int i = this.$r8$classId;
            TransacterImpl transacterImpl = this.this$0;
            switch (i) {
                case 0:
                    ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"instrument"}, listener);
                    break;
                default:
                    ((PaymentQueries) transacterImpl).driver.addListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "contact", "alias", "contact_alias", "itemizedReceipt", "loyaltyHiddenPaymentTypes", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids", "investing_settings"}, listener);
                    break;
            }
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult execute(Function1 function1) {
            int i = this.$r8$classId;
            CurrencyCode currencyCode = this.balance_currency;
            TransacterImpl transacterImpl = this.this$0;
            switch (i) {
                case 0:
                    InstrumentQueries instrumentQueries = (InstrumentQueries) transacterImpl;
                    return instrumentQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT instrument.token, instrument.cash_instrument_type, instrument.card_brand, instrument.suffix, instrument.bank_name, instrument.icon_url, instrument.balance_currency, instrument.balance_amount, instrument.version, instrument.detail_icon_url, instrument.display_name, instrument.wallet_address, instrument.pending_verification, instrument.selection_icon_url, instrument.sync_entity_id\n    |FROM instrument\n    |WHERE cash_instrument_type = ?\n    |AND balance_currency ", currencyCode != null ? "=" : "IS", " ?\n    "), function1, 2, new InstrumentQueries$$ExternalSyntheticLambda0(instrumentQueries, this, 15));
                default:
                    PaymentQueries paymentQueries = (PaymentQueries) transacterImpl;
                    return paymentQueries.driver.executeQuery(null, StringsKt__IndentKt.trimMargin$default("\n    |SELECT count(*) > 0\n    |FROM cashActivity\n    |LEFT JOIN investing_settings\n    |WHERE (\n    |  amount_currency " + (currencyCode == null ? "IS" : "=") + " ?\n    |  OR\n    |  their_id = (SELECT customer_id FROM bitcoinTransactionCustomerIds)\n    |  OR\n    |  investing_settings.bitcoin_investment_entity_token IS NOT NULL\n    |    AND cashActivity.gifted_investment_entity_token = investing_settings.bitcoin_investment_entity_token\n    |    AND cashActivity.role " + (((Role) this.cash_instrument_type) != null ? "=" : "IS") + " ?\n    |)\n    |AND cashActivity.state = \"COMPLETE\"\n    |AND is_hidden = 0\n    "), function1, 2, new ViewTreeObservers$$ExternalSyntheticLambda3(4, this, paymentQueries));
            }
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(Query.Listener listener) {
            int i = this.$r8$classId;
            TransacterImpl transacterImpl = this.this$0;
            listener.getClass();
            switch (i) {
                case 0:
                    ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"instrument"}, listener);
                    break;
                default:
                    ((PaymentQueries) transacterImpl).driver.removeListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "contact", "alias", "contact_alias", "itemizedReceipt", "loyaltyHiddenPaymentTypes", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids", "investing_settings"}, listener);
                    break;
            }
        }

        public final String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "Instrument.sq:forCurrency";
                default:
                    return "CashActivity.sq:hasBitcoinActivity";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForCurrencyQuery(PaymentQueries paymentQueries, CurrencyCode currencyCode, Role role, WebLoginConfigQueries$$ExternalSyntheticLambda0 webLoginConfigQueries$$ExternalSyntheticLambda0) {
            super(webLoginConfigQueries$$ExternalSyntheticLambda0);
            this.this$0 = paymentQueries;
            this.balance_currency = currencyCode;
            this.cash_instrument_type = role;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstrumentQueries(AndroidSqliteDriver androidSqliteDriver, Object obj, int i) {
        super(androidSqliteDriver);
        this.$r8$classId = i;
        this.instrumentAdapter = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentQueries(AndroidSqliteDriver androidSqliteDriver, Local_tab_content.Adapter adapter, byte b) {
        super(androidSqliteDriver);
        this.$r8$classId = 29;
        adapter.getClass();
        this.instrumentAdapter = adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentQueries(AndroidSqliteDriver androidSqliteDriver, EnumListAdapter enumListAdapter) {
        super(androidSqliteDriver);
        this.$r8$classId = 27;
        enumListAdapter.getClass();
        this.instrumentAdapter = enumListAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentQueries(AndroidSqliteDriver androidSqliteDriver, ScenarioPlan.Adapter adapter) {
        super(androidSqliteDriver);
        this.$r8$classId = 28;
        adapter.getClass();
        this.instrumentAdapter = adapter;
    }
}
