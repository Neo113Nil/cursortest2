package defpackage;

/* loaded from: classes5.dex */
public final class ygn extends zgn {
    public final String a;
    public final String b;
    public final String c;

    public ygn(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.zgn
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygn)) {
            return false;
        }
        ygn ygnVar = (ygn) obj;
        return this.a.equals(ygnVar.a) && this.b.equals(ygnVar.b) && this.c.equals(ygnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return su4.o(f1d.m("Unspecified(name=", this.a, ", value=", this.b, ", serializedSeed="), this.c, ")");
    }
}
