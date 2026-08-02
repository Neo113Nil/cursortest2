package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes5.dex */
public final class S4 implements Parcelable {
    public static final Parcelable.Creator<S4> CREATOR = new a();
    public final boolean a;

    public static final class a implements Parcelable.Creator<S4> {
        @Override // android.os.Parcelable.Creator
        public final S4 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new S4(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final S4[] newArray(int i) {
            return new S4[i];
        }
    }

    public S4() {
        this.a = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S4) && this.a == ((S4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("PlaidClientSideOnlyConfiguration(noLoadingUi=", ")", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
    }

    public S4(boolean z) {
        this.a = z;
    }
}
