package com.yandex.passport.api;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g2 implements h2 {
    public final String a;
    public final String b;

    public g2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return Intrinsics.d(this.a, g2Var.a) && Intrinsics.d(this.b, g2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessUrl(url=");
        sb.append(this.a);
        sb.append(", purpose=");
        return dfi.i(sb, this.b, ')');
    }
}
