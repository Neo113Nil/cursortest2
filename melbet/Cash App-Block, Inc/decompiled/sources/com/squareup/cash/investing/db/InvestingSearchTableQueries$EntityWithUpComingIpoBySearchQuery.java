package com.squareup.cash.investing.db;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class InvestingSearchTableQueries$EntityWithUpComingIpoBySearchQuery extends Query {
    public final InvestmentEntityStatus invalid_status;
    public final String search;
    public final /* synthetic */ InvestingDiscoveryQueries this$0;
    public final SyncInvestmentEntity.ReleaseStage valid_released_stage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingSearchTableQueries$EntityWithUpComingIpoBySearchQuery(InvestingDiscoveryQueries investingDiscoveryQueries, String str, InvestingSearchTableQueries$$ExternalSyntheticLambda0 investingSearchTableQueries$$ExternalSyntheticLambda0) {
        super(investingSearchTableQueries$$ExternalSyntheticLambda0);
        InvestmentEntityStatus investmentEntityStatus = InvestmentEntityStatus.INACTIVE;
        SyncInvestmentEntity.ReleaseStage releaseStage = SyncInvestmentEntity.ReleaseStage.PREVIEW_FOR_IPO;
        this.this$0 = investingDiscoveryQueries;
        this.invalid_status = investmentEntityStatus;
        this.valid_released_stage = releaseStage;
        this.search = str;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        this.this$0.driver.addListener(new String[]{"investment_entity", "investing_search"}, listener);
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        InvestingDiscoveryQueries investingDiscoveryQueries = this.this$0;
        return investingDiscoveryQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT investment_entity.id, investment_entity.token, investment_entity.symbol, investment_entity.type, investment_entity.display_name, investment_entity.icon_url, investment_entity.outstanding_shares, investment_entity.color, investment_entity.status, investment_entity.about_text, investment_entity.about_detail_rows, investment_entity.search_ordering, investment_entity.delisted, investment_entity.entity_color, investment_entity.icon, investment_entity.release_stage\n    |FROM investment_entity\n    |JOIN investing_search ON (investment_entity.rowid = docid AND (status != ? OR release_stage ", this.valid_released_stage == null ? "IS" : "==", " ?))\n    |WHERE content MATCH ? || '*'\n    |ORDER BY\n    |  (content LIKE ? || '%') + -- Symbols which start with the search term\n    |  (content LIKE '% ' || ? || '%') * 10 + -- Names which start with the search term (weighted more).\n    |  (content LIKE ? || ' %') * 20 -- Symbols that match exactly to the search term (weighted the highest)\n    |  DESC\n    "), function1, 6, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(7, investingDiscoveryQueries, this));
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        listener.getClass();
        this.this$0.driver.removeListener(new String[]{"investment_entity", "investing_search"}, listener);
    }

    public final String toString() {
        return "InvestingSearchTable.sq:entityWithUpComingIpoBySearch";
    }
}
