package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class zwp implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<zwp> CREATOR = new bwp(1);
    public final jxp a;
    public final co6 b;
    public final String c;
    public final String d;

    public zwp(jxp jxpVar, co6 co6Var, String str, String str2) {
        jxpVar.getClass();
        co6Var.getClass();
        str.getClass();
        str2.getClass();
        this.a = jxpVar;
        this.b = co6Var;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwp)) {
            return false;
        }
        zwp zwpVar = (zwp) obj;
        return Intrinsics.d(this.a, zwpVar.a) && Intrinsics.d(this.b, zwpVar.b) && Intrinsics.d(this.c, zwpVar.c) && Intrinsics.d(this.d, zwpVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareItem(id=");
        sb.append(this.a);
        sb.append(", cover=");
        sb.append(this.b);
        sb.append(", title=");
        return ouj.q(sb, this.c, ", subtitle=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
