package com.squareup.cash.banking.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.unicorn.balance_home_ui.BalanceHomeUi$FocusArea;
import com.squareup.protos.franklin.common.BalanceData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class BalanceHomeViewModel {

    public final class InitialLoading extends BalanceHomeViewModel {
        public static final InitialLoading INSTANCE = new InitialLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitialLoading);
        }

        public final int hashCode() {
            return -448334696;
        }

        public final String toString() {
            return "InitialLoading";
        }
    }

    public final class Loaded extends BalanceHomeViewModel {
        public final AccountDetailsViewModel accountDetailsViewModel;
        public final UiCallbackModel activityEmbeddedModel;
        public final BalanceViewModel balanceViewModel;
        public final UiCallbackModel bankingSectionsUiCallbackModel;
        public final CallToActionViewModel callToActionViewModel;
        public final String disclosure;
        public final boolean evergreenOverdraftEnabled;
        public final BalanceHomeUi$FocusArea focusArea;
        public final String overdraftBalanceSubtitle;
        public final OverdraftPillViewModel overdraftPillViewModel;
        public final OverdraftUpsellViewModel overdraftUpsellViewModel;
        public final RestrictedBalanceViewModel restrictedBalanceViewModel;
        public final boolean showDisclosureIcon;

        public final class AccountDetailsViewModel {
            public final BalanceData.Button button;
            public final AccountDetailsContent content;

            public AccountDetailsViewModel(AccountDetailsContent accountDetailsContent, BalanceData.Button button) {
                this.content = accountDetailsContent;
                this.button = button;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AccountDetailsViewModel)) {
                    return false;
                }
                AccountDetailsViewModel accountDetailsViewModel = (AccountDetailsViewModel) obj;
                return Intrinsics.areEqual(this.content, accountDetailsViewModel.content) && Intrinsics.areEqual(this.button, accountDetailsViewModel.button);
            }

            public final int hashCode() {
                AccountDetailsContent accountDetailsContent = this.content;
                int hashCode = (accountDetailsContent == null ? 0 : accountDetailsContent.hashCode()) * 31;
                BalanceData.Button button = this.button;
                return hashCode + (button != null ? button.hashCode() : 0);
            }

            public final String toString() {
                return "AccountDetailsViewModel(content=" + this.content + ", button=" + this.button + ")";
            }
        }

        public final class BalanceViewModel {
            public final String formattedBalance;
            public final String title;

            public BalanceViewModel(String str, String str2) {
                str.getClass();
                this.title = str;
                this.formattedBalance = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BalanceViewModel)) {
                    return false;
                }
                BalanceViewModel balanceViewModel = (BalanceViewModel) obj;
                return Intrinsics.areEqual(this.title, balanceViewModel.title) && this.formattedBalance.equals(balanceViewModel.formattedBalance);
            }

            public final int hashCode() {
                return this.formattedBalance.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("BalanceViewModel(title=", this.title, ", formattedBalance=", this.formattedBalance, ")");
            }
        }

        public final class CallToActionViewModel {
            public final String button;
            public final String clientRoute;
            public final String subtitle;
            public final String title;

            public CallToActionViewModel(String str, String str2, String str3, String str4) {
                str4.getClass();
                this.title = str;
                this.subtitle = str2;
                this.button = str3;
                this.clientRoute = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CallToActionViewModel)) {
                    return false;
                }
                CallToActionViewModel callToActionViewModel = (CallToActionViewModel) obj;
                return Intrinsics.areEqual(this.title, callToActionViewModel.title) && Intrinsics.areEqual(this.subtitle, callToActionViewModel.subtitle) && this.button.equals(callToActionViewModel.button) && Intrinsics.areEqual(this.clientRoute, callToActionViewModel.clientRoute);
            }

            public final int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtitle;
                return this.clientRoute.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.button);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CallToActionViewModel(title=", this.title, ", subtitle=", this.subtitle, ", button="), this.button, ", clientRoute=", this.clientRoute, ")");
            }
        }

        public final class OverdraftUpsellViewModel {
            public final String buttonText;
            public final Image image;
            public final String title;

            public OverdraftUpsellViewModel(Image image, String str, String str2) {
                str.getClass();
                str2.getClass();
                this.title = str;
                this.buttonText = str2;
                this.image = image;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OverdraftUpsellViewModel)) {
                    return false;
                }
                OverdraftUpsellViewModel overdraftUpsellViewModel = (OverdraftUpsellViewModel) obj;
                return Intrinsics.areEqual(this.title, overdraftUpsellViewModel.title) && Intrinsics.areEqual(this.buttonText, overdraftUpsellViewModel.buttonText) && this.image.equals(overdraftUpsellViewModel.image);
            }

            public final int hashCode() {
                return this.image.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.buttonText);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OverdraftUpsellViewModel(title=", this.title, ", buttonText=", this.buttonText, ", image=");
                m.append(this.image);
                m.append(")");
                return m.toString();
            }
        }

        public final class RestrictedBalanceViewModel {
            public final String formattedBalance;

            public RestrictedBalanceViewModel(String str) {
                str.getClass();
                this.formattedBalance = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RestrictedBalanceViewModel) && Intrinsics.areEqual(this.formattedBalance, ((RestrictedBalanceViewModel) obj).formattedBalance);
            }

            public final int hashCode() {
                return this.formattedBalance.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RestrictedBalanceViewModel(formattedBalance=", this.formattedBalance, ")");
            }
        }

        public Loaded(BalanceViewModel balanceViewModel, RestrictedBalanceViewModel restrictedBalanceViewModel, OverdraftPillViewModel overdraftPillViewModel, AccountDetailsViewModel accountDetailsViewModel, OverdraftUpsellViewModel overdraftUpsellViewModel, CallToActionViewModel callToActionViewModel, UiCallbackModel uiCallbackModel, String str, boolean z, BalanceHomeUi$FocusArea balanceHomeUi$FocusArea, UiCallbackModel uiCallbackModel2, boolean z2, String str2) {
            this.balanceViewModel = balanceViewModel;
            this.restrictedBalanceViewModel = restrictedBalanceViewModel;
            this.overdraftPillViewModel = overdraftPillViewModel;
            this.accountDetailsViewModel = accountDetailsViewModel;
            this.overdraftUpsellViewModel = overdraftUpsellViewModel;
            this.callToActionViewModel = callToActionViewModel;
            this.bankingSectionsUiCallbackModel = uiCallbackModel;
            this.disclosure = str;
            this.showDisclosureIcon = z;
            this.focusArea = balanceHomeUi$FocusArea;
            this.activityEmbeddedModel = uiCallbackModel2;
            this.evergreenOverdraftEnabled = z2;
            this.overdraftBalanceSubtitle = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.balanceViewModel.equals(loaded.balanceViewModel) && Intrinsics.areEqual(this.restrictedBalanceViewModel, loaded.restrictedBalanceViewModel) && Intrinsics.areEqual(this.overdraftPillViewModel, loaded.overdraftPillViewModel) && Intrinsics.areEqual(this.accountDetailsViewModel, loaded.accountDetailsViewModel) && Intrinsics.areEqual(this.overdraftUpsellViewModel, loaded.overdraftUpsellViewModel) && Intrinsics.areEqual(this.callToActionViewModel, loaded.callToActionViewModel) && this.bankingSectionsUiCallbackModel.equals(loaded.bankingSectionsUiCallbackModel) && Intrinsics.areEqual(this.disclosure, loaded.disclosure) && this.showDisclosureIcon == loaded.showDisclosureIcon && this.focusArea == loaded.focusArea && Intrinsics.areEqual(this.activityEmbeddedModel, loaded.activityEmbeddedModel) && this.evergreenOverdraftEnabled == loaded.evergreenOverdraftEnabled && Intrinsics.areEqual(this.overdraftBalanceSubtitle, loaded.overdraftBalanceSubtitle);
        }

        public final int hashCode() {
            int hashCode = this.balanceViewModel.hashCode() * 31;
            RestrictedBalanceViewModel restrictedBalanceViewModel = this.restrictedBalanceViewModel;
            int hashCode2 = (hashCode + (restrictedBalanceViewModel == null ? 0 : restrictedBalanceViewModel.formattedBalance.hashCode())) * 31;
            OverdraftPillViewModel overdraftPillViewModel = this.overdraftPillViewModel;
            int hashCode3 = (hashCode2 + (overdraftPillViewModel == null ? 0 : overdraftPillViewModel.hashCode())) * 31;
            AccountDetailsViewModel accountDetailsViewModel = this.accountDetailsViewModel;
            int hashCode4 = (hashCode3 + (accountDetailsViewModel == null ? 0 : accountDetailsViewModel.hashCode())) * 31;
            OverdraftUpsellViewModel overdraftUpsellViewModel = this.overdraftUpsellViewModel;
            int hashCode5 = (hashCode4 + (overdraftUpsellViewModel == null ? 0 : overdraftUpsellViewModel.hashCode())) * 31;
            CallToActionViewModel callToActionViewModel = this.callToActionViewModel;
            int hashCode6 = (this.bankingSectionsUiCallbackModel.hashCode() + ((hashCode5 + (callToActionViewModel == null ? 0 : callToActionViewModel.hashCode())) * 31)) * 31;
            String str = this.disclosure;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (str == null ? 0 : str.hashCode())) * 31, 31, this.showDisclosureIcon);
            BalanceHomeUi$FocusArea balanceHomeUi$FocusArea = this.focusArea;
            int hashCode7 = (m + (balanceHomeUi$FocusArea == null ? 0 : balanceHomeUi$FocusArea.hashCode())) * 31;
            UiCallbackModel uiCallbackModel = this.activityEmbeddedModel;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (uiCallbackModel == null ? 0 : uiCallbackModel.hashCode())) * 31, 31, this.evergreenOverdraftEnabled);
            String str2 = this.overdraftBalanceSubtitle;
            return m2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(balanceViewModel=");
            sb.append(this.balanceViewModel);
            sb.append(", restrictedBalanceViewModel=");
            sb.append(this.restrictedBalanceViewModel);
            sb.append(", overdraftPillViewModel=");
            sb.append(this.overdraftPillViewModel);
            sb.append(", accountDetailsViewModel=");
            sb.append(this.accountDetailsViewModel);
            sb.append(", overdraftUpsellViewModel=");
            sb.append(this.overdraftUpsellViewModel);
            sb.append(", callToActionViewModel=");
            sb.append(this.callToActionViewModel);
            sb.append(", bankingSectionsUiCallbackModel=");
            sb.append(this.bankingSectionsUiCallbackModel);
            sb.append(", disclosure=");
            sb.append(this.disclosure);
            sb.append(", showDisclosureIcon=");
            sb.append(this.showDisclosureIcon);
            sb.append(", focusArea=");
            sb.append(this.focusArea);
            sb.append(", activityEmbeddedModel=");
            sb.append(this.activityEmbeddedModel);
            sb.append(", evergreenOverdraftEnabled=");
            sb.append(this.evergreenOverdraftEnabled);
            sb.append(", overdraftBalanceSubtitle=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.overdraftBalanceSubtitle, ")");
        }
    }

    public interface OverdraftPillViewModel {

        public final class NewUserExperience implements OverdraftPillViewModel {
            public static final NewUserExperience INSTANCE = new NewUserExperience();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NewUserExperience);
            }

            public final int hashCode() {
                return 1383203973;
            }

            @Override // com.squareup.cash.banking.viewmodels.BalanceHomeViewModel.OverdraftPillViewModel
            public final boolean isEnabled() {
                return false;
            }

            public final String toString() {
                return "NewUserExperience";
            }
        }

        public final class Off implements OverdraftPillViewModel {
            public static final Off INSTANCE = new Off();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Off);
            }

            public final int hashCode() {
                return 1135397023;
            }

            @Override // com.squareup.cash.banking.viewmodels.BalanceHomeViewModel.OverdraftPillViewModel
            public final boolean isEnabled() {
                return false;
            }

            public final String toString() {
                return "Off";
            }
        }

        public final class On implements OverdraftPillViewModel {
            public static final On INSTANCE = new On();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof On);
            }

            public final int hashCode() {
                return -101921617;
            }

            @Override // com.squareup.cash.banking.viewmodels.BalanceHomeViewModel.OverdraftPillViewModel
            public final boolean isEnabled() {
                return true;
            }

            public final String toString() {
                return "On";
            }
        }

        public final class Upsell implements OverdraftPillViewModel {
            public static final Upsell INSTANCE = new Upsell();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Upsell);
            }

            public final int hashCode() {
                return 1926754109;
            }

            @Override // com.squareup.cash.banking.viewmodels.BalanceHomeViewModel.OverdraftPillViewModel
            public final boolean isEnabled() {
                return false;
            }

            public final String toString() {
                return "Upsell";
            }
        }

        public final class Used implements OverdraftPillViewModel {
            public final String amountUsed;
            public final boolean isEnabled;
            public final boolean isWarning;

            public Used(String str, boolean z, boolean z2) {
                str.getClass();
                this.isEnabled = z;
                this.amountUsed = str;
                this.isWarning = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Used)) {
                    return false;
                }
                Used used = (Used) obj;
                return this.isEnabled == used.isEnabled && Intrinsics.areEqual(this.amountUsed, used.amountUsed) && this.isWarning == used.isWarning;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isWarning) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isEnabled) * 31, 31, this.amountUsed);
            }

            @Override // com.squareup.cash.banking.viewmodels.BalanceHomeViewModel.OverdraftPillViewModel
            public final boolean isEnabled() {
                return this.isEnabled;
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("Used(isEnabled=", ", amountUsed=", this.amountUsed, ", isWarning=", this.isEnabled), this.isWarning, ")");
            }
        }

        boolean isEnabled();
    }
}
