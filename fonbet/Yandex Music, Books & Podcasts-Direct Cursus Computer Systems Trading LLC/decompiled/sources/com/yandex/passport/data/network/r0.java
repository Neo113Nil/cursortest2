package com.yandex.passport.data.network;

import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r0 implements s0 {
    public final String a;
    public final List b;

    public r0(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.d(this.a, r0Var.a) && Intrinsics.d(this.b, r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Url(value=");
        sb.append(this.a);
        sb.append(", cookies=");
        return eta.h(sb, this.b, ')');
    }
}
