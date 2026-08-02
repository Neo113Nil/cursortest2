package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c36 implements e36 {
    public final ws5 a;

    public c36(ws5 ws5Var) {
        ws5Var.getClass();
        this.a = ws5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c36) && Intrinsics.d(this.a, ((c36) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConcertItem(bundle=" + this.a + ")";
    }
}
