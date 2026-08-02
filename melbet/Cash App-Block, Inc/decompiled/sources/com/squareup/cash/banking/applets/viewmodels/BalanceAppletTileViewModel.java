package com.squareup.cash.banking.applets.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class BalanceAppletTileViewModel {

    public final class BalanceObfuscationButton {
        public final boolean areBalancesObfuscated;
        public final String clickLabel;
        public final String contentDescription;

        public BalanceObfuscationButton(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.areBalancesObfuscated = z;
            this.contentDescription = str;
            this.clickLabel = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BalanceObfuscationButton)) {
                return false;
            }
            BalanceObfuscationButton balanceObfuscationButton = (BalanceObfuscationButton) obj;
            return this.areBalancesObfuscated == balanceObfuscationButton.areBalancesObfuscated && Intrinsics.areEqual(this.contentDescription, balanceObfuscationButton.contentDescription) && Intrinsics.areEqual(this.clickLabel, balanceObfuscationButton.clickLabel);
        }

        public final int hashCode() {
            return this.clickLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.areBalancesObfuscated) * 31, 31, this.contentDescription);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("BalanceObfuscationButton(areBalancesObfuscated=", ", contentDescription=", this.contentDescription, ", clickLabel=", this.areBalancesObfuscated), this.clickLabel, ")");
        }
    }

    public final class ConvertedBalance {
        public final String formattedBalance;
        public final long rawBalance;

        public ConvertedBalance(String str, long j) {
            str.getClass();
            this.formattedBalance = str;
            this.rawBalance = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConvertedBalance)) {
                return false;
            }
            ConvertedBalance convertedBalance = (ConvertedBalance) obj;
            return Intrinsics.areEqual(this.formattedBalance, convertedBalance.formattedBalance) && this.rawBalance == convertedBalance.rawBalance;
        }

        public final int hashCode() {
            return Long.hashCode(this.rawBalance) + (this.formattedBalance.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("ConvertedBalance(formattedBalance=", this.formattedBalance, ", rawBalance=", this.rawBalance);
            m.append(")");
            return m.toString();
        }
    }

    public abstract class Loaded extends BalanceAppletTileViewModel {

        public final class Default extends Loaded {
            public final String accountContentDescription;
            public final String accountText;
            public final BalanceMovementButtons balanceMovementButtons;
            public final BalanceObfuscationButton balanceObfuscationButton;
            public final String formattedBalance;
            public final boolean isManagedAccount;
            public final String onTileClickLabel;
            public final OverdraftModel overdraftModel;
            public final long rawBalance;
            public final String restrictedBalanceLabel;
            public final String routingContentDescription;
            public final String routingText;
            public final String title;

            public Default(String str, BalanceMovementButtons balanceMovementButtons, String str2, String str3, String str4, String str5, long j, BalanceObfuscationButton balanceObfuscationButton, String str6, String str7, OverdraftModel overdraftModel, String str8, boolean z) {
                str.getClass();
                str5.getClass();
                this.title = str;
                this.balanceMovementButtons = balanceMovementButtons;
                this.onTileClickLabel = str2;
                this.accountText = str3;
                this.accountContentDescription = str4;
                this.formattedBalance = str5;
                this.rawBalance = j;
                this.balanceObfuscationButton = balanceObfuscationButton;
                this.routingText = str6;
                this.routingContentDescription = str7;
                this.overdraftModel = overdraftModel;
                this.restrictedBalanceLabel = str8;
                this.isManagedAccount = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Default)) {
                    return false;
                }
                Default r5 = (Default) obj;
                return Intrinsics.areEqual(this.title, r5.title) && this.balanceMovementButtons.equals(r5.balanceMovementButtons) && Intrinsics.areEqual(this.onTileClickLabel, r5.onTileClickLabel) && Intrinsics.areEqual(this.accountText, r5.accountText) && Intrinsics.areEqual(this.accountContentDescription, r5.accountContentDescription) && Intrinsics.areEqual(this.formattedBalance, r5.formattedBalance) && this.rawBalance == r5.rawBalance && this.balanceObfuscationButton.equals(r5.balanceObfuscationButton) && Intrinsics.areEqual(this.routingText, r5.routingText) && Intrinsics.areEqual(this.routingContentDescription, r5.routingContentDescription) && Intrinsics.areEqual(this.overdraftModel, r5.overdraftModel) && Intrinsics.areEqual(this.restrictedBalanceLabel, r5.restrictedBalanceLabel) && this.isManagedAccount == r5.isManagedAccount;
            }

            @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
            public final String getAccountContentDescription() {
                return this.accountContentDescription;
            }

            @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
            public final String getAccountText() {
                return this.accountText;
            }

            @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel
            public final BalanceMovementButtons getBalanceMovementButtons() {
                return this.balanceMovementButtons;
            }

            @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
            public final BalanceObfuscationButton getBalanceObfuscationButton() {
                return this.balanceObfuscationButton;
            }

            @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
            public final String getFormattedBalance() {
                return this.formattedBalance;
            }

            @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
            public final String getOnTileClickLabel() {
                return this.onTileClickLabel;
            }

            @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
            public final long getRawBalance() {
                return this.rawBalance;
            }

            @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                int hashCode = (this.balanceMovementButtons.hashCode() + (this.title.hashCode() * 31)) * 31;
                String str = this.onTileClickLabel;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.accountText;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.accountContentDescription;
                int hashCode4 = (this.balanceObfuscationButton.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.formattedBalance), 31, this.rawBalance)) * 31;
                String str4 = this.routingText;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.routingContentDescription;
                int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                OverdraftModel overdraftModel = this.overdraftModel;
                int hashCode7 = (hashCode6 + (overdraftModel == null ? 0 : overdraftModel.hashCode())) * 31;
                String str6 = this.restrictedBalanceLabel;
                return Boolean.hashCode(this.isManagedAccount) + ((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Default(title=");
                sb.append(this.title);
                sb.append(", balanceMovementButtons=");
                sb.append(this.balanceMovementButtons);
                sb.append(", onTileClickLabel=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.onTileClickLabel, ", accountText=", this.accountText, ", accountContentDescription=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.accountContentDescription, ", formattedBalance=", this.formattedBalance, ", rawBalance=");
                sb.append(this.rawBalance);
                sb.append(", balanceObfuscationButton=");
                sb.append(this.balanceObfuscationButton);
                Boxes$$ExternalSyntheticOutline1.m(sb, ", routingText=", this.routingText, ", routingContentDescription=", this.routingContentDescription);
                sb.append(", overdraftModel=");
                sb.append(this.overdraftModel);
                sb.append(", restrictedBalanceLabel=");
                sb.append(this.restrictedBalanceLabel);
                sb.append(", isManagedAccount=");
                sb.append(this.isManagedAccount);
                sb.append(")");
                return sb.toString();
            }
        }

        public abstract class Lite extends Loaded {

            public final class Installed extends Lite {
                public final String accountContentDescription;
                public final String accountText;
                public final BalanceMovementButtons balanceMovementButtons;
                public final BalanceObfuscationButton balanceObfuscationButton;
                public final ConvertedBalance convertedBalance;
                public final String formattedBalance;
                public final long rawBalance;
                public final String title;

                public Installed(String str, BalanceMovementButtons balanceMovementButtons, String str2, String str3, String str4, long j, BalanceObfuscationButton balanceObfuscationButton, ConvertedBalance convertedBalance) {
                    str.getClass();
                    str4.getClass();
                    this.title = str;
                    this.balanceMovementButtons = balanceMovementButtons;
                    this.accountText = str2;
                    this.accountContentDescription = str3;
                    this.formattedBalance = str4;
                    this.rawBalance = j;
                    this.balanceObfuscationButton = balanceObfuscationButton;
                    this.convertedBalance = convertedBalance;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Installed)) {
                        return false;
                    }
                    Installed installed = (Installed) obj;
                    return Intrinsics.areEqual(this.title, installed.title) && this.balanceMovementButtons.equals(installed.balanceMovementButtons) && Intrinsics.areEqual(this.accountText, installed.accountText) && Intrinsics.areEqual(this.accountContentDescription, installed.accountContentDescription) && Intrinsics.areEqual(this.formattedBalance, installed.formattedBalance) && this.rawBalance == installed.rawBalance && this.balanceObfuscationButton.equals(installed.balanceObfuscationButton) && Intrinsics.areEqual(this.convertedBalance, installed.convertedBalance);
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final String getAccountContentDescription() {
                    return this.accountContentDescription;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final String getAccountText() {
                    return this.accountText;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel
                public final BalanceMovementButtons getBalanceMovementButtons() {
                    return this.balanceMovementButtons;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final BalanceObfuscationButton getBalanceObfuscationButton() {
                    return this.balanceObfuscationButton;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded.Lite
                public final ConvertedBalance getConvertedBalance() {
                    return this.convertedBalance;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final String getFormattedBalance() {
                    return this.formattedBalance;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final String getOnTileClickLabel() {
                    return null;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final long getRawBalance() {
                    return this.rawBalance;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final String getTitle() {
                    return this.title;
                }

                public final int hashCode() {
                    int hashCode = (this.balanceMovementButtons.hashCode() + (this.title.hashCode() * 31)) * 961;
                    String str = this.accountText;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.accountContentDescription;
                    int hashCode3 = (this.balanceObfuscationButton.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.formattedBalance), 31, this.rawBalance)) * 31;
                    ConvertedBalance convertedBalance = this.convertedBalance;
                    return hashCode3 + (convertedBalance != null ? convertedBalance.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Installed(title=");
                    sb.append(this.title);
                    sb.append(", balanceMovementButtons=");
                    sb.append(this.balanceMovementButtons);
                    sb.append(", onTileClickLabel=null, accountText=");
                    Boxes$$ExternalSyntheticOutline1.m(sb, this.accountText, ", accountContentDescription=", this.accountContentDescription, ", formattedBalance=");
                    sb.append(this.formattedBalance);
                    sb.append(", rawBalance=");
                    sb.append(this.rawBalance);
                    sb.append(", balanceObfuscationButton=");
                    sb.append(this.balanceObfuscationButton);
                    sb.append(", convertedBalance=");
                    sb.append(this.convertedBalance);
                    sb.append(")");
                    return sb.toString();
                }
            }

            public final class Uninstalled extends Lite {
                public final String accountContentDescription;
                public final String accountText;
                public final BalanceMovementButtons balanceMovementButtons;
                public final BalanceObfuscationButton balanceObfuscationButton;
                public final ConvertedBalance convertedBalance;
                public final String formattedBalance;
                public final long rawBalance;
                public final String title;
                public final UninstalledRowModel uninstalledRowModel;

                public final class UninstalledRowModel {
                    public final String subtitle;
                    public final String title;

                    public UninstalledRowModel(String str, String str2) {
                        str.getClass();
                        str2.getClass();
                        this.title = str;
                        this.subtitle = str2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof UninstalledRowModel)) {
                            return false;
                        }
                        UninstalledRowModel uninstalledRowModel = (UninstalledRowModel) obj;
                        return Intrinsics.areEqual(this.title, uninstalledRowModel.title) && Intrinsics.areEqual(this.subtitle, uninstalledRowModel.subtitle);
                    }

                    public final int hashCode() {
                        return this.subtitle.hashCode() + (this.title.hashCode() * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("UninstalledRowModel(title=", this.title, ", subtitle=", this.subtitle, ")");
                    }
                }

                public Uninstalled(String str, BalanceMovementButtons balanceMovementButtons, String str2, String str3, String str4, long j, BalanceObfuscationButton balanceObfuscationButton, ConvertedBalance convertedBalance, UninstalledRowModel uninstalledRowModel) {
                    str.getClass();
                    str4.getClass();
                    uninstalledRowModel.getClass();
                    this.title = str;
                    this.balanceMovementButtons = balanceMovementButtons;
                    this.accountText = str2;
                    this.accountContentDescription = str3;
                    this.formattedBalance = str4;
                    this.rawBalance = j;
                    this.balanceObfuscationButton = balanceObfuscationButton;
                    this.convertedBalance = convertedBalance;
                    this.uninstalledRowModel = uninstalledRowModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Uninstalled)) {
                        return false;
                    }
                    Uninstalled uninstalled = (Uninstalled) obj;
                    return Intrinsics.areEqual(this.title, uninstalled.title) && this.balanceMovementButtons.equals(uninstalled.balanceMovementButtons) && Intrinsics.areEqual(this.accountText, uninstalled.accountText) && Intrinsics.areEqual(this.accountContentDescription, uninstalled.accountContentDescription) && Intrinsics.areEqual(this.formattedBalance, uninstalled.formattedBalance) && this.rawBalance == uninstalled.rawBalance && this.balanceObfuscationButton.equals(uninstalled.balanceObfuscationButton) && Intrinsics.areEqual(this.convertedBalance, uninstalled.convertedBalance) && Intrinsics.areEqual(this.uninstalledRowModel, uninstalled.uninstalledRowModel);
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final String getAccountContentDescription() {
                    return this.accountContentDescription;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final String getAccountText() {
                    return this.accountText;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel
                public final BalanceMovementButtons getBalanceMovementButtons() {
                    return this.balanceMovementButtons;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final BalanceObfuscationButton getBalanceObfuscationButton() {
                    return this.balanceObfuscationButton;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded.Lite
                public final ConvertedBalance getConvertedBalance() {
                    return this.convertedBalance;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final String getFormattedBalance() {
                    return this.formattedBalance;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final String getOnTileClickLabel() {
                    return null;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final long getRawBalance() {
                    return this.rawBalance;
                }

                @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel.Loaded
                public final String getTitle() {
                    return this.title;
                }

                public final int hashCode() {
                    int hashCode = (this.balanceMovementButtons.hashCode() + (this.title.hashCode() * 31)) * 961;
                    String str = this.accountText;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.accountContentDescription;
                    int hashCode3 = (this.balanceObfuscationButton.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.formattedBalance), 31, this.rawBalance)) * 31;
                    ConvertedBalance convertedBalance = this.convertedBalance;
                    return this.uninstalledRowModel.hashCode() + ((hashCode3 + (convertedBalance != null ? convertedBalance.hashCode() : 0)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Uninstalled(title=");
                    sb.append(this.title);
                    sb.append(", balanceMovementButtons=");
                    sb.append(this.balanceMovementButtons);
                    sb.append(", onTileClickLabel=null, accountText=");
                    Boxes$$ExternalSyntheticOutline1.m(sb, this.accountText, ", accountContentDescription=", this.accountContentDescription, ", formattedBalance=");
                    sb.append(this.formattedBalance);
                    sb.append(", rawBalance=");
                    sb.append(this.rawBalance);
                    sb.append(", balanceObfuscationButton=");
                    sb.append(this.balanceObfuscationButton);
                    sb.append(", convertedBalance=");
                    sb.append(this.convertedBalance);
                    sb.append(", uninstalledRowModel=");
                    sb.append(this.uninstalledRowModel);
                    sb.append(")");
                    return sb.toString();
                }
            }

            public abstract ConvertedBalance getConvertedBalance();
        }

        public abstract String getAccountContentDescription();

        public abstract String getAccountText();

        public abstract BalanceObfuscationButton getBalanceObfuscationButton();

        public abstract String getFormattedBalance();

        public abstract String getOnTileClickLabel();

        public abstract long getRawBalance();

        public abstract String getTitle();
    }

    public final class Loading extends BalanceAppletTileViewModel {
        public final BalanceMovementButtons balanceMovementButtons;
        public final String title;

        public Loading(String str, BalanceMovementButtons balanceMovementButtons) {
            str.getClass();
            this.title = str;
            this.balanceMovementButtons = balanceMovementButtons;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return Intrinsics.areEqual(this.title, loading.title) && this.balanceMovementButtons.equals(loading.balanceMovementButtons);
        }

        @Override // com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel
        public final BalanceMovementButtons getBalanceMovementButtons() {
            return this.balanceMovementButtons;
        }

        public final int hashCode() {
            return (this.balanceMovementButtons.hashCode() + (this.title.hashCode() * 31)) * 31;
        }

        public final String toString() {
            return "Loading(title=" + this.title + ", balanceMovementButtons=" + this.balanceMovementButtons + ", onTileClickLabel=null)";
        }
    }

    public final class OverdraftModel {
        public final String amountUsedText;
        public final boolean useWarningTextColor;

        public OverdraftModel(String str, boolean z) {
            str.getClass();
            this.amountUsedText = str;
            this.useWarningTextColor = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OverdraftModel)) {
                return false;
            }
            OverdraftModel overdraftModel = (OverdraftModel) obj;
            return Intrinsics.areEqual(this.amountUsedText, overdraftModel.amountUsedText) && this.useWarningTextColor == overdraftModel.useWarningTextColor;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.useWarningTextColor) + (this.amountUsedText.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("OverdraftModel(amountUsedText=", this.amountUsedText, ", useWarningTextColor=", ")", this.useWarningTextColor);
        }
    }

    public abstract BalanceMovementButtons getBalanceMovementButtons();

    public final class BalanceMovementButtons {
        public final boolean canDeposit;
        public final boolean canWithdraw;
        public final String depositButtonText;
        public final boolean showMathCta;
        public final String withdrawButtonText;
        public final boolean withdrawVisuallyDisabled;

        public BalanceMovementButtons(boolean z, boolean z2, String str, String str2, boolean z3, boolean z4) {
            str.getClass();
            str2.getClass();
            this.canDeposit = z;
            this.canWithdraw = z2;
            this.depositButtonText = str;
            this.withdrawButtonText = str2;
            this.showMathCta = z3;
            this.withdrawVisuallyDisabled = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BalanceMovementButtons)) {
                return false;
            }
            BalanceMovementButtons balanceMovementButtons = (BalanceMovementButtons) obj;
            return this.canDeposit == balanceMovementButtons.canDeposit && this.canWithdraw == balanceMovementButtons.canWithdraw && Intrinsics.areEqual(this.depositButtonText, balanceMovementButtons.depositButtonText) && Intrinsics.areEqual(this.withdrawButtonText, balanceMovementButtons.withdrawButtonText) && this.showMathCta == balanceMovementButtons.showMathCta && this.withdrawVisuallyDisabled == balanceMovementButtons.withdrawVisuallyDisabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.withdrawVisuallyDisabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.canDeposit) * 31, 31, this.canWithdraw), 31, this.depositButtonText), 31, this.withdrawButtonText), 31, this.showMathCta);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("BalanceMovementButtons(canDeposit=", ", canWithdraw=", ", depositButtonText=", this.canDeposit, this.canWithdraw);
            Boxes$$ExternalSyntheticOutline1.m(m, this.depositButtonText, ", withdrawButtonText=", this.withdrawButtonText, ", showMathCta=");
            return Request$Priority$EnumUnboxingLocalUtility.m(m, this.showMathCta, ", withdrawVisuallyDisabled=", this.withdrawVisuallyDisabled, ")");
        }

        public /* synthetic */ BalanceMovementButtons(boolean z, boolean z2, String str, String str2, int i) {
            this(z, z2, str, str2, (i & 16) == 0, false);
        }
    }
}
