package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hyu implements nyu, myu {
    public final unu a;
    public final v4q b;
    public final s4v c;
    public final p4q d;
    public final s9p e;

    public hyu(unu unuVar, v4q v4qVar, s4v s4vVar, p4q p4qVar, s9p s9pVar) {
        p4qVar.getClass();
        this.a = unuVar;
        this.b = v4qVar;
        this.c = s4vVar;
        this.d = p4qVar;
        this.e = s9pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyu)) {
            return false;
        }
        hyu hyuVar = (hyu) obj;
        return this.a.equals(hyuVar.a) && this.b.equals(hyuVar.b) && this.c.equals(hyuVar.c) && this.d == hyuVar.d && Intrinsics.d(this.e, hyuVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        s9p s9pVar = this.e;
        return hashCode + (s9pVar == null ? 0 : s9pVar.a.hashCode());
    }

    public final String toString() {
        return "PassiveSession(id=" + this.a + ", expectedAnalyticsOptions=" + this.b + ", description=" + this.c + ", waveType=" + this.d + ", pendingSeeds=" + this.e + ")";
    }
}
