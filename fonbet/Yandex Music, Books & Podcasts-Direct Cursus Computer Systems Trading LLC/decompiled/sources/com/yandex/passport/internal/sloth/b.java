package com.yandex.passport.internal.sloth;

import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final int a;
    public final boolean b;
    public final a c;
    public final Long d;

    public b(int i, boolean z, a aVar, Long l) {
        this.a = i;
        this.b = z;
        this.c = aVar;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Intrinsics.d(this.d, bVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + k5r.e(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Long l = this.d;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionSnapshot(code=");
        sb.append(this.a);
        sb.append(", isVpn=");
        sb.append(this.b);
        sb.append(", baseTransport=");
        sb.append(this.c);
        sb.append(", networkHandle=");
        return tlm.k(sb, this.d, ')');
    }
}
