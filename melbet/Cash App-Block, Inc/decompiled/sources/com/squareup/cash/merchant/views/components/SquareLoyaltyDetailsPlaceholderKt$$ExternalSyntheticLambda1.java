package com.squareup.cash.merchant.views.components;

import coil3.network.internal.UtilsKt;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltyDetailsViewEvent;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.Action$Action$OpenUrl;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class SquareLoyaltyDetailsPlaceholderKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SquareLoyaltyDetailsPlaceholderKt$$ExternalSyntheticLambda1(LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData loyaltyPromotionData, Function1 function1) {
        this.f$0 = loyaltyPromotionData;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        UtilsKt utilsKt;
        String str;
        int i = this.$r8$classId;
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData loyaltyPromotionData = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Action action = loyaltyPromotionData.tap;
                if (action != null && (utilsKt = action.action) != null) {
                    Action$Action$OpenUrl action$Action$OpenUrl = utilsKt instanceof Action$Action$OpenUrl ? (Action$Action$OpenUrl) utilsKt : null;
                    Action.OpenUrlAction openUrlAction = action$Action$OpenUrl != null ? action$Action$OpenUrl.value : null;
                    if (openUrlAction != null && (str = openUrlAction.url) != null) {
                        function1.invoke(new SquareLoyaltyDetailsViewEvent.SquareLoyaltyDetailsPlaceholderAction(str, action.analytics_event));
                    }
                }
                break;
            default:
                function1.invoke(new SquareLoyaltyDetailsViewEvent.SquareLoyaltyDetailsPlaceholderView(loyaltyPromotionData.view_event));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SquareLoyaltyDetailsPlaceholderKt$$ExternalSyntheticLambda1(Function1 function1, LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData loyaltyPromotionData) {
        this.f$1 = function1;
        this.f$0 = loyaltyPromotionData;
    }
}
