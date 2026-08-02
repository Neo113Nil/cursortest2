package com.squareup.cash.investing.db.categories;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes6.dex */
public final class CategorySearchQueries$PerformSearchQuery extends Query {
    public final String filter_string;
    public final SyncInvestmentFilterGroup.JoinType intersection_type;
    public final InvestmentEntityStatus invalid_status;
    public final String search;
    public final /* synthetic */ RewardSlotQueries this$0;
    public final SyncInvestmentEntity.ReleaseStage valid_released_stage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategorySearchQueries$PerformSearchQuery(RewardSlotQueries rewardSlotQueries, String str, String str2, TooltipBoxKt$$ExternalSyntheticLambda2 tooltipBoxKt$$ExternalSyntheticLambda2) {
        super(tooltipBoxKt$$ExternalSyntheticLambda2);
        SyncInvestmentFilterGroup.JoinType joinType = SyncInvestmentFilterGroup.JoinType.INTERSECTION;
        InvestmentEntityStatus investmentEntityStatus = InvestmentEntityStatus.INACTIVE;
        SyncInvestmentEntity.ReleaseStage releaseStage = SyncInvestmentEntity.ReleaseStage.PREVIEW_FOR_IPO;
        str.getClass();
        this.this$0 = rewardSlotQueries;
        this.filter_string = str;
        this.intersection_type = joinType;
        this.search = str2;
        this.invalid_status = investmentEntityStatus;
        this.valid_released_stage = releaseStage;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        this.this$0.driver.addListener(new String[]{"entity_in_category", "filter_group", "investment_entity", "investing_search"}, listener);
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        RewardSlotQueries rewardSlotQueries = this.this$0;
        return rewardSlotQueries.driver.executeQuery(null, StringsKt__IndentKt.trimMargin$default("\n    |WITH RECURSIVE\n    |-- This query splits the string :filter_string by spaces and counts how many splits it performs.\n    |-- The resulting table will have each filter on its own row, as well as the number of filters up\n    |-- to that point (word, counter). The (str) column is the remaining text to split.\n    |filter_split(filter, str, counter) AS (\n    |    SELECT '', ? || ' ', 0\n    |    UNION ALL SELECT\n    |      substr(str, 0, instr(str, ' ')),\n    |      substr(str, instr(str, ' ') + 1),\n    |      counter + 1\n    |    FROM filter_split WHERE str != ''\n    |),\n    |-- This query results in a table like this:\n    |-- filter_token | category_tokens_string\n    |-- -------------+-----------------------\n    |-- filter1      | token1,token2\n    |-- filter2      | token3,token4\n    |-- -------------+-----------------------\n    |filters(filter_token, category_tokens_string) AS (\n    |  SELECT substr(filter, 0, instr(filter, ',')),\n    |         substr(filter, instr(filter, ',') + 1)\n    |  FROM filter_split\n    |  WHERE filter != ''\n    |),\n    |-- This table has exactly one row with the number of filters.\n    |numFilters AS (SELECT counter FROM filter_split WHERE str == ''),\n    |-- This query splits the category_tokens_string (token1,token2) by commas.\n    |category_token_split (filter_token, category_token, str, counter) AS (\n    |  SELECT filter_token, '', category_tokens_string || ',', 0\n    |  FROM filters\n    |UNION ALL SELECT\n    |  filter_token,\n    |  substr(str, 0, instr(str, ',')),\n    |  substr(str, instr(str, ',') + 1),\n    |\tcounter + 1\n    |FROM category_token_split WHERE str != ''\n    |),\n    |-- This table has one row for each category token.\n    |category_tokens (filter_token, category_token) AS (SELECT filter_token, category_token FROM category_token_split WHERE category_token != ''),\n    |-- This table has exactly one row with the number of categories.\n    |numCategories AS (SELECT filter_token, counter FROM category_token_split WHERE str == ''),\n    |\n    |-- This is the one that matters, at this point we have a table which contains filter tokens\n    |-- and the entities that match that filter!\n    |entitiesInFilters AS (\n    |  SELECT filter_token, entity_token\n    |  FROM entity_in_category\n    |  JOIN category_tokens USING(category_token)\n    |  LEFT JOIN filter_group ON (filter_group.token = filter_token)\n    |  GROUP BY filter_token, entity_token HAVING CASE\n    |    WHEN filter_group.join_type " + (this.intersection_type == null ? "IS" : "==") + " ? THEN count(*) = (SELECT counter FROM numCategories WHERE numCategories.filter_token = filter_group.token)\n    |    ELSE 1\n    |  END\n    |)\n    |\n    |SELECT investment_entity.id, investment_entity.token, investment_entity.symbol, investment_entity.type, investment_entity.display_name, investment_entity.icon_url, investment_entity.outstanding_shares, investment_entity.color, investment_entity.status, investment_entity.about_text, investment_entity.about_detail_rows, investment_entity.search_ordering, investment_entity.delisted, investment_entity.entity_color, investment_entity.icon, investment_entity.release_stage\n    |FROM entitiesInFilters\n    |JOIN investment_entity ON (entitiesInFilters.entity_token = investment_entity.token)\n    |WHERE (? == '' OR investment_entity.rowid IN (\n    |  SELECT docid\n    |  FROM investing_search\n    |  WHERE content MATCH ? || '*'\n    |))\n    |AND (status != ? OR release_stage " + (this.valid_released_stage == null ? "IS" : "==") + " ?)\n    |GROUP BY investment_entity.token HAVING (count(*) = (SELECT numFilters.counter FROM numFilters))\n    |ORDER BY symbol == ? COLLATE NOCASE DESC,\n    |  display_name == ? COLLATE NOCASE DESC,\n    |  investment_entity.search_ordering IS NOT NULL DESC,\n    |  investment_entity.search_ordering ASC\n    "), function1, 8, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(16, this, rewardSlotQueries));
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        listener.getClass();
        this.this$0.driver.removeListener(new String[]{"entity_in_category", "filter_group", "investment_entity", "investing_search"}, listener);
    }

    public final String toString() {
        return "CategorySearch.sq:performSearch";
    }
}
