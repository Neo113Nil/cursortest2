package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fh {
    public final com.yandex.plus.core.graphql.type.f a;
    public final String b;
    public final Integer c;
    public final Double d;
    public final String e;

    public fh(com.yandex.plus.core.graphql.type.f fVar, String str, Integer num, Double d, String str2) {
        this.a = fVar;
        this.b = str;
        this.c = num;
        this.d = d;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh)) {
            return false;
        }
        fh fhVar = (fh) obj;
        return this.a == fhVar.a && this.b.equals(fhVar.b) && Intrinsics.d(this.c, fhVar.c) && Intrinsics.d(this.d, fhVar.d) && Intrinsics.d(this.e, fhVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.d;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComparisonPredicate(type=");
        sb.append(this.a);
        sb.append(", argName=");
        sb.append(this.b);
        sb.append(", intValue=");
        sb.append(this.c);
        sb.append(", doubleValue=");
        sb.append(this.d);
        sb.append(", stringValue=");
        return dfi.i(sb, this.e, ')');
    }
}
