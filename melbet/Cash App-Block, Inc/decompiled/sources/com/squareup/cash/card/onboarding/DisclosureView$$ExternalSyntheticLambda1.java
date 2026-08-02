package com.squareup.cash.card.onboarding;

import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDocumentViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewEvent;
import com.squareup.cash.card.onboarding.CardStudioExitDialogViewEvent;
import com.squareup.cash.card.onboarding.CardStudioMoreSheetViewEvent;
import com.squareup.cash.card.onboarding.CardStudioUndoViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewEventV2;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardStylePickerViewEvent;
import com.squareup.cash.card.onboarding.ConfirmExitDisclosureViewEvent;
import com.squareup.cash.card.onboarding.DisclosureViewEvent;
import com.squareup.cash.card.onboarding.StampSheetViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class DisclosureView$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ DisclosureView$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CardStudioViewModelV2$CustomizationMode$Pattern$STAMP cardStudioViewModelV2$CustomizationMode$Pattern$STAMP = CardStudioViewModelV2$CustomizationMode$Pattern$STAMP.INSTANCE;
        DisclosureViewEvent.OnBack onBack = DisclosureViewEvent.OnBack.INSTANCE;
        CardStudioViewEvent.ShowUndoDialog showUndoDialog = CardStudioViewEvent.ShowUndoDialog.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                int i2 = DisclosureView.$r8$clinit;
                function1.invoke(onBack);
                break;
            case 1:
                function1.invoke(AfterPayOrderDocumentViewEvent.GoBack.INSTANCE);
                break;
            case 2:
                function1.invoke(AfterPayOrderDocumentViewEvent.TryAgainClicked.INSTANCE);
                break;
            case 3:
                function1.invoke(AfterPayOrderHubViewEvent.ToolbarBackClicked.INSTANCE);
                break;
            case 4:
                function1.invoke(AfterPayOrderHubViewEvent.TryAgainClicked.INSTANCE);
                break;
            case 5:
                function1.invoke(CardStudioExitDialogViewEvent.Exit.INSTANCE);
                break;
            case 6:
                function1.invoke(CardStudioExitDialogViewEvent.Stay.INSTANCE);
                break;
            case 7:
                function1.invoke(CardStudioMoreSheetViewEvent.Dismiss.INSTANCE);
                break;
            case 8:
                function1.invoke(CardStudioMoreSheetViewEvent.StartOver.INSTANCE);
                break;
            case 9:
                function1.invoke(CardStudioMoreSheetViewEvent.DoneClicked.INSTANCE);
                break;
            case 10:
                function1.invoke(CardStudioUndoViewEvent.Undo.INSTANCE);
                break;
            case 11:
                function1.invoke(CardStudioUndoViewEvent.Cancel.INSTANCE);
                break;
            case 12:
                function1.invoke(showUndoDialog);
                break;
            case 13:
                function1.invoke(showUndoDialog);
                break;
            case 14:
                function1.invoke(new CardStudioViewEvent.ToggleScaleBar(false));
                break;
            case 15:
                function1.invoke(CardStudioViewEvent.ToggleCashtagVisibility.INSTANCE);
                break;
            case 16:
                function1.invoke(CardStudioViewEvent.EnterPatternCustomizationMode.INSTANCE);
                break;
            case 17:
                function1.invoke(showUndoDialog);
                break;
            case 18:
                function1.invoke(new CardStudioViewEvent.ToggleScaleBar(true));
                break;
            case 19:
                function1.invoke(new CardStudioViewEventV2.ShowStamps(CardStudioViewModelV2.CustomizationMode.STAMP.INSTANCE));
                break;
            case 20:
                function1.invoke(new CardStudioViewEventV2$ModeTransition$Enter(cardStudioViewModelV2$CustomizationMode$Pattern$STAMP));
                break;
            case 21:
                function1.invoke(new CardStudioViewEventV2$ModeTransition$Enter(CardStudioViewModelV2.CustomizationMode.DRAW.INSTANCE));
                break;
            case 22:
                function1.invoke(new CardStudioViewEventV2.ShowStamps(cardStudioViewModelV2$CustomizationMode$Pattern$STAMP));
                break;
            case 23:
                function1.invoke(CardStudioViewEventV2.ShowMoreSheet.INSTANCE);
                break;
            case 24:
                function1.invoke(CardStylePickerViewEvent.Exit.INSTANCE);
                break;
            case 25:
                int i3 = ConfirmExitDisclosureView.$r8$clinit;
                function1.invoke(ConfirmExitDisclosureViewEvent.PositiveClick.INSTANCE);
                break;
            case 26:
                int i4 = ConfirmExitDisclosureView.$r8$clinit;
                function1.invoke(ConfirmExitDisclosureViewEvent.NegativeClick.INSTANCE);
                break;
            case 27:
                function1.invoke(onBack);
                break;
            case 28:
                function1.invoke(DisclosureViewEvent.SubmitViewClick.INSTANCE);
                break;
            default:
                function1.invoke(StampSheetViewEvent.Cancel.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
