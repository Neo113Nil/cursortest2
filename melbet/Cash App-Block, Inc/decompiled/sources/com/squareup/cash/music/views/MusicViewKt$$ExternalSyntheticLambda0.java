package com.squareup.cash.music.views;

import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotPreambleEditorViewEvent;
import com.squareup.cash.moneybot.viewmodels.RawMessagesViewEvent$Back;
import com.squareup.cash.moneybot.viewmodels.staticpicker.MoneybotStaticPickerViewEvent;
import com.squareup.cash.moneybot.viewmodels.textinput.MoneybotTextInputViewEvent;
import com.squareup.cash.music.viewmodels.MusicViewEvent;
import com.squareup.cash.nearby.viewmodels.NearbyOrderedListsViewEvent$OnBackClicked;
import com.squareup.cash.nfc.viewmodels.NfcNotAvailableViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersDetailsSheetViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersDetailsSheetViewEventV2;
import com.squareup.cash.offers.viewmodels.viewevents.OffersFilterGroupSheetViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersFullscreenCollectionViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersGreenStatusViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersSearchViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MusicViewKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MoneybotPreambleEditorViewEvent.Close close = MoneybotPreambleEditorViewEvent.Close.INSTANCE;
        RawMessagesViewEvent$Back rawMessagesViewEvent$Back = RawMessagesViewEvent$Back.INSTANCE;
        MoneybotStaticPickerViewEvent.Dismissed dismissed = MoneybotStaticPickerViewEvent.Dismissed.INSTANCE;
        MoneybotTextInputViewEvent.Dismissed dismissed2 = MoneybotTextInputViewEvent.Dismissed.INSTANCE;
        MusicViewEvent.Close close2 = MusicViewEvent.Close.INSTANCE;
        NfcNotAvailableViewEvent.Dismiss dismiss = NfcNotAvailableViewEvent.Dismiss.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(close2);
                break;
            case 1:
                function1.invoke(MoneybotOverflowMenuViewEvent.CancelDelete.INSTANCE);
                break;
            case 2:
                function1.invoke(MoneybotOverflowMenuViewEvent.OpenTerms.INSTANCE);
                break;
            case 3:
                function1.invoke(close);
                break;
            case 4:
                function1.invoke(MoneybotPreambleEditorViewEvent.FetchLatest.INSTANCE);
                break;
            case 5:
                function1.invoke(MoneybotPreambleEditorViewEvent.ClearOverride.INSTANCE);
                break;
            case 6:
                function1.invoke(close);
                break;
            case 7:
                function1.invoke(rawMessagesViewEvent$Back);
                break;
            case 8:
                function1.invoke(rawMessagesViewEvent$Back);
                break;
            case 9:
                function1.invoke(dismissed);
                break;
            case 10:
                function1.invoke(dismissed);
                break;
            case 11:
                function1.invoke(MoneybotStaticPickerViewEvent.ContinueTapped.INSTANCE);
                break;
            case 12:
                function1.invoke(dismissed2);
                break;
            case 13:
                function1.invoke(dismissed2);
                break;
            case 14:
                function1.invoke(close2);
                break;
            case 15:
                function1.invoke(MusicViewEvent.ChooseTapped.INSTANCE);
                break;
            case 16:
                function1.invoke(NearbyOrderedListsViewEvent$OnBackClicked.INSTANCE);
                break;
            case 17:
                function1.invoke(dismiss);
                break;
            case 18:
                function1.invoke(dismiss);
                break;
            case 19:
                function1.invoke(NfcNotAvailableViewEvent.GoToNfcSettings.INSTANCE);
                break;
            case 20:
                function1.invoke(OffersFilterGroupSheetViewEvent.FilterGroupCleared.INSTANCE);
                break;
            case 21:
                function1.invoke(OffersGreenStatusViewEvent.SheetDismissed.INSTANCE);
                break;
            case 22:
                function1.invoke(OffersGreenStatusViewEvent.SheetDismissed.INSTANCE$1);
                break;
            case 23:
                function1.invoke(OffersSearchViewEvent.ErrorRetryClicked.INSTANCE);
                break;
            case 24:
                function1.invoke(OffersFullscreenCollectionViewEvent.GoBack.INSTANCE);
                break;
            case 25:
                function1.invoke(OffersDetailsSheetViewEventV2.OpenOffersTimeline.INSTANCE);
                break;
            case 26:
                function1.invoke(OffersDetailsSheetViewEventV2.SheetDismissed.INSTANCE);
                break;
            case 27:
                function1.invoke(OffersDetailsSheetViewEvent.DismissSheet.INSTANCE);
                break;
            case 28:
                function1.invoke(OffersHomeViewEvent.ErrorRetryClicked.INSTANCE);
                break;
            default:
                function1.invoke(OffersHomeViewEvent.OffersPullDownToRefresh.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
