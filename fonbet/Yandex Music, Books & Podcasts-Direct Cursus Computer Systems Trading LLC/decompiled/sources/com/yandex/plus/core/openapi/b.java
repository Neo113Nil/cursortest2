package com.yandex.plus.core.openapi;

import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final String a;
    public final String b;
    public final Map c;

    public b(String str, String str2, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && this.b.equals(bVar.b) && Intrinsics.d(this.c, bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Meta(requestMethod=" + this.a + ",requestUrl=" + this.b + ",requestHeadersCount=" + this.c.size() + ')';
    }
}
