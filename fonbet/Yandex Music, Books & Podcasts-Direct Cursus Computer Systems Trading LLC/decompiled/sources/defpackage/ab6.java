package defpackage;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ab6 {
    public final Object a;
    public final long b;

    public ab6(Object obj) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = obj;
        this.b = elapsedRealtime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab6)) {
            return false;
        }
        ab6 ab6Var = (ab6) obj;
        return Intrinsics.d(this.a, ab6Var.a) && this.b == ab6Var.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Long.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "Container(value=" + this.a + ", time=" + this.b + ")";
    }
}
