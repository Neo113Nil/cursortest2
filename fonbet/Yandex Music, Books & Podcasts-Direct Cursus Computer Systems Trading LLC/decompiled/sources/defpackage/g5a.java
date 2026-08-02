package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g5a extends h4a {
    public final r7b n;
    public final t5a o;
    public final Throwable p;
    public final ArrayList q;

    public g5a(r7b r7bVar, t5a t5aVar, Throwable th, ArrayList arrayList) {
        this.n = r7bVar;
        this.o = t5aVar;
        this.p = th;
        this.q = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        g5a g5aVar = (g5a) obj;
        return this.n.equals(g5aVar.n) && Intrinsics.d(this.o, g5aVar.o) && this.p.equals(g5aVar.p) && this.q.equals(g5aVar.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + (this.n.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Failed(context=" + this.n + ", query=" + this.o + ", error=" + this.p + ", tags=" + this.q + ")";
    }
}
