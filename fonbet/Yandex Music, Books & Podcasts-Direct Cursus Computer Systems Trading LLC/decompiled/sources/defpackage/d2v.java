package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d2v implements f2v, e2v {
    public final s9p a;
    public final s4v b;
    public final p4q c;

    public d2v(s9p s9pVar, s4v s4vVar, p4q p4qVar) {
        s9pVar.getClass();
        s4vVar.getClass();
        p4qVar.getClass();
        this.a = s9pVar;
        this.b = s4vVar;
        this.c = p4qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2v)) {
            return false;
        }
        d2v d2vVar = (d2v) obj;
        return Intrinsics.d(this.a, d2vVar.a) && Intrinsics.d(this.b, d2vVar.b) && this.c == d2vVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Wave(seeds=" + this.a + ", description=" + this.b + ", waveType=" + this.c + ")";
    }
}
