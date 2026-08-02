package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u4q implements e5q, q4q, x4q {
    public final tnu a;
    public final t4q b;
    public final s4v c;
    public final o4q d;
    public final p4q e;
    public final s9p f;

    public u4q(tnu tnuVar, t4q t4qVar, s4v s4vVar, o4q o4qVar, p4q p4qVar, s9p s9pVar) {
        o4qVar.getClass();
        p4qVar.getClass();
        this.a = tnuVar;
        this.b = t4qVar;
        this.c = s4vVar;
        this.d = o4qVar;
        this.e = p4qVar;
        this.f = s9pVar;
    }

    public static u4q h(u4q u4qVar, o4q o4qVar, s9p s9pVar, int i) {
        tnu tnuVar = u4qVar.a;
        t4q t4qVar = u4qVar.b;
        s4v s4vVar = u4qVar.c;
        if ((i & 8) != 0) {
            o4qVar = u4qVar.d;
        }
        o4q o4qVar2 = o4qVar;
        p4q p4qVar = u4qVar.e;
        if ((i & 32) != 0) {
            s9pVar = u4qVar.f;
        }
        o4qVar2.getClass();
        p4qVar.getClass();
        return new u4q(tnuVar, t4qVar, s4vVar, o4qVar2, p4qVar, s9pVar);
    }

    @Override // defpackage.x4q
    public final s9p a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4q)) {
            return false;
        }
        u4q u4qVar = (u4q) obj;
        return this.a.equals(u4qVar.a) && this.b.equals(u4qVar.b) && this.c.equals(u4qVar.c) && this.d == u4qVar.d && this.e == u4qVar.e && Intrinsics.d(this.f, u4qVar.f);
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
        return "WithOnlineSessionId(id=" + this.a + ", analyticsOptions=" + this.b + ", description=" + this.c + ", entityMode=" + this.d + ", waveType=" + this.e + ", pendingSeeds=" + this.f + ")";
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
