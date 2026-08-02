package defpackage;

import j$.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class v87 {
    public final long a;
    public final Duration b;

    public v87(long j, Duration duration) {
        duration.getClass();
        this.a = j;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v87)) {
            return false;
        }
        v87 v87Var = (v87) obj;
        return this.a == v87Var.a && Intrinsics.d(this.b, v87Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DailyTrafficMeasurement(bytes=" + this.a + ", timeInterval=" + this.b + ")";
    }
}
