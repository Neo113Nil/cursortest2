package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class s811 {
    public final Uri a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final Double e;

    public s811(Uri uri, Double d, Double d2, Double d3, Double d4) {
        this.a = uri;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
    }

    public final Double a() {
        return this.b;
    }

    public final Double b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s811)) {
            return false;
        }
        s811 s811Var = (s811) obj;
        return jl40.l(this.a, s811Var.a) && jl40.l(this.b, s811Var.b) && jl40.l(this.c, s811Var.c) && jl40.l(this.d, s811Var.d) && jl40.l(this.e, s811Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.d;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.e;
        return hashCode4 + (d4 != null ? d4.hashCode() : 0);
    }

    public final String toString() {
        return "TransportRoutesDeeplink(deeplinkUri=" + this.a + ", startLat=" + this.b + ", startLon=" + this.c + ", endLat=" + this.d + ", endLon=" + this.e + Extension.C_BRAKE;
    }
}
