package com.squareup.cash.offers.views.home;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.graphics.AndroidShader_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.DistanceAndFlags;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.cash.paraphrase.FormattedResource;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.money.viewmodels.HypeWelcomeModel;
import com.squareup.cash.money.views.HypeWelcomeUIKt;
import com.squareup.cash.moneybot.viewmodels.MoneybotAutomationsViewModel$Empty;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotDebugOverlayViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotPreambleEditorViewModel;
import com.squareup.cash.moneybot.viewmodels.RawMessagesViewModel;
import com.squareup.cash.moneybot.viewmodels.amountinput.MoneybotAmountInputViewModel;
import com.squareup.cash.moneybot.viewmodels.staticpicker.MoneybotStaticPickerViewModel;
import com.squareup.cash.moneybot.viewmodels.textinput.MoneybotTextInputViewModel;
import com.squareup.cash.moneybot.views.amountinput.MoneybotAmountInputViewKt;
import com.squareup.cash.moneybot.views.history.MoneybotChatHistoryViewKt;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.nearby.viewmodels.NearbyOrderedListsViewModel;
import com.squareup.cash.nearby.views.DotGridKt;
import com.squareup.cash.nfc.views.NfcNotAvailableKt;
import com.squareup.cash.offers.viewmodels.OfferCountdownCaptionViewModel;
import com.squareup.cash.offers.viewmodels.OfferCountdownTemplateViewModel;
import com.squareup.cash.offers.viewmodels.OffersGreenStatusViewModel;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModelV2;
import com.squareup.cash.offers.views.FormattedCaptionViewModel;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerErrorViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasPickerViewModel;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel;
import com.squareup.cash.passkeys.viewmodels.PasskeyUpsellViewModel;
import com.squareup.cash.passkeys.views.PasskeyUpsellViewKt;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.payments.viewmodels.ConfirmDuplicateDialogViewModel;
import com.squareup.cash.payments.viewmodels.ContactSyncViewModel;
import com.squareup.cash.payments.viewmodels.DuplicatePaymentViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestHelpViewModel;
import com.squareup.cash.payments.viewmodels.NoteRequiredViewModel;
import com.squareup.cash.payments.viewmodels.PaymentClaimViewModel;
import com.squareup.cash.payments.viewmodels.PaymentLoadingViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayDetailsViewModel;
import com.squareup.cash.payments.viewmodels.RecipientSelectionWarningViewModel;
import com.squareup.cash.payments.viewmodels.SchedulePaymentViewModel;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersHeroTileKt$$ExternalSyntheticLambda3 implements Function4 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OffersHeroTileKt$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long j;
        int i;
        Color color = null;
        switch (this.$r8$classId) {
            case 0:
                OfferCountdownTemplateViewModel offerCountdownTemplateViewModel = (OfferCountdownTemplateViewModel) obj;
                AndroidClock androidClock = (AndroidClock) obj2;
                int intValue = ((Integer) obj4).intValue();
                offerCountdownTemplateViewModel.getClass();
                androidClock.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj3);
                gapComposer.startReplaceGroup(-682833175);
                OfferCountdownCaptionViewModel offerCountdownCaptionModels = AndroidShader_androidKt.offerCountdownCaptionModels(androidClock, offerCountdownTemplateViewModel, gapComposer, ((intValue << 3) & 112) | ((intValue >> 3) & 14));
                Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                FormattedResource formattedResource = offerCountdownCaptionModels.timeUntilExpirationFormattedResource;
                String string2 = formattedResource != null ? Countries.getString(context, formattedResource) : null;
                if (string2 == null) {
                    string2 = "";
                } else {
                    String str = offerCountdownCaptionModels.captionTemplate;
                    if (str != null) {
                        string2 = StringsKt__StringsJVMKt.replace$default(str, offerCountdownCaptionModels.stringToReplace, string2);
                    }
                }
                com.squareup.protos.cash.ui.Color color2 = offerCountdownCaptionModels.captionColor;
                if (color2 == null) {
                    gapComposer.startReplaceGroup(-558451872);
                    gapComposer.end(false);
                } else {
                    color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1644553409, color2, gapComposer, false);
                }
                if (color == null) {
                    gapComposer.startReplaceGroup(1644554910);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.text.inverse;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1644553019);
                    gapComposer.end(false);
                    j = color.value;
                }
                FormattedCaptionViewModel formattedCaptionViewModel = new FormattedCaptionViewModel(string2, j, offerCountdownCaptionModels.icon);
                gapComposer.end(false);
                break;
            case 1:
                HypeWelcomeModel hypeWelcomeModel = (HypeWelcomeModel) obj;
                Function1 function1 = (Function1) obj2;
                Composer composer = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                hypeWelcomeModel.getClass();
                function1.getClass();
                if ((intValue2 & 6) == 0) {
                    i = ((intValue2 & 8) == 0 ? ((GapComposer) composer).changed(hypeWelcomeModel) : ((GapComposer) composer).changedInstance(hypeWelcomeModel) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(i & 1, (i & 147) != 146)) {
                    HypeWelcomeUIKt.HypeWelcomeUI(hypeWelcomeModel, function1, gapComposer2, i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                MoneybotChatHistoryViewModel moneybotChatHistoryViewModel = (MoneybotChatHistoryViewModel) obj;
                Function1 function12 = (Function1) obj2;
                int intValue3 = ((Integer) obj4).intValue();
                moneybotChatHistoryViewModel.getClass();
                function12.getClass();
                MoneybotChatHistoryViewKt.MoneybotChatHistoryView(moneybotChatHistoryViewModel, function12, (Composer) obj3, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 3:
                RawMessagesViewModel rawMessagesViewModel = (RawMessagesViewModel) obj;
                Function1 function13 = (Function1) obj2;
                int intValue4 = ((Integer) obj4).intValue();
                rawMessagesViewModel.getClass();
                function13.getClass();
                LazyListLayoutInfoKt.RawMessagesView(rawMessagesViewModel, function13, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 4:
                MoneybotPreambleEditorViewModel moneybotPreambleEditorViewModel = (MoneybotPreambleEditorViewModel) obj;
                Function1 function14 = (Function1) obj2;
                int intValue5 = ((Integer) obj4).intValue();
                moneybotPreambleEditorViewModel.getClass();
                function14.getClass();
                ExpandableContentKt.MoneybotPreambleEditorView(moneybotPreambleEditorViewModel, function14, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 5:
                MoneybotOverflowMenuViewModel moneybotOverflowMenuViewModel = (MoneybotOverflowMenuViewModel) obj;
                Function1 function15 = (Function1) obj2;
                int intValue6 = ((Integer) obj4).intValue();
                moneybotOverflowMenuViewModel.getClass();
                function15.getClass();
                ExpandableContentKt.MoneybotOverflowMenuView(moneybotOverflowMenuViewModel, function15, (Composer) obj3, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 6:
                MoneybotAutomationsViewModel$Empty moneybotAutomationsViewModel$Empty = (MoneybotAutomationsViewModel$Empty) obj;
                Function1 function16 = (Function1) obj2;
                int intValue7 = ((Integer) obj4).intValue();
                moneybotAutomationsViewModel$Empty.getClass();
                function16.getClass();
                zzacg.MoneybotAutomationsView(moneybotAutomationsViewModel$Empty, function16, (Composer) obj3, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 7:
                MoneybotDebugOverlayViewModel moneybotDebugOverlayViewModel = (MoneybotDebugOverlayViewModel) obj;
                Function1 function17 = (Function1) obj2;
                int intValue8 = ((Integer) obj4).intValue();
                moneybotDebugOverlayViewModel.getClass();
                function17.getClass();
                ExpandableContentKt.MoneybotDebugOverlayView(moneybotDebugOverlayViewModel, function17, (Composer) obj3, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 8:
                MoneybotAmountInputViewModel moneybotAmountInputViewModel = (MoneybotAmountInputViewModel) obj;
                Function1 function18 = (Function1) obj2;
                int intValue9 = ((Integer) obj4).intValue();
                moneybotAmountInputViewModel.getClass();
                function18.getClass();
                MoneybotAmountInputViewKt.MoneybotAmountInputView(moneybotAmountInputViewModel, function18, (Composer) obj3, intValue9 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 9:
                MoneybotStaticPickerViewModel moneybotStaticPickerViewModel = (MoneybotStaticPickerViewModel) obj;
                Function1 function19 = (Function1) obj2;
                int intValue10 = ((Integer) obj4).intValue();
                moneybotStaticPickerViewModel.getClass();
                function19.getClass();
                BadgedAvatarKt.MoneybotStaticPickerView(moneybotStaticPickerViewModel, function19, (Composer) obj3, intValue10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 10:
                MoneybotTextInputViewModel moneybotTextInputViewModel = (MoneybotTextInputViewModel) obj;
                Function1 function110 = (Function1) obj2;
                int intValue11 = ((Integer) obj4).intValue();
                moneybotTextInputViewModel.getClass();
                function110.getClass();
                LazyLayoutPagerKt.MoneybotTextInputView(moneybotTextInputViewModel, function110, (Composer) obj3, intValue11 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 11:
                NearbyOrderedListsViewModel nearbyOrderedListsViewModel = (NearbyOrderedListsViewModel) obj;
                Function1 function111 = (Function1) obj2;
                int intValue12 = ((Integer) obj4).intValue();
                nearbyOrderedListsViewModel.getClass();
                function111.getClass();
                DotGridKt.NearbyOrderedListsView(nearbyOrderedListsViewModel, function111, (Composer) obj3, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 12:
                Function1 function112 = (Function1) obj2;
                Composer composer2 = (Composer) obj3;
                int m = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function112);
                if ((m & 48) == 0) {
                    m |= ((GapComposer) composer2).changedInstance(function112) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(m & 1, (m & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    NfcNotAvailableKt.NfcNotAvailable(function112, gapComposer3, (m >> 3) & 14);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 13:
                OffersGreenStatusViewModel offersGreenStatusViewModel = (OffersGreenStatusViewModel) obj;
                Function1 function113 = (Function1) obj2;
                int intValue13 = ((Integer) obj4).intValue();
                offersGreenStatusViewModel.getClass();
                function113.getClass();
                UtilsKt.OffersGreenStatusSheet(offersGreenStatusViewModel, function113, (Composer) obj3, intValue13 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 14:
                OffersTimelineViewModelV2 offersTimelineViewModelV2 = (OffersTimelineViewModelV2) obj;
                Function1 function114 = (Function1) obj2;
                int intValue14 = ((Integer) obj4).intValue();
                offersTimelineViewModelV2.getClass();
                function114.getClass();
                DistanceAndFlags.OffersTimelineSheetV2(offersTimelineViewModelV2, function114, (Composer) obj3, intValue14 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 15:
                AccountPickerErrorViewModel accountPickerErrorViewModel = (AccountPickerErrorViewModel) obj;
                Function1 function115 = (Function1) obj2;
                int intValue15 = ((Integer) obj4).intValue();
                accountPickerErrorViewModel.getClass();
                function115.getClass();
                GapComposer gapComposer4 = (GapComposer) ((Composer) obj3);
                gapComposer4.startReplaceGroup(786676280);
                if ((((intValue15 & 112) ^ 48) <= 32 || !gapComposer4.changed(function115)) && (intValue15 & 48) != 32) {
                    r1 = false;
                }
                Object rememberedValue = gapComposer4.rememberedValue();
                if (r1 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda0(16, function115);
                    gapComposer4.updateRememberedValue(rememberedValue);
                }
                AliasPickerViewKt.AccountPickerErrorDialog((Function0) rememberedValue, null, accountPickerErrorViewModel.message, gapComposer4, 0, 2);
                gapComposer4.end(false);
                break;
            case 16:
                AliasPickerViewModel aliasPickerViewModel = (AliasPickerViewModel) obj;
                Function1 function116 = (Function1) obj2;
                int intValue16 = ((Integer) obj4).intValue();
                aliasPickerViewModel.getClass();
                function116.getClass();
                GapComposer gapComposer5 = (GapComposer) ((Composer) obj3);
                gapComposer5.startReplaceGroup(-1326638927);
                AliasPickerViewKt.AliasPicker(aliasPickerViewModel, function116, null, gapComposer5, intValue16 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer5.end(false);
                break;
            case 17:
                PasskeyManagementViewModel passkeyManagementViewModel = (PasskeyManagementViewModel) obj;
                Function1 function117 = (Function1) obj2;
                int intValue17 = ((Integer) obj4).intValue();
                passkeyManagementViewModel.getClass();
                function117.getClass();
                PasskeyUpsellViewKt.PasskeyManagementView(passkeyManagementViewModel, function117, null, (Composer) obj3, intValue17 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 18:
                PasskeyUpsellViewModel passkeyUpsellViewModel = (PasskeyUpsellViewModel) obj;
                Function1 function118 = (Function1) obj2;
                int intValue18 = ((Integer) obj4).intValue();
                passkeyUpsellViewModel.getClass();
                function118.getClass();
                PasskeyUpsellViewKt.PasskeyUpsellView(passkeyUpsellViewModel, function118, null, (Composer) obj3, intValue18 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 19:
                Function1 function119 = (Function1) obj2;
                int intValue19 = ((Integer) obj4).intValue();
                function119.getClass();
                HelpSheetViewKt.CustomAllocationView((AmountPickerViewModel) obj, function119, null, (Composer) obj3, intValue19 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 20:
                Function1 function120 = (Function1) obj2;
                int intValue20 = ((Integer) obj4).intValue();
                ((ContactSyncViewModel) obj).getClass();
                function120.getClass();
                QuickPayViewKt.ContactSync((intValue20 >> 3) & 14, (Composer) obj3, null, function120);
                break;
            case 21:
                QuickPayDetailsViewModel quickPayDetailsViewModel = (QuickPayDetailsViewModel) obj;
                Function1 function121 = (Function1) obj2;
                int intValue21 = ((Integer) obj4).intValue();
                quickPayDetailsViewModel.getClass();
                function121.getClass();
                QuickPayViewKt.QuickPayDetailsSheetView(quickPayDetailsViewModel, function121, (Composer) obj3, intValue21 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 22:
                DuplicatePaymentViewModel duplicatePaymentViewModel = (DuplicatePaymentViewModel) obj;
                Function1 function122 = (Function1) obj2;
                int intValue22 = ((Integer) obj4).intValue();
                duplicatePaymentViewModel.getClass();
                function122.getClass();
                QuickPayViewKt.DuplicatePaymentView(function122, duplicatePaymentViewModel, (Composer) obj3, ((intValue22 << 3) & 112) | ((intValue22 >> 3) & 14));
                break;
            case 23:
                NearbyPayRequestHelpViewModel nearbyPayRequestHelpViewModel = (NearbyPayRequestHelpViewModel) obj;
                Function1 function123 = (Function1) obj2;
                int intValue23 = ((Integer) obj4).intValue();
                nearbyPayRequestHelpViewModel.getClass();
                function123.getClass();
                NearbyPayRequestViewKt.NearbyPayRequestHelpView(nearbyPayRequestHelpViewModel, function123, (Composer) obj3, intValue23 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 24:
                SchedulePaymentViewModel schedulePaymentViewModel = (SchedulePaymentViewModel) obj;
                Function1 function124 = (Function1) obj2;
                int intValue24 = ((Integer) obj4).intValue();
                schedulePaymentViewModel.getClass();
                function124.getClass();
                QuickPayViewKt.SchedulePaymentView(function124, schedulePaymentViewModel, (Composer) obj3, ((intValue24 << 3) & 112) | ((intValue24 >> 3) & 14));
                break;
            case 25:
                ConfirmDuplicateDialogViewModel confirmDuplicateDialogViewModel = (ConfirmDuplicateDialogViewModel) obj;
                Function1 function125 = (Function1) obj2;
                int intValue25 = ((Integer) obj4).intValue();
                confirmDuplicateDialogViewModel.getClass();
                function125.getClass();
                QuickPayViewKt.ConfirmDuplicate(confirmDuplicateDialogViewModel, function125, null, (Composer) obj3, intValue25 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 26:
                NoteRequiredViewModel noteRequiredViewModel = (NoteRequiredViewModel) obj;
                Function1 function126 = (Function1) obj2;
                int intValue26 = ((Integer) obj4).intValue();
                noteRequiredViewModel.getClass();
                function126.getClass();
                QuickPayViewKt.NoteRequired(noteRequiredViewModel, function126, null, (Composer) obj3, intValue26 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 27:
                RecipientSelectionWarningViewModel recipientSelectionWarningViewModel = (RecipientSelectionWarningViewModel) obj;
                Function1 function127 = (Function1) obj2;
                int intValue27 = ((Integer) obj4).intValue();
                recipientSelectionWarningViewModel.getClass();
                function127.getClass();
                QuickPayViewKt.RecipientSelectionWarning(function127, recipientSelectionWarningViewModel, (Composer) obj3, ((intValue27 << 3) & 112) | ((intValue27 >> 3) & 14));
                break;
            case 28:
                PaymentClaimViewModel paymentClaimViewModel = (PaymentClaimViewModel) obj;
                Function1 function128 = (Function1) obj2;
                int intValue28 = ((Integer) obj4).intValue();
                paymentClaimViewModel.getClass();
                function128.getClass();
                QuickPayViewKt.ClaimPayment(function128, null, paymentClaimViewModel, (Composer) obj3, ((intValue28 << 6) & 896) | ((intValue28 >> 3) & 14));
                break;
            default:
                Function1 function129 = (Function1) obj2;
                int intValue29 = ((Integer) obj4).intValue();
                ((PaymentLoadingViewModel) obj).getClass();
                function129.getClass();
                QuickPayViewKt.PaymentLoading(function129, (Composer) obj3, (intValue29 >> 3) & 14);
                break;
        }
        return Unit.INSTANCE;
    }
}
