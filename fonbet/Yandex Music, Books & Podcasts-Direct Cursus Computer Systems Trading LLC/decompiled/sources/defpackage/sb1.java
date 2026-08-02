package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sb1 implements tb1 {
    public final String a;
    public final egl b;

    public sb1(String str, egl eglVar) {
        str.getClass();
        this.a = str;
        this.b = eglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb1)) {
            return false;
        }
        sb1 sb1Var = (sb1) obj;
        return Intrinsics.d(this.a, sb1Var.a) && this.b.equals(sb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Enabled(title=" + this.a + ", config=" + this.b + ")";
    }
}
