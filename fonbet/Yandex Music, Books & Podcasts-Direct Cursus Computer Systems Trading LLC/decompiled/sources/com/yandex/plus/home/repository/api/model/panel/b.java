package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.k5r;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b extends g {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new com.yandex.plus.core.benchmark.g(29);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final com.yandex.plus.core.data.common.v e;
    public final com.yandex.plus.core.data.common.v f;
    public final com.yandex.plus.core.data.common.v g;
    public final d0 h;
    public final String i;
    public final com.yandex.plus.core.data.common.v j;
    public final List k;
    public final List l;
    public final List m;
    public final List n;
    public final d0 o;
    public final h p;
    public final String q;
    public final com.yandex.plus.core.data.common.v r;
    public final com.yandex.plus.core.data.common.v s;
    public final com.yandex.plus.core.data.common.y t;
    public final com.yandex.plus.core.data.common.y u;
    public final com.yandex.plus.core.data.common.y v;
    public final Map w;

    public b(String str, String str2, String str3, String str4, com.yandex.plus.core.data.common.v vVar, com.yandex.plus.core.data.common.v vVar2, com.yandex.plus.core.data.common.v vVar3, d0 d0Var, String str5, com.yandex.plus.core.data.common.v vVar4, List list, List list2, List list3, List list4, d0 d0Var2, h hVar, String str6, com.yandex.plus.core.data.common.v vVar5, com.yandex.plus.core.data.common.v vVar6, com.yandex.plus.core.data.common.y yVar, com.yandex.plus.core.data.common.y yVar2, com.yandex.plus.core.data.common.y yVar3, Map map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        vVar.getClass();
        vVar2.getClass();
        vVar3.getClass();
        list.getClass();
        list3.getClass();
        yVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = vVar;
        this.f = vVar2;
        this.g = vVar3;
        this.h = d0Var;
        this.i = str5;
        this.j = vVar4;
        this.k = list;
        this.l = list2;
        this.m = list3;
        this.n = list4;
        this.o = d0Var2;
        this.p = hVar;
        this.q = str6;
        this.r = vVar5;
        this.s = vVar6;
        this.t = yVar;
        this.u = yVar2;
        this.v = yVar3;
        this.w = map;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final List C() {
        return this.m;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final com.yandex.plus.core.data.common.v K() {
        return this.f;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final com.yandex.plus.core.data.common.v L() {
        return this.e;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final com.yandex.plus.core.data.common.v d() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final String e() {
        return this.q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b) && Intrinsics.d(this.c, bVar.c) && Intrinsics.d(this.d, bVar.d) && Intrinsics.d(this.e, bVar.e) && Intrinsics.d(this.f, bVar.f) && Intrinsics.d(this.g, bVar.g) && Intrinsics.d(this.h, bVar.h) && Intrinsics.d(this.i, bVar.i) && Intrinsics.d(this.j, bVar.j) && Intrinsics.d(this.k, bVar.k) && Intrinsics.d(this.l, bVar.l) && Intrinsics.d(this.m, bVar.m) && Intrinsics.d(this.n, bVar.n) && Intrinsics.d(this.o, bVar.o) && Intrinsics.d(this.p, bVar.p) && Intrinsics.d(this.q, bVar.q) && Intrinsics.d(this.r, bVar.r) && Intrinsics.d(this.s, bVar.s) && Intrinsics.d(this.t, bVar.t) && Intrinsics.d(this.u, bVar.u) && Intrinsics.d(this.v, bVar.v) && Intrinsics.d(this.w, bVar.w);
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final com.yandex.plus.core.data.common.v f() {
        return this.r;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final d0 g() {
        return this.o;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final com.yandex.plus.core.data.common.v getBackgroundColor() {
        return this.g;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final String getId() {
        return this.a;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final String getName() {
        return this.b;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final String getSubtitle() {
        return this.d;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final String getTitle() {
        return this.c;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final String h() {
        return this.i;
    }

    public final int hashCode() {
        int f = com.appsflyer.internal.k.f(this.g, com.appsflyer.internal.k.f(this.f, com.appsflyer.internal.k.f(this.e, k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31);
        d0 d0Var = this.h;
        int hashCode = (f + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.yandex.plus.core.data.common.v vVar = this.j;
        int d = k5r.d((hashCode2 + (vVar == null ? 0 : vVar.hashCode())) * 31, 31, this.k);
        List list = this.l;
        int d2 = k5r.d((d + (list == null ? 0 : list.hashCode())) * 31, 31, this.m);
        List list2 = this.n;
        int hashCode3 = (d2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        d0 d0Var2 = this.o;
        int hashCode4 = (hashCode3 + (d0Var2 == null ? 0 : d0Var2.hashCode())) * 31;
        h hVar = this.p;
        int hashCode5 = (hashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str2 = this.q;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.yandex.plus.core.data.common.v vVar2 = this.r;
        int hashCode7 = (hashCode6 + (vVar2 == null ? 0 : vVar2.hashCode())) * 31;
        com.yandex.plus.core.data.common.v vVar3 = this.s;
        int hashCode8 = (this.t.hashCode() + ((hashCode7 + (vVar3 == null ? 0 : vVar3.hashCode())) * 31)) * 31;
        com.yandex.plus.core.data.common.y yVar = this.u;
        int hashCode9 = (hashCode8 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        com.yandex.plus.core.data.common.y yVar2 = this.v;
        int hashCode10 = (hashCode9 + (yVar2 == null ? 0 : yVar2.hashCode())) * 31;
        Map map = this.w;
        return hashCode10 + (map != null ? map.hashCode() : 0);
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final List i() {
        return this.l;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final com.yandex.plus.core.data.common.v j() {
        return this.j;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final List k() {
        return this.n;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final com.yandex.plus.core.data.common.y l() {
        return this.u;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final com.yandex.plus.core.data.common.y m() {
        return this.t;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final h n() {
        return this.p;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final com.yandex.plus.core.data.common.y o() {
        return this.v;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.g
    public final List p() {
        return this.k;
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.c0
    public final d0 q() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Big(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", titleTextColor=");
        sb.append(this.e);
        sb.append(", subtitleTextColor=");
        sb.append(this.f);
        sb.append(", backgroundColor=");
        sb.append(this.g);
        sb.append(", action=");
        sb.append(this.h);
        sb.append(", description=");
        sb.append(this.i);
        sb.append(", descriptionTextColor=");
        sb.append(this.j);
        sb.append(", subtitleStyledTexts=");
        sb.append(this.k);
        sb.append(", descriptionStyledTexts=");
        sb.append(this.l);
        sb.append(", subtitleTextIcons=");
        sb.append(this.m);
        sb.append(", descriptionTextIcons=");
        sb.append(this.n);
        sb.append(", buttonAction=");
        sb.append(this.o);
        sb.append(", giftProgress=");
        sb.append(this.p);
        sb.append(", badgeText=");
        sb.append(this.q);
        sb.append(", badgeTextColor=");
        sb.append(this.r);
        sb.append(", badgeBackgroundColor=");
        sb.append(this.s);
        sb.append(", giftImage=");
        sb.append(this.t);
        sb.append(", firstConfettiImage=");
        sb.append(this.u);
        sb.append(", secondConfettiImage=");
        sb.append(this.v);
        sb.append(", analyticsParams=");
        return k5r.p(sb, this.w, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        d0 d0Var = this.h;
        if (d0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            d0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.i);
        parcel.writeParcelable(this.j, i);
        Iterator n = f1d.n(parcel, this.k);
        while (n.hasNext()) {
            ((e0) n.next()).writeToParcel(parcel, i);
        }
        List list = this.l;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator v = hrg.v(parcel, 1, list);
            while (v.hasNext()) {
                ((e0) v.next()).writeToParcel(parcel, i);
            }
        }
        Iterator n2 = f1d.n(parcel, this.m);
        while (n2.hasNext()) {
            ((f0) n2.next()).writeToParcel(parcel, i);
        }
        List list2 = this.n;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator v2 = hrg.v(parcel, 1, list2);
            while (v2.hasNext()) {
                ((f0) v2.next()).writeToParcel(parcel, i);
            }
        }
        d0 d0Var2 = this.o;
        if (d0Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            d0Var2.writeToParcel(parcel, i);
        }
        h hVar = this.p;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.q);
        parcel.writeParcelable(this.r, i);
        parcel.writeParcelable(this.s, i);
        parcel.writeParcelable(this.t, i);
        parcel.writeParcelable(this.u, i);
        parcel.writeParcelable(this.v, i);
        Map map = this.w;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
