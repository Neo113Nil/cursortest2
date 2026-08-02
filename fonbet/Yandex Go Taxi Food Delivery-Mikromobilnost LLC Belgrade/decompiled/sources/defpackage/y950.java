package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y950 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public y950(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y950)) {
            return false;
        }
        y950 y950Var = (y950) obj;
        return this.a == y950Var.a && this.b == y950Var.b && this.c == y950Var.c && this.d == y950Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", maneuversVisibility=", Extension.C_BRAKE, qv10.u("NavigationStyleConfig(trafficLightsVisibility=", ", roadEventsOnRouteVisibility=", ", balloonsVisibility=", this.a, this.b), this.c, this.d);
    }

    public y950() {
        this(true, true, true, true);
    }
}
