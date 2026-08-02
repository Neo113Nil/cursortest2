package com.yandex.plus.pay.repository.api.model.invoice;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {
    public final String a;
    public final a b;
    public final String c;
    public final String d;

    public b(String str, a aVar, String str2, String str3) {
        str2.getClass();
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b == bVar.b && Intrinsics.d(this.c, bVar.c) && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        return this.d.hashCode() + k5r.c((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Payment(id=");
        sb.append(this.a);
        sb.append(", errorStatusCode=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", description=");
        return dfi.i(sb, this.d, ')');
    }
}
