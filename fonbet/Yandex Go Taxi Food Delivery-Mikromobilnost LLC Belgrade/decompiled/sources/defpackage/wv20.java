package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wv20 {
    public final String a;
    public final String b;

    public wv20(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv20)) {
            return false;
        }
        wv20 wv20Var = (wv20) obj;
        return this.a.equals(wv20Var.a) && this.b.equals(wv20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("MobilityHubRouteDetailsDeeplink(transportType=", this.a, ", routeUri=", this.b, Extension.C_BRAKE);
    }
}
