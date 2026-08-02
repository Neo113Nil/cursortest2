package com.squareup.cash.payments.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import coil3.RealImageLoader;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafd;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.offers.viewmodels.itemviewmodels.CategoryOffersTileViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerOptionsMenuViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasPickerViewModel;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.onboarding.viewmodels.OnboardingLandingViewModel;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel;
import com.squareup.cash.passkeys.viewmodels.PasskeyUpsellViewModel;
import com.squareup.cash.passkeys.views.PasskeyUpsellViewKt;
import com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel;
import com.squareup.cash.paychecks.viewmodels.DistributePaycheckViewModel;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksActivityListViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksReceiptViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.payments.viewmodels.ConfirmDuplicateDialogViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayersSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPaymentKeypadViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPeopleOverflowSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPermissionsPromptSheetViewModel;
import com.squareup.cash.payments.viewmodels.NoteRequiredViewModel;
import com.squareup.cash.payments.viewmodels.PaymentClaimViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentStickersViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewModel;
import com.squareup.cash.payments.viewmodels.WarningDialogViewModel;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.phoneplans.applets.viewmodels.PhonePlansAppletTileModel;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class NoteRequiredViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ NoteRequiredViewKt$$ExternalSyntheticLambda1(EditDistributionViewModel.Content.Configuration configuration, Modifier modifier, Function1 function1, int i) {
        this.$r8$classId = 10;
        this.f$0 = configuration;
        this.f$2 = modifier;
        this.f$1 = function1;
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
                QuickPayViewKt.NoteRequired((NoteRequiredViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ShadowKt.OffersCategoryTile((Modifier) obj3, (CategoryOffersTileViewModel.CategoryIconTileViewModel) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AliasPickerViewKt.AccountPickerOptionsMenu((AccountPickerOptionsMenuViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AliasPickerViewKt.AccountList((AccountPickerViewModel.AccountList) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AliasPickerViewKt.ArcadeAccountPicker((Function1) obj4, (AccountPickerViewModel) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AliasPickerViewKt.AliasPicker((AliasPickerViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                zzafd.OnboardingLandingView((OnboardingLandingViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                PasskeyUpsellViewKt.PasskeyManagementView((PasskeyManagementViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                PasskeyUpsellViewKt.PasskeyUpsellView((PasskeyUpsellViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                JvmActuals_jvmKt.UI((PaychecksAppletTileModel) obj5, (AppletTile.AppletTileAppearance) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.ConfigurationRow((EditDistributionViewModel.Content.Configuration) obj5, (Modifier) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.DestinationAllocationRow((DestinationAllocationRowViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.DistributePaycheck((DistributePaycheckViewModel.Loaded) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                HelpSheetViewKt.Footer(updateChangedFlags, composer, (Modifier) obj3, (EditDistributionViewModel.Content) obj5, (Function1) obj4);
                break;
            case 14:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.PaychecksActivityList((PaychecksActivityListViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.PaychecksReceiptView((PaychecksReceiptViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                QuickPayViewKt.ConfirmDuplicate((ConfirmDuplicateDialogViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                QuickPayViewKt.ClaimPayment((Function1) obj4, (Modifier) obj3, (PaymentClaimViewModel) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                QuickPayViewKt.PaymentConfigurationView((Function1) obj4, (PaymentConfigurationViewModel) obj5, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                UtilKt.WarningDialog((WarningDialogViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                ErrorKt.InputAmount((PaymentConfigurationViewModel.InputAmount) obj5, (Function1) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPayersSheetView((Function1) obj4, (NearbyPayersSheetViewModel) obj5, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPaymentKeypadView((NearbyPaymentKeypadViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPaymentsInfoView((Function1) obj4, (NearbyPaymentsInfoViewModel) obj5, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView((Function1) obj4, (NearbyPeopleOverflowSheetViewModel) obj5, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView((Function1) obj4, (NearbyPermissionsPromptSheetViewModel) obj5, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                AlphaKt.PersonalizePaymentRecipientView((PersonalizePaymentRecipientViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                AlphaKt.PersonalizePaymentStickers((Function1) obj4, (PersonalizePaymentStickersViewModel) obj5, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                AlphaKt.PersonalizePaymentView((PersonalizePaymentViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((TaxesAppletTile) obj5).InstalledUI((PhonePlansAppletTileModel.Installed) obj4, (AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ NoteRequiredViewKt$$ExternalSyntheticLambda1(Modifier modifier, CategoryOffersTileViewModel.CategoryIconTileViewModel categoryIconTileViewModel, Function0 function0, int i) {
        this.$r8$classId = 1;
        this.f$2 = modifier;
        this.f$0 = categoryIconTileViewModel;
        this.f$1 = function0;
        this.f$3 = i;
    }

    public /* synthetic */ NoteRequiredViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
    }

    public /* synthetic */ NoteRequiredViewKt$$ExternalSyntheticLambda1(Function1 function1, Modifier modifier, PaymentClaimViewModel paymentClaimViewModel, int i) {
        this.$r8$classId = 17;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$0 = paymentClaimViewModel;
        this.f$3 = i;
    }

    public /* synthetic */ NoteRequiredViewKt$$ExternalSyntheticLambda1(Function1 function1, Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = function1;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = i;
    }
}
