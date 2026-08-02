package defpackage;

/* loaded from: classes2.dex */
public final class zkd {
    public final String a;
    public final yay b;

    public zkd(String str, yay yayVar) {
        this.a = str;
        this.b = yayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkd)) {
            return false;
        }
        zkd zkdVar = (zkd) obj;
        return this.a.equals(zkdVar.a) && this.b.equals(zkdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LegalInfo(__typename=" + this.a + ", legalInfo=" + this.b + ')';
    }
}
