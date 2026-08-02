package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class qfk implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<qfk> CREATOR = new pgj(20);
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final boolean e;
    public final cm2 f;
    public final String g;
    public final String h;
    public final String i;
    public final ufk j;
    public final b5c k;
    public final r8k l;
    public final iae m;
    public final List n;
    public final String o;
    public final String p;

    public qfk(String str, ArrayList arrayList, String str2, String str3, boolean z, cm2 cm2Var, String str4, String str5, String str6, ufk ufkVar, b5c b5cVar, r8k r8kVar, iae iaeVar, ArrayList arrayList2, String str7, String str8) {
        str.getClass();
        arrayList.getClass();
        str2.getClass();
        str3.getClass();
        cm2Var.getClass();
        ufkVar.getClass();
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = cm2Var;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = ufkVar;
        this.k = b5cVar;
        this.l = r8kVar;
        this.m = iaeVar;
        this.n = arrayList2;
        this.o = str7;
        this.p = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f.name());
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j.name());
        parcel.writeParcelable(this.k, i);
        parcel.writeParcelable(this.l, i);
        parcel.writeParcelable(this.m, i);
        parcel.writeStringList(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
    }
}
