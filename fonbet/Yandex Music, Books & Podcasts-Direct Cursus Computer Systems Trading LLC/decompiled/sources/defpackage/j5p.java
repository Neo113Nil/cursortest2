package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j5p extends n5p {

    @NotNull
    public static final Parcelable.Creator<j5p> CREATOR = new z8o(26);
    public final oq b;
    public final c0p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5p(oq oqVar, c0p c0pVar) {
        super(c0pVar);
        oqVar.getClass();
        c0pVar.getClass();
        this.b = oqVar;
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
        if (!(obj instanceof j5p)) {
            return false;
        }
        j5p j5pVar = (j5p) obj;
        return Intrinsics.d(this.b, j5pVar.b) && this.c == j5pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.a.hashCode() * 31);
    }

    public final String toString() {
        return "Album(album=" + this.b + ", searchContext=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
    }
}
