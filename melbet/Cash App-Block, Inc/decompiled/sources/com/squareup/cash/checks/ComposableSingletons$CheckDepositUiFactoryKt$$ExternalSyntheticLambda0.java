package com.squareup.cash.checks;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.RemeasureImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import app.cash.broadway.ui.compose.UiScope;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.internal.common.zzj;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.viewmodels.DemandDepositDialogViewModel;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.CardScreenBounds;
import com.squareup.cash.cashapplite.viewmodels.LiteAddMoneyViewModel;
import com.squareup.cash.cashapplite.viewmodels.LiteBalanceHomeViewModel;
import com.squareup.cash.cashapplite.viewmodels.LiteCashInViewModel;
import com.squareup.cash.cashapplite.viewmodels.PasskeySignatureBlockerViewModel;
import com.squareup.cash.cashapplite.views.LiteBalanceHomeViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.cashapppay.viewmodels.StatusInterstitialViewModel;
import com.squareup.cash.cashapppay.views.StatusInterstitialSheetKt;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.deposits.physical.view.address.AddressSearchKt;
import com.squareup.cash.deposits.physical.view.map.AtmClusterItem;
import com.squareup.cash.deposits.physical.view.map.AtmPmdExplainerViewKt;
import com.squareup.cash.deposits.physical.view.map.AtmWithdrawlInfoArcadeKt;
import com.squareup.cash.deposits.physical.view.map.LimitReachedModalArcadeKt;
import com.squareup.cash.deposits.physical.view.map.PmdClusterItem;
import com.squareup.cash.deposits.physical.viewmodels.address.PhysicalDepositAddressEntryViewModel;
import com.squareup.cash.deposits.physical.viewmodels.error.PhysicalDepositErrorViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmExplainerViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmPmdExplainerViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.LimitReachedDialogViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositEditPaycheckAmountViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormCompletionViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormDetailsViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSetupViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSingleInputViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewModel;
import com.squareup.cash.directdeposit.views.DirectDepositDialogKt;
import com.squareup.cash.directdeposit.views.DirectDepositDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.maps.views.ClusterItemKt;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0 implements Function4 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z = true;
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                ConfirmBackOfCheckViewModel confirmBackOfCheckViewModel = (ConfirmBackOfCheckViewModel) obj;
                Function1 function1 = (Function1) obj2;
                int intValue = ((Integer) obj4).intValue();
                confirmBackOfCheckViewModel.getClass();
                function1.getClass();
                CheckDepositAmountKt.ConfirmBackOfCheck(confirmBackOfCheckViewModel, function1, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((CardScreenBounds) obj).getClass();
                ((ZoomLevel) obj2).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                PasskeySignatureBlockerViewModel passkeySignatureBlockerViewModel = (PasskeySignatureBlockerViewModel) obj;
                Function1 function12 = (Function1) obj2;
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                passkeySignatureBlockerViewModel.getClass();
                function12.getClass();
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1041886926, new CaptureCheckFaceKt$$ExternalSyntheticLambda6(9, (Object) passkeySignatureBlockerViewModel, (Object) function12), composer2), composer2, 3072, 7);
                return Unit.INSTANCE;
            case 3:
                LiteAddMoneyViewModel liteAddMoneyViewModel = (LiteAddMoneyViewModel) obj;
                Function1 function13 = (Function1) obj2;
                Composer composer3 = (Composer) obj3;
                ((Integer) obj4).getClass();
                liteAddMoneyViewModel.getClass();
                function13.getClass();
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1432189943, new CaptureCheckFaceKt$$ExternalSyntheticLambda6(10, (Object) liteAddMoneyViewModel, (Object) function13), composer3), composer3, 3072, 7);
                return Unit.INSTANCE;
            case 4:
                LiteCashInViewModel liteCashInViewModel = (LiteCashInViewModel) obj;
                Function1 function14 = (Function1) obj2;
                Composer composer4 = (Composer) obj3;
                ((Integer) obj4).getClass();
                liteCashInViewModel.getClass();
                function14.getClass();
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2108753287, new CaptureCheckFaceKt$$ExternalSyntheticLambda6(11, (Object) liteCashInViewModel, (Object) function14), composer4), composer4, 3072, 7);
                return Unit.INSTANCE;
            case 5:
                LiteBalanceHomeViewModel liteBalanceHomeViewModel = (LiteBalanceHomeViewModel) obj;
                Function1 function15 = (Function1) obj2;
                Composer composer5 = (Composer) obj3;
                ((Integer) obj4).getClass();
                liteBalanceHomeViewModel.getClass();
                function15.getClass();
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(660648706, new LiteBalanceHomeViewKt$$ExternalSyntheticLambda4(liteBalanceHomeViewModel, function15), composer5), composer5, 3072, 7);
                return Unit.INSTANCE;
            case 6:
                Function1 function16 = (Function1) obj2;
                int intValue3 = ((Integer) obj4).intValue();
                function16.getClass();
                StatusInterstitialSheetKt.StatusInterstitialSheetContent((StatusInterstitialViewModel) obj, function16, (Composer) obj3, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 7:
                ConfirmFrontOfCheckViewModel confirmFrontOfCheckViewModel = (ConfirmFrontOfCheckViewModel) obj;
                Function1 function17 = (Function1) obj2;
                int intValue4 = ((Integer) obj4).intValue();
                confirmFrontOfCheckViewModel.getClass();
                function17.getClass();
                CheckDepositAmountKt.ConfirmFrontOfCheck(confirmFrontOfCheckViewModel, function17, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 8:
                CheckDepositAmountViewModel checkDepositAmountViewModel = (CheckDepositAmountViewModel) obj;
                Function1 function18 = (Function1) obj2;
                int intValue5 = ((Integer) obj4).intValue();
                checkDepositAmountViewModel.getClass();
                function18.getClass();
                CheckDepositAmountKt.CheckDepositAmount(checkDepositAmountViewModel, function18, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 9:
                VerifyCheckDepositViewModel verifyCheckDepositViewModel = (VerifyCheckDepositViewModel) obj;
                Function1 function19 = (Function1) obj2;
                int intValue6 = ((Integer) obj4).intValue();
                verifyCheckDepositViewModel.getClass();
                function19.getClass();
                CheckDepositAmountKt.VerifyCheckDeposit(verifyCheckDepositViewModel, function19, (Composer) obj3, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 10:
                String str = (String) obj2;
                int intValue7 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                str.getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj3);
                Object rememberedValue = gapComposer2.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
                Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
                if ((((intValue7 & 112) ^ 48) <= 32 || !gapComposer2.changed(str)) && (intValue7 & 48) != 32) {
                    z = false;
                }
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new EntitySyncerKt$hasSyncedFlow$1(str, parcelableSnapshotMutableIntState, continuation, 15);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue2);
                String substring = str.substring(0, parcelableSnapshotMutableIntState.getIntValue());
                TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, colors.semantic.text.placeholder, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, substring, (Map) null, (Function1) null, false);
                return Unit.INSTANCE;
            case 11:
                PhysicalDepositAddressEntryViewModel physicalDepositAddressEntryViewModel = (PhysicalDepositAddressEntryViewModel) obj;
                Function1 function110 = (Function1) obj2;
                int intValue8 = ((Integer) obj4).intValue();
                physicalDepositAddressEntryViewModel.getClass();
                function110.getClass();
                AddressSearchKt.AddressSearch(physicalDepositAddressEntryViewModel, function110, (Composer) obj3, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 12:
                AtmExplainerViewModel atmExplainerViewModel = (AtmExplainerViewModel) obj;
                Function1 function111 = (Function1) obj2;
                int intValue9 = ((Integer) obj4).intValue();
                atmExplainerViewModel.getClass();
                function111.getClass();
                AtmWithdrawlInfoArcadeKt.AtmWithdrawalInfoArcade(atmExplainerViewModel, function111, (Composer) obj3, intValue9 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 13:
                LocationDeniedScreen locationDeniedScreen = (LocationDeniedScreen) obj;
                Function1 function112 = (Function1) obj2;
                int intValue10 = ((Integer) obj4).intValue();
                locationDeniedScreen.getClass();
                function112.getClass();
                Identity.LocationDeniedModal(locationDeniedScreen, function112, (Composer) obj3, intValue10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 14:
                PhysicalDepositErrorViewModel physicalDepositErrorViewModel = (PhysicalDepositErrorViewModel) obj;
                Function1 function113 = (Function1) obj2;
                int intValue11 = ((Integer) obj4).intValue();
                physicalDepositErrorViewModel.getClass();
                function113.getClass();
                Logging.PaperMoneyDepositErrorModal(physicalDepositErrorViewModel, function113, (Composer) obj3, intValue11 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 15:
                LimitReachedDialogViewModel limitReachedDialogViewModel = (LimitReachedDialogViewModel) obj;
                Function1 function114 = (Function1) obj2;
                int intValue12 = ((Integer) obj4).intValue();
                limitReachedDialogViewModel.getClass();
                function114.getClass();
                LimitReachedModalArcadeKt.LimitReachedModalArcade(limitReachedDialogViewModel, function114, (Composer) obj3, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 16:
                AtmPmdExplainerViewModel atmPmdExplainerViewModel = (AtmPmdExplainerViewModel) obj;
                Function1 function115 = (Function1) obj2;
                int intValue13 = ((Integer) obj4).intValue();
                atmPmdExplainerViewModel.getClass();
                function115.getClass();
                AtmPmdExplainerViewKt.AtmPmdExplainerView(atmPmdExplainerViewModel, function115, (Composer) obj3, intValue13 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 17:
                AtmClusterItem atmClusterItem = (AtmClusterItem) obj;
                ((Boolean) obj2).booleanValue();
                ((Integer) obj4).intValue();
                atmClusterItem.getClass();
                String str2 = atmClusterItem.viewModel.retailerLocation.retailer_icon_url;
                str2.getClass();
                ClusterItemKt.ClusterItem(str2, R.drawable.atm_location_details_placeholder, R.string.atm_cluster_item_content_description, (Composer) obj3, 0);
                return Unit.INSTANCE;
            case 18:
                PmdClusterItem pmdClusterItem = (PmdClusterItem) obj;
                ((Boolean) obj2).booleanValue();
                ((Integer) obj4).intValue();
                pmdClusterItem.getClass();
                String str3 = pmdClusterItem.viewModel.retailerLocation.retailer_icon_url;
                str3.getClass();
                ClusterItemKt.ClusterItem(str3, R.drawable.default_marker_icon, R.string.pmd_cluster_item_content_description, (Composer) obj3, 0);
                return Unit.INSTANCE;
            case 19:
                DirectDepositSingleInputViewModel directDepositSingleInputViewModel = (DirectDepositSingleInputViewModel) obj;
                Function1 function116 = (Function1) obj2;
                int intValue14 = ((Integer) obj4).intValue();
                directDepositSingleInputViewModel.getClass();
                function116.getClass();
                DirectDepositFormErrorKt.DirectDepositSingleInput(directDepositSingleInputViewModel, function116, null, (Composer) obj3, intValue14 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 20:
                DirectDepositSingleInputViewModel directDepositSingleInputViewModel2 = (DirectDepositSingleInputViewModel) obj;
                Function1 function117 = (Function1) obj2;
                int intValue15 = ((Integer) obj4).intValue();
                directDepositSingleInputViewModel2.getClass();
                function117.getClass();
                DirectDepositFormErrorKt.DirectDepositSingleInput(directDepositSingleInputViewModel2, function117, null, (Composer) obj3, intValue15 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 21:
                DirectDepositManualFormDetailsViewModel directDepositManualFormDetailsViewModel = (DirectDepositManualFormDetailsViewModel) obj;
                Function1 function118 = (Function1) obj2;
                int intValue16 = ((Integer) obj4).intValue();
                directDepositManualFormDetailsViewModel.getClass();
                function118.getClass();
                DirectDepositFormErrorKt.DirectDepositManualFormDetails(directDepositManualFormDetailsViewModel, function118, null, (Composer) obj3, intValue16 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 22:
                DirectDepositEditPaycheckAmountViewModel directDepositEditPaycheckAmountViewModel = (DirectDepositEditPaycheckAmountViewModel) obj;
                Function1 function119 = (Function1) obj2;
                int intValue17 = ((Integer) obj4).intValue();
                directDepositEditPaycheckAmountViewModel.getClass();
                function119.getClass();
                DirectDepositFormErrorKt.DirectDepositEditPaycheckAllocation(directDepositEditPaycheckAmountViewModel, function119, null, (Composer) obj3, intValue17 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 23:
                DirectDepositSingleInputViewModel directDepositSingleInputViewModel3 = (DirectDepositSingleInputViewModel) obj;
                Function1 function120 = (Function1) obj2;
                int intValue18 = ((Integer) obj4).intValue();
                directDepositSingleInputViewModel3.getClass();
                function120.getClass();
                DirectDepositFormErrorKt.DirectDepositSingleInput(directDepositSingleInputViewModel3, function120, null, (Composer) obj3, intValue18 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 24:
                DirectDepositSingleInputViewModel directDepositSingleInputViewModel4 = (DirectDepositSingleInputViewModel) obj;
                Function1 function121 = (Function1) obj2;
                int intValue19 = ((Integer) obj4).intValue();
                directDepositSingleInputViewModel4.getClass();
                function121.getClass();
                DirectDepositFormErrorKt.DirectDepositSingleInput(directDepositSingleInputViewModel4, function121, null, (Composer) obj3, intValue19 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 25:
                DirectDepositManualFormCompletionViewModel directDepositManualFormCompletionViewModel = (DirectDepositManualFormCompletionViewModel) obj;
                Function1 function122 = (Function1) obj2;
                int intValue20 = ((Integer) obj4).intValue();
                directDepositManualFormCompletionViewModel.getClass();
                function122.getClass();
                DirectDepositFormErrorKt.DirectDepositManualFormCompletion(directDepositManualFormCompletionViewModel, function122, (Composer) obj3, intValue20 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 26:
                DirectDepositUpdateManualFormDetailsViewModel directDepositUpdateManualFormDetailsViewModel = (DirectDepositUpdateManualFormDetailsViewModel) obj;
                Function1 function123 = (Function1) obj2;
                int intValue21 = ((Integer) obj4).intValue();
                directDepositUpdateManualFormDetailsViewModel.getClass();
                function123.getClass();
                DirectDepositFormErrorKt.DirectDepositUpdateManualFormDetails(directDepositUpdateManualFormDetailsViewModel, function123, null, (Composer) obj3, intValue21 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 27:
                DemandDepositDialogViewModel demandDepositDialogViewModel = (DemandDepositDialogViewModel) obj;
                Function1 function124 = (Function1) obj2;
                ((Integer) obj4).getClass();
                demandDepositDialogViewModel.getClass();
                function124.getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj3);
                gapComposer3.startReplaceGroup(234864346);
                ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-2027737853, new DirectDepositDialogKt$$ExternalSyntheticLambda2(demandDepositDialogViewModel, function124), gapComposer3), gapComposer3, 6);
                gapComposer3.end(false);
                return Unit.INSTANCE;
            case 28:
                DirectDepositSetupViewModel directDepositSetupViewModel = (DirectDepositSetupViewModel) obj;
                Function1 function125 = (Function1) obj2;
                int intValue22 = ((Integer) obj4).intValue();
                function125.getClass();
                GapComposer gapComposer4 = (GapComposer) ((Composer) obj3);
                if (directDepositSetupViewModel != null) {
                    gapComposer4.startReplaceGroup(-146450563);
                    DirectDepositDialogKt.DirectDepositHome(directDepositSetupViewModel, function125, gapComposer4, intValue22 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer4.startReplaceGroup(-244968442);
                }
                gapComposer4.end(false);
                return Unit.INSTANCE;
            default:
                UiScope uiScope = (UiScope) obj;
                final String str4 = (String) obj2;
                int intValue23 = ((Integer) obj4).intValue();
                uiScope.getClass();
                str4.getClass();
                GapComposer gapComposer5 = (GapComposer) ((Composer) obj3);
                gapComposer5.startReplaceGroup(-498469645);
                Modifier sharedBounds$default = SharedTransitionScope.sharedBounds$default(uiScope, Modifier.Companion.$$INSTANCE, uiScope.rememberSharedContentState(new Object(str4) { // from class: com.squareup.cash.sharedElements.PromotionDetailsSharedKey$Bounds
                    public final String id;

                    {
                        str4.getClass();
                        this.id = str4;
                    }

                    public final boolean equals(Object obj5) {
                        if (this == obj5) {
                            return true;
                        }
                        return (obj5 instanceof PromotionDetailsSharedKey$Bounds) && Intrinsics.areEqual(this.id, ((PromotionDetailsSharedKey$Bounds) obj5).id);
                    }

                    public final int hashCode() {
                        return this.id.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Bounds(id=", this.id, ")");
                    }
                }, gapComposer5, (intValue23 << 3) & 112), uiScope, null, null, null, RemeasureImpl.scaleToBounds$default(SharedTransitionScope.ResizeMode.Companion, ContentScale.Companion.None), zzj.overlayClip(uiScope, gapComposer5), 476);
                gapComposer5.end(false);
                return sharedBounds$default;
        }
    }
}
