package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class t8o extends q9o {

    @NotNull
    public static final Parcelable.Creator<t8o> CREATOR = new s2m(24);
    public final bfk a;

    public t8o(bfk bfkVar) {
        this.a = bfkVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8o) && Intrinsics.d(this.a, ((t8o) obj).a);
    }

    public final int hashCode() {
        bfk bfkVar = this.a;
        if (bfkVar == null) {
            return 0;
        }
        return bfkVar.hashCode();
    }

    public final String toString() {
        return "PaymentFailure(error=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }
}
