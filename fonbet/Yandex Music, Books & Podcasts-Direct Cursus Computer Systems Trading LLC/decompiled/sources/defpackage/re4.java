package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class re4 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<re4> CREATOR = new i02(26);
    public final oq a;
    public final jf4 b;

    public re4(oq oqVar, jf4 jf4Var) {
        oqVar.getClass();
        jf4Var.getClass();
        this.a = oqVar;
        this.b = jf4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re4)) {
            return false;
        }
        re4 re4Var = (re4) obj;
        return Intrinsics.d(this.a, re4Var.a) && Intrinsics.d(this.b, re4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChartAlbum(album=" + this.a + ", chartPosition=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
    }
}
