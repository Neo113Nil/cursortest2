package defpackage;

/* loaded from: classes3.dex */
public final class ly5 {
    public final String a;
    public final String b;

    public ly5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly5)) {
            return false;
        }
        ly5 ly5Var = (ly5) obj;
        return this.a.equals(ly5Var.a) && this.b.equals(ly5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("ConcertPlaceMap(mapImage=", this.a, ", mapUrl=", this.b, ")");
    }
}
