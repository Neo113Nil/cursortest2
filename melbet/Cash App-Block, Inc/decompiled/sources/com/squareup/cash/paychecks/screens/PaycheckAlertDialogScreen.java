package com.squareup.cash.paychecks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.payments.common.PaymentRecipient;

/* loaded from: classes.dex */
public interface PaycheckAlertDialogScreen extends PaychecksScreen, DialogScreen {

    /* loaded from: classes6.dex */
    public final class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new PaymentRecipient.Creator(22);
        public final boolean acknowledged;

        public Result(boolean z) {
            this.acknowledged = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && this.acknowledged == ((Result) obj).acknowledged;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.acknowledged);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Result(acknowledged=", ")", this.acknowledged);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.acknowledged ? 1 : 0);
        }
    }
}
