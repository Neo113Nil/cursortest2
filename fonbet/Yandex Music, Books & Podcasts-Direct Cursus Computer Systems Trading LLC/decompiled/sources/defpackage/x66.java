package defpackage;

/* loaded from: classes4.dex */
public final class x66 {
    public final boolean a;
    public final u0j b;

    public x66(boolean z, u0j u0jVar) {
        u0jVar.getClass();
        this.a = z;
        this.b = u0jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x66)) {
            return false;
        }
        x66 x66Var = (x66) obj;
        return this.a == x66Var.a && this.b == x66Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ConnectivityInfoImpl(connected=" + this.a + ", mode=" + this.b + ")";
    }
}
