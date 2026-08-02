package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Date;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class i1m implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<i1m> CREATOR = new tgk(29);
    private static final long serialVersionUID = 1;
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final Date f;

    public i1m(long j, long j2, String str, String str2, int i, Date date) {
        str.getClass();
        str2.getClass();
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i1m.class.equals(obj.getClass()) && this.a == ((i1m) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder l = tlm.l(this.a, "PlaylistTrack(id=", ", playlistId=");
        l.append(this.b);
        l.append(", trackId=");
        l.append(this.c);
        l.append(", albumId=");
        l.append(this.d);
        l.append(", position=");
        l.append(this.e);
        l.append(", timestamp=");
        l.append(this.f);
        l.append(")");
        return l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeSerializable(this.f);
    }
}
