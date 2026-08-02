package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t7o implements Serializable {
    public final Throwable a;

    public t7o(Throwable th) {
        th.getClass();
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t7o) {
            return Intrinsics.d(this.a, ((t7o) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("Failure("), this.a, ')');
    }
}
