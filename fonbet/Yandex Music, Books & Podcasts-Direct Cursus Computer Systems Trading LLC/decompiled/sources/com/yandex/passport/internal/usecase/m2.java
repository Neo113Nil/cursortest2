package com.yandex.passport.internal.usecase;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m2 {
    public final com.yandex.passport.common.core.f a;
    public final String b;
    public final String c;
    public final String d;

    public m2(com.yandex.passport.common.core.f fVar, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = fVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return this.a.equals(m2Var.a) && Intrinsics.d(this.b, m2Var.b) && Intrinsics.d(this.c, m2Var.c) && this.d.equals(m2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(uid=");
        sb.append(this.a);
        sb.append(", service=");
        sb.append(this.b);
        sb.append(", brand=");
        sb.append(this.c);
        sb.append(", from=");
        return dfi.i(sb, this.d, ')');
    }
}
