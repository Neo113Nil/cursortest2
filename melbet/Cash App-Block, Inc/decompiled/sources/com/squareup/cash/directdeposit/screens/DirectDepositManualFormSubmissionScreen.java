package com.squareup.cash.directdeposit.screens;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface DirectDepositManualFormSubmissionScreen extends DirectDepositManualSetupScreen, Parcelable {
    FormDetails getFormDetails();

    /* loaded from: classes6.dex */
    public final class FormDetails implements Parcelable {
        public static final Parcelable.Creator<FormDetails> CREATOR = new Limit.Creator(16);
        public final boolean addSignature;
        public final Redacted companyName;
        public final Redacted fullName;
        public final PaycheckDepositAllocation paycheckDepositAllocation;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public FormDetails(String str, String str2, PaycheckDepositAllocation paycheckDepositAllocation, boolean z) {
            this(new RedactedString(str), new RedactedString(str2), paycheckDepositAllocation, z);
            str.getClass();
            str2.getClass();
            paycheckDepositAllocation.getClass();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormDetails)) {
                return false;
            }
            FormDetails formDetails = (FormDetails) obj;
            return Intrinsics.areEqual(this.fullName, formDetails.fullName) && Intrinsics.areEqual(this.companyName, formDetails.companyName) && Intrinsics.areEqual(this.paycheckDepositAllocation, formDetails.paycheckDepositAllocation) && this.addSignature == formDetails.addSignature;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.addSignature) + ((this.paycheckDepositAllocation.hashCode() + re$$ExternalSyntheticOutline0.m(this.companyName, this.fullName.hashCode() * 31, 31)) * 31);
        }

        public final String toString() {
            return "FormDetails(fullName=" + this.fullName + ", companyName=" + this.companyName + ", paycheckDepositAllocation=" + this.paycheckDepositAllocation + ", addSignature=" + this.addSignature + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.fullName, i);
            parcel.writeParcelable(this.companyName, i);
            parcel.writeParcelable(this.paycheckDepositAllocation, i);
            parcel.writeInt(this.addSignature ? 1 : 0);
        }

        public FormDetails(Redacted redacted, Redacted redacted2, PaycheckDepositAllocation paycheckDepositAllocation, boolean z) {
            redacted.getClass();
            redacted2.getClass();
            paycheckDepositAllocation.getClass();
            this.fullName = redacted;
            this.companyName = redacted2;
            this.paycheckDepositAllocation = paycheckDepositAllocation;
            this.addSignature = z;
        }
    }
}
