package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes4.dex */
public final class ixc implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ixc> CREATOR = new a5c(8);
    public final String a;
    public final String b;
    public final CoverPath c;
    public final qo6 d;
    public final tn6 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public ixc(String str, String str2, CoverPath coverPath, qo6 qo6Var, tn6 tn6Var, String str3, String str4, String str5, String str6) {
        str2.getClass();
        coverPath.getClass();
        qo6Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = coverPath;
        this.d = qo6Var;
        this.e = tn6Var;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixc)) {
            return false;
        }
        ixc ixcVar = (ixc) obj;
        return Intrinsics.d(this.a, ixcVar.a) && Intrinsics.d(this.b, ixcVar.b) && Intrinsics.d(this.c, ixcVar.c) && this.d == ixcVar.d && Intrinsics.d(this.e, ixcVar.e) && Intrinsics.d(this.f, ixcVar.f) && Intrinsics.d(this.g, ixcVar.g) && Intrinsics.d(this.h, ixcVar.h) && Intrinsics.d(this.i, ixcVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31)) * 31;
        tn6 tn6Var = this.e;
        int hashCode2 = (hashCode + (tn6Var == null ? 0 : tn6Var.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("FullInfo(ownerId=", this.a, ", objectId=", this.b, ", coverPath=");
        m.append(this.c);
        m.append(", coverType=");
        m.append(this.d);
        m.append(", coverInfo=");
        m.append(this.e);
        m.append(", title=");
        m.append(this.f);
        m.append(", subtitle=");
        su4.v(m, this.g, ", info=", this.h, ", promoInfo=");
        return su4.o(m, this.i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d.name());
        parcel.writeSerializable(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
