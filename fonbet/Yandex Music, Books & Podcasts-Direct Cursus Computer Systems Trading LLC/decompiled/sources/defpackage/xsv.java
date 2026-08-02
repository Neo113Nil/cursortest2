package defpackage;

/* loaded from: classes4.dex */
public final class xsv implements zsv {
    public final ktv a;
    public final wsv b;

    public xsv(ktv ktvVar, wsv wsvVar) {
        this.a = ktvVar;
        this.b = wsvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsv)) {
            return false;
        }
        xsv xsvVar = (xsv) obj;
        return this.a.equals(xsvVar.a) && this.b.equals(xsvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(artist=" + this.a + ", mode=" + this.b + ")";
    }
}
