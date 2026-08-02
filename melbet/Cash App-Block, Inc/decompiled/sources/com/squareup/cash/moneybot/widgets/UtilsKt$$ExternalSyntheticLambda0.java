package com.squareup.cash.moneybot.widgets;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.IntSize;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import coil3.compose.AsyncImagePainter;
import com.google.android.gms.maps.model.LatLng;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewEvent$ViewAll;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.limits.viewmodels.LimitsInlineMessageViewEvent;
import com.squareup.cash.limits.viewmodels.LimitsViewEvent;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import com.squareup.cash.maps.views.MapEngineEvent;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewEvent;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewEvent;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltyDetailsViewEvent;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltySheetViewEvent;
import com.squareup.cash.money.booklet.MoneyTabBookletViewEvent;
import com.squareup.cash.money.viewmodels.MoneyTabEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotAutomationsViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotDebugOverlayViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewEvent;
import com.squareup.cash.moneybot.viewmodels.amountinput.MoneybotAmountInputViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.SlashCommandViewModel;
import com.squareup.cash.offers.screens.OffersFilterGroupSheetResult;
import com.squareup.cash.offers.viewmodels.ImpressionReportable;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.offers.viewmodels.viewevents.OfferDetailsSheetClosed;
import com.squareup.cash.offers.viewmodels.viewevents.OffersSearchViewEvent;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class UtilsKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ UtilsKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        OfferDetailsSheetClosed offerDetailsSheetClosed = OfferDetailsSheetClosed.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                function1.invoke(Integer.valueOf((int) Float.intBitsToFloat((int) (layoutCoordinates.mo843localToWindowMKHz9U(0L) & BodyPartID.bodyIdMax))));
                break;
            case 1:
                LimitsInlineMessageViewEvent limitsInlineMessageViewEvent = (LimitsInlineMessageViewEvent) obj;
                limitsInlineMessageViewEvent.getClass();
                function1.invoke(new LimitsViewEvent.LimitsInlineMessageEvent(limitsInlineMessageViewEvent));
                break;
            case 2:
                LimitsInlineMessageViewEvent limitsInlineMessageViewEvent2 = (LimitsInlineMessageViewEvent) obj;
                limitsInlineMessageViewEvent2.getClass();
                function1.invoke(new LimitsViewEvent.LimitsInlineMessageEvent(limitsInlineMessageViewEvent2));
                break;
            case 3:
                LimitViewModel limitViewModel = (LimitViewModel) obj;
                limitViewModel.getClass();
                function1.invoke(new LimitsViewEvent.LimitsSectionSelectedEvent(limitViewModel));
                break;
            case 4:
                ((LatLng) obj).getClass();
                function1.invoke(MapEngineEvent.MapClicked.INSTANCE);
                break;
            case 5:
                GoogleMapEngine.GoogleClusterItemAdapter googleClusterItemAdapter = (GoogleMapEngine.GoogleClusterItemAdapter) obj;
                googleClusterItemAdapter.getClass();
                String token = googleClusterItemAdapter.cashItem.getViewModel().getToken();
                if (token != null) {
                    function1.invoke(new MapEngineEvent.MarkerClicked(token));
                }
                break;
            case 6:
                ((AsyncImagePainter.State.Error) obj).getClass();
                function1.invoke(AppMessageViewEvent.AppMessageImageFailedToRender.INSTANCE);
                break;
            case 7:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                boolean z = dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult;
                MerchantBlockingViewEvent.CloseClicked closeClicked = MerchantBlockingViewEvent.CloseClicked.INSTANCE;
                if (z) {
                    function1.invoke(closeClicked);
                } else if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    function1.invoke(closeClicked);
                }
                break;
            case 8:
                ProfilePaymentHistoryViewEvent$ViewAll profilePaymentHistoryViewEvent$ViewAll = (ProfilePaymentHistoryViewEvent$ViewAll) obj;
                profilePaymentHistoryViewEvent$ViewAll.getClass();
                if (profilePaymentHistoryViewEvent$ViewAll.equals(ProfilePaymentHistoryViewEvent$ViewAll.INSTANCE)) {
                    function1.invoke(new MerchantProfileViewEvent.PaymentHistoryViewEvent(profilePaymentHistoryViewEvent$ViewAll));
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 9:
                GenericTreeElementsViewEvent genericTreeElementsViewEvent = (GenericTreeElementsViewEvent) obj;
                genericTreeElementsViewEvent.getClass();
                function1.invoke(new MerchantProfileViewEvent.MerchantGenericTreeElementsViewEvent(genericTreeElementsViewEvent));
                break;
            case 10:
                GenericTreeElementsViewEvent genericTreeElementsViewEvent2 = (GenericTreeElementsViewEvent) obj;
                genericTreeElementsViewEvent2.getClass();
                function1.invoke(new SquareLoyaltyDetailsViewEvent.LoyaltyGenericTreeElementsViewEvent(genericTreeElementsViewEvent2));
                break;
            case 11:
                GenericTreeElementsViewEvent genericTreeElementsViewEvent3 = (GenericTreeElementsViewEvent) obj;
                genericTreeElementsViewEvent3.getClass();
                function1.invoke(new SquareLoyaltySheetViewEvent.LoyaltyGenericTreeElementsViewEvent(genericTreeElementsViewEvent3));
                break;
            case 12:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new MoneyTabBookletViewEvent.LinkClicked(str));
                break;
            case 13:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent.getClass();
                function1.invoke(new MoneyTabEvent.TabToolbarEvent(tabToolbarInternalViewEvent));
                break;
            case 14:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new MoneybotAmountInputViewEvent.AmountChanged(str2));
                break;
            case 15:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent2 = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent2.getClass();
                function1.invoke(new MoneybotAutomationsViewEvent.TabToolbarEvent(tabToolbarInternalViewEvent2));
                break;
            case 16:
                SlashCommandViewModel slashCommandViewModel = (SlashCommandViewModel) obj;
                slashCommandViewModel.getClass();
                function1.invoke(new MoneybotChatViewEvent.SlashCommandSelected(slashCommandViewModel.command));
                break;
            case 17:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                layoutCoordinates2.getClass();
                function1.invoke(new IntSize(layoutCoordinates2.mo838getSizeYbymL2g()));
                break;
            case 18:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new MoneybotChatViewEvent.SubmitMessagePrompt(StringsKt.trim(str3).toString(), null, null));
                break;
            case 19:
                function1.invoke(new MoneybotChatViewEvent.RemoveAttachment(((Integer) obj).intValue()));
                break;
            case 20:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent3 = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent3.getClass();
                function1.invoke(new MoneybotHomeViewEvent.TabToolbarEvent(tabToolbarInternalViewEvent3));
                break;
            case 21:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new MoneybotDebugOverlayViewEvent.OpenSessionById(str4));
                break;
            case 22:
                function1.invoke(MoneybotChatViewEvent.MessageSendAnimationFinished.INSTANCE);
                break;
            case 23:
                if (!((Boolean) obj).booleanValue()) {
                    function1.invoke(MoneybotChatViewEvent.ThinkingAnimationPaused.INSTANCE);
                }
                break;
            case 24:
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                textFieldValue.getClass();
                String str5 = textFieldValue.annotatedString.text;
                if (str5.length() > 0) {
                    for (int i2 = 0; i2 < str5.length(); i2++) {
                        char charAt = str5.charAt(i2);
                        if (charAt == '\n' || charAt == '\r') {
                        }
                    }
                    break;
                }
                if (str5.length() <= 100000) {
                    function1.invoke(textFieldValue);
                } else {
                    function1.invoke(TextFieldValue.m1002copy3r_uNRQ$default(textFieldValue, str5.substring(0, 100000), 0L, 6));
                }
                break;
            case 25:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                function1.invoke(bool);
                break;
            case 26:
                DialogListenerEvent dialogListenerEvent2 = (DialogListenerEvent) obj;
                dialogListenerEvent2.getClass();
                if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogCanceled)) {
                    if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        Object obj2 = ((DialogListenerEvent.OnDialogResult) dialogListenerEvent2).result;
                        if (obj2 instanceof OffersFilterGroupSheetResult) {
                            OffersFilterGroupSheetResult offersFilterGroupSheetResult = (OffersFilterGroupSheetResult) obj2;
                            function1.invoke(new OffersSearchViewEvent.FilterGroupApplied(offersFilterGroupSheetResult.filterGroupIndex, offersFilterGroupSheetResult.selectedFilterToken));
                        }
                    }
                }
                break;
            case 27:
                DialogListenerEvent dialogListenerEvent3 = (DialogListenerEvent) obj;
                dialogListenerEvent3.getClass();
                if (!(dialogListenerEvent3 instanceof DialogListenerEvent.OnDialogResult)) {
                    if (!(dialogListenerEvent3 instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        function1.invoke(offerDetailsSheetClosed);
                    }
                }
                break;
            case 28:
                OffersHomeListItemViewModel offersHomeListItemViewModel = (OffersHomeListItemViewModel) obj;
                offersHomeListItemViewModel.getClass();
                if (offersHomeListItemViewModel instanceof ImpressionReportable) {
                    ImpressionReportable impressionReportable = (ImpressionReportable) offersHomeListItemViewModel;
                    if (!impressionReportable.getImpressionEventSpecs().isEmpty()) {
                        function1.invoke(new ItemViewed(impressionReportable.getImpressionEventSpecs()));
                    }
                }
                break;
            default:
                DialogListenerEvent dialogListenerEvent4 = (DialogListenerEvent) obj;
                dialogListenerEvent4.getClass();
                if (!(dialogListenerEvent4 instanceof DialogListenerEvent.OnDialogResult)) {
                    if (!(dialogListenerEvent4 instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        function1.invoke(offerDetailsSheetClosed);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
