package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kxi implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<kxi> CREATOR = new mmh(21);
    public final fnb a;
    public final gj b;

    public kxi(fnb fnbVar, gj gjVar) {
        fnbVar.getClass();
        this.a = fnbVar;
        this.b = gjVar;
    }

    public final a6l a(String str) {
        str.getClass();
        return new a6l(new gxc(this.a.G(), str), this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxi)) {
            return false;
        }
        kxi kxiVar = (kxi) obj;
        return Intrinsics.d(this.a, kxiVar.a) && Intrinsics.d(this.b, kxiVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gj gjVar = this.b;
        return hashCode + (gjVar == null ? 0 : gjVar.hashCode());
    }

    public final String toString() {
        return "NavigationData(evgenMeta=" + this.a + ", adData=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
