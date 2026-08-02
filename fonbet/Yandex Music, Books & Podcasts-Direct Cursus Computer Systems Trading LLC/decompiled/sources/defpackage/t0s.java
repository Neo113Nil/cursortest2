package defpackage;

/* loaded from: classes3.dex */
public final class t0s {
    public final o0s a;
    public final int b;

    public t0s(o0s o0sVar, int i) {
        this.a = o0sVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0s)) {
            return false;
        }
        t0s t0sVar = (t0s) obj;
        return this.a == t0sVar.a && this.b == t0sVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TabDataForAnalytics(tabType=" + this.a + ", tabPosition=" + this.b + ")";
    }
}
