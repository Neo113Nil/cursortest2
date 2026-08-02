package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bj {
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;

    public bj(String str, List list, String str2, String str3, String str4, Integer num, String str5, String str6) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return this.a.equals(bjVar.a) && Intrinsics.d(this.b, bjVar.b) && Intrinsics.d(this.c, bjVar.c) && Intrinsics.d(this.d, bjVar.d) && Intrinsics.d(this.e, bjVar.e) && Intrinsics.d(this.f, bjVar.f) && Intrinsics.d(this.g, bjVar.g) && Intrinsics.d(this.h, bjVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueTextProperty(text=");
        sb.append(this.a);
        sb.append(", textDecoration=");
        sb.append(this.b);
        sb.append(", color=");
        sb.append(this.c);
        sb.append(", metaColor=");
        sb.append(this.d);
        sb.append(", metaStyle=");
        sb.append(this.e);
        sb.append(", fontSize=");
        sb.append(this.f);
        sb.append(", fontStyle=");
        sb.append(this.g);
        sb.append(", fontWeight=");
        return dfi.i(sb, this.h, ')');
    }
}
