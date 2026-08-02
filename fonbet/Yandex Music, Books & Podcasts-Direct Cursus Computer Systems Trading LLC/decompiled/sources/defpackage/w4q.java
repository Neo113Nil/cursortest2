package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w4q implements e5q, z4q, a5q, x4q {
    public final unu a;
    public final v4q b;
    public final s4v c;
    public final o4q d;
    public final p4q e;
    public final s9p f;

    public w4q(unu unuVar, v4q v4qVar, s4v s4vVar, o4q o4qVar, p4q p4qVar, s9p s9pVar) {
        o4qVar.getClass();
        p4qVar.getClass();
        this.a = unuVar;
        this.b = v4qVar;
        this.c = s4vVar;
        this.d = o4qVar;
        this.e = p4qVar;
        this.f = s9pVar;
    }

    public static w4q h(w4q w4qVar, o4q o4qVar, s9p s9pVar, int i) {
        unu unuVar = w4qVar.a;
        v4q v4qVar = w4qVar.b;
        s4v s4vVar = w4qVar.c;
        if ((i & 8) != 0) {
            o4qVar = w4qVar.d;
        }
        o4q o4qVar2 = o4qVar;
        p4q p4qVar = w4qVar.e;
        if ((i & 32) != 0) {
            s9pVar = w4qVar.f;
        }
        o4qVar2.getClass();
        p4qVar.getClass();
        return new w4q(unuVar, v4qVar, s4vVar, o4qVar2, p4qVar, s9pVar);
    }

    @Override // defpackage.x4q
    public final s9p a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4q)) {
            return false;
        }
        w4q w4qVar = (w4q) obj;
        return this.a.equals(w4qVar.a) && this.b.equals(w4qVar.b) && this.c.equals(w4qVar.c) && this.d == w4qVar.d && this.e == w4qVar.e && Intrinsics.d(this.f, w4qVar.f);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        s9p s9pVar = this.f;
        return hashCode + (s9pVar == null ? 0 : s9pVar.a.hashCode());
    }

    public final String toString() {
        return "WithPassiveSessionId(id=" + this.a + ", expectedAnalyticsOptions=" + this.b + ", description=" + this.c + ", entityMode=" + this.d + ", waveType=" + this.e + ", pendingSeeds=" + this.f + ")";
    }

    @Override // defpackage.e5q, defpackage.u3q
    public final vnu getId() {
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
