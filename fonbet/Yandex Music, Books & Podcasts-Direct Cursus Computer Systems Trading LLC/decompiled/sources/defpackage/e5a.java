package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e5a extends h4a {
    public final r7b n;
    public final t5a o;

    public e5a(r7b r7bVar, t5a t5aVar) {
        this.n = r7bVar;
        this.o = t5aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        e5a e5aVar = (e5a) obj;
        return this.n.equals(e5aVar.n) && Intrinsics.d(this.o, e5aVar.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + (this.n.hashCode() * 31);
    }

    public final String toString() {
        return "Cancelled(context=" + this.n + ", query=" + this.o + ")";
    }
}
