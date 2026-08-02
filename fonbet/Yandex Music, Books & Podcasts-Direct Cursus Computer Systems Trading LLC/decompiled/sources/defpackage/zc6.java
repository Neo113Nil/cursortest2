package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class zc6 implements ad6 {
    public static final zc6 a = new zc6();

    @NotNull
    public static final Parcelable.Creator<zc6> CREATOR = new kg4(19);

    @Override // defpackage.ad6
    public final String R() {
        return "bookmate";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zc6);
    }

    public final int hashCode() {
        return 485340248;
    }

    public final String toString() {
        return "YandexBooks";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
