package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zr1 extends bs1 {
    public final w4k a;

    public zr1(w4k w4kVar) {
        this.a = w4kVar;
    }

    @Override // defpackage.bs1
    public final w4k a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zr1) && Intrinsics.d(this.a, ((zr1) obj).a);
    }

    public final int hashCode() {
        w4k w4kVar = this.a;
        if (w4kVar == null) {
            return 0;
        }
        return w4kVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ')';
    }
}
