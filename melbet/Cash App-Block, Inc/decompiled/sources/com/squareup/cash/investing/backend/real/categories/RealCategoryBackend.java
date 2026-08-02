package com.squareup.cash.investing.backend.real.categories;

import androidx.room.util.DBUtil;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries;
import com.squareup.cash.investing.db.categories.CategoryQueries;
import com.squareup.cash.investing.db.categories.CategoryQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.db.categories.CategoryQueries$categoryForToken$2;
import com.squareup.cash.investing.db.categories.FilterGroupQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.db.categories.FilterGroupQueries$MapForTokenQuery;
import com.squareup.cash.investing.db.categories.FilterGroupQueries$filterGroupForToken$2;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes6.dex */
public final class RealCategoryBackend {
    public final CategoryQueries categoryQueries;
    public final CategoryQueries entityInCategoryQueries;
    public final RealEntityPriceRefresher entityPriceRefresher;
    public final RewardSlotQueries filterGroupQueries;
    public final InvestingDiscoveryQueries investingSearchQueries;
    public final CoroutineContext ioDispatcher;
    public final RewardSlotQueries searchQueries;

    public RealCategoryBackend(RealEntityPriceRefresher realEntityPriceRefresher, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.entityPriceRefresher = realEntityPriceRefresher;
        this.ioDispatcher = coroutineContext;
        this.categoryQueries = cashAccountDatabaseImpl.categoryQueries;
        this.entityInCategoryQueries = cashAccountDatabaseImpl.entityInCategoryQueries;
        this.investingSearchQueries = cashAccountDatabaseImpl.investingSearchTableQueries;
        this.filterGroupQueries = cashAccountDatabaseImpl.filterGroupQueries;
        this.searchQueries = cashAccountDatabaseImpl.categorySearchQueries;
    }

    public final RealContactRepository$contacts$$inlined$map$1 categoryDetails(CategoryToken categoryToken) {
        categoryToken.getClass();
        CategoryQueries categoryQueries = this.categoryQueries;
        categoryQueries.getClass();
        CategoryQueries$categoryForToken$2 categoryQueries$categoryForToken$2 = CategoryQueries$categoryForToken$2.INSTANCE;
        return new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(categoryQueries, categoryToken, new CategoryQueries$$ExternalSyntheticLambda4(categoryQueries, 1))), this.ioDispatcher), 16);
    }

    public final RealContactRepository$contacts$$inlined$map$1 filterDetails(FilterToken filterToken) {
        filterToken.getClass();
        RewardSlotQueries rewardSlotQueries = this.filterGroupQueries;
        rewardSlotQueries.getClass();
        FilterGroupQueries$filterGroupForToken$2 filterGroupQueries$filterGroupForToken$2 = FilterGroupQueries$filterGroupForToken$2.INSTANCE;
        return new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new FilterGroupQueries$MapForTokenQuery(rewardSlotQueries, filterToken, new FilterGroupQueries$$ExternalSyntheticLambda0(rewardSlotQueries, 1))), this.ioDispatcher), 17);
    }

    public final FlowQuery$mapToList$$inlined$map$1 rootCategories() {
        UiAlias.Type.Companion companion = SyncInvestmentCategory.CategoryType.Companion;
        RealCategoryBackend$$ExternalSyntheticLambda1 realCategoryBackend$$ExternalSyntheticLambda1 = new RealCategoryBackend$$ExternalSyntheticLambda1(1);
        CategoryQueries categoryQueries = this.categoryQueries;
        categoryQueries.getClass();
        return DBUtil.mapToList(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(categoryQueries, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(12, realCategoryBackend$$ExternalSyntheticLambda1, categoryQueries))), this.ioDispatcher);
    }
}
