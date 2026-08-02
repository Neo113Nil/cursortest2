package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class thm implements ohb {
    public final t5a a;
    public final vhm b;
    public final m4a c;

    public thm(t5a t5aVar, vhm vhmVar, m4a m4aVar) {
        this.a = t5aVar;
        this.b = vhmVar;
        this.c = m4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!thm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        thm thmVar = (thm) obj;
        return Intrinsics.d(this.a, thmVar.a) && Intrinsics.d(this.b, thmVar.b) && this.c.equals(thmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Finished(query=" + this.a + ", portionParams=" + this.b + ", documentFetchResult=" + this.c + ")";
    }
}
