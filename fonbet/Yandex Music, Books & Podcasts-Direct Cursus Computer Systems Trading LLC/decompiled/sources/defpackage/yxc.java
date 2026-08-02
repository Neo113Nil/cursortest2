package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yxc implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<yxc> CREATOR = new a5c(9);
    public final drt a;
    public final int b;
    public final String c;
    public final boolean d;
    public final b6d e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final List i;
    public final Object j;

    public yxc(drt drtVar, int i, String str, boolean z, b6d b6dVar, boolean z2, boolean z3, boolean z4, List list) {
        drtVar.getClass();
        b6dVar.getClass();
        list.getClass();
        this.a = drtVar;
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = b6dVar;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = list;
        this.j = btf.a(bwf.c, new ita(20, this));
    }

    public final xxq d() {
        drt drtVar = this.a;
        return new xxq(drtVar.a, drtVar.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxc)) {
            return false;
        }
        yxc yxcVar = (yxc) obj;
        return Intrinsics.d(this.a, yxcVar.a) && this.b == yxcVar.b && Intrinsics.d(this.c, yxcVar.c) && this.d == yxcVar.d && Intrinsics.d(this.e, yxcVar.e) && this.f == yxcVar.f && this.g == yxcVar.g && this.h == yxcVar.h && Intrinsics.d(this.i, yxcVar.i);
    }

    public final int hashCode() {
        int a = f1d.a(this.b, this.a.a.hashCode() * 31, 31);
        String str = this.c;
        return this.i.hashCode() + k5r.e(k5r.e(k5r.e(k5r.c(k5r.e((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e.a), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullUserInfo(user=");
        sb.append(this.a);
        sb.append(", passportEnvironment=");
        sb.append(this.b);
        sb.append(", email=");
        sb.append(this.c);
        sb.append(", serviceAvailable=");
        sb.append(this.d);
        sb.append(", geoRegion=");
        sb.append(this.e);
        sb.append(", isKid=");
        sb.append(this.f);
        sb.append(", hasPlus=");
        dfi.t(sb, this.g, ", hasMusicSubscription=", this.h, ", hasOptions=");
        return vz1.u(sb, this.i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeStringList(this.i);
    }
}
