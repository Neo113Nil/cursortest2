package defpackage;

/* loaded from: classes3.dex */
public final class mmj {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public mmj(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmj)) {
            return false;
        }
        mmj mmjVar = (mmj) obj;
        return this.a == mmjVar.a && this.b == mmjVar.b && this.c == mmjVar.c && this.d == mmjVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return v3w.g(eta.j("OfflineSwitcherState(myVibeButton=", this.a, ", downloadsButton=", this.b, ", offlineMode="), this.c, ", autoCacheDisabled=", this.d, ")");
    }
}
