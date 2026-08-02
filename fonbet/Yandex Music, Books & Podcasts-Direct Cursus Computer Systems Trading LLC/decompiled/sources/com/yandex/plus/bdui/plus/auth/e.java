package com.yandex.plus.bdui.plus.auth;

import defpackage.eta;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements f {
    public final long a;
    public final String b;
    public final List c;

    public e(long j, String str, List list) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && Intrinsics.d(this.b, eVar.b) && this.c.equals(eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(userId=");
        sb.append(this.a);
        sb.append(", oauthToken=");
        sb.append(this.b);
        sb.append(", partitions=");
        return eta.h(sb, this.c, ')');
    }
}
