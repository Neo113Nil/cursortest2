package com.squareup.cash.pdf.view;

import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.viewmodels.WarningDialogViewModel;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.UtilKt;
import com.squareup.cash.pdf.backend.real.PdfBitmapRender;
import com.squareup.cash.pdf.view.PdfPreviewViewModel;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewModel;
import com.squareup.cash.phoneplans.PhonePlansHomeViewKt;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingViewModel;
import com.squareup.cash.pools.viewmodels.PoolMoreOptionsBottomSheetViewModel;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerListViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerRemovedSuccessViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceRemovalFailedViewModel;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.profile.viewmodels.EnableAliasSheetViewModel;
import com.squareup.cash.profile.viewmodels.OpenSourceViewModel;
import com.squareup.cash.profile.views.BadgeNameKt;
import com.squareup.cash.profile.views.notifications.EnableAliasSheetViewKt;
import com.squareup.cash.savings.viewmodels.TransferringViewModel;
import com.squareup.cash.savings.viewmodels.UpsellCardModel$Loaded;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.cash.score.viewmodels.ScoreHomeViewModel;
import com.squareup.cash.score.views.CalloutKt;
import com.squareup.cash.securityhub.viewmodels.BookletViewModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideViewModel;
import com.squareup.cash.securityhub.viewmodels.SecurityHubUiModel;
import com.squareup.cash.securityhub.views.BookletViewKt;
import com.squareup.cash.securityhub.views.RecoveryGuideViewKt;
import com.squareup.cash.securityhub.views.SecurityHubViewKt;
import com.squareup.cash.sharesheet.ShareSheetViewKt;
import com.squareup.cash.sharesheet.ShareSheetViewModel;
import com.squareup.cash.shopping.settings.viewmodels.ErrorViewModel;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsAutofillViewModel;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsViewModel;
import com.squareup.cash.shopping.settings.views.ErrorDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes7.dex */
public final /* synthetic */ class ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1 implements Function4 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                PdfPreviewViewModel pdfPreviewViewModel = (PdfPreviewViewModel) obj2;
                Composer composer = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                pdfPreviewViewModel.getClass();
                PdfPreviewViewModel.Ready ready = pdfPreviewViewModel instanceof PdfPreviewViewModel.Ready ? (PdfPreviewViewModel.Ready) pdfPreviewViewModel : null;
                PdfBitmapRender pdfBitmapRender = ready != null ? ready.pdfRender : null;
                PdfBitmapRender pdfBitmapRender2 = pdfBitmapRender != null ? pdfBitmapRender : null;
                if (pdfBitmapRender2 != null) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    GapComposer gapComposer = (GapComposer) composer;
                    boolean changedInstance = gapComposer.changedInstance(pdfBitmapRender2);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(pdfBitmapRender2, 19);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.LazyColumn(fillMaxSize, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 6, 510);
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                WarningDialogViewModel warningDialogViewModel = (WarningDialogViewModel) obj;
                Function1 function1 = (Function1) obj2;
                int intValue = ((Integer) obj4).intValue();
                warningDialogViewModel.getClass();
                function1.getClass();
                UtilKt.WarningDialog(warningDialogViewModel, function1, null, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 2:
                Composer composer2 = (Composer) obj3;
                int m = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, (Function1) obj2);
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(m & 1, (m & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    QuickPayViewKt.QuickPayExitRouterView(gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                PhonePlansEsimCheckViewModel phonePlansEsimCheckViewModel = (PhonePlansEsimCheckViewModel) obj;
                Function1 function12 = (Function1) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                phonePlansEsimCheckViewModel.getClass();
                function12.getClass();
                PhonePlansHomeViewKt.PhonePlansEsimCheckView(phonePlansEsimCheckViewModel, function12, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 4:
                PhonePlansNewLineLoadingViewModel phonePlansNewLineLoadingViewModel = (PhonePlansNewLineLoadingViewModel) obj;
                Function1 function13 = (Function1) obj2;
                int intValue3 = ((Integer) obj4).intValue();
                phonePlansNewLineLoadingViewModel.getClass();
                function13.getClass();
                PhonePlansHomeViewKt.PhonePlansNewLineLoadingView(phonePlansNewLineLoadingViewModel, function13, (Composer) obj3, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 5:
                PoolMoreOptionsBottomSheetViewModel poolMoreOptionsBottomSheetViewModel = (PoolMoreOptionsBottomSheetViewModel) obj;
                Function1 function14 = (Function1) obj2;
                int intValue4 = ((Integer) obj4).intValue();
                poolMoreOptionsBottomSheetViewModel.getClass();
                function14.getClass();
                PoolToastKt.PoolMoreOptionsBottomSheetView(function14, poolMoreOptionsBottomSheetViewModel, (Composer) obj3, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                break;
            case 6:
                PrepurchaseCashCardPlanningViewModel prepurchaseCashCardPlanningViewModel = (PrepurchaseCashCardPlanningViewModel) obj;
                Function1 function15 = (Function1) obj2;
                int intValue5 = ((Integer) obj4).intValue();
                prepurchaseCashCardPlanningViewModel.getClass();
                function15.getClass();
                LocaleToggleKt.PrepurchaseCashCardPlanningSheetView(prepurchaseCashCardPlanningViewModel, function15, null, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 7:
                DeviceManagerListViewModel deviceManagerListViewModel = (DeviceManagerListViewModel) obj;
                Function1 function16 = (Function1) obj2;
                int intValue6 = ((Integer) obj4).intValue();
                function16.getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj3);
                if (deviceManagerListViewModel != null) {
                    gapComposer3.startReplaceGroup(183343238);
                    DeviceManagerListViewKt.DeviceManagerListContent(deviceManagerListViewModel, function16, gapComposer3, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer3.startReplaceGroup(1388711524);
                }
                gapComposer3.end(false);
                break;
            case 8:
                DeviceRemovalFailedViewModel deviceRemovalFailedViewModel = (DeviceRemovalFailedViewModel) obj;
                Function1 function17 = (Function1) obj2;
                int intValue7 = ((Integer) obj4).intValue();
                function17.getClass();
                GapComposer gapComposer4 = (GapComposer) ((Composer) obj3);
                if (deviceRemovalFailedViewModel != null) {
                    gapComposer4.startReplaceGroup(-493693768);
                    DeviceManagerListViewKt.DeviceRemovalFailedFullScreenContent(deviceRemovalFailedViewModel, function17, gapComposer4, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer4.startReplaceGroup(1875412350);
                }
                gapComposer4.end(false);
                break;
            case 9:
                DeviceRemovalFailedViewModel deviceRemovalFailedViewModel2 = (DeviceRemovalFailedViewModel) obj;
                Function1 function18 = (Function1) obj2;
                int intValue8 = ((Integer) obj4).intValue();
                function18.getClass();
                GapComposer gapComposer5 = (GapComposer) ((Composer) obj3);
                if (deviceRemovalFailedViewModel2 != null) {
                    gapComposer5.startReplaceGroup(-250156907);
                    DeviceManagerListViewKt.DeviceRemovalFailedHalfSheetScreen(deviceRemovalFailedViewModel2, function18, gapComposer5, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer5.startReplaceGroup(835118527);
                }
                gapComposer5.end(false);
                break;
            case 10:
                DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel = (DeviceManagerRemovedSuccessViewModel) obj;
                Function1 function19 = (Function1) obj2;
                int intValue9 = ((Integer) obj4).intValue();
                function19.getClass();
                GapComposer gapComposer6 = (GapComposer) ((Composer) obj3);
                if (deviceManagerRemovedSuccessViewModel != null) {
                    gapComposer6.startReplaceGroup(1139440389);
                    DeviceManagerListViewKt.DeviceManagerRemovedSuccessFullScreenContent(deviceManagerRemovedSuccessViewModel, function19, gapComposer6, intValue9 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer6.startReplaceGroup(962971353);
                }
                gapComposer6.end(false);
                break;
            case 11:
                DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel2 = (DeviceManagerRemovedSuccessViewModel) obj;
                Function1 function110 = (Function1) obj2;
                int intValue10 = ((Integer) obj4).intValue();
                function110.getClass();
                GapComposer gapComposer7 = (GapComposer) ((Composer) obj3);
                if (deviceManagerRemovedSuccessViewModel2 != null) {
                    gapComposer7.startReplaceGroup(1382977250);
                    DeviceManagerListViewKt.DeviceManagerRemovedSuccessHalfSheetScreen(deviceManagerRemovedSuccessViewModel2, function110, gapComposer7, intValue10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer7.startReplaceGroup(-77322470);
                }
                gapComposer7.end(false);
                break;
            case 12:
                EnableAliasSheetViewModel enableAliasSheetViewModel = (EnableAliasSheetViewModel) obj;
                Function1 function111 = (Function1) obj2;
                int intValue11 = ((Integer) obj4).intValue();
                enableAliasSheetViewModel.getClass();
                function111.getClass();
                EnableAliasSheetViewKt.EnableAlias(null, function111, enableAliasSheetViewModel, (Composer) obj3, ((intValue11 << 6) & 896) | (intValue11 & 112));
                break;
            case 13:
                OpenSourceViewModel openSourceViewModel = (OpenSourceViewModel) obj;
                Function1 function112 = (Function1) obj2;
                int intValue12 = ((Integer) obj4).intValue();
                openSourceViewModel.getClass();
                function112.getClass();
                BadgeNameKt.OpenSource(openSourceViewModel, function112, (Composer) obj3, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 14:
                Bitmap bitmap = (Bitmap) obj2;
                Composer composer3 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                if (bitmap == null) {
                    GapComposer gapComposer8 = (GapComposer) composer3;
                    gapComposer8.startReplaceGroup(-1563348232);
                    gapComposer8.end(false);
                } else {
                    GapComposer gapComposer9 = (GapComposer) composer3;
                    gapComposer9.startReplaceGroup(-1563348231);
                    ImageKt.m176Image5hnEew(new AndroidImageBitmap(bitmap), null, SizeKt.fillMaxSize(companion, 1.0f), null, null, gapComposer9, 432, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    gapComposer9.end(false);
                }
                break;
            case 15:
                ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                ((Unit) obj2).getClass();
                break;
            case 16:
                Function1 function113 = (Function1) obj2;
                int intValue13 = ((Integer) obj4).intValue();
                function113.getClass();
                ButtonGroupKt.CondensedTransferInView((AmountPickerViewModel) obj, function113, (Composer) obj3, intValue13 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 17:
                Function1 function114 = (Function1) obj2;
                int intValue14 = ((Integer) obj4).intValue();
                function114.getClass();
                ButtonGroupKt.TransferringView((TransferringViewModel) obj, function114, (Composer) obj3, intValue14 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 18:
                Function1 function115 = (Function1) obj2;
                int intValue15 = ((Integer) obj4).intValue();
                function115.getClass();
                ButtonGroupKt.SavingsUpsellSheetView((UpsellCardModel$Loaded) obj, function115, (Composer) obj3, intValue15 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 19:
                ((Integer) obj4).intValue();
                ((Function1) obj2).getClass();
                ButtonGroupKt.SavingsRouteInterstitial((Composer) obj3, 0);
                break;
            case 20:
                Function1 function116 = (Function1) obj2;
                int intValue16 = ((Integer) obj4).intValue();
                function116.getClass();
                ButtonGroupKt.FullTransferInView((AmountPickerViewModel) obj, function116, null, (Composer) obj3, intValue16 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 21:
                Function1 function117 = (Function1) obj2;
                int intValue17 = ((Integer) obj4).intValue();
                function117.getClass();
                ButtonGroupKt.FullTransferOutView((AmountPickerViewModel) obj, function117, null, (Composer) obj3, intValue17 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 22:
                ScoreHomeViewModel scoreHomeViewModel = (ScoreHomeViewModel) obj;
                Function1 function118 = (Function1) obj2;
                int intValue18 = ((Integer) obj4).intValue();
                scoreHomeViewModel.getClass();
                function118.getClass();
                CalloutKt.ScoreHome(scoreHomeViewModel, function118, null, null, (Composer) obj3, intValue18 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 23:
                SecurityHubUiModel securityHubUiModel = (SecurityHubUiModel) obj;
                Function1 function119 = (Function1) obj2;
                int intValue19 = ((Integer) obj4).intValue();
                securityHubUiModel.getClass();
                function119.getClass();
                SecurityHubViewKt.SecurityHubView(securityHubUiModel, function119, null, (Composer) obj3, intValue19 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 24:
                BookletViewModel bookletViewModel = (BookletViewModel) obj;
                Function1 function120 = (Function1) obj2;
                int intValue20 = ((Integer) obj4).intValue();
                bookletViewModel.getClass();
                function120.getClass();
                BookletViewKt.BookletView(bookletViewModel, function120, null, (Composer) obj3, intValue20 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 25:
                RecoveryGuideViewModel recoveryGuideViewModel = (RecoveryGuideViewModel) obj;
                Function1 function121 = (Function1) obj2;
                int intValue21 = ((Integer) obj4).intValue();
                recoveryGuideViewModel.getClass();
                function121.getClass();
                RecoveryGuideViewKt.RecoveryGuideView(recoveryGuideViewModel, function121, null, (Composer) obj3, intValue21 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 26:
                Function1 function122 = (Function1) obj2;
                int intValue22 = ((Integer) obj4).intValue();
                function122.getClass();
                ShareSheetViewKt.ShareSheetView((ShareSheetViewModel) obj, function122, (Composer) obj3, intValue22 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 27:
                ShoppingSettingsViewModel shoppingSettingsViewModel = (ShoppingSettingsViewModel) obj;
                Function1 function123 = (Function1) obj2;
                int intValue23 = ((Integer) obj4).intValue();
                shoppingSettingsViewModel.getClass();
                function123.getClass();
                ErrorDialogKt.ShoppingSettingsView(shoppingSettingsViewModel, function123, null, (Composer) obj3, intValue23 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 28:
                ShoppingSettingsAutofillViewModel shoppingSettingsAutofillViewModel = (ShoppingSettingsAutofillViewModel) obj;
                Function1 function124 = (Function1) obj2;
                int intValue24 = ((Integer) obj4).intValue();
                shoppingSettingsAutofillViewModel.getClass();
                function124.getClass();
                ErrorDialogKt.ShoppingSettingsAutofillView(shoppingSettingsAutofillViewModel, function124, null, (Composer) obj3, intValue24 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            default:
                ErrorViewModel errorViewModel = (ErrorViewModel) obj;
                Function1 function125 = (Function1) obj2;
                int intValue25 = ((Integer) obj4).intValue();
                errorViewModel.getClass();
                function125.getClass();
                ErrorDialogKt.ErrorDialog(errorViewModel, function125, null, (Composer) obj3, intValue25 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
