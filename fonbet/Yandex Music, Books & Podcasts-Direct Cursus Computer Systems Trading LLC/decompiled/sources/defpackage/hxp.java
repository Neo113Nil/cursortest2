package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class hxp extends jxp {

    @NotNull
    public static final Parcelable.Creator<hxp> CREATOR = new bwp(6);
    public final String a;
    public final String b;
    public final lqs c;

    public hxp(String str, String str2, lqs lqsVar) {
        str.getClass();
        lqsVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = lqsVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxp)) {
            return false;
        }
        hxp hxpVar = (hxp) obj;
        return Intrinsics.d(this.a, hxpVar.a) && Intrinsics.d(this.b, hxpVar.b) && this.c == hxpVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("TrackId(trackId=", this.a, ", albumId=", this.b, ", type=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
    }
}
