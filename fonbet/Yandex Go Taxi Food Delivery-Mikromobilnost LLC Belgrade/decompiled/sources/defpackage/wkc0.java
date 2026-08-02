package defpackage;

/* loaded from: classes2.dex */
public final class wkc0 {
    public final int a;
    public final ukc0 b;

    public wkc0(int i, ukc0 ukc0Var) {
        this.a = i;
        this.b = ukc0Var;
    }

    public final int a() {
        return this.a;
    }

    public final ukc0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkc0)) {
            return false;
        }
        wkc0 wkc0Var = (wkc0) obj;
        return this.a == wkc0Var.a && this.b.equals(wkc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlaqueCounterNotification(count=" + this.a + ", displayRules=" + this.b + ')';
    }
}
