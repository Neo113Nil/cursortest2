package com.squareup.cash.paymentpad.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.payments.common.PaymentRecipient;

/* loaded from: classes.dex */
public final class LitePaymentPadSheetScreen implements Screen {
    public static final Parcelable.Creator<LitePaymentPadSheetScreen> CREATOR = new PaymentRecipient.Creator(26);
    public final boolean animateEntrance;

    public LitePaymentPadSheetScreen(boolean z) {
        this.animateEntrance = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LitePaymentPadSheetScreen) && this.animateEntrance == ((LitePaymentPadSheetScreen) obj).animateEntrance;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.animateEntrance);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("LitePaymentPadSheetScreen(animateEntrance=", ")", this.animateEntrance);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.animateEntrance ? 1 : 0);
    }
}
