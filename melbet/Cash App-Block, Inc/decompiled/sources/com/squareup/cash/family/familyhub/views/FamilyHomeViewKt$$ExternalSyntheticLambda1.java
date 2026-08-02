package com.squareup.cash.family.familyhub.views;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import coil3.RealImageLoader;
import com.google.android.gms.internal.location.zzes;
import com.google.android.gms.internal.mlkit_genai_prompt.zzanv;
import com.google.android.instantapps.InstantApps;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.behavior.HideLeftViewOnScrollDelegate;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.sidesheet.LeftSheetDelegate;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewModel;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.earnings.applets.viewmodels.EarnerAppletTileModel;
import com.squareup.cash.earnings.viewmodels.EarningsActivityListViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel;
import com.squareup.cash.earnings.viewmodels.payers.PayerTaggingPromptViewModel;
import com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel;
import com.squareup.cash.earnings.views.home.EarningsHomeKt;
import com.squareup.cash.earnings.views.home.EarningsToolsSectionKt;
import com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt;
import com.squareup.cash.earnings.views.payers.PresentationStyle;
import com.squareup.cash.earnings.views.streamdetail.EarningsStreamDetailKt;
import com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel;
import com.squareup.cash.earningstracker.viewmodels.EarningsTimeframeSelectorSheetViewModel;
import com.squareup.cash.earningstracker.viewmodels.HeaderTitle;
import com.squareup.cash.earningstracker.views.NetEarningsInfoSheetViewKt;
import com.squareup.cash.earningstracker.views.components.EarningsHeaderKt;
import com.squareup.cash.family.applets.viewmodels.AllowanceAppletTileViewModel;
import com.squareup.cash.family.applets.views.FamilyAppletTileKt;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.viewmodels.ControlDisablingConfirmationViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsLimitsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailIntroductionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorLedInviteViewModel;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormPaymentPlanScheduleKt;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.IconTextDetailViewModel;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.api.FormBlocker;
import com.withpersona.sdk2.inquiry.device.EmulatorDeviceUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FamilyHomeViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ FamilyHomeViewKt$$ExternalSyntheticLambda1(EarningsHomeViewModel.EarnerModeSheet earnerModeSheet, Function1 function1, PaddingValues paddingValues, int i) {
        this.$r8$classId = 4;
        this.f$0 = earnerModeSheet;
        this.f$2 = function1;
        this.f$1 = paddingValues;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                FamilyHomeViewKt.FamilyHomeView((RealImageLoader) obj5, (FamilyHomeViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                DirectDepositFormErrorKt.DirectDepositUpdateManualFormDetails((DirectDepositUpdateManualFormDetailsViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                zzes.InstalledEarnerAppletTileContent((EarnerAppletTileModel.Installed) obj5, (AppletTile.AppletTileAppearance) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                EarningsHomeKt.EarningsActivityList((EarningsActivityListViewModel) obj4, (Function1) obj3, (RealImageLoader) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                EarningsToolsSectionKt.EarnerModeSheetContent((EarningsHomeViewModel.EarnerModeSheet) obj5, (Function1) obj3, (PaddingValues) obj4, Modifier.Companion.$$INSTANCE, (Composer) obj, updateChangedFlags);
                break;
            case 5:
                ((Integer) obj2).getClass();
                AddPayerCustomersViewKt.AddPayerCustomersLoadedContent((AddPayerCustomersViewModel.Loaded) obj5, (Function1) obj3, (PresentationStyle) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AddPayerCustomersViewKt.AddPayerCustomers((AddPayerCustomersViewModel) obj4, (Function1) obj3, (RealImageLoader) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AddPayerCustomersViewKt.AddPayerCustomersLoadErrorContent((AddPayerCustomersViewModel.LoadError) obj5, (Function1) obj3, (PresentationStyle) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                AddPayerCustomersViewKt.PayerTaggingPrompt((PayerTaggingPromptViewModel) obj4, (Function1) obj3, (RealImageLoader) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                EarningsStreamDetailKt.EarningsStreamDetail((EarningsStreamDetailViewModel) obj4, (Function1) obj3, (RealImageLoader) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                zzanv.UI((EarningsAppletTileModel) obj5, (AppletTile.AppletTileAppearance) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                NetEarningsInfoSheetViewKt.EarningsTimeframeSelectorSheet((EarningsTimeframeSelectorSheetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                EarningsHeaderKt.EarningsCounter((HeaderTitle.EarningsCounterTitle) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                FamilyAppletTileKt.UI((AllowanceAppletTileViewModel) obj5, (AppletTile.AppletTileAppearance) obj4, (ScoreAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                AllowanceViewKt.ControlDisablingConfirmationDialog((ControlDisablingConfirmationViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                AllowanceViewKt.LimitSection((DependentControlsLimitsViewModel) obj5, (ControlType) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                AllowanceViewKt.DependentControlsAndLimits((DependentControlsAndLimitsViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                AllowanceViewKt.DependentDetailIntroductionDialogScreen((RealImageLoader) obj5, (DependentDetailIntroductionViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                AllowanceViewKt.AllowanceSelectionBottomSheetContent((AmountChooserViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                SponsorDetailViewKt.FamilyPendingRequestsView((RealImageLoader) obj5, (FamilyPendingRequestsViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                SponsorDetailViewKt.SponsorDetailView((RealImageLoader) obj5, (SponsorDetailViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                SponsorDetailViewKt.SponsorLedInviteView((RealImageLoader) obj5, (SponsorLedInviteViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                FidesmoProvisioningViewKt.PreScanContent((FidesmoProvisioningViewModel.PreScanInstructions) obj5, (Function1) obj3, (ScrollState) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ArcadeFormPaymentPlanScheduleKt.ArcadeFormPaymentPlanSchedule((FormBlocker.Element.PaymentPlanScheduleElement) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                InstantApps.GenericBaseElement((GenericBaseViewModel) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                EmulatorDeviceUtilsKt.GenericButton((GenericBaseViewModel.ButtonViewModel) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                AnimatorSetCompat.GenericIconButton((GenericBaseViewModel.IconButtonViewModel) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                HideLeftViewOnScrollDelegate.GenericIconTextDetail((IconTextDetailViewModel) obj5, (Modifier) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                MaterialAttributes.FullWidthWidget((GenericComponentViewModel.FullWidthViewModel) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                LeftSheetDelegate.ValueUnitWidget((GenericComponentViewModel.ValueUnitViewModel) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FamilyHomeViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
    }

    public /* synthetic */ FamilyHomeViewKt$$ExternalSyntheticLambda1(Object obj, Function1 function1, RealImageLoader realImageLoader, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = function1;
        this.f$0 = realImageLoader;
        this.f$3 = i;
    }

    public /* synthetic */ FamilyHomeViewKt$$ExternalSyntheticLambda1(Object obj, Function1 function1, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
        this.f$3 = i;
    }
}
