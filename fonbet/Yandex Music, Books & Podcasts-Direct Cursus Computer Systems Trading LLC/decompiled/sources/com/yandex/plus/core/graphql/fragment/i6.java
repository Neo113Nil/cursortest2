package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i6 {
    public final String a;
    public final String b;
    public final g6 c;

    public i6(String str, String str2, g6 g6Var) {
        this.a = str;
        this.b = str2;
        this.c = g6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return Intrinsics.d(this.a, i6Var.a) && Intrinsics.d(this.b, i6Var.b) && Intrinsics.d(this.c, i6Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        g6 g6Var = this.c;
        return hashCode2 + (g6Var != null ? g6Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "Button(textColor=" + this.a + ", backgroundColor=" + this.b + ", action=" + this.c + ')';
    }
}
