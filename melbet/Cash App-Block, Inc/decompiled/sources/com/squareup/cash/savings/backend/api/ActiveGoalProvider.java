package com.squareup.cash.savings.backend.api;

import com.squareup.cash.savings.backend.api.data.ActiveGoal;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;

/* loaded from: classes7.dex */
public interface ActiveGoalProvider {

    public final class Default implements ActiveGoalProvider {
        public final SavingsFolder.GoalFolder goal;
        public final CardTransitionKt$$ExternalSyntheticLambda4 isGoalMet;
        public final Money lastSeenBalance;
        public final Float lastSeenProgress;
        public final Money lastSeenRemainingBalance;

        public Default(SavingsFolder.GoalFolder goalFolder, Money money, Money money2, Float f, CardTransitionKt$$ExternalSyntheticLambda4 cardTransitionKt$$ExternalSyntheticLambda4) {
            goalFolder.getClass();
            this.goal = goalFolder;
            this.lastSeenBalance = money;
            this.lastSeenRemainingBalance = money2;
            this.lastSeenProgress = f;
            this.isGoalMet = cardTransitionKt$$ExternalSyntheticLambda4;
        }

        @Override // com.squareup.cash.savings.backend.api.ActiveGoalProvider
        public final ActiveGoal get() {
            float longValue;
            CardTransitionKt$$ExternalSyntheticLambda4 cardTransitionKt$$ExternalSyntheticLambda4 = this.isGoalMet;
            SavingsFolder.GoalFolder goalFolder = this.goal;
            boolean booleanValue = ((Boolean) cardTransitionKt$$ExternalSyntheticLambda4.invoke(goalFolder)).booleanValue();
            String str = goalFolder.token;
            Money money = goalFolder.goalAmount;
            Money money2 = goalFolder.balance;
            String str2 = goalFolder.iconId;
            String str3 = goalFolder.label;
            if (booleanValue) {
                longValue = 1.0f;
            } else {
                Float f = goalFolder.progress;
                if (f != null) {
                    longValue = f.floatValue();
                } else {
                    Long l = money2.amount;
                    l.getClass();
                    float longValue2 = l.longValue();
                    money.amount.getClass();
                    longValue = longValue2 / r8.longValue();
                }
            }
            Money max = Moneys.max(new Money((Long) 0L, CurrencyCode.USD, 4), Moneys.minus(money, money2));
            String str4 = goalFolder.completionToken;
            Money money3 = this.lastSeenRemainingBalance;
            Float f2 = this.lastSeenProgress;
            Money money4 = this.lastSeenBalance;
            return new ActiveGoal(str, booleanValue, str2, str3, longValue, max, goalFolder.goalFlowParameters, false, str4, (money4 == null && f2 == null && money3 == null) ? null : new ActiveGoal.LastSeenStatus(money4, f2, money3));
        }
    }

    ActiveGoal get();
}
