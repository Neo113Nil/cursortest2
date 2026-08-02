package defpackage;

/* loaded from: classes5.dex */
public final class bfd {
    public final cfd a;
    public final cfd b;

    public bfd(cfd cfdVar, cfd cfdVar2) {
        this.a = cfdVar;
        this.b = cfdVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfd)) {
            return false;
        }
        bfd bfdVar = (bfd) obj;
        return this.a == bfdVar.a && this.b == bfdVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Requirements(discoveryState=" + this.a + ", smartHomeState=" + this.b + ")";
    }
}
