package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l5a extends h4a {
    public final r7b n;
    public final t5a o;
    public final vhm p;
    public final q2a q;

    public l5a(r7b r7bVar, t5a t5aVar, vhm vhmVar, q2a q2aVar) {
        this.n = r7bVar;
        this.o = t5aVar;
        this.p = vhmVar;
        this.q = q2aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        l5a l5aVar = (l5a) obj;
        return this.n.equals(l5aVar.n) && Intrinsics.d(this.o, l5aVar.o) && Intrinsics.d(this.p, l5aVar.p) && Intrinsics.d(this.q, l5aVar.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + (this.n.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PortionFinished(context=" + this.n + ", query=" + this.o + ", portionParams=" + this.p + ", document=" + this.q + ")";
    }
}
