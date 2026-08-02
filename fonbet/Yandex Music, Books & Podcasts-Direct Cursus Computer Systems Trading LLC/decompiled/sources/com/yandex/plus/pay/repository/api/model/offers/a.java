package com.yandex.plus.pay.repository.api.model.offers;

import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ArrayList g;
    public final String h;
    public final Map i;
    public final boolean j;
    public final boolean k;
    public final ArrayList l;
    public final l1 m;
    public final m1 n;
    public final m0 o;

    public a(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, String str7, Map map, boolean z, boolean z2, ArrayList arrayList2, l1 l1Var, m1 m1Var, m0 m0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = arrayList;
        this.h = str7;
        this.i = map;
        this.j = z;
        this.k = z2;
        this.l = arrayList2;
        this.m = l1Var;
        this.n = m1Var;
        this.o = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.g.equals(aVar.g) && Intrinsics.d(this.h, aVar.h) && this.i.equals(aVar.i) && this.j == aVar.j && this.k == aVar.k && this.l.equals(aVar.l) && this.m == aVar.m && this.n == aVar.n && Intrinsics.d(this.o, aVar.o);
    }

    public final int hashCode() {
        int b = dfi.b(this.g, k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
        String str = this.h;
        int hashCode = (this.n.hashCode() + ((this.m.hashCode() + dfi.b(this.l, k5r.e(k5r.e(f1d.b(this.i, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.j), 31, this.k), 31)) * 31)) * 31;
        m0 m0Var = this.o;
        return hashCode + (m0Var != null ? m0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalOffer(offerName=" + this.a + ", offersBatchId=" + this.b + ", positionId=" + this.c + ", title=" + this.d + ", text=" + this.e + ", additionalText=" + this.f + ", benefits=" + this.g + ", disclaimer=" + this.h + ", iconImages=" + this.i + ", isAvailable=" + this.j + ", isSelected=" + this.k + ", offersToReplace=" + this.l + ", upsaleStep=" + this.m + ", upsaleType=" + this.n + ", offerSwitchToggle=" + this.o + ')';
    }
}
