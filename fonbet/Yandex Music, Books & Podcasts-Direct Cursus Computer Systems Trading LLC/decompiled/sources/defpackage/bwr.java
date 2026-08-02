package defpackage;

/* loaded from: classes4.dex */
public final class bwr implements jwr {
    public final n43 a;
    public final kwr b;

    public bwr(n43 n43Var, kwr kwrVar) {
        this.a = n43Var;
        this.b = kwrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwr)) {
            return false;
        }
        bwr bwrVar = (bwr) obj;
        return this.a.equals(bwrVar.a) && this.b == bwrVar.b;
    }

    @Override // defpackage.jwr
    public final n43 getType() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorSyncBlock(type=" + this.a + ", errorCode=" + this.b + ")";
    }
}
