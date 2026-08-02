package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fa7 {
    public final dd5 a;
    public final q3q b;

    public fa7(dd5 dd5Var, q3q q3qVar) {
        dd5Var.getClass();
        q3qVar.getClass();
        this.a = dd5Var;
        this.b = q3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa7)) {
            return false;
        }
        fa7 fa7Var = (fa7) obj;
        return Intrinsics.d(this.a, fa7Var.a) && Intrinsics.d(this.b, fa7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DataForEntityHash(id=" + this.a + ", subtype=" + this.b + ")";
    }
}
