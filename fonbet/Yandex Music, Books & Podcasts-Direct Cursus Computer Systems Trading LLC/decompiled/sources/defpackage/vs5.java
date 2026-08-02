package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class vs5 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<vs5> CREATOR = new kg4(9);
    public final String a;
    public final String b;
    public final dud c;

    public vs5(String str, String str2, dud dudVar) {
        str.getClass();
        dudVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = dudVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs5)) {
            return false;
        }
        vs5 vs5Var = (vs5) obj;
        return Intrinsics.d(this.a, vs5Var.a) && Intrinsics.d(this.b, vs5Var.b) && Intrinsics.d(this.c, vs5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ConcertActivityParams(concertId=", this.a, ", artistId=", this.b, ", headerAverageColorSource=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
