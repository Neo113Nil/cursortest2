package defpackage;

/* loaded from: classes4.dex */
public final class kyu implements oyu, lyu {
    public final tnu a;
    public final t4q b;
    public final s4v c;
    public final p4q d;

    public kyu(tnu tnuVar, t4q t4qVar, s4v s4vVar, p4q p4qVar) {
        p4qVar.getClass();
        this.a = tnuVar;
        this.b = t4qVar;
        this.c = s4vVar;
        this.d = p4qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyu)) {
            return false;
        }
        kyu kyuVar = (kyu) obj;
        return this.a.equals(kyuVar.a) && this.b.equals(kyuVar.b) && this.c.equals(kyuVar.c) && this.d == kyuVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WithActiveSession(id=" + this.a + ", analyticsOptions=" + this.b + ", description=" + this.c + ", waveType=" + this.d + ")";
    }
}
