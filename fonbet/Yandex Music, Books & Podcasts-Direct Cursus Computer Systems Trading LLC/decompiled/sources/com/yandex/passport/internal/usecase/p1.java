package com.yandex.passport.internal.usecase;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p1 {
    public final com.yandex.passport.common.core.f a;
    public final String b;
    public final String c;
    public final String d;

    public p1(com.yandex.passport.common.core.f fVar, String str, String str2, String str3) {
        fVar.getClass();
        str.getClass();
        this.a = fVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Intrinsics.d(this.a, p1Var.a) && Intrinsics.d(this.b, p1Var.b) && Intrinsics.d(this.c, p1Var.c) && this.d.equals(p1Var.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(uid=");
        sb.append(this.a);
        sb.append(", biometricSessionId=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", installId=");
        return dfi.i(sb, this.d, ')');
    }
}
