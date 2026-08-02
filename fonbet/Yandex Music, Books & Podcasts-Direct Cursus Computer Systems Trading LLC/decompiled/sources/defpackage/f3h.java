package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f3h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<f3h> CREATOR = new pnf(16);
    public final int a;
    public final String b;
    public final int c;
    public final r2h d;

    public f3h(int i, String str, int i2, r2h r2hVar) {
        str.getClass();
        r2hVar.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = r2hVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3h)) {
            return false;
        }
        f3h f3hVar = (f3h) obj;
        return this.a == f3hVar.a && Intrinsics.d(this.b, f3hVar.b) && this.c == f3hVar.c && this.d == f3hVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + f1d.a(this.c, k5r.c(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder r = k5r.r(this.a, "LyricsInfo(lyricId=", ", externalLyricId=", this.b, ", majorId=");
        r.append(this.c);
        r.append(", format=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d.name());
    }
}
