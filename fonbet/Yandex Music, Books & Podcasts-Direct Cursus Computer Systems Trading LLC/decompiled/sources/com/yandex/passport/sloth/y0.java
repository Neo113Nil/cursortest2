package com.yandex.passport.sloth;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y0 implements b1 {
    public final String a;
    public final String b;

    public y0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.a, y0Var.a) && Intrinsics.d(this.b, y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlothOpenUrlResult(url=");
        com.appsflyer.internal.k.y(sb, this.a, ", purpose=");
        return dfi.i(sb, this.b, ')');
    }
}
