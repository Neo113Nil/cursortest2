package com.yandex.plus.experiments.api;

import defpackage.k5r;
import defpackage.vz1;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public final String a;
    public final String b;
    public final List c;
    public final Set d;

    public a(String str, String str2, List list, Set set) {
        str.getClass();
        str2.getClass();
        list.getClass();
        set.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.d(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusExperiments(testIdsWithBucketNumber=");
        sb.append(this.a);
        sb.append(", triggeredTestIdsWithBucketNumber=");
        sb.append(this.b);
        sb.append(", testIds=");
        sb.append(this.c);
        sb.append(", flags=");
        return vz1.v(sb, this.d, ')');
    }
}
