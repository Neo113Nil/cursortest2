package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l5p extends n5p {

    @NotNull
    public static final Parcelable.Creator<l5p> CREATOR = new z8o(28);
    public final p0p b;
    public final c0p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5p(p0p p0pVar, c0p c0pVar) {
        super(c0pVar);
        p0pVar.getClass();
        c0pVar.getClass();
        this.b = p0pVar;
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
        if (!(obj instanceof l5p)) {
            return false;
        }
        l5p l5pVar = (l5p) obj;
        return this.b == l5pVar.b && this.c == l5pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Other(searchEntityType=" + this.b + ", searchContext=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.b.name());
        parcel.writeString(this.c.name());
    }
}
