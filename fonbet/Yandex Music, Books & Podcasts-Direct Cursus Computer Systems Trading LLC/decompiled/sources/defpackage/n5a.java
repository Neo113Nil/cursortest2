package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n5a implements ohb {
    public final t5a a;
    public final q2a b;

    public n5a(q2a q2aVar, t5a t5aVar) {
        this.a = t5aVar;
        this.b = q2aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        n5a n5aVar = (n5a) obj;
        return Intrinsics.d(this.a, n5aVar.a) && Intrinsics.d(this.b, n5aVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q2a q2aVar = this.b;
        return hashCode + (q2aVar != null ? q2aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Started(query=" + this.a + ", preview=" + this.b + ")";
    }
}
