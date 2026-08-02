package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements c0 {
    public final String a;
    public final String b;
    public final Map c;

    public a0(String str, String str2, Map map) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.c0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.a, a0Var.a) && Intrinsics.d(this.b, a0Var.b) && Intrinsics.d(this.c, a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSpecific(actionContext=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", items=");
        return k5r.p(sb, this.c, ')');
    }
}
