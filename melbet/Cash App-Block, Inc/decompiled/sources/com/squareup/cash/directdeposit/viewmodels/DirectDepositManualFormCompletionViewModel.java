package com.squareup.cash.directdeposit.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;

/* loaded from: classes6.dex */
public interface DirectDepositManualFormCompletionViewModel extends Parcelable {

    public final class Error implements DirectDepositManualFormCompletionViewModel {
        public static final Error INSTANCE = new Error();
        public static final Parcelable.Creator<Error> CREATOR = new Limit.Creator(20);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Loading implements DirectDepositManualFormCompletionViewModel {
        public static final Loading INSTANCE = new Loading();
        public static final Parcelable.Creator<Loading> CREATOR = new Limit.Creator(21);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Success implements DirectDepositManualFormCompletionViewModel {
        public static final Success INSTANCE = new Success();
        public static final Parcelable.Creator<Success> CREATOR = new Limit.Creator(22);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
