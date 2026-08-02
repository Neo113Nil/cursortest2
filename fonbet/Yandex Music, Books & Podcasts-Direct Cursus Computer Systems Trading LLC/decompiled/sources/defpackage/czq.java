package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class czq {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Long d;
    public final Long e;

    public czq(boolean z, boolean z2, boolean z3, Long l, Long l2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = l;
        this.e = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czq)) {
            return false;
        }
        czq czqVar = (czq) obj;
        return this.a == czqVar.a && this.b == czqVar.b && this.c == czqVar.c && Intrinsics.d(this.d, czqVar.d) && Intrinsics.d(this.e, czqVar.e);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        int hashCode = (e + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder j = eta.j("Config(idleDeviceRequired=", this.a, ", chargingRequired=", this.b, ", deleteGradually=");
        j.append(this.c);
        j.append(", retryDelayMs=");
        j.append(this.d);
        j.append(", downloadTimeoutMs=");
        j.append(this.e);
        j.append(")");
        return j.toString();
    }
}
