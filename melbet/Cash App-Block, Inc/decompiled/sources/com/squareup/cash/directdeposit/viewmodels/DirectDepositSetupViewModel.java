package com.squareup.cash.directdeposit.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DirectDepositSetupViewModel {
    public final CreateFormSection createFormSection;
    public final String disclosure;
    public final HeaderSection headerSection;
    public final String helpActionLabel;
    public final SetupYourselfSection setupYourselfSection;

    public final class AccountDetailsContentHome {
        public final String accountContentDescription;
        public final String accountLabel;
        public final Redacted accountNumber;
        public final String routingContentDescription;
        public final String routingLabel;
        public final Redacted routingNumber;

        public AccountDetailsContentHome(String str, RedactedString redactedString, String str2, String str3, RedactedString redactedString2, String str4) {
            str.getClass();
            str3.getClass();
            this.routingLabel = str;
            this.routingNumber = redactedString;
            this.routingContentDescription = str2;
            this.accountLabel = str3;
            this.accountNumber = redactedString2;
            this.accountContentDescription = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountDetailsContentHome)) {
                return false;
            }
            AccountDetailsContentHome accountDetailsContentHome = (AccountDetailsContentHome) obj;
            return Intrinsics.areEqual(this.routingLabel, accountDetailsContentHome.routingLabel) && Intrinsics.areEqual(this.routingNumber, accountDetailsContentHome.routingNumber) && Intrinsics.areEqual(this.routingContentDescription, accountDetailsContentHome.routingContentDescription) && Intrinsics.areEqual(this.accountLabel, accountDetailsContentHome.accountLabel) && Intrinsics.areEqual(this.accountNumber, accountDetailsContentHome.accountNumber) && Intrinsics.areEqual(this.accountContentDescription, accountDetailsContentHome.accountContentDescription);
        }

        public final int hashCode() {
            int hashCode = this.routingLabel.hashCode() * 31;
            Redacted redacted = this.routingNumber;
            int hashCode2 = (hashCode + (redacted == null ? 0 : redacted.hashCode())) * 31;
            String str = this.routingContentDescription;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.accountLabel);
            Redacted redacted2 = this.accountNumber;
            int hashCode3 = (m + (redacted2 == null ? 0 : redacted2.hashCode())) * 31;
            String str2 = this.accountContentDescription;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccountDetailsContentHome(routingLabel=");
            sb.append(this.routingLabel);
            sb.append(", routingNumber=");
            sb.append(this.routingNumber);
            sb.append(", routingContentDescription=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.routingContentDescription, ", accountLabel=", this.accountLabel, ", accountNumber=");
            sb.append(this.accountNumber);
            sb.append(", accountContentDescription=");
            sb.append(this.accountContentDescription);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class CreateFormSection {
        public final String description;
        public final String label;

        public CreateFormSection(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.label = str;
            this.description = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreateFormSection)) {
                return false;
            }
            CreateFormSection createFormSection = (CreateFormSection) obj;
            return Intrinsics.areEqual(this.label, createFormSection.label) && Intrinsics.areEqual(this.description, createFormSection.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + (this.label.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("CreateFormSection(label=", this.label, ", description=", this.description, ")");
        }
    }

    public final class HeaderSection {
        public final String subtitle;
        public final String title;

        public HeaderSection(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderSection)) {
                return false;
            }
            HeaderSection headerSection = (HeaderSection) obj;
            return Intrinsics.areEqual(this.title, headerSection.title) && Intrinsics.areEqual(this.subtitle, headerSection.subtitle);
        }

        public final int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("HeaderSection(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }

    public final class SetupYourselfSection {
        public final AccountDetailsContentHome accountDetails;
        public final String description;
        public final String title;

        public SetupYourselfSection(String str, String str2, AccountDetailsContentHome accountDetailsContentHome) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.description = str2;
            this.accountDetails = accountDetailsContentHome;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetupYourselfSection)) {
                return false;
            }
            SetupYourselfSection setupYourselfSection = (SetupYourselfSection) obj;
            return Intrinsics.areEqual(this.title, setupYourselfSection.title) && Intrinsics.areEqual(this.description, setupYourselfSection.description) && this.accountDetails.equals(setupYourselfSection.accountDetails);
        }

        public final int hashCode() {
            return this.accountDetails.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SetupYourselfSection(title=", this.title, ", description=", this.description, ", accountDetails=");
            m.append(this.accountDetails);
            m.append(")");
            return m.toString();
        }
    }

    public DirectDepositSetupViewModel(HeaderSection headerSection, SetupYourselfSection setupYourselfSection, CreateFormSection createFormSection, String str, String str2) {
        str.getClass();
        this.headerSection = headerSection;
        this.setupYourselfSection = setupYourselfSection;
        this.createFormSection = createFormSection;
        this.helpActionLabel = str;
        this.disclosure = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectDepositSetupViewModel)) {
            return false;
        }
        DirectDepositSetupViewModel directDepositSetupViewModel = (DirectDepositSetupViewModel) obj;
        return this.headerSection.equals(directDepositSetupViewModel.headerSection) && this.setupYourselfSection.equals(directDepositSetupViewModel.setupYourselfSection) && this.createFormSection.equals(directDepositSetupViewModel.createFormSection) && Intrinsics.areEqual(this.helpActionLabel, directDepositSetupViewModel.helpActionLabel) && this.disclosure.equals(directDepositSetupViewModel.disclosure);
    }

    public final int hashCode() {
        return this.disclosure.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.createFormSection.hashCode() + ((this.setupYourselfSection.hashCode() + (this.headerSection.hashCode() * 31)) * 31)) * 31, 31, this.helpActionLabel);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectDepositSetupViewModel(headerSection=");
        sb.append(this.headerSection);
        sb.append(", setupYourselfSection=");
        sb.append(this.setupYourselfSection);
        sb.append(", createFormSection=");
        sb.append(this.createFormSection);
        sb.append(", helpActionLabel=");
        sb.append(this.helpActionLabel);
        sb.append(", disclosure=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.disclosure, ")");
    }
}
