package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gh {
    public final String a;
    public final Integer b;
    public final String c;

    public gh(String str, Integer num, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh)) {
            return false;
        }
        gh ghVar = (gh) obj;
        return this.a.equals(ghVar.a) && Intrinsics.d(this.b, ghVar.b) && Intrinsics.d(this.c, ghVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContainsPredicate(argName=");
        sb.append(this.a);
        sb.append(", intValue=");
        sb.append(this.b);
        sb.append(", stringValue=");
        return dfi.i(sb, this.c, ')');
    }
}
