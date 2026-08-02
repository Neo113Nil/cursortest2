package com.squareup.cash.card.onboarding;

import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewKt$$ExternalSyntheticLambda41 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardStudioViewModel.Content f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda41(CardStudioViewModel.Content content, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = content;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        CardStudioViewModel.Content content = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new CardStudioViewEvent.SetCustomizationMode(content.customizationMode instanceof CardStudioViewModel.CustomizationMode.Pattern.DRAW ? CardStudioViewModel.CustomizationMode.Pattern.STAMP.INSTANCE : CardStudioViewModel.CustomizationMode.Pattern.DRAW.INSTANCE));
                break;
            case 1:
                function1.invoke(new CardStudioViewEvent.ShowStamps(content.customizationMode));
                break;
            case 2:
                function1.invoke(new CardStudioViewEvent.ShowStamps(content.customizationMode));
                break;
            default:
                CardStudioViewModel.CustomizationMode customizationMode = content.customizationMode;
                CardStudioViewModel.CustomizationMode customizationMode2 = CardStudioViewModel.CustomizationMode.DRAW.INSTANCE;
                if (Intrinsics.areEqual(customizationMode, customizationMode2)) {
                    customizationMode2 = CardStudioViewModel.CustomizationMode.STAMP.INSTANCE;
                }
                function1.invoke(new CardStudioViewEvent.SetCustomizationMode(customizationMode2));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda41(Function1 function1, CardStudioViewModel.Content content, int i) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = content;
    }
}
