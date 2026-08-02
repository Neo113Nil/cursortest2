package com.squareup.cash.education.stories.db;

import app.cash.sqldelight.TransacterImpl;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;

/* loaded from: classes.dex */
public final class StoryQueries extends TransacterImpl {
    public void deleteForCategory(String str) {
        str.getClass();
        this.driver.execute(-1176612159, "DELETE FROM filter_for_category\nWHERE category_token = ?", new ClusterItemKt$$ExternalSyntheticLambda3(str, 6));
        notifyQueries(-1176612159, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(15));
    }

    public void deleteForFilter(String str) {
        str.getClass();
        this.driver.execute(-2074670555, "DELETE FROM category_in_filter_group\nWHERE filter_group_token = ?", new ClusterItemKt$$ExternalSyntheticLambda3(str, 4));
        notifyQueries(-2074670555, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(3));
    }
}
