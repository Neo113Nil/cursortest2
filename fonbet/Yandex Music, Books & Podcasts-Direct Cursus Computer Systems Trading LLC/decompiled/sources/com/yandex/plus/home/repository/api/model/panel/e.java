package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eta;
import defpackage.hrg;
import defpackage.k5r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final String a;
    public final com.yandex.plus.core.data.common.v b;
    public final com.yandex.plus.core.data.common.y c;
    public final com.yandex.plus.core.data.common.y d;
    public final d0 e;
    public final String f;
    public final String g;
    public final String h;
    public final com.yandex.plus.core.data.common.v i;
    public final com.yandex.plus.core.data.common.v j;
    public final com.yandex.plus.core.data.common.v k;
    public final List l;
    public final List m;
    public final List n;
    public final List o;
    public final d0 p;
    public final List q;

    public e(String str, com.yandex.plus.core.data.common.v vVar, com.yandex.plus.core.data.common.y yVar, com.yandex.plus.core.data.common.y yVar2, d0 d0Var, String str2, String str3, String str4, com.yandex.plus.core.data.common.v vVar2, com.yandex.plus.core.data.common.v vVar3, com.yandex.plus.core.data.common.v vVar4, List list, List list2, List list3, List list4, d0 d0Var2, ArrayList arrayList) {
        str.getClass();
        vVar.getClass();
        str2.getClass();
        vVar2.getClass();
        this.a = str;
        this.b = vVar;
        this.c = yVar;
        this.d = yVar2;
        this.e = d0Var;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = vVar2;
        this.j = vVar3;
        this.k = vVar4;
        this.l = list;
        this.m = list2;
        this.n = list3;
        this.o = list4;
        this.p = d0Var2;
        this.q = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.a, eVar.a) && Intrinsics.d(this.b, eVar.b) && Intrinsics.d(this.c, eVar.c) && Intrinsics.d(this.d, eVar.d) && Intrinsics.d(this.e, eVar.e) && Intrinsics.d(this.f, eVar.f) && Intrinsics.d(this.g, eVar.g) && Intrinsics.d(this.h, eVar.h) && Intrinsics.d(this.i, eVar.i) && Intrinsics.d(this.j, eVar.j) && Intrinsics.d(this.k, eVar.k) && Intrinsics.d(this.l, eVar.l) && Intrinsics.d(this.m, eVar.m) && Intrinsics.d(this.n, eVar.n) && Intrinsics.d(this.o, eVar.o) && Intrinsics.d(this.p, eVar.p) && Intrinsics.d(this.q, eVar.q);
    }

    public final int hashCode() {
        int f = com.appsflyer.internal.k.f(this.b, this.a.hashCode() * 31, 31);
        com.yandex.plus.core.data.common.y yVar = this.c;
        int hashCode = (f + (yVar == null ? 0 : yVar.hashCode())) * 31;
        com.yandex.plus.core.data.common.y yVar2 = this.d;
        int hashCode2 = (hashCode + (yVar2 == null ? 0 : yVar2.hashCode())) * 31;
        d0 d0Var = this.e;
        int c = k5r.c((hashCode2 + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31, this.f);
        String str = this.g;
        int hashCode3 = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int f2 = com.appsflyer.internal.k.f(this.i, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        com.yandex.plus.core.data.common.v vVar = this.j;
        int hashCode4 = (f2 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        com.yandex.plus.core.data.common.v vVar2 = this.k;
        int hashCode5 = (hashCode4 + (vVar2 == null ? 0 : vVar2.hashCode())) * 31;
        List list = this.l;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.m;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.n;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.o;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        d0 d0Var2 = this.p;
        int hashCode10 = (hashCode9 + (d0Var2 == null ? 0 : d0Var2.hashCode())) * 31;
        List list5 = this.q;
        return hashCode10 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomPart(id=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", startConfettiImage=");
        sb.append(this.c);
        sb.append(", endConfettiImage=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", description=");
        sb.append(this.h);
        sb.append(", titleTextColor=");
        sb.append(this.i);
        sb.append(", subtitleTextColor=");
        sb.append(this.j);
        sb.append(", descriptionTextColor=");
        sb.append(this.k);
        sb.append(", subtitleStyledTexts=");
        sb.append(this.l);
        sb.append(", descriptionStyledTexts=");
        sb.append(this.m);
        sb.append(", subtitleTextIcons=");
        sb.append(this.n);
        sb.append(", descriptionTextIcons=");
        sb.append(this.o);
        sb.append(", buttonAction=");
        sb.append(this.p);
        sb.append(", serviceImages=");
        return eta.h(sb, this.q, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        d0 d0Var = this.e;
        if (d0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            d0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
        parcel.writeParcelable(this.k, i);
        List list = this.l;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator v = hrg.v(parcel, 1, list);
            while (v.hasNext()) {
                ((e0) v.next()).writeToParcel(parcel, i);
            }
        }
        List list2 = this.m;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator v2 = hrg.v(parcel, 1, list2);
            while (v2.hasNext()) {
                ((e0) v2.next()).writeToParcel(parcel, i);
            }
        }
        List list3 = this.n;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator v3 = hrg.v(parcel, 1, list3);
            while (v3.hasNext()) {
                ((f0) v3.next()).writeToParcel(parcel, i);
            }
        }
        List list4 = this.o;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator v4 = hrg.v(parcel, 1, list4);
            while (v4.hasNext()) {
                ((f0) v4.next()).writeToParcel(parcel, i);
            }
        }
        d0 d0Var2 = this.p;
        if (d0Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            d0Var2.writeToParcel(parcel, i);
        }
        List list5 = this.q;
        if (list5 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator v5 = hrg.v(parcel, 1, list5);
        while (v5.hasNext()) {
            parcel.writeParcelable((Parcelable) v5.next(), i);
        }
    }
}
