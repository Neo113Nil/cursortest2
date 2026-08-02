package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p4k extends r4k {
    public final Throwable a;

    public p4k(Exception exc) {
        exc.getClass();
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4k) && Intrinsics.d(this.a, ((p4k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hlr.e("LoadResult.Error(\n                    |   throwable: " + this.a + "\n                    |) ");
    }
}
