package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class r8o extends q9o {
    public static final r8o a = new r8o();

    @NotNull
    public static final Parcelable.Creator<r8o> CREATOR = new s2m(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof r8o);
    }

    public final int hashCode() {
        return -1199193040;
    }

    public final String toString() {
        return "IPaymentPolling";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
