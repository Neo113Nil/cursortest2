package defpackage;

/* loaded from: classes3.dex */
public final class y0h {
    public final String a;
    public final String b;

    public y0h(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0h)) {
            return false;
        }
        y0h y0hVar = (y0h) obj;
        return this.a.equals(y0hVar.a) && this.b.equals(y0hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("LumenImage(lightUrl=", this.a, ", darkUrl=", this.b, ")");
    }
}
