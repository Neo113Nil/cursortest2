package com.squareup.cash.gps.db;

import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import coil3.ImageLoader$Builder;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.cash.db2.StampsConfig;
import com.squareup.cash.investing.db.InvestingSettingsQueries$select$2;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.common.Money;
import papa.internal.LaunchTracker;

/* loaded from: classes.dex */
public final class GpsConfigQueries extends TransacterImpl {
    public final Object gpsConfigAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsConfigQueries(AndroidSqliteDriver androidSqliteDriver, BlockersConfig.Adapter adapter) {
        super(androidSqliteDriver);
        adapter.getClass();
        this.gpsConfigAdapter = adapter;
    }

    public QueryResult insertOrReplace(OfferSheetKey offerSheetKey, Long l, OffersSheetResponse offersSheetResponse, OfferType offerType) {
        offerSheetKey.getClass();
        offersSheetResponse.getClass();
        QueryResult execute = this.driver.execute(840085913, "INSERT OR REPLACE INTO offersSheet\nVALUES (?, ?, ?, ?)", new OverlayKt$$ExternalSyntheticLambda3(this, offerSheetKey, l, offersSheetResponse, offerType, 23));
        notifyQueries(840085913, new OffersHomeQueries$$ExternalSyntheticLambda1(25));
        return execute;
    }

    public Query select$2() {
        InvestingSettingsQueries$select$2 investingSettingsQueries$select$2 = InvestingSettingsQueries$select$2.INSTANCE;
        TooltipBoxKt$$ExternalSyntheticLambda2 tooltipBoxKt$$ExternalSyntheticLambda2 = new TooltipBoxKt$$ExternalSyntheticLambda2(this, (char) 0);
        SqlDriver sqlDriver = this.driver;
        sqlDriver.getClass();
        return new SimpleQuery(-1537276463, new String[]{"investing_settings"}, sqlDriver, "InvestingSettings.sq", "select", "SELECT investing_settings.purchase_limit, investing_settings.sell_limit, investing_settings.equities_discovery_url, investing_settings.bitcoin_discovery_url, investing_settings.disclosures_web_url, investing_settings.my_watchlist_description, investing_settings.crypto_disclosure_url, investing_settings.my_first_stock_configuration, investing_settings.equities_discovery_stock_tiles, investing_settings.my_first_bitcoin_configuration, investing_settings.min_scheduled_btc_buy_amt, investing_settings.min_scheduled_stock_buy_amt, investing_settings.custom_order_configuration, investing_settings.first_time_congrats_equity_title, investing_settings.first_time_congrats_equity_text, investing_settings.first_time_congrats_equity_detail_title, investing_settings.first_time_congrats_equity_detail_text, investing_settings.first_time_congrats_bitcoin_title, investing_settings.first_time_congrats_bitcoin_text, investing_settings.bitcoin_investment_entity_token, investing_settings.trusted_contact_enabled, investing_settings.investing_home_disclosure_text, investing_settings.entity_details_disclosure_text, investing_settings.documents_disclosure_text, investing_settings.drip_disclosure_text\nFROM investing_settings", tooltipBoxKt$$ExternalSyntheticLambda2);
    }

    public void setGoalCelebrated(String str, String str2) {
        str.getClass();
        this.driver.execute(467339038, "INSERT OR REPLACE INTO savingsGoalLocalStatus(\n  token,\n  completion_token,\n  met,\n  celebration_shown,\n  last_seen_balance,\n  last_seen_remaining_balance,\n  last_seen_progress_bps\n)\n-- If we've celebrated it, it's been met; therefore if for whatever reason it hasn't been marked\n-- as `met`, do it now.\nVALUES (\n  ?,\n  ?,\n  1,\n  1,\n  (SELECT last_seen_balance FROM savingsGoalLocalStatus WHERE token = ?),\n  (SELECT last_seen_remaining_balance FROM savingsGoalLocalStatus WHERE token = ?),\n  (SELECT last_seen_progress_bps FROM savingsGoalLocalStatus WHERE token = ?)\n)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str, str2, 26));
        notifyQueries(467339038, new CelebrationKt$$ExternalSyntheticLambda1(18));
    }

    public void setLastSeenValues(String str, Money money, Money money2, Long l) {
        str.getClass();
        this.driver.execute(-540341023, "INSERT OR REPLACE INTO savingsGoalLocalStatus(\ntoken, completion_token, met, celebration_shown, last_seen_balance, last_seen_remaining_balance, last_seen_progress_bps)\nVALUES (\n  ?,\n  (SELECT completion_token FROM savingsGoalLocalStatus WHERE token = ?),\n  (SELECT met FROM savingsGoalLocalStatus WHERE token = ?),\n  (SELECT celebration_shown FROM savingsGoalLocalStatus WHERE token = ?),\n  ?,\n  ?,\n  ?\n)", new OverlayKt$$ExternalSyntheticLambda3(str, money, money2, l, this, 25));
        notifyQueries(-540341023, new CelebrationKt$$ExternalSyntheticLambda1(17));
    }

    public /* synthetic */ GpsConfigQueries(AndroidSqliteDriver androidSqliteDriver, Object obj) {
        super(androidSqliteDriver);
        this.gpsConfigAdapter = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsConfigQueries(AndroidSqliteDriver androidSqliteDriver, Local_tab_content.Adapter adapter, boolean z) {
        super(androidSqliteDriver);
        adapter.getClass();
        this.gpsConfigAdapter = adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsConfigQueries(AndroidSqliteDriver androidSqliteDriver, RecipientConfig$Adapter recipientConfig$Adapter) {
        super(androidSqliteDriver);
        recipientConfig$Adapter.getClass();
        this.gpsConfigAdapter = recipientConfig$Adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsConfigQueries(AndroidSqliteDriver androidSqliteDriver, StampsConfig.Adapter adapter) {
        super(androidSqliteDriver);
        adapter.getClass();
        this.gpsConfigAdapter = adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsConfigQueries(AndroidSqliteDriver androidSqliteDriver, Local_tab_content.Adapter adapter) {
        super(androidSqliteDriver);
        adapter.getClass();
        this.gpsConfigAdapter = adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsConfigQueries(AndroidSqliteDriver androidSqliteDriver, LaunchTracker launchTracker) {
        super(androidSqliteDriver);
        launchTracker.getClass();
        this.gpsConfigAdapter = launchTracker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsConfigQueries(AndroidSqliteDriver androidSqliteDriver, ImageLoader$Builder imageLoader$Builder) {
        super(androidSqliteDriver);
        imageLoader$Builder.getClass();
        this.gpsConfigAdapter = imageLoader$Builder;
    }
}
