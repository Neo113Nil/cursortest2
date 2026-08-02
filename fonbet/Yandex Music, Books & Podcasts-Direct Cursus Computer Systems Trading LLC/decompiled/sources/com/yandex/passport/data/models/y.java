package com.yandex.passport.data.models;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y {
    public final x a;
    public final String b;

    public y(x xVar, String str) {
        str.getClass();
        this.a = xVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && Intrinsics.d(this.b, yVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VersionRule(sign=");
        sb.append(this.a);
        sb.append(", version=");
        return dfi.i(sb, this.b, ')');
    }
}
