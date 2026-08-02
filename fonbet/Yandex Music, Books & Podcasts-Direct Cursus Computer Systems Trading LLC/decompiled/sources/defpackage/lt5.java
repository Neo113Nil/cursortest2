package defpackage;

/* loaded from: classes3.dex */
public final class lt5 {
    public final String a;
    public final String b;

    public lt5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt5)) {
            return false;
        }
        lt5 lt5Var = (lt5) obj;
        return this.a.equals(lt5Var.a) && this.b.equals(lt5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("ConcertCatalogParams(type=", this.a, ", id=", this.b, ")");
    }
}
