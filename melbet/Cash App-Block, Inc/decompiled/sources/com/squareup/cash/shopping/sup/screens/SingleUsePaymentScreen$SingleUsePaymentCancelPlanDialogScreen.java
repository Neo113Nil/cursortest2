package com.squareup.cash.shopping.sup.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen implements Screen, DialogScreen {
    public static final Parcelable.Creator<SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen> CREATOR = new ErrorScreen.Creator(19);
    public final String downPayment;
    public final String estimatedTotal;

    public SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.downPayment = str;
        this.estimatedTotal = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen)) {
            return false;
        }
        SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen singleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen = (SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen) obj;
        return Intrinsics.areEqual(this.downPayment, singleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen.downPayment) && Intrinsics.areEqual(this.estimatedTotal, singleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen.estimatedTotal);
    }

    public final int hashCode() {
        return this.estimatedTotal.hashCode() + (this.downPayment.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SingleUsePaymentCancelPlanDialogScreen(downPayment=", this.downPayment, ", estimatedTotal=", this.estimatedTotal, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.downPayment);
        parcel.writeString(this.estimatedTotal);
    }
}
