package com.squareup.cash.offers.db;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.zipline.loader.internal.cache.FilesQueries;
import bo.app.xg$$ExternalSyntheticLambda9;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.education.stories.db.StoryQueries;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class OffersHomeQueries$ForIdQuery extends Query {
    public final /* synthetic */ int $r8$classId;
    public final long id;
    public final /* synthetic */ TransacterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersHomeQueries$ForIdQuery(StoryQueries storyQueries, RealSheetState$$ExternalSyntheticLambda0 realSheetState$$ExternalSyntheticLambda0) {
        super(realSheetState$$ExternalSyntheticLambda0);
        this.$r8$classId = 8;
        this.this$0 = storyQueries;
        this.id = 3L;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"offersHome"}, listener);
                break;
            case 1:
                ((FilesQueries) transacterImpl).driver.addListener(new String[]{"files"}, listener);
                break;
            case 2:
                ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"afterpayApplet"}, listener);
                break;
            case 3:
                ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"pendingPayment"}, listener);
                break;
            case 4:
                ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"pendingTransfer"}, listener);
                break;
            case 5:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"offersSearch"}, listener);
                break;
            case 6:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"shopInfoDetails"}, listener);
                break;
            case 7:
                ((RewardSlotQueries) transacterImpl).driver.addListener(new String[]{"productsResultsItem"}, listener);
                break;
            case 8:
                ((StoryQueries) transacterImpl).driver.addListener(new String[]{"shoppingRecentSearches"}, listener);
                break;
            default:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"shoppingRecentlyViewed"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        int i2 = 15;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                return ((GpsConfigQueries) transacterImpl).driver.executeQuery(-332861591, "SELECT offersHome.id, offersHome.ttl_in_millis, offersHome.offers_home_response\nFROM offersHome\nWHERE id = ?", function1, 1, new Overlay$$ExternalSyntheticLambda0(this, 20));
            case 1:
                return ((FilesQueries) transacterImpl).driver.executeQuery(-1770413352, "SELECT files.id, files.sha256_hex, files.manifest_for_application_name, files.file_state, files.size_bytes, files.last_used_at_epoch_ms, files.fresh_at_epoch_ms\nFROM files\nWHERE id = ?\nLIMIT 1", function1, 1, new xg$$ExternalSyntheticLambda9(this, 7));
            case 2:
                return ((LocalTabContentQueries) transacterImpl).driver.executeQuery(-1247124336, "SELECT afterpayApplet.key, afterpayApplet.ttl_in_millis, afterpayApplet.afterpay_applet_response\nFROM afterpayApplet\nWHERE key = ?\nLIMIT 1", function1, 1, new ContextKt$$ExternalSyntheticLambda1(this, 4));
            case 3:
                return ((InstrumentQueries) transacterImpl).driver.executeQuery(1833123843, "SELECT pendingPayment.external_id, pendingPayment.created_at, pendingPayment.retry_at, pendingPayment.retry_count, pendingPayment.request, pendingPayment.amount, pendingPayment.orientation, pendingPayment.succeeded, pendingPayment.recipients, pendingPayment.invest_payment_data, pendingPayment.client_scenario, pendingPayment.personalization, pendingPayment.ready_for_removal\nFROM pendingPayment\nWHERE retry_at <= ?\nAND succeeded = 0", function1, 1, new OfflineQueries$$ExternalSyntheticLambda0(this, 12));
            case 4:
                return ((InstrumentQueries) transacterImpl).driver.executeQuery(-1745599883, "SELECT pendingTransfer.external_id, pendingTransfer.created_at, pendingTransfer.retry_at, pendingTransfer.retry_count, pendingTransfer.request, pendingTransfer.succeeded, pendingTransfer.type, pendingTransfer.ready_for_removal, pendingTransfer.first_error_request_created_at, pendingTransfer.first_error_response_created_at, pendingTransfer.first_error_response_reason\nFROM pendingTransfer\nWHERE retry_at <= ?\nAND succeeded = 0", function1, 1, new OfflineQueries$$ExternalSyntheticLambda0(this, i2));
            case 5:
                return ((GpsConfigQueries) transacterImpl).driver.executeQuery(1469494336, "SELECT offersSearch.id, offersSearch.offers_search_response, offersSearch.expire_at_ms, offersSearch.last_updated\nFROM offersSearch\nWHERE id = ?", function1, 1, new Overlay$$ExternalSyntheticLambda0(this, 22));
            case 6:
                return ((GpsConfigQueries) transacterImpl).driver.executeQuery(-1923347392, "SELECT shopInfoDetails.id, shopInfoDetails.ttl_in_millis, shopInfoDetails.shop_info_response\nFROM shopInfoDetails\nWHERE id = ?", function1, 1, new RealSandboxer$$ExternalSyntheticLambda0(this, 13));
            case 7:
                return ((RewardSlotQueries) transacterImpl).driver.executeQuery(-683482881, "SELECT productsResultsItem.id, productsResultsItem.sectionId, productsResultsItem.position, productsResultsItem.title, productsResultsItem.subtitle, productsResultsItem.captionLeft, productsResultsItem.captionRight, productsResultsItem.actionUrl, productsResultsItem.picture, productsResultsItem.metadata\nFROM productsResultsItem\nWHERE sectionId = ?\nORDER BY position ASC", function1, 1, new RealSandboxer$$ExternalSyntheticLambda0(this, 14));
            case 8:
                return ((StoryQueries) transacterImpl).driver.executeQuery(-2086964576, "SELECT search_text\nFROM shoppingRecentSearches\nORDER BY updated_at DESC\nLIMIT ?", function1, 1, new RealSandboxer$$ExternalSyntheticLambda0(this, i2));
            default:
                return ((GpsConfigQueries) transacterImpl).driver.executeQuery(-2037895978, "SELECT shoppingRecentlyViewed.token, shoppingRecentlyViewed.title, shoppingRecentlyViewed.light_image_url, shoppingRecentlyViewed.dark_image_url, shoppingRecentlyViewed.action_url, shoppingRecentlyViewed.updated_at, shoppingRecentlyViewed.accent_color, shoppingRecentlyViewed.subtitle, shoppingRecentlyViewed.type, shoppingRecentlyViewed.imageType\nFROM shoppingRecentlyViewed\nORDER BY updated_at DESC\nLIMIT ?", function1, 1, new RealSandboxer$$ExternalSyntheticLambda0(this, 17));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"offersHome"}, listener);
                break;
            case 1:
                ((FilesQueries) transacterImpl).driver.removeListener(new String[]{"files"}, listener);
                break;
            case 2:
                ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"afterpayApplet"}, listener);
                break;
            case 3:
                ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"pendingPayment"}, listener);
                break;
            case 4:
                ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"pendingTransfer"}, listener);
                break;
            case 5:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"offersSearch"}, listener);
                break;
            case 6:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"shopInfoDetails"}, listener);
                break;
            case 7:
                ((RewardSlotQueries) transacterImpl).driver.removeListener(new String[]{"productsResultsItem"}, listener);
                break;
            case 8:
                ((StoryQueries) transacterImpl).driver.removeListener(new String[]{"shoppingRecentSearches"}, listener);
                break;
            default:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"shoppingRecentlyViewed"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "OffersHome.sq:forId";
            case 1:
                return "Files.sq:getById";
            case 2:
                return "AfterpayApplet.sq:forKey";
            case 3:
                return "PendingPayment.sq:paymentsToRetry";
            case 4:
                return "PendingTransfer.sq:transfersToRetry";
            case 5:
                return "OffersSearch.sq:forId";
            case 6:
                return "ShopInfoDetails.sq:forId";
            case 7:
                return "ShopProductsSearch.sq:itemsForSectionId";
            case 8:
                return "ShoppingRecentSearches.sq:recentSearches";
            default:
                return "ShoppingRecentlyViewed.sq:recentlyViewed";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersHomeQueries$ForIdQuery(TransacterImpl transacterImpl, Function1 function1, int i) {
        super(function1);
        this.$r8$classId = i;
        this.this$0 = transacterImpl;
        this.id = 1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersHomeQueries$ForIdQuery(TransacterImpl transacterImpl, long j, Function1 function1, int i) {
        super(function1);
        this.$r8$classId = i;
        this.this$0 = transacterImpl;
        this.id = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersHomeQueries$ForIdQuery(GpsConfigQueries gpsConfigQueries, RealSandboxer$$ExternalSyntheticLambda0 realSandboxer$$ExternalSyntheticLambda0) {
        super(realSandboxer$$ExternalSyntheticLambda0);
        this.$r8$classId = 9;
        this.this$0 = gpsConfigQueries;
        this.id = 9L;
    }
}
