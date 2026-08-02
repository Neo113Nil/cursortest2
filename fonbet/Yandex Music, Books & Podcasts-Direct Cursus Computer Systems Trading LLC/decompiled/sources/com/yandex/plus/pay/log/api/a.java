package com.yandex.plus.pay.log.api;

import defpackage.f1d;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final int a;
    public final com.yandex.plus.log.api.a b;
    public final String c;
    public final String d;
    public final Throwable e;

    public a(int i, com.yandex.plus.log.api.a aVar, String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = aVar;
        this.c = str;
        this.d = str2;
        this.e = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d) && Intrinsics.d(this.e, aVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
        Throwable th = this.e;
        return c + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayLogEntry(id=");
        sb.append(this.a);
        sb.append(", priority=");
        sb.append(this.b);
        sb.append(", tag=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", error=");
        return f1d.k(sb, this.e, ')');
    }
}
