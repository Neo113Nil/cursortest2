package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a9o extends q9o {

    @NotNull
    public static final Parcelable.Creator<a9o> CREATOR = new z8o(0);
    public final bfk a;

    public a9o(bfk bfkVar) {
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
        return (obj instanceof a9o) && Intrinsics.d(this.a, ((a9o) obj).a);
    }

    public final int hashCode() {
        bfk bfkVar = this.a;
        if (bfkVar == null) {
            return 0;
        }
        return bfkVar.hashCode();
    }

    public final String toString() {
        return "PspChallengeFailure(error=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }
}
