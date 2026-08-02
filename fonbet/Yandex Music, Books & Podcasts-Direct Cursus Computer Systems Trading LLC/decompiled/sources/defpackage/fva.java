package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fva implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<fva> CREATOR = new vn7(18);
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final eva h;
    public final eva i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;

    public fva(boolean z, boolean z2, String str, String str2, boolean z3, String str3, String str4, eva evaVar, eva evaVar2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        str.getClass();
        str2.getClass();
        evaVar.getClass();
        str5.getClass();
        str10.getClass();
        str11.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = str3;
        this.g = str4;
        this.h = evaVar;
        this.i = evaVar2;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = str10;
        this.p = str11;
        this.q = str12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fva)) {
            return false;
        }
        fva fvaVar = (fva) obj;
        return this.a == fvaVar.a && this.b == fvaVar.b && Intrinsics.d(this.c, fvaVar.c) && Intrinsics.d(this.d, fvaVar.d) && this.e == fvaVar.e && Intrinsics.d(this.f, fvaVar.f) && Intrinsics.d(this.g, fvaVar.g) && Intrinsics.d(this.h, fvaVar.h) && Intrinsics.d(this.i, fvaVar.i) && Intrinsics.d(this.j, fvaVar.j) && Intrinsics.d(this.k, fvaVar.k) && Intrinsics.d(this.l, fvaVar.l) && Intrinsics.d(this.m, fvaVar.m) && Intrinsics.d(this.n, fvaVar.n) && Intrinsics.d(this.o, fvaVar.o) && Intrinsics.d(this.p, fvaVar.p) && Intrinsics.d(this.q, fvaVar.q);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.c(k5r.c(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (this.h.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        eva evaVar = this.i;
        int c = k5r.c((hashCode2 + (evaVar == null ? 0 : evaVar.hashCode())) * 31, 31, this.j);
        String str3 = this.k;
        int hashCode3 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        int c2 = k5r.c(k5r.c((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.o), 31, this.p);
        String str7 = this.q;
        return c2 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder j = eta.j("DynamicOverlayData(canBeOpened=", this.a, ", isCenterAlign=", this.b, ", headerText=");
        su4.v(j, this.c, ", headerColor=", this.d, ", bigHeader=");
        j.append(this.e);
        j.append(", subtitleText=");
        j.append(this.f);
        j.append(", subtitleColor=");
        j.append(this.g);
        j.append(", firstButton=");
        j.append(this.h);
        j.append(", secondButton=");
        j.append(this.i);
        j.append(", closeButtonColor=");
        j.append(this.j);
        j.append(", advButtonColor=");
        su4.v(j, this.k, ", advDisclaimer=", this.l, ", disclaimerText=");
        su4.v(j, this.m, ", disclaimerColor=", this.n, ", imageUrl=");
        su4.v(j, this.o, ", backgroundColor=", this.p, ", backgroundImageUrl=");
        return su4.o(j, this.q, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        this.h.writeToParcel(parcel, i);
        eva evaVar = this.i;
        if (evaVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            evaVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }
}
