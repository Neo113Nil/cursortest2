package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xnw implements znw {
    public final raq a;

    public xnw(raq raqVar) {
        raqVar.getClass();
        this.a = raqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xnw) && Intrinsics.d(this.a, ((xnw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Unsupported(state=" + this.a + ")";
    }
}
