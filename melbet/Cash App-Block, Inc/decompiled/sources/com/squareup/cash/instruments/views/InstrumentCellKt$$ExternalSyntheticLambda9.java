package com.squareup.cash.instruments.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.squareup.cash.account.settings.viewmodels.ContactInfoSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.IdentityVerificationSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$ProfileSecurityPolicy;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityViewModel;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewModel;
import com.squareup.cash.history.payments.views.PaymentHistoryWidgetKt;
import com.squareup.cash.investing.components.exchange.InvestingExchangeAtmPickerKt;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.moneybot.viewmodels.SuggestionViewModel;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerRemovedSuccessViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceRemovalFailedViewModel;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.profile.views.personal.RatePlanSectionKt;
import com.squareup.cash.profile.views.security.WebSectionKt;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.shopping.autofill.views.content.ErrorContentKt;
import com.squareup.cash.taptopay.views.components.TapToPayButtonKt;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.protos.franklin.api.Region;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InstrumentCellKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ InstrumentCellKt$$ExternalSyntheticLambda9(int i, int i2, String str, String str2, Function0 function0) {
        this.$r8$classId = 5;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$3 = i;
        this.f$2 = function0;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                InstrumentCellKt.InstrumentAvatar((Modifier) obj4, (List) obj5, (AvatarSize) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AllowanceViewKt.FamilyPendingRequestRow((FamilyPendingRequestRowModel) obj5, (Modifier) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 2:
                ((Integer) obj2).getClass();
                CameraUpdateFactory.GenericArcadeButton((Modifier) obj4, (GenericBaseViewModel.ArcadeButtonViewModel) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 3:
                ((Integer) obj2).getClass();
                PaymentHistoryWidgetKt.PaymentHistoryWidgetView((ProfilePaymentHistoryViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                InvestingExchangeAtmPickerKt.InvestingExchangeAtmPicker((InvestingExchangeViewModel.Content.BottomSheetContent) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 5:
                Function0 function0 = (Function0) obj3;
                ((Integer) obj2).intValue();
                int updateChangedFlags = Updater.updateChangedFlags(this.f$4 | 1);
                int i3 = this.f$3;
                SharedUIKt.AppletTileRowUninstalledContent(i3, updateChangedFlags, (Composer) obj, (String) obj4, (String) obj5, function0);
                break;
            case 6:
                ((Integer) obj2).getClass();
                SuggestionUiKt.SuggestionPill((Modifier) obj4, null, (Function1) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 7:
                ((Integer) obj2).getClass();
                AliasPickerViewKt.AccountPickerErrorDialog((Function0) obj5, (Modifier) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 8:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.BenefitsModuleHeader((PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 9:
                ((Integer) obj2).getClass();
                QuickPayViewKt.SheetTextFieldFocusKeyboardWrapper((Modifier) obj4, (FocusRequester) obj5, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 10:
                ((Integer) obj2).getClass();
                DeviceManagerListViewKt.DeviceManagerRemovedSuccessHalfSheetContent((DeviceManagerRemovedSuccessViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 11:
                ((Integer) obj2).getClass();
                DeviceManagerListViewKt.DeviceRemovalFailedHalfSheetContent((DeviceRemovalFailedViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 12:
                ((Integer) obj2).getClass();
                RatePlanSectionKt.ContactInfoSection((ContactInfoSectionViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 13:
                ((Integer) obj2).getClass();
                RatePlanSectionKt.PersonalInfoSection((PersonalInfoSectionViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 14:
                ((Integer) obj2).getClass();
                WebSectionKt.AllowedAccountsSection((ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 15:
                ((Integer) obj2).getClass();
                WebSectionKt.BlockedAccountsSection((ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 16:
                ((Integer) obj2).getClass();
                WebSectionKt.CashPinSection((ProfileSecurityViewModel.Ready.CashPinViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 17:
                ((Integer) obj2).getClass();
                WebSectionKt.IdentityVerificationSection((IdentityVerificationSectionViewModel.Content) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 18:
                ((Integer) obj2).getClass();
                WebSectionKt.RequestsSection((ProfilePrivacyReadyViewModel$ProfileSecurityPolicy) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 19:
                ((Integer) obj2).getClass();
                WebSectionKt.TrustedContactsSection((TrustedContactSettingViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 20:
                ((Integer) obj2).getClass();
                PermissionChecker.NoResults((Region) obj4, (String) obj5, (String) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 21:
                ((Integer) obj2).getClass();
                ErrorContentKt.LoadedContent((Modifier) obj4, (AutofillViewModel.Loaded) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 22:
                ((Integer) obj2).getClass();
                TapToPayButtonKt.TapToPayButton((Modifier) obj4, (ButtonProminence) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            case 23:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.InternalTransfersAmountDisplay((AmountDisplayState) obj5, (Modifier) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
            default:
                ((Integer) obj2).getClass();
                zzrl.ActualImage((Painter) obj5, (Modifier) obj4, (ContentScale) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InstrumentCellKt$$ExternalSyntheticLambda9(Modifier modifier, SuggestionViewModel.SuggestionPillViewModel suggestionPillViewModel, Function1 function1, Function1 function12, int i, int i2) {
        this.$r8$classId = 6;
        this.f$0 = modifier;
        this.f$1 = function1;
        this.f$2 = function12;
        this.f$3 = i;
        this.f$4 = i2;
    }

    public /* synthetic */ InstrumentCellKt$$ExternalSyntheticLambda9(Object obj, Modifier modifier, Object obj2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$1 = obj;
        this.f$0 = modifier;
        this.f$2 = obj2;
        this.f$3 = i;
        this.f$4 = i2;
    }

    public /* synthetic */ InstrumentCellKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
        this.f$4 = i2;
    }

    public /* synthetic */ InstrumentCellKt$$ExternalSyntheticLambda9(Object obj, Function1 function1, Modifier modifier, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$1 = obj;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$3 = i;
        this.f$4 = i2;
    }
}
