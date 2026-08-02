package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s4q implements e5q, q4q {
    public final tnu a;
    public final r4q b;
    public final s4v c;
    public final o4q d;
    public final p4q e;

    public s4q(tnu tnuVar, r4q r4qVar, s4v s4vVar) {
        s4vVar.getClass();
        this.a = tnuVar;
        this.b = r4qVar;
        this.c = s4vVar;
        this.d = o4q.a;
        this.e = p4q.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4q)) {
            return false;
        }
        s4q s4qVar = (s4q) obj;
        return this.a.equals(s4qVar.a) && this.b.equals(s4qVar.b) && Intrinsics.d(this.c, s4qVar.c);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WithOfflineSessionId(id=" + this.a + ", analyticsOptions=" + this.b + ", description=" + this.c + ")";
    }

    @Override // defpackage.e5q, defpackage.u3q
    public final tnu getId() {
        return this.a;
    }

    @Override // defpackage.e5q, defpackage.u3q
    public final xnu getId() {
        return this.a;
    }

    @Override // defpackage.e5q, defpackage.u3q
    public final aou getId() {
        return this.a;
    }
}
