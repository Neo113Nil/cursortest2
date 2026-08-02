package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b6a {
    public final q2a a;
    public final t5a b;

    public b6a(q2a q2aVar, t5a t5aVar) {
        this.a = q2aVar;
        this.b = t5aVar;
        f0q f0qVar = q2aVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b6a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        b6a b6aVar = (b6a) obj;
        return Intrinsics.d(this.a, b6aVar.a) && Intrinsics.d(this.b, b6aVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t5a t5aVar = this.b;
        return hashCode + (t5aVar != null ? t5aVar.hashCode() : 0);
    }

    public final String toString() {
        return "DocumentResponse(document=" + this.a + ", redirect=" + this.b + ")";
    }
}
