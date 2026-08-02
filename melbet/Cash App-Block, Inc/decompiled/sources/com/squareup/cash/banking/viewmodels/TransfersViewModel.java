package com.squareup.cash.banking.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class TransfersViewModel {
    public final BankTransferContent bankTransferContent;
    public final TransfersViewModel$Companion$TransfersTab tab;
    public final WireTransferContent wireTransferContent;

    public interface BankTransferContent {

        public final class HasCashCard implements BankTransferContent {
            public final AccountDetailsContent accountDetailsContent;
            public final String callToActionButtonText;

            public HasCashCard(String str, AccountDetailsContent accountDetailsContent) {
                str.getClass();
                this.callToActionButtonText = str;
                this.accountDetailsContent = accountDetailsContent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HasCashCard)) {
                    return false;
                }
                HasCashCard hasCashCard = (HasCashCard) obj;
                return Intrinsics.areEqual(this.callToActionButtonText, hasCashCard.callToActionButtonText) && this.accountDetailsContent.equals(hasCashCard.accountDetailsContent);
            }

            public final int hashCode() {
                return this.accountDetailsContent.hashCode() + (this.callToActionButtonText.hashCode() * 31);
            }

            public final String toString() {
                return "HasCashCard(callToActionButtonText=" + this.callToActionButtonText + ", accountDetailsContent=" + this.accountDetailsContent + ")";
            }
        }

        public interface NoCashCard extends BankTransferContent {

            public final class CashCardNotOrdered implements NoCashCard {
                public final String callToActionButtonText;
                public final String secondaryDescription;

                public CashCardNotOrdered(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    this.callToActionButtonText = str;
                    this.secondaryDescription = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CashCardNotOrdered)) {
                        return false;
                    }
                    CashCardNotOrdered cashCardNotOrdered = (CashCardNotOrdered) obj;
                    return Intrinsics.areEqual(this.callToActionButtonText, cashCardNotOrdered.callToActionButtonText) && Intrinsics.areEqual(this.secondaryDescription, cashCardNotOrdered.secondaryDescription);
                }

                @Override // com.squareup.cash.banking.viewmodels.TransfersViewModel.BankTransferContent.NoCashCard
                public final String getSecondaryDescription() {
                    return this.secondaryDescription;
                }

                public final int hashCode() {
                    return this.secondaryDescription.hashCode() + (this.callToActionButtonText.hashCode() * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("CashCardNotOrdered(callToActionButtonText=", this.callToActionButtonText, ", secondaryDescription=", this.secondaryDescription, ")");
                }
            }

            public final class CashCardOrdered implements NoCashCard {
                public final String callToActionButtonText;
                public final String secondaryDescription;

                public CashCardOrdered(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    this.callToActionButtonText = str;
                    this.secondaryDescription = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CashCardOrdered)) {
                        return false;
                    }
                    CashCardOrdered cashCardOrdered = (CashCardOrdered) obj;
                    return Intrinsics.areEqual(this.callToActionButtonText, cashCardOrdered.callToActionButtonText) && Intrinsics.areEqual(this.secondaryDescription, cashCardOrdered.secondaryDescription);
                }

                @Override // com.squareup.cash.banking.viewmodels.TransfersViewModel.BankTransferContent.NoCashCard
                public final String getSecondaryDescription() {
                    return this.secondaryDescription;
                }

                public final int hashCode() {
                    return this.secondaryDescription.hashCode() + (this.callToActionButtonText.hashCode() * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("CashCardOrdered(callToActionButtonText=", this.callToActionButtonText, ", secondaryDescription=", this.secondaryDescription, ")");
                }
            }

            String getSecondaryDescription();
        }
    }

    public interface WireTransferContent {

        public final class Deactivated implements WireTransferContent {
            public final String callToActionButtonText;
            public final String description;
            public final String title;

            public Deactivated(String str, String str2, String str3) {
                str.getClass();
                this.title = str;
                this.description = str2;
                this.callToActionButtonText = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Deactivated)) {
                    return false;
                }
                Deactivated deactivated = (Deactivated) obj;
                return Intrinsics.areEqual(this.title, deactivated.title) && Intrinsics.areEqual(this.description, deactivated.description) && Intrinsics.areEqual(this.callToActionButtonText, deactivated.callToActionButtonText);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.description;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.callToActionButtonText;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Deactivated(title=", this.title, ", description=", this.description, ", callToActionButtonText="), this.callToActionButtonText, ")");
            }
        }

        public final class Eligible implements WireTransferContent {
            public final AccountDetailsContent accountDetailsContent;
            public final String callToActionButtonText;
            public final String legalName;
            public final PartnerBankDetailsContent partnerBankDetailsContent;
            public final List requirements;

            public final class PartnerBankDetailsContent {
                public final String cityStateZip;
                public final String name;
                public final String street;

                public PartnerBankDetailsContent(String str, String str2, String str3) {
                    re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                    this.name = str;
                    this.street = str2;
                    this.cityStateZip = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PartnerBankDetailsContent)) {
                        return false;
                    }
                    PartnerBankDetailsContent partnerBankDetailsContent = (PartnerBankDetailsContent) obj;
                    return Intrinsics.areEqual(this.name, partnerBankDetailsContent.name) && Intrinsics.areEqual(this.street, partnerBankDetailsContent.street) && Intrinsics.areEqual(this.cityStateZip, partnerBankDetailsContent.cityStateZip);
                }

                public final int hashCode() {
                    return this.cityStateZip.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.street);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PartnerBankDetailsContent(name=", this.name, ", street=", this.street, ", cityStateZip="), this.cityStateZip, ")");
                }
            }

            public Eligible(String str, AccountDetailsContent accountDetailsContent, PartnerBankDetailsContent partnerBankDetailsContent, String str2, List list) {
                str.getClass();
                list.getClass();
                this.callToActionButtonText = str;
                this.accountDetailsContent = accountDetailsContent;
                this.partnerBankDetailsContent = partnerBankDetailsContent;
                this.legalName = str2;
                this.requirements = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Eligible)) {
                    return false;
                }
                Eligible eligible = (Eligible) obj;
                return Intrinsics.areEqual(this.callToActionButtonText, eligible.callToActionButtonText) && this.accountDetailsContent.equals(eligible.accountDetailsContent) && this.partnerBankDetailsContent.equals(eligible.partnerBankDetailsContent) && Intrinsics.areEqual(this.legalName, eligible.legalName) && Intrinsics.areEqual(this.requirements, eligible.requirements);
            }

            public final int hashCode() {
                int hashCode = (this.partnerBankDetailsContent.hashCode() + ((this.accountDetailsContent.hashCode() + (this.callToActionButtonText.hashCode() * 31)) * 31)) * 31;
                String str = this.legalName;
                return this.requirements.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Eligible(callToActionButtonText=");
                sb.append(this.callToActionButtonText);
                sb.append(", accountDetailsContent=");
                sb.append(this.accountDetailsContent);
                sb.append(", partnerBankDetailsContent=");
                sb.append(this.partnerBankDetailsContent);
                sb.append(", legalName=");
                sb.append(this.legalName);
                sb.append(", requirements=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.requirements, ")");
            }
        }

        public final class Ineligible implements WireTransferContent {
            public final String callToActionButtonText;
            public final String secondaryDescription;

            public Ineligible(String str, String str2) {
                this.callToActionButtonText = str;
                this.secondaryDescription = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Ineligible)) {
                    return false;
                }
                Ineligible ineligible = (Ineligible) obj;
                return Intrinsics.areEqual(this.callToActionButtonText, ineligible.callToActionButtonText) && Intrinsics.areEqual(this.secondaryDescription, ineligible.secondaryDescription);
            }

            public final int hashCode() {
                String str = this.callToActionButtonText;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.secondaryDescription;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Ineligible(callToActionButtonText=", this.callToActionButtonText, ", secondaryDescription=", this.secondaryDescription, ")");
            }
        }
    }

    public TransfersViewModel(BankTransferContent bankTransferContent, WireTransferContent wireTransferContent, TransfersViewModel$Companion$TransfersTab transfersViewModel$Companion$TransfersTab) {
        transfersViewModel$Companion$TransfersTab.getClass();
        this.bankTransferContent = bankTransferContent;
        this.wireTransferContent = wireTransferContent;
        this.tab = transfersViewModel$Companion$TransfersTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransfersViewModel)) {
            return false;
        }
        TransfersViewModel transfersViewModel = (TransfersViewModel) obj;
        return this.bankTransferContent.equals(transfersViewModel.bankTransferContent) && Intrinsics.areEqual(this.wireTransferContent, transfersViewModel.wireTransferContent) && this.tab == transfersViewModel.tab;
    }

    public final int hashCode() {
        int hashCode = this.bankTransferContent.hashCode() * 31;
        WireTransferContent wireTransferContent = this.wireTransferContent;
        return this.tab.hashCode() + ((hashCode + (wireTransferContent == null ? 0 : wireTransferContent.hashCode())) * 31);
    }

    public final String toString() {
        return "TransfersViewModel(bankTransferContent=" + this.bankTransferContent + ", wireTransferContent=" + this.wireTransferContent + ", tab=" + this.tab + ")";
    }
}
