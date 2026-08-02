package com.squareup.cash.offers.db;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.education.stories.db.StoryQueries;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.investing.db.InvestingPortfolioGraphCacheQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.investing.db.categories.CategoryQueries;
import com.squareup.cash.investing.db.categories.CategoryQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.db.categories.FilterGroupQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.ui.BlockState;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class OffersSheetQueries$ForSheetKeyQuery extends Query {
    public final /* synthetic */ int $r8$classId;
    public final Object sheet_key;
    public final /* synthetic */ TransacterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(StoryQueries storyQueries, String str, CardAppletTile$$ExternalSyntheticLambda0 cardAppletTile$$ExternalSyntheticLambda0) {
        super(cardAppletTile$$ExternalSyntheticLambda0);
        this.$r8$classId = 25;
        str.getClass();
        this.this$0 = storyQueries;
        this.sheet_key = str;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"offersSheet"}, listener);
                break;
            case 1:
                ((ContactQueries) transacterImpl).driver.addListener(new String[]{"customer", "contact", "alias", "contact_alias"}, listener);
                break;
            case 2:
                ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"extendedProfileDetails"}, listener);
                break;
            case 3:
                ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"profileAlias"}, listener);
                break;
            case 4:
                ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"scenarioPlan"}, listener);
                break;
            case 5:
                ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"customerStatementType"}, listener);
                break;
            case 6:
                ((SessionQueries) transacterImpl).driver.addListener(new String[]{"itemizedReceipt"}, listener);
                break;
            case 7:
                ((ContactQueries) transacterImpl).driver.addListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "invitationEntity", "rewardMerchant"}, listener);
                break;
            case 8:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"paperDepositBarcodeInfo"}, listener);
                break;
            case 9:
                ((StoryQueries) transacterImpl).driver.addListener(new String[]{"education_story", "education_story_scene_data"}, listener);
                break;
            case 10:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"dependentLastSeenSavingsBalance"}, listener);
                break;
            case 11:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"investing_news_article"}, listener);
                break;
            case 12:
                ((RewardSlotQueries) transacterImpl).driver.addListener(new String[]{"investing_stocks_portfolio_graph_cache"}, listener);
                break;
            case 13:
                ((InvestmentEntityQueries) transacterImpl).driver.addListener(new String[]{"investment_entity"}, listener);
                break;
            case 14:
                ((InvestmentEntityQueries) transacterImpl).driver.addListener(new String[]{"investment_holding"}, listener);
                break;
            case 15:
                ((InvestmentEntityQueries) transacterImpl).driver.addListener(new String[]{"investment_holding", "investment_entity"}, listener);
                break;
            case 16:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"investment_performance"}, listener);
                break;
            case 17:
                ((CategoryQueries) transacterImpl).driver.addListener(new String[]{"category", "filter_group", "filter_for_category"}, listener);
                break;
            case 18:
                ((CategoryQueries) transacterImpl).driver.addListener(new String[]{"category", "entity_in_category"}, listener);
                break;
            case 19:
                ((CategoryQueries) transacterImpl).driver.addListener(new String[]{"category"}, listener);
                break;
            case 20:
                ((RewardSlotQueries) transacterImpl).driver.addListener(new String[]{"filter_group", "filter_for_category", "category"}, listener);
                break;
            case 21:
                ((RewardSlotQueries) transacterImpl).driver.addListener(new String[]{"filter_group"}, listener);
                break;
            case 22:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"offersCollectionDetail"}, listener);
                break;
            case 23:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"savingsGoalLocalStatus"}, listener);
                break;
            case 24:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"shoppingRecentlyViewed"}, listener);
                break;
            default:
                ((StoryQueries) transacterImpl).driver.addListener(new String[]{"cardCustomization"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        int i2 = 10;
        int i3 = 12;
        Object obj = this.sheet_key;
        int i4 = 14;
        int i5 = 23;
        int i6 = 8;
        int i7 = 6;
        int i8 = 11;
        int i9 = 18;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) transacterImpl;
                return gpsConfigQueries.driver.executeQuery(-1347516950, "SELECT offersSheet.sheet_key, offersSheet.ttl_in_millis, offersSheet.offers_sheet_response, offersSheet.offer_type\nFROM offersSheet\nWHERE sheet_key = ?", function1, 1, new MusicViewKt$$ExternalSyntheticLambda6(20, gpsConfigQueries, this));
            case 1:
                return ((ContactQueries) transacterImpl).driver.executeQuery(-1520464145, "SELECT customer.customer_id, contact.lookup_key, contact.display_name AS contact_display_name, customer_display_name, photo, themed_accent_color,\n  email_alias.email, sms_alias.sms, cashtag, is_business, is_verified, region, credit_card_fee,\n  blocked, is_cash_customer, merchant_data, can_accept_payments\nFROM customer\nLEFT JOIN alias AS email_alias ON\n  (customer.customer_id = email_alias.customer_id AND email_alias.email IS NOT NULL)\nLEFT JOIN alias AS sms_alias ON\n  (customer.customer_id = sms_alias.customer_id AND sms_alias.sms IS NOT NULL)\nLEFT JOIN contact_alias ON (contact_alias.hashed_alias = email_alias.hashed_alias OR contact_alias.hashed_alias = sms_alias.hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nWHERE customer.customer_id = ?\nLIMIT 1", function1, 1, new OfflineQueries$$ExternalSyntheticLambda0(this, i9));
            case 2:
                return ((InstrumentQueries) transacterImpl).driver.executeQuery(-644585905, "SELECT extendedProfileDetails.customer_token, extendedProfileDetails.get_profile_details_response\nFROM extendedProfileDetails\nWHERE customer_token = ?", function1, 1, new OfflineQueries$$ExternalSyntheticLambda0(this, 21));
            case 3:
                InstrumentQueries instrumentQueries = (InstrumentQueries) transacterImpl;
                return instrumentQueries.driver.executeQuery(-811489357, "SELECT profileAlias.canonical_text, profileAlias.verified, profileAlias.type\nFROM profileAlias\nWHERE type = ?", function1, 1, new ProfileQueries$$ExternalSyntheticLambda13(i6, instrumentQueries, this));
            case 4:
                InstrumentQueries instrumentQueries2 = (InstrumentQueries) transacterImpl;
                return instrumentQueries2.driver.executeQuery(-484028768, "SELECT scenarioPlan.client_scenario, scenarioPlan.scenario_plan\nFROM scenarioPlan\nWHERE client_scenario = ?", function1, 1, new ProfileQueries$$ExternalSyntheticLambda13(i2, instrumentQueries2, this));
            case 5:
                InstrumentQueries instrumentQueries3 = (InstrumentQueries) transacterImpl;
                return instrumentQueries3.driver.executeQuery(-706102815, "SELECT customerStatementType.customer_token, customerStatementType.is_sponsored_account, customerStatementType.display_name, customerStatementType.statement_type, customerStatementType.is_active_sponsored_account FROM customerStatementType\nWHERE statement_type = ?", function1, 1, new ProfileQueries$$ExternalSyntheticLambda13(i8, instrumentQueries3, this));
            case 6:
                return ((SessionQueries) transacterImpl).driver.executeQuery(255880980, "SELECT token FROM itemizedReceipt\nWHERE transaction_token = ?", function1, 1, new RecipientQueries$$ExternalSyntheticLambda0(this, i7));
            case 7:
                ContactQueries contactQueries = (ContactQueries) transacterImpl;
                return contactQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT recentRecipient.contact_display_name, recentRecipient.lookup_key, recentRecipient.already_invited, recentRecipient.has_multiple_customers, recentRecipient.customer_id, recentRecipient.threaded_customer_id, recentRecipient.cashtag, recentRecipient.is_cash_customer, recentRecipient.is_verified, recentRecipient.is_business, recentRecipient.email, recentRecipient.sms, recentRecipient.photo, recentRecipient.customer_display_name, recentRecipient.email_addresses, recentRecipient.sms_numbers, recentRecipient.can_accept_payments, recentRecipient.is_square, recentRecipient.credit_card_fee, recentRecipient.blocked, recentRecipient.merchant_data, recentRecipient.themed_accent_color, recentRecipient.region, recentRecipient.category, recentRecipient.joined_on, recentRecipient.reward_token\n    |FROM recentRecipient\n    |WHERE (blocked IS NULL OR blocked ", ((BlockState) obj) == null ? "IS NOT" : "!=", " ?)\n    "), function1, 1, new ProfileQueries$$ExternalSyntheticLambda13(i3, this, contactQueries));
            case 8:
                return ((GpsConfigQueries) transacterImpl).driver.executeQuery(-178959655, "SELECT ((success IS NOT NULL AND\n        expires_at IS NOT NULL AND\n        expires_at > ?) OR\n        (failure IS NOT NULL)) AS hasValidValue\nFROM paperDepositBarcodeInfo LIMIT 1", function1, 1, new RecipientQueries$$ExternalSyntheticLambda0(this, i2));
            case 9:
                return ((StoryQueries) transacterImpl).driver.executeQuery(-1554770696, "SELECT story.id, story.url, story.slug, story.title, story.thumbnail, story.primaryColor, story.published_at_millis, story.priority, scene.id, scene.scene_index, scene.backgroundColor, scene.storyId FROM education_story story\nLEFT JOIN education_story_scene_data scene ON story.id = scene.storyId\nWHERE story.slug = ?", function1, 1, new RecipientQueries$$ExternalSyntheticLambda0(this, i9));
            case 10:
                return ((GpsConfigQueries) transacterImpl).driver.executeQuery(1647913289, "SELECT balance, general_balance\nFROM dependentLastSeenSavingsBalance\nWHERE customer_token = ?", function1, 1, new RecipientQueries$$ExternalSyntheticLambda0(this, i5));
            case 11:
                GpsConfigQueries gpsConfigQueries2 = (GpsConfigQueries) transacterImpl;
                return gpsConfigQueries2.driver.executeQuery(277804874, "SELECT investing_news_article.kind, investing_news_article.provider, investing_news_article.provider_avatar, investing_news_article.headline, investing_news_article.published_at_millis, investing_news_article.url, investing_news_article.display_in_carousel, investing_news_article.saved_at_millis\nFROM investing_news_article\nWHERE kind = ?", function1, 1, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(3, gpsConfigQueries2, this));
            case 12:
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) transacterImpl;
                return rewardSlotQueries.driver.executeQuery(-2104821565, "SELECT investing_stocks_portfolio_graph_cache.range, investing_stocks_portfolio_graph_cache.data\nFROM investing_stocks_portfolio_graph_cache\nWHERE range = ?", function1, 1, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(5, rewardSlotQueries, this));
            case 13:
                Collection collection = (Collection) obj;
                return ((InvestmentEntityQueries) transacterImpl).driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n          |SELECT investment_entity.id, investment_entity.token, investment_entity.symbol, investment_entity.type, investment_entity.display_name, investment_entity.icon_url, investment_entity.outstanding_shares, investment_entity.color, investment_entity.status, investment_entity.about_text, investment_entity.about_detail_rows, investment_entity.search_ordering, investment_entity.delisted, investment_entity.entity_color, investment_entity.icon, investment_entity.release_stage FROM\n          |investment_entity\n          |WHERE token IN ", TransacterImpl.createArguments(collection.size()), "\n          "), function1, collection.size(), new TooltipBoxKt$$ExternalSyntheticLambda2(this, i3));
            case 14:
                return ((InvestmentEntityQueries) transacterImpl).driver.executeQuery(-1408675931, "SELECT investment_holding.token, investment_holding.units, investment_holding.invested_amount, investment_holding.currency, investment_holding.state, investment_holding.daily_gain_params, investment_holding.average_cost\nFROM investment_holding\nWHERE token = ?", function1, 1, new TooltipBoxKt$$ExternalSyntheticLambda2(this, i4));
            case 15:
                InvestmentEntityQueries investmentEntityQueries = (InvestmentEntityQueries) transacterImpl;
                return investmentEntityQueries.driver.executeQuery(514509677, "SELECT investment_holding.token, investment_holding.units, investment_holding.invested_amount, investment_holding.currency, investment_holding.state, investment_holding.daily_gain_params, investment_holding.average_cost, investment_entity.id, investment_entity.symbol, investment_entity.type, investment_entity.display_name, investment_entity.icon_url, investment_entity.outstanding_shares, investment_entity.color, investment_entity.status, investment_entity.about_text, investment_entity.about_detail_rows, investment_entity.search_ordering, investment_entity.delisted, investment_entity.entity_color, investment_entity.icon, investment_entity.release_stage\nFROM investment_holding\nJOIN investment_entity USING (token)\nWHERE state = ?", function1, 1, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(9, investmentEntityQueries, this));
            case 16:
                return ((GpsConfigQueries) transacterImpl).driver.executeQuery(354080431, "SELECT investment_performance.entity_token, investment_performance.title, investment_performance.sections\nFROM investment_performance\nWHERE entity_token = ?", function1, 1, new TooltipBoxKt$$ExternalSyntheticLambda2(this, 16));
            case 17:
                CategoryQueries categoryQueries = (CategoryQueries) transacterImpl;
                return categoryQueries.driver.executeQuery(-1423410181, "SELECT category.id,\n       category.token,\n       category.name AS categoryName,\n       description,\n       filter_description,\n       prefix_icon,\n       image_url,\n       category_color,\n       accent_color,\n       filter_token,\n       filter_group.name AS filterName,\n       filter_group.name_plural AS filterNamePlural\nFROM category\nLEFT JOIN filter_for_category ON (filter_for_category.category_token = category.token)\nLEFT JOIN filter_group ON (filter_for_category.filter_token = filter_group.token)\nWHERE category.token = ?\nORDER BY filter_for_category.rowid", function1, 1, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(13, categoryQueries, this));
            case 18:
                CategoryQueries categoryQueries2 = (CategoryQueries) transacterImpl;
                return categoryQueries2.driver.executeQuery(709994426, "SELECT id, token, name, image_url, category_color, description, filter_description, prefix_icon, accent_color\nFROM category\nWHERE type = ?\nAND token IN (SELECT DISTINCT category_token FROM entity_in_category)\nORDER BY ui_order, name COLLATE NOCASE ASC", function1, 1, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(i4, categoryQueries2, this));
            case 19:
                return ((CategoryQueries) transacterImpl).driver.executeQuery(534736364, "SELECT token\nFROM category\nWHERE entity_id = ?", function1, 1, new TooltipBoxKt$$ExternalSyntheticLambda2(this, 17));
            case 20:
                RewardSlotQueries rewardSlotQueries2 = (RewardSlotQueries) transacterImpl;
                return rewardSlotQueries2.driver.executeQuery(-866493598, "SELECT filter_group.token, filter_group.name, filter_group.name_plural\nFROM filter_group\nJOIN filter_for_category ON (filter_for_category.filter_token = filter_group.token)\nJOIN category ON (filter_for_category.category_token = category.token)\nWHERE category.type = ?", function1, 1, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(i5, rewardSlotQueries2, this));
            case 21:
                return ((RewardSlotQueries) transacterImpl).driver.executeQuery(-2055751547, "SELECT token\nFROM filter_group\nWHERE entity_id = ?", function1, 1, new TooltipBoxKt$$ExternalSyntheticLambda2(this, 19));
            case 22:
                return ((GpsConfigQueries) transacterImpl).driver.executeQuery(1232371611, "SELECT offersCollectionDetail.token, offersCollectionDetail.ttl_in_millis, offersCollectionDetail.offers_collection_response\nFROM offersCollectionDetail\nWHERE token = ?", function1, 1, new Overlay$$ExternalSyntheticLambda0(this, i9));
            case 23:
                return ((GpsConfigQueries) transacterImpl).driver.executeQuery(-263295993, "SELECT savingsGoalLocalStatus.token, savingsGoalLocalStatus.met, savingsGoalLocalStatus.celebration_shown, savingsGoalLocalStatus.completion_token, savingsGoalLocalStatus.last_seen_balance, savingsGoalLocalStatus.last_seen_remaining_balance, savingsGoalLocalStatus.last_seen_progress_bps FROM savingsGoalLocalStatus\nWHERE token = ?", function1, 1, new RealSandboxer$$ExternalSyntheticLambda0(this, i6));
            case 24:
                GpsConfigQueries gpsConfigQueries3 = (GpsConfigQueries) transacterImpl;
                return gpsConfigQueries3.driver.executeQuery(-974751777, "SELECT token\nFROM shoppingRecentlyViewed\nWHERE type = ?", function1, 1, new BottomSheet$$ExternalSyntheticLambda3(i7, gpsConfigQueries3, this));
            default:
                return ((StoryQueries) transacterImpl).driver.executeQuery(761614420, "SELECT cardCustomization.path, cardCustomization.customization_bitmap FROM cardCustomization WHERE path = ?", function1, 1, new AlertBannerKt$$ExternalSyntheticLambda3(this, i8));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"offersSheet"}, listener);
                break;
            case 1:
                ((ContactQueries) transacterImpl).driver.removeListener(new String[]{"customer", "contact", "alias", "contact_alias"}, listener);
                break;
            case 2:
                ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"extendedProfileDetails"}, listener);
                break;
            case 3:
                ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"profileAlias"}, listener);
                break;
            case 4:
                ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"scenarioPlan"}, listener);
                break;
            case 5:
                ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"customerStatementType"}, listener);
                break;
            case 6:
                ((SessionQueries) transacterImpl).driver.removeListener(new String[]{"itemizedReceipt"}, listener);
                break;
            case 7:
                ((ContactQueries) transacterImpl).driver.removeListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "invitationEntity", "rewardMerchant"}, listener);
                break;
            case 8:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"paperDepositBarcodeInfo"}, listener);
                break;
            case 9:
                ((StoryQueries) transacterImpl).driver.removeListener(new String[]{"education_story", "education_story_scene_data"}, listener);
                break;
            case 10:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"dependentLastSeenSavingsBalance"}, listener);
                break;
            case 11:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"investing_news_article"}, listener);
                break;
            case 12:
                ((RewardSlotQueries) transacterImpl).driver.removeListener(new String[]{"investing_stocks_portfolio_graph_cache"}, listener);
                break;
            case 13:
                ((InvestmentEntityQueries) transacterImpl).driver.removeListener(new String[]{"investment_entity"}, listener);
                break;
            case 14:
                ((InvestmentEntityQueries) transacterImpl).driver.removeListener(new String[]{"investment_holding"}, listener);
                break;
            case 15:
                ((InvestmentEntityQueries) transacterImpl).driver.removeListener(new String[]{"investment_holding", "investment_entity"}, listener);
                break;
            case 16:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"investment_performance"}, listener);
                break;
            case 17:
                ((CategoryQueries) transacterImpl).driver.removeListener(new String[]{"category", "filter_group", "filter_for_category"}, listener);
                break;
            case 18:
                ((CategoryQueries) transacterImpl).driver.removeListener(new String[]{"category", "entity_in_category"}, listener);
                break;
            case 19:
                ((CategoryQueries) transacterImpl).driver.removeListener(new String[]{"category"}, listener);
                break;
            case 20:
                ((RewardSlotQueries) transacterImpl).driver.removeListener(new String[]{"filter_group", "filter_for_category", "category"}, listener);
                break;
            case 21:
                ((RewardSlotQueries) transacterImpl).driver.removeListener(new String[]{"filter_group"}, listener);
                break;
            case 22:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"offersCollectionDetail"}, listener);
                break;
            case 23:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"savingsGoalLocalStatus"}, listener);
                break;
            case 24:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"shoppingRecentlyViewed"}, listener);
                break;
            default:
                ((StoryQueries) transacterImpl).driver.removeListener(new String[]{"cardCustomization"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "OffersSheet.sq:forSheetKey";
            case 1:
                return "CustomerProfile.sq:customerProfile";
            case 2:
                return "ExtendedProfileDetails.sq:forCustomerToken";
            case 3:
                return "ProfileAlias.sq:forAliasType";
            case 4:
                return "ScenarioPlan.sq:forClientScenario";
            case 5:
                return "CustomerStatementType.sq:selectForType";
            case 6:
                return "ItemizedReceipt.sq:forTransactionToken";
            case 7:
                return "Recipient.sq:recipients";
            case 8:
                return "PhysicalDepositsBarcode.sq:hasValidValue";
            case 9:
                return "Story.sq:selectBySlug";
            case 10:
                return "DependentLastSeenSavingsBalance.sq:getDependentSavingsBalance";
            case 11:
                return "InvestingNewsArticle.sq:articles";
            case 12:
                return "InvestingPortfolioGraphCache.sq:stocks";
            case 13:
                return "InvestmentEntity.sq:forTokens";
            case 14:
                return "InvestmentHolding.sq:forToken";
            case 15:
                return "InvestmentHolding.sq:holdingsForState";
            case 16:
                return "InvestmentPerformance.sq:forEntityToken";
            case 17:
                return "Category.sq:categoryForToken";
            case 18:
                return "Category.sq:nonEmptyCategoriesForType";
            case 19:
                return "Category.sq:token";
            case 20:
                return "FilterGroup.sq:rootFilterGroups";
            case 21:
                return "FilterGroup.sq:token";
            case 22:
                return "OffersCollectionDetail.sq:forToken";
            case 23:
                return "SavingsGoalLocalStatus.sq:getGoalStatus";
            case 24:
                return "ShoppingRecentlyViewed.sq:tokensForType";
            default:
                return "CardCustomization.sq:select";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersSheetQueries$ForSheetKeyQuery(TransacterImpl transacterImpl, Object obj, Function1 function1, int i) {
        super(function1);
        this.$r8$classId = i;
        this.this$0 = transacterImpl;
        this.sheet_key = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(GpsConfigQueries gpsConfigQueries, String str, TooltipBoxKt$$ExternalSyntheticLambda2 tooltipBoxKt$$ExternalSyntheticLambda2) {
        super(tooltipBoxKt$$ExternalSyntheticLambda2);
        this.$r8$classId = 16;
        str.getClass();
        this.this$0 = gpsConfigQueries;
        this.sheet_key = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(InstrumentQueries instrumentQueries, String str, OfflineQueries$$ExternalSyntheticLambda0 offlineQueries$$ExternalSyntheticLambda0) {
        super(offlineQueries$$ExternalSyntheticLambda0);
        this.$r8$classId = 2;
        str.getClass();
        this.this$0 = instrumentQueries;
        this.sheet_key = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(GpsConfigQueries gpsConfigQueries, String str, Overlay$$ExternalSyntheticLambda0 overlay$$ExternalSyntheticLambda0) {
        super(overlay$$ExternalSyntheticLambda0);
        this.$r8$classId = 22;
        str.getClass();
        this.this$0 = gpsConfigQueries;
        this.sheet_key = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(InstrumentQueries instrumentQueries, ClientScenario clientScenario, OfflineQueries$$ExternalSyntheticLambda0 offlineQueries$$ExternalSyntheticLambda0) {
        super(offlineQueries$$ExternalSyntheticLambda0);
        this.$r8$classId = 4;
        clientScenario.getClass();
        this.this$0 = instrumentQueries;
        this.sheet_key = clientScenario;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(GpsConfigQueries gpsConfigQueries, String str, RecipientQueries$$ExternalSyntheticLambda0 recipientQueries$$ExternalSyntheticLambda0) {
        super(recipientQueries$$ExternalSyntheticLambda0);
        this.$r8$classId = 10;
        str.getClass();
        this.this$0 = gpsConfigQueries;
        this.sheet_key = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(SessionQueries sessionQueries, String str, PasswordInfoQueries$$ExternalSyntheticLambda0 passwordInfoQueries$$ExternalSyntheticLambda0) {
        super(passwordInfoQueries$$ExternalSyntheticLambda0);
        this.$r8$classId = 6;
        str.getClass();
        this.this$0 = sessionQueries;
        this.sheet_key = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(ContactQueries contactQueries, String str, OfflineQueries$$ExternalSyntheticLambda0 offlineQueries$$ExternalSyntheticLambda0) {
        super(offlineQueries$$ExternalSyntheticLambda0);
        this.$r8$classId = 1;
        str.getClass();
        this.this$0 = contactQueries;
        this.sheet_key = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(InstrumentQueries instrumentQueries, OfflineQueries$$ExternalSyntheticLambda0 offlineQueries$$ExternalSyntheticLambda0) {
        super(offlineQueries$$ExternalSyntheticLambda0);
        this.$r8$classId = 3;
        UiAlias.Type type2 = UiAlias.Type.EMAIL;
        this.this$0 = instrumentQueries;
        this.sheet_key = type2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(GpsConfigQueries gpsConfigQueries, NewsKind newsKind, TooltipBoxKt$$ExternalSyntheticLambda2 tooltipBoxKt$$ExternalSyntheticLambda2) {
        super(tooltipBoxKt$$ExternalSyntheticLambda2);
        this.$r8$classId = 11;
        newsKind.getClass();
        this.this$0 = gpsConfigQueries;
        this.sheet_key = newsKind;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(RewardSlotQueries rewardSlotQueries, HistoricalRange historicalRange, InvestingPortfolioGraphCacheQueries$$ExternalSyntheticLambda4 investingPortfolioGraphCacheQueries$$ExternalSyntheticLambda4) {
        super(investingPortfolioGraphCacheQueries$$ExternalSyntheticLambda4);
        this.$r8$classId = 12;
        historicalRange.getClass();
        this.this$0 = rewardSlotQueries;
        this.sheet_key = historicalRange;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(GpsConfigQueries gpsConfigQueries, OfferSheetKey offerSheetKey, Overlay$$ExternalSyntheticLambda0 overlay$$ExternalSyntheticLambda0) {
        super(overlay$$ExternalSyntheticLambda0);
        this.$r8$classId = 0;
        offerSheetKey.getClass();
        this.this$0 = gpsConfigQueries;
        this.sheet_key = offerSheetKey;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(GpsConfigQueries gpsConfigQueries, RealSheetState$$ExternalSyntheticLambda0 realSheetState$$ExternalSyntheticLambda0) {
        super(realSheetState$$ExternalSyntheticLambda0);
        this.$r8$classId = 24;
        Metadata.EntityType entityType = Metadata.EntityType.AP_STORE;
        this.this$0 = gpsConfigQueries;
        this.sheet_key = entityType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(RewardSlotQueries rewardSlotQueries, MerchantBlockingViewKt$$ExternalSyntheticLambda15 merchantBlockingViewKt$$ExternalSyntheticLambda15) {
        super(merchantBlockingViewKt$$ExternalSyntheticLambda15);
        this.$r8$classId = 20;
        SyncInvestmentCategory.CategoryType categoryType = SyncInvestmentCategory.CategoryType.TOP_LEVEL_UI;
        this.this$0 = rewardSlotQueries;
        this.sheet_key = categoryType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(GpsConfigQueries gpsConfigQueries, String str, RealSandboxer$$ExternalSyntheticLambda0 realSandboxer$$ExternalSyntheticLambda0) {
        super(realSandboxer$$ExternalSyntheticLambda0);
        this.$r8$classId = 23;
        str.getClass();
        this.this$0 = gpsConfigQueries;
        this.sheet_key = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(CategoryQueries categoryQueries, MerchantBlockingViewKt$$ExternalSyntheticLambda15 merchantBlockingViewKt$$ExternalSyntheticLambda15) {
        super(merchantBlockingViewKt$$ExternalSyntheticLambda15);
        this.$r8$classId = 18;
        SyncInvestmentCategory.CategoryType categoryType = SyncInvestmentCategory.CategoryType.CATEGORY;
        this.this$0 = categoryQueries;
        this.sheet_key = categoryType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(RewardSlotQueries rewardSlotQueries, String str, FilterGroupQueries$$ExternalSyntheticLambda0 filterGroupQueries$$ExternalSyntheticLambda0) {
        super(filterGroupQueries$$ExternalSyntheticLambda0);
        this.$r8$classId = 21;
        str.getClass();
        this.this$0 = rewardSlotQueries;
        this.sheet_key = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(CategoryQueries categoryQueries, CategoryToken categoryToken, CategoryQueries$$ExternalSyntheticLambda4 categoryQueries$$ExternalSyntheticLambda4) {
        super(categoryQueries$$ExternalSyntheticLambda4);
        this.$r8$classId = 17;
        categoryToken.getClass();
        this.this$0 = categoryQueries;
        this.sheet_key = categoryToken;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(CategoryQueries categoryQueries, String str, CategoryQueries$$ExternalSyntheticLambda4 categoryQueries$$ExternalSyntheticLambda4) {
        super(categoryQueries$$ExternalSyntheticLambda4);
        this.$r8$classId = 19;
        str.getClass();
        this.this$0 = categoryQueries;
        this.sheet_key = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(InvestmentEntityQueries investmentEntityQueries, String str, InvestmentHoldingQueries$$ExternalSyntheticLambda5 investmentHoldingQueries$$ExternalSyntheticLambda5) {
        super(investmentHoldingQueries$$ExternalSyntheticLambda5);
        this.$r8$classId = 14;
        str.getClass();
        this.this$0 = investmentEntityQueries;
        this.sheet_key = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(InvestmentEntityQueries investmentEntityQueries, InvestmentHoldingQueries$$ExternalSyntheticLambda5 investmentHoldingQueries$$ExternalSyntheticLambda5) {
        super(investmentHoldingQueries$$ExternalSyntheticLambda5);
        this.$r8$classId = 15;
        SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState = SyncInvestmentHolding.InvestmentHoldingState.FOLLOWED;
        this.this$0 = investmentEntityQueries;
        this.sheet_key = investmentHoldingState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetQueries$ForSheetKeyQuery(InvestmentEntityQueries investmentEntityQueries, Collection collection, InvestmentEntityQueries$$ExternalSyntheticLambda7 investmentEntityQueries$$ExternalSyntheticLambda7) {
        super(investmentEntityQueries$$ExternalSyntheticLambda7);
        this.$r8$classId = 13;
        collection.getClass();
        this.this$0 = investmentEntityQueries;
        this.sheet_key = collection;
    }
}
