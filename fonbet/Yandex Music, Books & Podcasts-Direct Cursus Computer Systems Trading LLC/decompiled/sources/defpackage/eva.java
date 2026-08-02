package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class eva implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<eva> CREATOR = new vn7(17);
    public final String a;
    public final dva b;
    public final String c;
    public final String d;

    public eva(String str, dva dvaVar, String str2, String str3) {
        str.getClass();
        dvaVar.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = dvaVar;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eva)) {
            return false;
        }
        eva evaVar = (eva) obj;
        return Intrinsics.d(this.a, evaVar.a) && Intrinsics.d(this.b, evaVar.b) && Intrinsics.d(this.c, evaVar.c) && Intrinsics.d(this.d, evaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonData(text=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", color=");
        return ouj.q(sb, this.c, ", textColor=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
