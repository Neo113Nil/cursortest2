package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o5a extends h4a {
    public final r7b n;
    public final t5a o;

    public o5a(r7b r7bVar, t5a t5aVar) {
        this.n = r7bVar;
        this.o = t5aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        o5a o5aVar = (o5a) obj;
        return this.n.equals(o5aVar.n) && Intrinsics.d(this.o, o5aVar.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + (this.n.hashCode() * 31);
    }

    public final String toString() {
        return "Started(context=" + this.n + ", query=" + this.o + ")";
    }
}
