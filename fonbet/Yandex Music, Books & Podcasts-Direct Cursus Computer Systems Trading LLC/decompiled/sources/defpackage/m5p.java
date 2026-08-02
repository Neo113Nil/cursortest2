package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m5p extends n5p {

    @NotNull
    public static final Parcelable.Creator<m5p> CREATOR = new z8o(29);
    public final cvl b;
    public final p0p c;
    public final c0p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5p(cvl cvlVar, p0p p0pVar, c0p c0pVar) {
        super(c0pVar);
        cvlVar.getClass();
        p0pVar.getClass();
        c0pVar.getClass();
        this.b = cvlVar;
        this.c = p0pVar;
        this.d = c0pVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5p)) {
            return false;
        }
        m5p m5pVar = (m5p) obj;
        return Intrinsics.d(this.b, m5pVar.b) && this.c == m5pVar.c && this.d == m5pVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Playlist(playlistHeader=" + this.b + ", searchEntityType=" + this.c + ", searchContext=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d.name());
    }
}
