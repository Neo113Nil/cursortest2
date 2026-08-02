package com.squareup.cash.investing.db.categories;

import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;

/* loaded from: classes.dex */
public final class CategoryQueries extends TransacterImpl {
    public final Category$Adapter categoryAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryQueries(AndroidSqliteDriver androidSqliteDriver, Category$Adapter category$Adapter, int i) {
        super(androidSqliteDriver);
        category$Adapter.getClass();
        switch (i) {
            case 1:
                super(androidSqliteDriver);
                this.categoryAdapter = category$Adapter;
                break;
            default:
                this.categoryAdapter = category$Adapter;
                break;
        }
    }

    public void deleteForCategory(String str) {
        str.getClass();
        this.driver.execute(1587037991, "DELETE FROM entity_in_category\nWHERE category_token = ?", new ClusterItemKt$$ExternalSyntheticLambda3(str, 5));
        notifyQueries(1587037991, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(10));
    }
}
