package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i5a extends h4a {
    public final r7b n;
    public final t5a o;
    public final q2a p;
    public final ArrayList q;

    public i5a(q2a q2aVar, t5a t5aVar, r7b r7bVar, ArrayList arrayList) {
        this.n = r7bVar;
        this.o = t5aVar;
        this.p = q2aVar;
        this.q = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        i5a i5aVar = (i5a) obj;
        return this.n.equals(i5aVar.n) && Intrinsics.d(this.o, i5aVar.o) && Intrinsics.d(this.p, i5aVar.p) && this.q.equals(i5aVar.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + (this.n.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Finished(context=" + this.n + ", query=" + this.o + ", document=" + this.p + ", tags=" + this.q + ")";
    }
}
