package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PaymentDeviceCustomizationScreen implements BlockersScreens {
    public static final Parcelable.Creator<PaymentDeviceCustomizationScreen> CREATOR = new CheckCaptureQuestion.Creator(6);
    public final PaymentDeviceCustomizationBlocker blocker;
    public final BlockersData blockersData;

    public PaymentDeviceCustomizationScreen(BlockersData blockersData, PaymentDeviceCustomizationBlocker paymentDeviceCustomizationBlocker) {
        blockersData.getClass();
        paymentDeviceCustomizationBlocker.getClass();
        this.blockersData = blockersData;
        this.blocker = paymentDeviceCustomizationBlocker;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDeviceCustomizationScreen)) {
            return false;
        }
        PaymentDeviceCustomizationScreen paymentDeviceCustomizationScreen = (PaymentDeviceCustomizationScreen) obj;
        return Intrinsics.areEqual(this.blockersData, paymentDeviceCustomizationScreen.blockersData) && Intrinsics.areEqual(this.blocker, paymentDeviceCustomizationScreen.blocker);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentDeviceCustomizationScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.blocker, i);
    }
}
