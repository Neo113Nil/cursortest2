package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qb1 implements tb1 {
    public final egl a;

    public qb1(egl eglVar) {
        eglVar.getClass();
        this.a = eglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb1) && Intrinsics.d(this.a, ((qb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Debug(config=" + this.a + ")";
    }
}
