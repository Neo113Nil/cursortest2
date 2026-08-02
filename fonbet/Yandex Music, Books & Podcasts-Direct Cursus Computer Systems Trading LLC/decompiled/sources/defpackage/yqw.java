package defpackage;

/* loaded from: classes3.dex */
public final class yqw {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public yqw(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqw)) {
            return false;
        }
        yqw yqwVar = (yqw) obj;
        return this.a == yqwVar.a && this.b == yqwVar.b && this.c == yqwVar.c && this.d == yqwVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e(k5r.e(k5r.e(k5r.e(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, false), 31, this.c);
    }

    public final String toString() {
        return v3w.g(eta.j("Requirements(featureEnabled=false, userAuthorized=", this.a, ", userSubscribed=", this.b, ", tokenValid=false, network="), this.c, ", mediaSessionEnabled=", this.d, ")");
    }
}
