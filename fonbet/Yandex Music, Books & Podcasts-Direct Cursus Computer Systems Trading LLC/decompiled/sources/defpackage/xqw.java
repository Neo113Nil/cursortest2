package defpackage;

/* loaded from: classes6.dex */
public final class xqw {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public xqw(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
    }

    public final boolean a() {
        return this.a && this.d && this.b && this.e && this.f && this.g && this.h && this.c && this.i && !this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqw)) {
            return false;
        }
        xqw xqwVar = (xqw) obj;
        return this.a == xqwVar.a && this.b == xqwVar.b && this.c == xqwVar.c && this.d == xqwVar.d && this.e == xqwVar.e && this.f == xqwVar.f && this.g == xqwVar.g && this.h == xqwVar.h && this.i == xqwVar.i && this.j == xqwVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder j = eta.j("Requirements(featureEnabled=", this.a, ", userAuthorized=", this.b, ", userSubscribed=");
        dfi.t(j, this.c, ", tokenValid=", this.d, ", network=");
        dfi.t(j, this.e, ", mediaSessionEnabled=", this.f, ", backgroundRestrictionsSatisfied=");
        dfi.t(j, this.g, ", deviceIdResolved=", this.h, ", deviceRegistrationRestrictionsSatisfied=");
        return v3w.g(j, this.i, ", isDeeplinkPreload=", this.j, ")");
    }
}
