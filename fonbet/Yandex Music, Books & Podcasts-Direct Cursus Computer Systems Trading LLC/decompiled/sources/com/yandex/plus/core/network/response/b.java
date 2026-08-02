package com.yandex.plus.core.network.response;

import com.yandex.plus.core.insets.d;
import defpackage.f1d;
import defpackage.hlr;
import defpackage.k5r;
import defpackage.o3o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class b {
    public static final IntRange g = new IntRange(400, 599, 1);
    public final com.yandex.plus.core.network.request.b a;
    public final a b;
    public final int c;
    public final String d;
    public final d e;
    public final Object f;

    public b(com.yandex.plus.core.network.request.b bVar, a aVar, int i, String str, d dVar, o3o o3oVar) {
        str.getClass();
        this.a = bVar;
        this.b = aVar;
        this.c = i;
        this.d = str;
        this.e = dVar;
        this.f = o3oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c == bVar.c && Intrinsics.d(this.d, bVar.d) && this.e.equals(bVar.e) && Intrinsics.d(this.f, bVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + k5r.c(f1d.a(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b.a), 31), 31, this.d)) * 31;
        Object obj = this.f;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return hlr.d("\n            Response status: " + this.c + "\n            \n            Headers:\n            " + this.e + "\n        ");
    }
}
