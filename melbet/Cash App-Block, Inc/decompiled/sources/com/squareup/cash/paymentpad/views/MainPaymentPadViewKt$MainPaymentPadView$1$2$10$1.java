package com.squareup.cash.paymentpad.views;

import app.cash.local.primitives.RewardToken;
import app.cash.local.screens.app.LoyaltyRewardToApplyQuestion;
import app.cash.local.viewmodels.OrderBuilderEvent;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class MainPaymentPadViewKt$MainPaymentPadView$1$2$10$1 implements Function2 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MainPaymentPadViewKt$MainPaymentPadView$1$2$10$1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.$onEvent = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                MainPaymentPadViewEvent mainPaymentPadViewEvent = (MainPaymentPadViewEvent) obj2;
                mainPaymentPadViewEvent.getClass();
                function1.invoke(mainPaymentPadViewEvent);
                break;
            case 1:
                LoyaltyRewardToApplyQuestion loyaltyRewardToApplyQuestion = (LoyaltyRewardToApplyQuestion) obj;
                RewardToken rewardToken = (RewardToken) obj2;
                String str = rewardToken != null ? rewardToken.value : null;
                loyaltyRewardToApplyQuestion.getClass();
                function1.invoke(new OrderBuilderEvent.SelectRewardToken(str));
                break;
            case 2:
                MainPaymentPadViewEvent mainPaymentPadViewEvent2 = (MainPaymentPadViewEvent) obj2;
                mainPaymentPadViewEvent2.getClass();
                function1.invoke(mainPaymentPadViewEvent2);
                break;
            default:
                MainPaymentPadViewEvent mainPaymentPadViewEvent3 = (MainPaymentPadViewEvent) obj2;
                mainPaymentPadViewEvent3.getClass();
                function1.invoke(mainPaymentPadViewEvent3);
                break;
        }
        return Unit.INSTANCE;
    }
}
