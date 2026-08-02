package com.squareup.cash.family.safetyhub.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.google.android.gms.internal.mlkit_vision_common.zzg;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.google.android.gms.maps.internal.zza;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentGraduationViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel;
import com.squareup.cash.family.familyhub.viewmodels.SetDependentCustomLimitErrorViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetail;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.familyhub.views.DependentDetailToolbarModel;
import com.squareup.cash.family.familyhub.views.DependentDetailViewKt;
import com.squareup.cash.family.familyhub.views.SponsorDetailViewKt;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewModel;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorErrorViewModel;
import com.squareup.cash.family.requestsponsorship.views.SponsorRowViewKt;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyHubViewModel;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.favorites.viewmodels.FavoritesMessageViewModel;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.genericelements.components.base.GenericProgressMeterKt;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.IconViewModel;
import com.withpersona.sdk2.camera.ImageToAnalyzeKt;
import com.withpersona.sdk2.camera.feed.CameraFeedKt;
import com.withpersona.sdk2.inquiry.nfc.NfcTrackingEventsHolder;
import com.withpersona.sdk2.inquiry.selfie.SelfieUtilsKt;
import com.withpersona.sdk2.inquiry.shared.LottieUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class SafetyHubViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ SafetyHubViewKt$$ExternalSyntheticLambda0(GenericComponentViewModel.TwoColumnCardViewModel twoColumnCardViewModel, Function1 function1, int i) {
        this.$r8$classId = 28;
        this.f$0 = twoColumnCardViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                SafetyHubViewKt.SafetyHubView((SafetyHubViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AllowanceViewKt.DependentDetailToolbar((DependentDetailToolbarModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                DependentDetailViewKt.Toolbar((DependentDetailViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AllowanceViewKt.AllowanceSelectionBottomSheetLoaded((AmountChooserViewModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                AllowanceViewKt.FamilyPendingRequestRowContentLoaded((FamilyPendingRequestRowModel.Loaded) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                SponsorDetailViewKt.SetDependentCustomLimitErrorView((SetDependentCustomLimitErrorViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                SponsorDetailViewKt.InviteFriendsSection((SponsorDetailViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                SponsorDetailViewKt.GraduationSection((DependentGraduationViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                SponsorDetailViewKt.SponsorSection((SponsorDetail) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                SponsorDetailViewKt.SponsorResourcesView((SponsorResourcesViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                SponsorRowViewKt.SelectContactMethodContent((SelectContactMethodViewModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                SponsorRowViewKt.SelectSponsorErrorDialog((SelectSponsorErrorViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                SafetyHubViewKt.SafetyHubLoadedView((SafetyHubViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                AddFavoritesViewKt.FavoritesMessage((FavoritesMessageViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                zzg.ScanningProgressPercent((Integer) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                FidesmoProvisioningViewKt.ErrorContent((FidesmoProvisioningViewModel.Error) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                FidesmoProvisioningViewKt.DeprovisionSuccess((FidesmoProvisioningViewModel.Success.Deprovisioned) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                FidesmoProvisioningViewKt.FailedContent((FidesmoProvisioningViewModel.Failed) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                FidesmoProvisioningViewKt.FidesmoProvisioningView((FidesmoProvisioningViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ImageToAnalyzeKt.GenericArcadeBadgedAvatar((Modifier) obj4, (GenericBaseViewModel.ArcadeBadgedAvatarViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                zza.GenericArcadeText((GenericBaseViewModel.ArcadeTextViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                CameraFeedKt.GenericAvatar((GenericBaseViewModel.AvatarViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                NfcTrackingEventsHolder.GenericImage((IconViewModel.ImageViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                GenericProgressMeterKt.GenericProgressMeter((IconViewModel.ProgressMeterViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                MaterialColors.GenericText((GenericBaseViewModel.TextViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                SelfieUtilsKt.CompactCardWidget((GenericComponentViewModel.CompactCardViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                zzpc.CompactInfoWidget((GenericComponentViewModel.CompactInfoViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                MathUtils.DetailedCardWidget((GenericComponentViewModel.DetailedCardViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                LottieUtilsKt.TwoColumnCardWidget((GenericComponentViewModel.TwoColumnCardViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ResToolsKt.TwoColumnRowWidget((GenericComponentViewModel.TwoColumnRowViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SafetyHubViewKt$$ExternalSyntheticLambda0(AmountChooserViewModel.Content content, Function1 function1, int i) {
        this.$r8$classId = 3;
        this.f$0 = content;
        this.f$1 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ SafetyHubViewKt$$ExternalSyntheticLambda0(GenericComponentViewModel.TwoColumnRowViewModel twoColumnRowViewModel, Function1 function1, int i) {
        this.$r8$classId = 29;
        this.f$0 = twoColumnRowViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ SafetyHubViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
