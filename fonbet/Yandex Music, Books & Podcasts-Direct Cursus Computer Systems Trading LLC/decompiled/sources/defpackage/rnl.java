package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rnl extends vnl {
    public final bdn a;
    public final qan b;
    public final n1g c;
    public final mj2 d;
    public final zi6 e;
    public final dtp f;
    public final z3h g;

    public rnl(bdn bdnVar, qan qanVar, n1g n1gVar, mj2 mj2Var, zi6 zi6Var, dtp dtpVar, z3h z3hVar) {
        bdnVar.getClass();
        qanVar.getClass();
        n1gVar.getClass();
        mj2Var.getClass();
        zi6Var.getClass();
        dtpVar.getClass();
        this.a = bdnVar;
        this.b = qanVar;
        this.c = n1gVar;
        this.d = mj2Var;
        this.e = zi6Var;
        this.f = dtpVar;
        this.g = z3hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnl)) {
            return false;
        }
        rnl rnlVar = (rnl) obj;
        return Intrinsics.d(this.a, rnlVar.a) && Intrinsics.d(this.b, rnlVar.b) && Intrinsics.d(this.c, rnlVar.c) && Intrinsics.d(this.d, rnlVar.d) && Intrinsics.d(this.e, rnlVar.e) && Intrinsics.d(this.f, rnlVar.f) && Intrinsics.d(this.g, rnlVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        z3h z3hVar = this.g;
        return hashCode + (z3hVar == null ? 0 : z3hVar.hashCode());
    }

    public final String toString() {
        return "Ready(queueData=" + this.a + ", queuePlayablesData=" + this.b + ", likeState=" + this.c + ", background=" + this.d + ", controls=" + this.e + ", settingsState=" + this.f + ", lyricsData=" + this.g + ")";
    }
}
