package com.squareup.cash.badging.db;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.clientsync.SyncEntityQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.PendingPaymentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries;
import com.squareup.cash.investing.db.InvestingPortfolioGraphCacheQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.db.InvestingSearchTableQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.investing.db.categories.CategoryQueries;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.squareup.protos.franklin.ui.BlockState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__IndentKt;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;

/* loaded from: classes5.dex */
public final class BadgeQueries$VersionQuery extends Query {
    public final /* synthetic */ int $r8$classId;
    public final Serializable external_token;
    public final Object item_type;
    public final /* synthetic */ TransacterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeQueries$VersionQuery(CategoryQueries categoryQueries, String str, MerchantBlockingViewKt$$ExternalSyntheticLambda15 merchantBlockingViewKt$$ExternalSyntheticLambda15, byte b) {
        super(merchantBlockingViewKt$$ExternalSyntheticLambda15);
        this.$r8$classId = 12;
        SyncInvestmentCategory.CategoryType categoryType = SyncInvestmentCategory.CategoryType.CATEGORY;
        str.getClass();
        this.this$0 = categoryQueries;
        this.external_token = str;
        this.item_type = categoryType;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"badge"}, listener);
                break;
            case 1:
                ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"sync_entity"}, listener);
                break;
            case 2:
                ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"instrument"}, listener);
                break;
            case 3:
                ((ContactQueries) transacterImpl).driver.addListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "invitationEntity", "payment", "profile"}, listener);
                break;
            case 4:
                ((RewardSlotQueries) transacterImpl).driver.addListener(new String[]{"recipientConfig", "contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "invitationEntity", "payment"}, listener);
                break;
            case 5:
                ((PaymentQueries) transacterImpl).driver.addListener(new String[]{"payment"}, listener);
                break;
            case 6:
                ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"pendingPayment"}, listener);
                break;
            case 7:
                ((ContactQueries) transacterImpl).driver.addListener(new String[]{"contact", "alias", "contact_alias"}, listener);
                break;
            case 8:
                ((RewardSlotQueries) transacterImpl).driver.addListener(new String[]{"investing_bitcoin_portfolio_graph_cache"}, listener);
                break;
            case 9:
                ((InvestingDiscoveryQueries) transacterImpl).driver.addListener(new String[]{"investment_entity", "investing_search"}, listener);
                break;
            case 10:
                ((InvestmentEntityQueries) transacterImpl).driver.addListener(new String[]{"investment_holding", "investment_entity"}, listener);
                break;
            case 11:
                ((CategoryQueries) transacterImpl).driver.addListener(new String[]{"category", "entity_in_category"}, listener);
                break;
            case 12:
                ((CategoryQueries) transacterImpl).driver.addListener(new String[]{"category", "entity_in_category"}, listener);
                break;
            default:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"exchange_data"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        int i2 = 4;
        int i3 = 6;
        int i4 = 18;
        Serializable serializable = this.external_token;
        Object obj = this.item_type;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) transacterImpl;
                return localTabContentQueries.driver.executeQuery(-48416381, "SELECT badge_version\nFROM badge\nWHERE external_token = ?\nAND item_type = ?", function1, 2, new BadgeQueries$$ExternalSyntheticLambda0(14, this, localTabContentQueries));
            case 1:
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) transacterImpl;
                return localTabContentQueries2.driver.executeQuery(-734095478, "SELECT sync_entity.topic, sync_entity.entity_id, sync_entity.entity_type, sync_entity.entity_data, sync_entity.entity_version, sync_entity.value_type\nFROM sync_entity\nWHERE entity_id = ?\nAND entity_type = ?", function1, 2, new BadgedBoxKt$$ExternalSyntheticLambda0(3, this, localTabContentQueries2));
            case 2:
                InstrumentQueries instrumentQueries = (InstrumentQueries) transacterImpl;
                return instrumentQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT wallet_address\n    |FROM instrument\n    |WHERE cash_instrument_type = ?\n    |AND balance_currency ", ((CurrencyCode) obj) == null ? "IS" : "=", " ?\n    "), function1, 2, new InstrumentQueries$$ExternalSyntheticLambda0(instrumentQueries, this, 17));
            case 3:
                ContactQueries contactQueries = (ContactQueries) transacterImpl;
                SqlDriver sqlDriver = contactQueries.driver;
                String str = (String) serializable;
                String str2 = str == null ? "IS" : "==";
                String str3 = str != null ? "==" : "IS";
                String str4 = ((BlockState) obj) == null ? "IS NOT" : "!=";
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n    |SELECT recipients.contact_display_name, recipients.lookup_key, recipients.already_invited, recipients.has_multiple_customers, recipients.customer_id, recipients.threaded_customer_id, recipients.cashtag, recipients.is_cash_customer, recipients.is_verified, recipients.is_business, recipients.email, recipients.sms, recipients.photo, recipients.customer_display_name, recipients.email_addresses, recipients.sms_numbers, recipients.can_accept_payments, recipients.is_square, recipients.credit_card_fee, recipients.blocked, recipients.merchant_data, recipients.themed_accent_color, recipients.region, recipients.category, recipients.joined_on, recipients.is_recent\n    |FROM recipients\n    |WHERE lookup_key IS NOT NULL\n    |AND (sms ", str2, " ? OR email ", str3, " ?)\n    |AND (blocked IS NULL OR blocked ");
                m.append(str4);
                m.append(" ?)\n    |AND (customer_id IS NULL OR customer_id != (SELECT profile_id FROM profile))\n    |LIMIT 1\n    ");
                return sqlDriver.executeQuery(null, StringsKt__IndentKt.trimMargin$default(m.toString()), function1, 3, new InstrumentQueries$$ExternalSyntheticLambda0(26, this, contactQueries));
            case 4:
                return ((RewardSlotQueries) transacterImpl).driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT (CASE WHEN coalesce(lookup_key, customer_id) IS NULL THEN confirm_cashtag_recipient ELSE 0 END) = 1\n    |FROM recipientConfig\n    |LEFT JOIN recipients\n    |ON (lookup_key IS NOT NULL AND lookup_key = ? )\n    |OR (customer_id IS NOT NULL AND customer_id ", ((String) obj) == null ? "IS" : "=", " ?)\n    |LIMIT 1\n    "), function1, 2, new OfflineQueries$$ExternalSyntheticLambda0(this, 1));
            case 5:
                PaymentQueries paymentQueries = (PaymentQueries) transacterImpl;
                ArrayList arrayList = (ArrayList) serializable;
                int size = arrayList.size();
                paymentQueries.getClass();
                String createArguments = TransacterImpl.createArguments(size);
                ArrayList arrayList2 = (ArrayList) obj;
                String createArguments2 = TransacterImpl.createArguments(arrayList2.size());
                return paymentQueries.driver.executeQuery(null, StringsKt__IndentKt.trimMargin$default("\n          |WITH combined_transactions AS (\n          |    SELECT recipient_id AS user_id, display_date\n          |    FROM payment\n          |    WHERE recipient_id IN " + createArguments + "\n          |    AND state != 'FAILED'\n          |\n          |    UNION ALL\n          |\n          |    SELECT sender_id AS user_id, display_date\n          |    FROM payment\n          |    WHERE sender_id IN " + createArguments2 + "\n          |    AND state != 'FAILED'\n          |)\n          |SELECT\n          |    user_id,\n          |    MAX(display_date) AS last_transaction_date\n          |FROM combined_transactions\n          |GROUP BY user_id\n          |ORDER BY last_transaction_date DESC\n          "), function1, arrayList2.size() + arrayList.size(), new OfflineQueries$$ExternalSyntheticLambda0(this, i3));
            case 6:
                InstrumentQueries instrumentQueries2 = (InstrumentQueries) transacterImpl;
                return instrumentQueries2.driver.executeQuery(-145882314, "SELECT request\nFROM pendingPayment\nWHERE amount = ?\nAND orientation = ?\nAND succeeded = 0", function1, 2, new ProfileQueries$$ExternalSyntheticLambda13(i2, instrumentQueries2, this));
            case 7:
                SqlDriver sqlDriver2 = ((ContactQueries) transacterImpl).driver;
                String str5 = (String) serializable;
                String str6 = str5 == null ? "IS" : "=";
                String str7 = str5 == null ? "IS" : "=";
                String str8 = ((String) obj) == null ? "IS" : "=";
                StringBuilder m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n    |SELECT contact.lookup_key, display_name, email, sms\n    |FROM alias\n    |LEFT JOIN contact_alias USING (hashed_alias)\n    |LEFT JOIN contact USING (lookup_key)\n    |WHERE (email ", str6, " ? OR sms ", str7, " ?) AND (? IS NULL OR contact.lookup_key ");
                m2.append(str8);
                m2.append(" ?)\n    |LIMIT 1\n    ");
                return sqlDriver2.executeQuery(null, StringsKt__IndentKt.trimMargin$default(m2.toString()), function1, 4, new OfflineQueries$$ExternalSyntheticLambda0(this, 19));
            case 8:
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) transacterImpl;
                return rewardSlotQueries.driver.executeQuery(957048120, "SELECT investing_bitcoin_portfolio_graph_cache.profileCurrency, investing_bitcoin_portfolio_graph_cache.range, investing_bitcoin_portfolio_graph_cache.data\nFROM investing_bitcoin_portfolio_graph_cache\nWHERE profileCurrency = ? AND range = ?", function1, 2, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(i2, rewardSlotQueries, this));
            case 9:
                InvestingDiscoveryQueries investingDiscoveryQueries = (InvestingDiscoveryQueries) transacterImpl;
                return investingDiscoveryQueries.driver.executeQuery(-1784216878, "SELECT investment_entity.id, investment_entity.token, investment_entity.symbol, investment_entity.type, investment_entity.display_name, investment_entity.icon_url, investment_entity.outstanding_shares, investment_entity.color, investment_entity.status, investment_entity.about_text, investment_entity.about_detail_rows, investment_entity.search_ordering, investment_entity.delisted, investment_entity.entity_color, investment_entity.icon, investment_entity.release_stage\nFROM investment_entity\nJOIN investing_search ON (investment_entity.rowid = docid AND status != ?)\nWHERE content MATCH ? || '*'\nORDER BY\n  (content LIKE ? || '%') + -- Symbols which start with the search term\n  (content LIKE '% ' || ? || '%') * 10 + -- Names which start with the search term (weighted more).\n  (content LIKE ? || ' %') * 20 -- Symbols that matches exactly to the search term (weighted the highest)\n  DESC", function1, 5, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(i3, investingDiscoveryQueries, this));
            case 10:
                InvestmentEntityQueries investmentEntityQueries = (InvestmentEntityQueries) transacterImpl;
                return investmentEntityQueries.driver.executeQuery(1956294654, "SELECT ownedHoldings.token, ownedHoldings.units, ownedHoldings.invested_amount, ownedHoldings.currency, ownedHoldings.state, ownedHoldings.daily_gain_params, ownedHoldings.average_cost, ownedHoldings.id, ownedHoldings.symbol, ownedHoldings.type, ownedHoldings.display_name, ownedHoldings.icon_url, ownedHoldings.outstanding_shares, ownedHoldings.color, ownedHoldings.status, ownedHoldings.about_text, ownedHoldings.about_detail_rows, ownedHoldings.search_ordering, ownedHoldings.delisted, ownedHoldings.entity_color, ownedHoldings.icon, ownedHoldings.release_stage\nFROM ownedHoldings\nWHERE token = ?\nAND state = ?", function1, 2, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(8, this, investmentEntityQueries));
            case 11:
                CategoryQueries categoryQueries = (CategoryQueries) transacterImpl;
                return categoryQueries.driver.executeQuery(-244083279, "SELECT id, token, name, image_url, category_color, description, filter_description, prefix_icon, accent_color\nFROM category\nWHERE name LIKE ? || '%'\nAND type = ?\nAND token IN (SELECT DISTINCT category_token FROM entity_in_category)\nORDER BY ui_order, name COLLATE NOCASE ASC", function1, 2, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(15, this, categoryQueries));
            case 12:
                CategoryQueries categoryQueries2 = (CategoryQueries) transacterImpl;
                return categoryQueries2.driver.executeQuery(-620083845, "SELECT category.id,\n       category.token,\n       category.name,\n       category.image_url,\n       category.category_color,\n       category.description,\n       category.filter_description,\n       category.prefix_icon,\n       category.accent_color\nFROM category\nJOIN entity_in_category ON category.token = category_token\nWHERE entity_token = ? AND category.type = ?\nORDER BY category.ui_order, category.name COLLATE NOCASE ASC", function1, 2, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(i4, this, categoryQueries2));
            default:
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) transacterImpl;
                return gpsConfigQueries.driver.executeQuery(-608490926, "SELECT exchange_data.base_currency_code, exchange_data.quote_currency_code, exchange_data.rates, exchange_data.timestamp FROM exchange_data\nWHERE base_currency_code = ? AND quote_currency_code = ?", function1, 2, new BlurEffectKt$$ExternalSyntheticLambda1(i4, gpsConfigQueries, this));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"badge"}, listener);
                break;
            case 1:
                ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"sync_entity"}, listener);
                break;
            case 2:
                ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"instrument"}, listener);
                break;
            case 3:
                ((ContactQueries) transacterImpl).driver.removeListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "invitationEntity", "payment", "profile"}, listener);
                break;
            case 4:
                ((RewardSlotQueries) transacterImpl).driver.removeListener(new String[]{"recipientConfig", "contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "invitationEntity", "payment"}, listener);
                break;
            case 5:
                ((PaymentQueries) transacterImpl).driver.removeListener(new String[]{"payment"}, listener);
                break;
            case 6:
                ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"pendingPayment"}, listener);
                break;
            case 7:
                ((ContactQueries) transacterImpl).driver.removeListener(new String[]{"contact", "alias", "contact_alias"}, listener);
                break;
            case 8:
                ((RewardSlotQueries) transacterImpl).driver.removeListener(new String[]{"investing_bitcoin_portfolio_graph_cache"}, listener);
                break;
            case 9:
                ((InvestingDiscoveryQueries) transacterImpl).driver.removeListener(new String[]{"investment_entity", "investing_search"}, listener);
                break;
            case 10:
                ((InvestmentEntityQueries) transacterImpl).driver.removeListener(new String[]{"investment_holding", "investment_entity"}, listener);
                break;
            case 11:
                ((CategoryQueries) transacterImpl).driver.removeListener(new String[]{"category", "entity_in_category"}, listener);
                break;
            case 12:
                ((CategoryQueries) transacterImpl).driver.removeListener(new String[]{"category", "entity_in_category"}, listener);
                break;
            default:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"exchange_data"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "Badge.sq:version";
            case 1:
                return "SyncEntity.sq:select";
            case 2:
                return "Instrument.sq:walletAddressForCurrency";
            case 3:
                return "Contact.sq:contactByAlias";
            case 4:
                return "Customer.sq:showConfirmRecipient";
            case 5:
                return "Payment.sq:lastTransactionDate";
            case 6:
                return "PendingPayment.sq:possibleDuplicates";
            case 7:
                return "CustomerProfile.sq:localContactProfile";
            case 8:
                return "InvestingPortfolioGraphCache.sq:bitcoin";
            case 9:
                return "InvestingSearchTable.sq:entityBySearch";
            case 10:
                return "InvestmentHolding.sq:holdingForToken";
            case 11:
                return "Category.sq:searchNonEmptyCategories";
            case 12:
                return "EntityInCategory.sq:categoriesForEntity";
            default:
                return "ExchangeData.sq:exchangeRates";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeQueries$VersionQuery(GpsConfigQueries gpsConfigQueries, CurrencyCode currencyCode, CurrencyCode currencyCode2, ForwardingFileSystem$$ExternalSyntheticLambda0 forwardingFileSystem$$ExternalSyntheticLambda0) {
        super(forwardingFileSystem$$ExternalSyntheticLambda0);
        this.$r8$classId = 13;
        currencyCode.getClass();
        this.this$0 = gpsConfigQueries;
        this.external_token = currencyCode;
        this.item_type = currencyCode2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BadgeQueries$VersionQuery(TransacterImpl transacterImpl, Serializable serializable, Serializable serializable2, Function1 function1, int i) {
        super(function1);
        this.$r8$classId = i;
        this.this$0 = transacterImpl;
        this.external_token = serializable;
        this.item_type = serializable2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeQueries$VersionQuery(InvestingDiscoveryQueries investingDiscoveryQueries, String str, InvestingSearchTableQueries$$ExternalSyntheticLambda0 investingSearchTableQueries$$ExternalSyntheticLambda0) {
        super(investingSearchTableQueries$$ExternalSyntheticLambda0);
        this.$r8$classId = 9;
        InvestmentEntityStatus investmentEntityStatus = InvestmentEntityStatus.INACTIVE;
        str.getClass();
        this.this$0 = investingDiscoveryQueries;
        this.item_type = investmentEntityStatus;
        this.external_token = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeQueries$VersionQuery(RewardSlotQueries rewardSlotQueries, CurrencyCode currencyCode, HistoricalRange historicalRange, InvestingPortfolioGraphCacheQueries$$ExternalSyntheticLambda4 investingPortfolioGraphCacheQueries$$ExternalSyntheticLambda4) {
        super(investingPortfolioGraphCacheQueries$$ExternalSyntheticLambda4);
        this.$r8$classId = 8;
        currencyCode.getClass();
        this.this$0 = rewardSlotQueries;
        this.external_token = currencyCode;
        this.item_type = historicalRange;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeQueries$VersionQuery(CategoryQueries categoryQueries, String str, MerchantBlockingViewKt$$ExternalSyntheticLambda15 merchantBlockingViewKt$$ExternalSyntheticLambda15) {
        super(merchantBlockingViewKt$$ExternalSyntheticLambda15);
        this.$r8$classId = 11;
        SyncInvestmentCategory.CategoryType categoryType = SyncInvestmentCategory.CategoryType.CATEGORY;
        this.this$0 = categoryQueries;
        this.external_token = str;
        this.item_type = categoryType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeQueries$VersionQuery(LocalTabContentQueries localTabContentQueries, String str, SyncEntityType syncEntityType, SyncEntityQueries$$ExternalSyntheticLambda0 syncEntityQueries$$ExternalSyntheticLambda0) {
        super(syncEntityQueries$$ExternalSyntheticLambda0);
        this.$r8$classId = 1;
        str.getClass();
        syncEntityType.getClass();
        this.this$0 = localTabContentQueries;
        this.external_token = str;
        this.item_type = syncEntityType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeQueries$VersionQuery(LocalTabContentQueries localTabContentQueries, String str, ItemType itemType, AvatarsKt$$ExternalSyntheticLambda2 avatarsKt$$ExternalSyntheticLambda2) {
        super(avatarsKt$$ExternalSyntheticLambda2);
        this.$r8$classId = 0;
        str.getClass();
        this.this$0 = localTabContentQueries;
        this.external_token = str;
        this.item_type = itemType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeQueries$VersionQuery(InstrumentQueries instrumentQueries, Money money, Orientation orientation, PendingPaymentQueries$$ExternalSyntheticLambda0 pendingPaymentQueries$$ExternalSyntheticLambda0) {
        super(pendingPaymentQueries$$ExternalSyntheticLambda0);
        this.$r8$classId = 6;
        money.getClass();
        orientation.getClass();
        this.this$0 = instrumentQueries;
        this.external_token = money;
        this.item_type = orientation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeQueries$VersionQuery(InvestmentEntityQueries investmentEntityQueries, String str, InvestmentHoldingQueries$$ExternalSyntheticLambda5 investmentHoldingQueries$$ExternalSyntheticLambda5) {
        super(investmentHoldingQueries$$ExternalSyntheticLambda5);
        this.$r8$classId = 10;
        SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState = SyncInvestmentHolding.InvestmentHoldingState.OWNED;
        this.this$0 = investmentEntityQueries;
        this.external_token = str;
        this.item_type = investmentHoldingState;
    }
}
