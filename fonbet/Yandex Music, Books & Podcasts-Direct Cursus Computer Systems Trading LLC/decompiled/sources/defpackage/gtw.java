package defpackage;

/* loaded from: classes4.dex */
public final class gtw implements itw {
    public final int a;

    public gtw(int i) {
        this.a = i;
    }

    @Override // defpackage.itw
    public final wqw a(wqw wqwVar) {
        wqwVar.getClass();
        return wqwVar.b.a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gtw) && this.a == ((gtw) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Set(", ")");
    }
}
