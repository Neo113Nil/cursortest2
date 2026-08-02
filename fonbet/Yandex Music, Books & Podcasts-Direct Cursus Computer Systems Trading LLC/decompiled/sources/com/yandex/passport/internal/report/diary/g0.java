package com.yandex.passport.internal.report.diary;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public g0(String str, String str2, String str3, int i) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.a, g0Var.a) && Intrinsics.d(this.b, g0Var.b) && Intrinsics.d(this.c, g0Var.c) && this.d == g0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiaryParameterStats(name=");
        sb.append(this.a);
        sb.append(", methodName=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", count=");
        return vz1.r(sb, this.d, ')');
    }
}
