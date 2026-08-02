package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import defpackage.k5r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class in {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final String f;
    public final String g;
    public final hn h;
    public final en i;
    public final List j;
    public final String k;

    public in(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, hn hnVar, en enVar, List list, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = hnVar;
        this.i = enVar;
        this.j = list;
        this.k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in)) {
            return false;
        }
        in inVar = (in) obj;
        return this.a.equals(inVar.a) && this.b.equals(inVar.b) && this.c.equals(inVar.c) && this.d.equals(inVar.d) && Intrinsics.d(this.e, inVar.e) && Intrinsics.d(this.f, inVar.f) && Intrinsics.d(this.g, inVar.g) && Intrinsics.d(this.h, inVar.h) && Intrinsics.d(this.i, inVar.i) && Intrinsics.d(this.j, inVar.j) && Intrinsics.d(this.k, inVar.k);
    }

    public final int hashCode() {
        int b = dfi.b(this.d, k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        hn hnVar = this.h;
        int hashCode4 = (hashCode3 + (hnVar == null ? 0 : hnVar.a.hashCode())) * 31;
        en enVar = this.i;
        int hashCode5 = (hashCode4 + (enVar == null ? 0 : enVar.hashCode())) * 31;
        List list = this.j;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.k;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortcutFragment(__typename=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", actions=");
        sb.append(this.d);
        sb.append(", iconUrl=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", textStyle=");
        sb.append(this.h);
        sb.append(", background=");
        sb.append(this.i);
        sb.append(", commonOverlays=");
        sb.append(this.j);
        sb.append(", additionalData=");
        return dfi.i(sb, this.k, ')');
    }
}
