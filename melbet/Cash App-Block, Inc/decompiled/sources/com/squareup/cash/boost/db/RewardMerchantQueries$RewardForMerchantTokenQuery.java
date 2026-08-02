package com.squareup.cash.boost.db;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.db.SessionQueries;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class RewardMerchantQueries$RewardForMerchantTokenQuery extends Query {
    public final /* synthetic */ int $r8$classId = 1;
    public final String merchant_token;
    public final /* synthetic */ SessionQueries this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardMerchantQueries$RewardForMerchantTokenQuery(SessionQueries sessionQueries, String str, RewardQueries$$ExternalSyntheticLambda4 rewardQueries$$ExternalSyntheticLambda4, byte b) {
        super(rewardQueries$$ExternalSyntheticLambda4);
        str.getClass();
        this.this$0 = sessionQueries;
        this.merchant_token = str;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        SessionQueries sessionQueries = this.this$0;
        switch (i) {
            case 0:
                sessionQueries.driver.addListener(new String[]{"rewardMerchant"}, listener);
                break;
            case 1:
                sessionQueries.driver.addListener(new String[]{"rewardMerchant"}, listener);
                break;
            default:
                sessionQueries.driver.addListener(new String[]{"rewardMerchant"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        SessionQueries sessionQueries = this.this$0;
        switch (i) {
            case 0:
                return sessionQueries.driver.executeQuery(149994811, "SELECT reward_token\nFROM rewardMerchant\nWHERE merchant_token = ?", function1, 1, new RewardSlotQueries$$ExternalSyntheticLambda0(this, 8));
            case 1:
                return sessionQueries.driver.executeQuery(-305981960, "SELECT merchant_name\nFROM rewardMerchant\nWHERE reward_token = ?", function1, 1, new RewardSlotQueries$$ExternalSyntheticLambda0(this, 6));
            default:
                return sessionQueries.driver.executeQuery(50694087, "SELECT merchant_token\nFROM rewardMerchant\nWHERE reward_token = ?", function1, 1, new RewardSlotQueries$$ExternalSyntheticLambda0(this, 7));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        SessionQueries sessionQueries = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                sessionQueries.driver.removeListener(new String[]{"rewardMerchant"}, listener);
                break;
            case 1:
                sessionQueries.driver.removeListener(new String[]{"rewardMerchant"}, listener);
                break;
            default:
                sessionQueries.driver.removeListener(new String[]{"rewardMerchant"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "RewardMerchant.sq:rewardForMerchantToken";
            case 1:
                return "RewardMerchant.sq:merchantNameForRewardToken";
            default:
                return "RewardMerchant.sq:merchantTokensForRewardToken";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardMerchantQueries$RewardForMerchantTokenQuery(SessionQueries sessionQueries, String str, RewardQueries$$ExternalSyntheticLambda4 rewardQueries$$ExternalSyntheticLambda4) {
        super(rewardQueries$$ExternalSyntheticLambda4);
        str.getClass();
        this.this$0 = sessionQueries;
        this.merchant_token = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardMerchantQueries$RewardForMerchantTokenQuery(SessionQueries sessionQueries, String str, RewardQueries$$ExternalSyntheticLambda4 rewardQueries$$ExternalSyntheticLambda4, char c) {
        super(rewardQueries$$ExternalSyntheticLambda4);
        this.this$0 = sessionQueries;
        this.merchant_token = str;
    }
}
