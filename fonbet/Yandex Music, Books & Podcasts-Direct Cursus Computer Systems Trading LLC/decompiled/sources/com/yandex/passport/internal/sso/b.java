package com.yandex.passport.internal.sso;

import defpackage.eta;
import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final com.yandex.passport.common.core.f a;
    public final int b;
    public final a c;
    public final long d;

    public b(com.yandex.passport.common.core.f fVar, int i, a aVar, long j) {
        fVar.getClass();
        aVar.getClass();
        this.a = fVar;
        this.b = i;
        this.c = aVar;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountAction(uid=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", lastAction=");
        sb.append(this.c);
        sb.append(", localTimestamp=");
        return eta.g(sb, this.d, ')');
    }
}
