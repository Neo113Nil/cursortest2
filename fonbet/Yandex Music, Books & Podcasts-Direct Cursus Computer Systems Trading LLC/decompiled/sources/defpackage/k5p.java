package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k5p extends n5p {

    @NotNull
    public static final Parcelable.Creator<k5p> CREATOR = new z8o(27);
    public final c01 b;
    public final c0p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5p(c01 c01Var, c0p c0pVar) {
        super(c0pVar);
        c01Var.getClass();
        c0pVar.getClass();
        this.b = c01Var;
        this.c = c0pVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5p)) {
            return false;
        }
        k5p k5pVar = (k5p) obj;
        return Intrinsics.d(this.b, k5pVar.b) && this.c == k5pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.a.hashCode() * 31);
    }

    public final String toString() {
        return "Artist(artist=" + this.b + ", searchContext=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
    }
}
