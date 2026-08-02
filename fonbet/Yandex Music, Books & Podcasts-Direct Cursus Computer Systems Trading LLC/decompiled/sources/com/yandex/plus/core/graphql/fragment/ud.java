package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ud {
    public final String a;
    public final Integer b;
    public final double c;

    public ud(String str, Integer num, double d) {
        this.a = str;
        this.b = num;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud)) {
            return false;
        }
        ud udVar = (ud) obj;
        return this.a.equals(udVar.a) && Intrinsics.d(this.b, udVar.b) && Double.compare(this.c, udVar.c) == 0;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Double.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueColor(color=");
        sb.append(this.a);
        sb.append(", opacity=");
        sb.append(this.b);
        sb.append(", position=");
        return k5r.n(sb, this.c, ')');
    }
}
