package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f5i implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<f5i> CREATOR = new mmh(14);
    private static final long serialVersionUID = 1;
    public final String a;
    public final int b;

    public f5i(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5i)) {
            return false;
        }
        f5i f5iVar = (f5i) obj;
        return Intrinsics.d(this.a, f5iVar.a) && this.b == f5iVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MetroStation(title=" + this.a + ", color=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
