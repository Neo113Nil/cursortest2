package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class ln implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ln> CREATOR = new l(7);
    public final String A;
    public final z6w B;
    public final xx3 a;
    public final xfk b;
    public final List c;
    public final xt0 d;
    public final j8o e;
    public final boolean f;
    public final lmk g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final ind m;
    public final String n;
    public final String o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final dnd t;
    public final boolean u;
    public final zov v;
    public final boolean w;
    public final boolean x;
    public final Boolean y;
    public final Map z;

    public ln(xx3 xx3Var, xfk xfkVar, List list, xt0 xt0Var, j8o j8oVar, boolean z, lmk lmkVar, String str, String str2, boolean z2, boolean z3, boolean z4, ind indVar, String str3, String str4, int i, boolean z5, boolean z6, boolean z7, dnd dndVar, boolean z8, zov zovVar, boolean z9, boolean z10, Boolean bool, LinkedHashMap linkedHashMap, String str5, z6w z6wVar) {
        xx3Var.getClass();
        xfkVar.getClass();
        list.getClass();
        xt0Var.getClass();
        j8oVar.getClass();
        lmkVar.getClass();
        dndVar.getClass();
        z6wVar.getClass();
        this.a = xx3Var;
        this.b = xfkVar;
        this.c = list;
        this.d = xt0Var;
        this.e = j8oVar;
        this.f = z;
        this.g = lmkVar;
        this.h = str;
        this.i = str2;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = indVar;
        this.n = str3;
        this.o = str4;
        this.p = i;
        this.q = z5;
        this.r = z6;
        this.s = z7;
        this.t = dndVar;
        this.u = z8;
        this.v = zovVar;
        this.w = z9;
        this.x = z10;
        this.y = bool;
        this.z = linkedHashMap;
        this.A = str5;
        this.B = z6wVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        Iterator n = f1d.n(parcel, this.c);
        while (n.hasNext()) {
            parcel.writeParcelable((Parcelable) n.next(), i);
        }
        parcel.writeParcelable(this.d, i);
        this.e.writeToParcel(parcel, i);
        parcel.writeInt(this.f ? 1 : 0);
        this.g.writeToParcel(parcel, i);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeParcelable(this.m, i);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeParcelable(this.t, i);
        parcel.writeInt(this.u ? 1 : 0);
        zov zovVar = this.v;
        if (zovVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(zovVar.name());
        }
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        Boolean bool = this.y;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Map map = this.z;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.A);
        parcel.writeString(this.B.name());
    }
}
