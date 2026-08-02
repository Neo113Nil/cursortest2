package com.squareup.cash.investing.db;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.driver.android.AndroidCursor;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.investing.db.categories.Category$Adapter;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingPortfolioGraphCacheQueries$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RewardSlotQueries f$1;

    public /* synthetic */ InvestingPortfolioGraphCacheQueries$$ExternalSyntheticLambda4(RewardSlotQueries rewardSlotQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                InvestingPortfolioGraphCacheQueries$stocks$2 investingPortfolioGraphCacheQueries$stocks$2 = InvestingPortfolioGraphCacheQueries$stocks$2.INSTANCE;
                break;
            default:
                InvestingPortfolioGraphCacheQueries$bitcoin$2 investingPortfolioGraphCacheQueries$bitcoin$2 = InvestingPortfolioGraphCacheQueries$bitcoin$2.INSTANCE;
                break;
        }
        this.f$1 = rewardSlotQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [byte[], java.io.Serializable, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        RewardSlotQueries rewardSlotQueries = this.f$1;
        switch (i) {
            case 0:
                InvestingPortfolioGraphCacheQueries$bitcoin$2 investingPortfolioGraphCacheQueries$bitcoin$2 = InvestingPortfolioGraphCacheQueries$bitcoin$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                Category$Adapter category$Adapter = (Category$Adapter) rewardSlotQueries.rewardAdapter;
                return investingPortfolioGraphCacheQueries$bitcoin$2.invoke(NavAction$$ExternalSyntheticOutline0.m(androidCursor, 0, category$Adapter.prefix_iconAdapter), NavAction$$ExternalSyntheticOutline0.m(androidCursor, 1, category$Adapter.typeAdapter), BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor, 2, category$Adapter.category_colorAdapter));
            default:
                InvestingPortfolioGraphCacheQueries$stocks$2 investingPortfolioGraphCacheQueries$stocks$2 = InvestingPortfolioGraphCacheQueries$stocks$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                ScenarioPlan.Adapter adapter = (ScenarioPlan.Adapter) rewardSlotQueries.rewardSlotAdapter;
                Enum m = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, adapter.client_scenarioAdapter);
                WireAdapter wireAdapter = adapter.scenario_planAdapter;
                ?? bytes = androidCursor2.getBytes(1);
                bytes.getClass();
                return investingPortfolioGraphCacheQueries$stocks$2.invoke(m, wireAdapter.decode(bytes));
        }
    }
}
