package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class d1 {
    public static final d1 g;
    public final List a;
    public final t1 b;
    public final String c;
    public final m2 d;
    public final m2 e;
    public final bte f;

    static {
        q1.Companion.getClass();
        q1 q1Var = q1.g;
        q1Var.getClass();
        g = new d1("default", q1Var);
    }

    public d1(String str, q1 q1Var) {
        str.getClass();
        q1Var.getClass();
        yse yseVar = q1Var.e;
        this.a = yseVar.a;
        bte bteVar = yseVar.b;
        bteVar.getClass();
        this.b = new t1(str, bteVar);
        this.c = yseVar.c;
        this.d = q1Var.c;
        this.e = q1Var.d;
        this.f = yseVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        d1 d1Var = (d1) obj;
        return Intrinsics.d(this.a, d1Var.a) && Intrinsics.d(this.b, d1Var.b) && Intrinsics.d(this.c, d1Var.c) && Intrinsics.d(this.d, d1Var.d) && Intrinsics.d(this.e, d1Var.e) && Intrinsics.d(this.f, d1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        return "AbConfig(testIds=" + this.a + ", flags=" + this.b + ", slots='" + this.c + "', experimentValidationResult=" + this.d + ", featureToggleValidationResult=" + this.e + ", rawFlags=" + this.f + ')';
    }
}
