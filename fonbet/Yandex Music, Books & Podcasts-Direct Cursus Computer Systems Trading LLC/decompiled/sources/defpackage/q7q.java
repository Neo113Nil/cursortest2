package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q7q implements t7q {
    public final n7q a;

    public q7q(n7q n7qVar) {
        n7qVar.getClass();
        this.a = n7qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7q) && Intrinsics.d(this.a, ((q7q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Active(state=" + this.a + ")";
    }
}
