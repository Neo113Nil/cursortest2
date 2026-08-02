package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g3h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g3h> CREATOR = new pnf(17);
    public final String a;
    public final String b;
    public final String c;

    public g3h(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3h)) {
            return false;
        }
        g3h g3hVar = (g3h) obj;
        return Intrinsics.d(this.a, g3hVar.a) && Intrinsics.d(this.b, g3hVar.b) && Intrinsics.d(this.c, g3hVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return su4.o(f1d.m("TrackInfo(trackId=", this.a, ", albumId=", this.b, ", playlistId="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
