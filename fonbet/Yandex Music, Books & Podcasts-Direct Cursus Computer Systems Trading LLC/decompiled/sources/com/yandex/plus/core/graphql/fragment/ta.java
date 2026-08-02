package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import defpackage.k5r;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ta {
    public final String a;
    public final String b;
    public final ra c;
    public final String d;
    public final String e;
    public final String f;
    public final qa g;
    public final Object h;
    public final ArrayList i;
    public final com.yandex.plus.core.graphql.type.a0 j;
    public final Map k;

    public ta(String str, String str2, ra raVar, String str3, String str4, String str5, qa qaVar, Object obj, ArrayList arrayList, com.yandex.plus.core.graphql.type.a0 a0Var, Map map) {
        this.a = str;
        this.b = str2;
        this.c = raVar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = qaVar;
        this.h = obj;
        this.i = arrayList;
        this.j = a0Var;
        this.k = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        return this.a.equals(taVar.a) && this.b.equals(taVar.b) && this.c.equals(taVar.c) && Intrinsics.d(this.d, taVar.d) && Intrinsics.d(this.e, taVar.e) && Intrinsics.d(this.f, taVar.f) && this.g.equals(taVar.g) && this.h.equals(taVar.h) && this.i.equals(taVar.i) && this.j == taVar.j && Intrinsics.d(this.k, taVar.k);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c.a);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (this.j.hashCode() + dfi.b(this.i, (this.h.hashCode() + ((this.g.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31, 31)) * 31;
        Map map = this.k;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionOffer(name=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", option=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append(this.e);
        sb.append(", additionText=");
        sb.append(this.f);
        sb.append(", commonPrice=");
        sb.append(this.g);
        sb.append(", commonPeriod=");
        sb.append(this.h);
        sb.append(", plans=");
        sb.append(this.i);
        sb.append(", offerVendorType=");
        sb.append(this.j);
        sb.append(", payload=");
        return k5r.p(sb, this.k, ')');
    }
}
