package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class u51 implements aab, Parcelable {

    @NotNull
    public static final Parcelable.Creator<u51> CREATOR = new l(26);
    public final String a;
    public final String b;
    public final u9b c;
    public final u9b d;
    public final gd6 e;
    public final jzb f;

    public u51(String str, String str2, u9b u9bVar, u9b u9bVar2, gd6 gd6Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = u9bVar;
        this.d = u9bVar2;
        this.e = gd6Var;
        this.f = gd6Var != null ? saf.o0(gd6Var) : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u51)) {
            return false;
        }
        u51 u51Var = (u51) obj;
        return Intrinsics.d(this.a, u51Var.a) && Intrinsics.d(this.b, u51Var.b) && Intrinsics.d(this.c, u51Var.c) && Intrinsics.d(this.d, u51Var.d) && Intrinsics.d(this.e, u51Var.e);
    }

    @Override // defpackage.aab
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        u9b u9bVar = this.c;
        int hashCode = (c + (u9bVar == null ? 0 : u9bVar.hashCode())) * 31;
        u9b u9bVar2 = this.d;
        int hashCode2 = (hashCode + (u9bVar2 == null ? 0 : u9bVar2.hashCode())) * 31;
        gd6 gd6Var = this.e;
        return hashCode2 + (gd6Var != null ? gd6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ArtistDomainItem(id=", this.a, ", name=", this.b, ", cover=");
        m.append(this.c);
        m.append(", cutoutCover=");
        m.append(this.d);
        m.append(", contentRestrictions=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        u9b u9bVar = this.c;
        if (u9bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            u9bVar.writeToParcel(parcel, i);
        }
        u9b u9bVar2 = this.d;
        if (u9bVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            u9bVar2.writeToParcel(parcel, i);
        }
        gd6 gd6Var = this.e;
        if (gd6Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gd6Var.writeToParcel(parcel, i);
        }
    }
}
