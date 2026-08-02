package io.appmetrica.analytics.egress.impl;

import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public a(boolean z, String str, int i, int i2, boolean z2, boolean z3) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = z2;
        this.f = z3;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.c;
    }

    public final boolean c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && Intrinsics.d(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int a = f1d.a(this.d, f1d.a(this.c, k5r.c(r0 * 31, 31, this.b), 31), 31);
        ?? r3 = this.e;
        int i = r3;
        if (r3 != 0) {
            i = 1;
        }
        int i2 = (a + i) * 31;
        boolean z2 = this.f;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EgressConfig(enabled=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", repeatedDelay=");
        sb.append(this.c);
        sb.append(", randomDelayWindow=");
        sb.append(this.d);
        sb.append(", isBackgroundAllowed=");
        sb.append(this.e);
        sb.append(", isDiagnosticsEnabled=");
        return dfi.j(sb, this.f, ')');
    }
}
