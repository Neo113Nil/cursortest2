package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zel {
    public final egl a;
    public final boolean b;

    public zel(egl eglVar, boolean z) {
        eglVar.getClass();
        this.a = eglVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zel)) {
            return false;
        }
        zel zelVar = (zel) obj;
        return Intrinsics.d(this.a, zelVar.a) && this.b == zelVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Conditions(restrictions=" + this.a + ", foreground=" + this.b + ")";
    }
}
