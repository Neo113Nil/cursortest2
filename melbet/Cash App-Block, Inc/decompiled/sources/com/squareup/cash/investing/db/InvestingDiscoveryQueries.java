package com.squareup.cash.investing.db;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class InvestingDiscoveryQueries extends TransacterImpl {
    public final zzlj investment_entityAdapter;

    /* loaded from: classes6.dex */
    public final class SelectDiscoveriesQuery extends Query {
        public final boolean in_search_category;

        public SelectDiscoveriesQuery(boolean z, TooltipBoxKt$$ExternalSyntheticLambda2 tooltipBoxKt$$ExternalSyntheticLambda2) {
            super(tooltipBoxKt$$ExternalSyntheticLambda2);
            this.in_search_category = z;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(Query.Listener listener) {
            InvestingDiscoveryQueries.this.driver.addListener(new String[]{"investing_discovery", "investment_entity"}, listener);
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult execute(Function1 function1) {
            return InvestingDiscoveryQueries.this.driver.executeQuery(-1139012264, "SELECT token,\n  display_name,\n  icon_url,\n  category,\n  category_index,\n  category_description,\n  in_search_suggestion,\n  in_search_category,\n  id,\n  symbol,\n  color,\n  delisted,\n  entity_color,\n  icon,\n  outstanding_shares,\n  release_stage\nFROM investing_discovery\nJOIN investment_entity ON (investment_entity_token = token)\nWHERE in_search_category = ?", function1, 1, new TooltipBoxKt$$ExternalSyntheticLambda2(this, 7));
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(Query.Listener listener) {
            listener.getClass();
            InvestingDiscoveryQueries.this.driver.removeListener(new String[]{"investing_discovery", "investment_entity"}, listener);
        }

        public final String toString() {
            return "InvestingDiscovery.sq:selectDiscoveries";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingDiscoveryQueries(AndroidSqliteDriver androidSqliteDriver, zzlj zzljVar, int i) {
        super(androidSqliteDriver);
        zzljVar.getClass();
        switch (i) {
            case 1:
                super(androidSqliteDriver);
                this.investment_entityAdapter = zzljVar;
                break;
            default:
                this.investment_entityAdapter = zzljVar;
                break;
        }
    }

    public void insert(String str, long j, String str2, String str3, Boolean bool, boolean z) {
        str.getClass();
        str2.getClass();
        this.driver.execute(1738549459, "INSERT OR REPLACE INTO investing_discovery\nVALUES (?, ?, ?, ?, ?, ?)", new InvestingDiscoveryQueries$$ExternalSyntheticLambda0(str, j, str2, str3, bool, z));
        notifyQueries(1738549459, new InvestmentEntityQueries$$ExternalSyntheticLambda1(14));
    }
}
