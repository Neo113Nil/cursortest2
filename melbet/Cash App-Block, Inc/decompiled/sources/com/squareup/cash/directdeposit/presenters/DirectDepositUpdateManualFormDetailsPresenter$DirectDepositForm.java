package com.squareup.cash.directdeposit.presenters;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.presenters.DirectDepositForm;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm implements Parcelable {
    public static final Parcelable.Creator<DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm> CREATOR = new DirectDepositForm.Creator(1);
    public final boolean addSignature;
    public final String companyName;
    public final String fullName;
    public final PaycheckDepositAllocation paycheckDepositAllocation;

    public DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm(String str, String str2, PaycheckDepositAllocation paycheckDepositAllocation, boolean z) {
        str.getClass();
        str2.getClass();
        paycheckDepositAllocation.getClass();
        this.fullName = str;
        this.companyName = str2;
        this.paycheckDepositAllocation = paycheckDepositAllocation;
        this.addSignature = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm)) {
            return false;
        }
        DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm directDepositUpdateManualFormDetailsPresenter$DirectDepositForm = (DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm) obj;
        return Intrinsics.areEqual(this.fullName, directDepositUpdateManualFormDetailsPresenter$DirectDepositForm.fullName) && Intrinsics.areEqual(this.companyName, directDepositUpdateManualFormDetailsPresenter$DirectDepositForm.companyName) && Intrinsics.areEqual(this.paycheckDepositAllocation, directDepositUpdateManualFormDetailsPresenter$DirectDepositForm.paycheckDepositAllocation) && this.addSignature == directDepositUpdateManualFormDetailsPresenter$DirectDepositForm.addSignature;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.addSignature) + ((this.paycheckDepositAllocation.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fullName.hashCode() * 31, 31, this.companyName)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DirectDepositForm(fullName=", this.fullName, ", companyName=", this.companyName, ", paycheckDepositAllocation=");
        m.append(this.paycheckDepositAllocation);
        m.append(", addSignature=");
        m.append(this.addSignature);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.fullName);
        parcel.writeString(this.companyName);
        parcel.writeParcelable(this.paycheckDepositAllocation, i);
        parcel.writeInt(this.addSignature ? 1 : 0);
    }
}
