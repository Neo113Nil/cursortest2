package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q4a {
    public static final q4a b = new q4a(null);
    public final Long a;

    public q4a(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q4a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.d(this.a, ((q4a) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DocumentLifetime(freshUntilTimestamp=" + this.a + ")";
    }
}
