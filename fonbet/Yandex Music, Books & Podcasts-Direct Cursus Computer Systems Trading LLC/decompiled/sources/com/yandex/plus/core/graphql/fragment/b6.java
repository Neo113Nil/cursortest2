package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b6 {
    public final String a;
    public final String b;
    public final a6 c;
    public final String d;
    public final String e;
    public final z5 f;
    public final y5 g;

    public b6(String str, String str2, a6 a6Var, String str3, String str4, z5 z5Var, y5 y5Var) {
        this.a = str;
        this.b = str2;
        this.c = a6Var;
        this.d = str3;
        this.e = str4;
        this.f = z5Var;
        this.g = y5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return Intrinsics.d(this.a, b6Var.a) && Intrinsics.d(this.b, b6Var.b) && Intrinsics.d(this.c, b6Var.c) && Intrinsics.d(this.d, b6Var.d) && Intrinsics.d(this.e, b6Var.e) && Intrinsics.d(this.f, b6Var.f) && Intrinsics.d(this.g, b6Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        a6 a6Var = this.c;
        int hashCode3 = (hashCode2 + (a6Var == null ? 0 : a6Var.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        z5 z5Var = this.f;
        int hashCode6 = (hashCode5 + (z5Var == null ? 0 : z5Var.hashCode())) * 31;
        y5 y5Var = this.g;
        return hashCode6 + (y5Var != null ? y5Var.hashCode() : 0);
    }

    public final String toString() {
        return "DarkOverlayFragment(text=" + this.a + ", textColor=" + this.b + ", textColors=" + this.c + ", shape=" + this.d + ", imageUrl=" + this.e + ", background=" + this.f + ", attributedText=" + this.g + ')';
    }
}
