package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a8v implements c8v {
    public final n6v a;

    public a8v(n6v n6vVar) {
        n6vVar.getClass();
        this.a = n6vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8v) && Intrinsics.d(this.a, ((a8v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Action(action=" + this.a + ")";
    }
}
