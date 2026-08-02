package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ob6 {
    public final int a;
    public final long b;
    public final pb6 c;
    public final vtm d;

    public ob6(int i, long j, pb6 pb6Var, vtm vtmVar) {
        this.a = i;
        this.b = j;
        this.c = pb6Var;
        this.d = vtmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob6)) {
            return false;
        }
        ob6 ob6Var = (ob6) obj;
        return this.a == ob6Var.a && this.b == ob6Var.b && this.c == ob6Var.c && Intrinsics.d(this.d, ob6Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + tlm.c(this.b, Integer.hashCode(this.a) * 31, 31)) * 31;
        vtm vtmVar = this.d;
        return hashCode + (vtmVar == null ? 0 : vtmVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
