package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class q621 extends mr {
    public final c301 a;

    public q621(c301 c301Var) {
        this.a = c301Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q621) && jl40.l(this.a, ((q621) obj).a);
    }

    public final int hashCode() {
        c301 c301Var = this.a;
        if (c301Var == null) {
            return 0;
        }
        return c301Var.hashCode();
    }

    public final String toString() {
        return "UpdateAnalyticsData(trackingAnalyticsData=" + this.a + Extension.C_BRAKE;
    }
}
