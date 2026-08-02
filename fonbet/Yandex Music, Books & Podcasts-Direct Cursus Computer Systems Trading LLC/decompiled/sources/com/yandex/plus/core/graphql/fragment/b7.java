package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import defpackage.k5r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b7 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final a7 e;
    public final x6 f;
    public final List g;
    public final String h;

    public b7(String str, String str2, String str3, ArrayList arrayList, a7 a7Var, x6 x6Var, List list, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = a7Var;
        this.f = x6Var;
        this.g = list;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7)) {
            return false;
        }
        b7 b7Var = (b7) obj;
        return this.a.equals(b7Var.a) && this.b.equals(b7Var.b) && Intrinsics.d(this.c, b7Var.c) && this.d.equals(b7Var.d) && Intrinsics.d(this.e, b7Var.e) && Intrinsics.d(this.f, b7Var.f) && Intrinsics.d(this.g, b7Var.g) && Intrinsics.d(this.h, b7Var.h);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int b = dfi.b(this.d, (c + (str == null ? 0 : str.hashCode())) * 31, 31);
        a7 a7Var = this.e;
        int hashCode = (b + (a7Var == null ? 0 : a7Var.a.hashCode())) * 31;
        x6 x6Var = this.f;
        int hashCode2 = (hashCode + (x6Var == null ? 0 : x6Var.hashCode())) * 31;
        List list = this.g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.h;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DarkShortcutFragment(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", actions=");
        sb.append(this.d);
        sb.append(", textStyle=");
        sb.append(this.e);
        sb.append(", background=");
        sb.append(this.f);
        sb.append(", commonOverlays=");
        sb.append(this.g);
        sb.append(", additionalData=");
        return dfi.i(sb, this.h, ')');
    }
}
