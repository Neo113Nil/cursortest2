package com.yandex.passport.internal.report.reporters;

import defpackage.k5r;
import defpackage.vz1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 {
    public final String a;
    public final String b;
    public final String c;
    public final Long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Set i;

    public m0(String str, String str2, String str3, Long l, boolean z, boolean z2, boolean z3, boolean z4, Set set) {
        str.getClass();
        set.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.a, m0Var.a) && Intrinsics.d(this.b, m0Var.b) && Intrinsics.d(this.c, m0Var.c) && Intrinsics.d(this.d, m0Var.d) && this.e == m0Var.e && this.f == m0Var.f && this.g == m0Var.g && this.h == m0Var.h && Intrinsics.d(this.i, m0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        return this.i.hashCode() + k5r.e(k5r.e(k5r.e(k5r.e((hashCode3 + (l != null ? l.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Account(uid=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", environment=");
        sb.append(this.c);
        sb.append(", locationId=");
        sb.append(this.d);
        sb.append(", hasUserInfo=");
        sb.append(this.e);
        sb.append(", hasStash=");
        sb.append(this.f);
        sb.append(", hasToken=");
        sb.append(this.g);
        sb.append(", hasTombstone=");
        sb.append(this.h);
        sb.append(", stashKeys=");
        return vz1.v(sb, this.i, ')');
    }
}
