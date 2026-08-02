package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m93 implements q93, qzn {
    public final h93 a;

    public m93(h93 h93Var) {
        h93Var.getClass();
        this.a = h93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m93) && Intrinsics.d(this.a, ((m93) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InfoBlock(data=" + this.a + ")";
    }
}
