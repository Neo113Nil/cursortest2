package defpackage;

/* loaded from: classes4.dex */
public final class bgo {
    public final tfo a;
    public final boolean b;

    public bgo(tfo tfoVar, boolean z) {
        this.a = tfoVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgo)) {
            return false;
        }
        bgo bgoVar = (bgo) obj;
        return this.a.equals(bgoVar.a) && this.b == bgoVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RotorTrackSessionBatch(batch=" + this.a + ", unknownSession=" + this.b + ")";
    }
}
