package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class so2 implements uo2 {
    public final mo2 a;

    public so2(mo2 mo2Var) {
        mo2Var.getClass();
        this.a = mo2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so2) && Intrinsics.d(this.a, ((so2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content(uiData=" + this.a + ")";
    }
}
