package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pd1 implements rd1 {
    public final u51 a;
    public final boolean b;

    public pd1(u51 u51Var, boolean z) {
        u51Var.getClass();
        this.a = u51Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd1)) {
            return false;
        }
        pd1 pd1Var = (pd1) obj;
        return Intrinsics.d(this.a, pd1Var.a) && this.b == pd1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Placeholder(item=" + this.a + ", loading=" + this.b + ")";
    }
}
