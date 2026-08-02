package com.squareup.cash.investing.db.categories;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class FilterGroupQueries$MapForTokenQuery extends Query {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ RewardSlotQueries this$0;
    public final FilterToken token;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterGroupQueries$MapForTokenQuery(RewardSlotQueries rewardSlotQueries, FilterToken filterToken, FilterGroupQueries$$ExternalSyntheticLambda0 filterGroupQueries$$ExternalSyntheticLambda0) {
        super(filterGroupQueries$$ExternalSyntheticLambda0);
        filterToken.getClass();
        this.this$0 = rewardSlotQueries;
        this.token = filterToken;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        RewardSlotQueries rewardSlotQueries = this.this$0;
        switch (i) {
            case 0:
                rewardSlotQueries.driver.addListener(new String[]{"filter_group"}, listener);
                break;
            default:
                rewardSlotQueries.driver.addListener(new String[]{"filter_group", "category", "category_in_filter_group"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        RewardSlotQueries rewardSlotQueries = this.this$0;
        switch (i) {
            case 0:
                return rewardSlotQueries.driver.executeQuery(628729272, "SELECT category_map\nFROM filter_group\nWHERE token = ?", function1, 1, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(22, rewardSlotQueries, this));
            default:
                return rewardSlotQueries.driver.executeQuery(1794744131, "SELECT filter_group.token AS filterToken,\n       filter_group.name AS filterName,\n       filter_group.subfilters,\n       filter_group.category_map,\n       category.id AS categoryId,\n       category.name AS categoryName,\n       category.token AS categoryToken,\n       category.image_url,\n       category.category_color,\n       category.type,\n       category.description,\n       category.filter_description,\n       category.prefix_icon,\n       category.accent_color\nFROM filter_group\nLEFT JOIN category_in_filter_group ON (category_in_filter_group.filter_group_token = filter_group.token)\nLEFT JOIN category ON (category_in_filter_group.category_token = category.token)\nWHERE filter_group.token = ?\nORDER BY category_in_filter_group.rowid", function1, 1, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(21, rewardSlotQueries, this));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        RewardSlotQueries rewardSlotQueries = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                rewardSlotQueries.driver.removeListener(new String[]{"filter_group"}, listener);
                break;
            default:
                rewardSlotQueries.driver.removeListener(new String[]{"filter_group", "category", "category_in_filter_group"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "FilterGroup.sq:mapForToken";
            default:
                return "FilterGroup.sq:filterGroupForToken";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterGroupQueries$MapForTokenQuery(RewardSlotQueries rewardSlotQueries, FilterToken filterToken, FilterGroupQueries$$ExternalSyntheticLambda0 filterGroupQueries$$ExternalSyntheticLambda0, byte b) {
        super(filterGroupQueries$$ExternalSyntheticLambda0);
        filterToken.getClass();
        this.this$0 = rewardSlotQueries;
        this.token = filterToken;
    }
}
