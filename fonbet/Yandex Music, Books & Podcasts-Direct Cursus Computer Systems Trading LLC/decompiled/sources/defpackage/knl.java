package defpackage;

/* loaded from: classes4.dex */
public final class knl {
    public final dnl a;
    public final ajl b;

    public knl(dnl dnlVar, ajl ajlVar) {
        this.a = dnlVar;
        this.b = ajlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knl)) {
            return false;
        }
        knl knlVar = (knl) obj;
        return this.a.equals(knlVar.a) && this.b.equals(knlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerScreenSkeletonStateWithAnalytics(skeletonState=" + this.a + ", analyticsState=" + this.b + ")";
    }
}
