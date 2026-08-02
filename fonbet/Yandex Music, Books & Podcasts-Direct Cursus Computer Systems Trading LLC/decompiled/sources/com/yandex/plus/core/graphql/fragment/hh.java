package com.yandex.plus.core.graphql.fragment;

import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hh {
    public final String a;
    public final List b;
    public final List c;

    public hh(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh)) {
            return false;
        }
        hh hhVar = (hh) obj;
        return this.a.equals(hhVar.a) && Intrinsics.d(this.b, hhVar.b) && Intrinsics.d(this.c, hhVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InSetPredicate(argName=");
        sb.append(this.a);
        sb.append(", intSet=");
        sb.append(this.b);
        sb.append(", stringSet=");
        return eta.h(sb, this.c, ')');
    }
}
