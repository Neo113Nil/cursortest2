package defpackage;

/* loaded from: classes4.dex */
public final class diu {
    public final String a;
    public final int b;

    public diu(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diu)) {
            return false;
        }
        diu diuVar = (diu) obj;
        return this.a.equals(diuVar.a) && this.b == diuVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewabilityReportingConfig(url=" + this.a + ", timeMs=" + this.b + ")";
    }
}
