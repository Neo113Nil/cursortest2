package com.squareup.cash.banking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.bankingbenefits.api.v1_0.core.PaycheckDepositStatusActiveBenefitType;

/* loaded from: classes.dex */
public final class BenefitsLeafletSheetScreen implements BankingSheets {
    public static final Parcelable.Creator<BenefitsLeafletSheetScreen> CREATOR = new SheetAppMessage.Creator(14);
    public final PaycheckDepositStatusActiveBenefitType benefit;

    public BenefitsLeafletSheetScreen(PaycheckDepositStatusActiveBenefitType paycheckDepositStatusActiveBenefitType) {
        paycheckDepositStatusActiveBenefitType.getClass();
        this.benefit = paycheckDepositStatusActiveBenefitType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitsLeafletSheetScreen) && this.benefit == ((BenefitsLeafletSheetScreen) obj).benefit;
    }

    public final int hashCode() {
        return this.benefit.hashCode();
    }

    public final String toString() {
        return "BenefitsLeafletSheetScreen(benefit=" + this.benefit + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.benefit.name());
    }
}
