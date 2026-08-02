package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class p9o extends q9o {
    public static final p9o a = new p9o();

    @NotNull
    public static final Parcelable.Creator<p9o> CREATOR = new z8o(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p9o);
    }

    public final int hashCode() {
        return 305554674;
    }

    public final String toString() {
        return "VerificationSuccess";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
