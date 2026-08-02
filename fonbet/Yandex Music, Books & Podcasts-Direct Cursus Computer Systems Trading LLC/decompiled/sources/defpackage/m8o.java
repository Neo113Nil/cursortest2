package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class m8o extends q9o {
    public static final m8o a = new m8o();

    @NotNull
    public static final Parcelable.Creator<m8o> CREATOR = new s2m(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m8o);
    }

    public final int hashCode() {
        return 377152548;
    }

    public final String toString() {
        return "CardBindingSuccess";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
