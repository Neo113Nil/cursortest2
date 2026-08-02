package com.squareup.cash.account.settings.viewmodels;

import com.squareup.cash.account.settings.viewmodels.IdentityVerificationSectionViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PersonalInfoRow {

    public final class Address implements PersonalInfoRow {
        public final String address;

        public Address(String str) {
            this.address = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Address) && this.address.equals(((Address) obj).address);
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Address(address=", this.address, ")");
        }
    }

    public final class IdentityVerification implements PersonalInfoRow {
        public final IdentityVerificationSectionViewModel.Content content;

        public IdentityVerification(IdentityVerificationSectionViewModel.Content content) {
            content.getClass();
            this.content = content;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IdentityVerification) && Intrinsics.areEqual(this.content, ((IdentityVerification) obj).content);
        }

        public final int hashCode() {
            return this.content.hashCode();
        }

        public final String toString() {
            return "IdentityVerification(content=" + this.content + ")";
        }
    }

    public final class LegalName implements PersonalInfoRow {
        public final String legalName;

        public LegalName(String str) {
            str.getClass();
            this.legalName = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LegalName) && Intrinsics.areEqual(this.legalName, ((LegalName) obj).legalName);
        }

        public final int hashCode() {
            return this.legalName.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LegalName(legalName=", this.legalName, ")");
        }
    }
}
