package defpackage;

import com.yandex.mapkit.geometry.Subpolyline;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class r440 implements fj40 {
    public final List a;
    public final boolean b;
    public final MtTransportType c;
    public final kdc d;
    public final String e;
    public final long f;
    public final String g;
    public final List h;
    public final Subpolyline i;
    public final double j;
    public final int k;
    public final String l;

    public r440(List list, boolean z, MtTransportType mtTransportType, kdc kdcVar, String str, long j, String str2, List list2, Subpolyline subpolyline, double d, int i, String str3) {
        this.a = list;
        this.b = z;
        this.c = mtTransportType;
        this.d = kdcVar;
        this.e = str;
        this.f = j;
        this.g = str2;
        this.h = list2;
        this.i = subpolyline;
        this.j = d;
        this.k = i;
        this.l = str3;
    }

    @Override // defpackage.fj40
    public final kdc a() {
        return this.d;
    }

    @Override // defpackage.hz30
    public final int b() {
        return this.k;
    }

    @Override // defpackage.hz30
    public final Subpolyline c() {
        return this.i;
    }

    @Override // defpackage.fj40
    public final String d() {
        return this.g;
    }

    @Override // defpackage.fj40
    public final List e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r440)) {
            return false;
        }
        r440 r440Var = (r440) obj;
        return jl40.l(this.a, r440Var.a) && this.b == r440Var.b && this.c == r440Var.c && jl40.l(this.d, r440Var.d) && jl40.l(this.e, r440Var.e) && this.f == r440Var.f && jl40.l(this.g, r440Var.g) && jl40.l(this.h, r440Var.h) && jl40.l(this.i, r440Var.i) && Double.compare(this.j, r440Var.j) == 0 && this.k == r440Var.k && jl40.l(this.l, r440Var.l);
    }

    public final b3v0 f() {
        b3v0 b3v0Var = (b3v0) a.R(this.a);
        if (b3v0Var != null) {
            return b3v0Var;
        }
        b3v0 b3v0Var2 = b3v0.j;
        return b3v0.j;
    }

    @Override // defpackage.hz30
    public final double getDuration() {
        return this.j;
    }

    @Override // defpackage.fj40
    public final MtTransportType getType() {
        return this.c;
    }

    public final int hashCode() {
        int b = oyr.b(this.k, unr0.a((this.i.hashCode() + unr0.c(unr0.b(qv10.c(unr0.b(smw0.d(this.d, (this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31);
        String str = this.l;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtSuburbanSection(threads=");
        sb.append(this.a);
        sb.append(", isAeroExpress=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", color=");
        sb.append(this.d);
        sb.append(", departureTime=");
        ly3.y(this.f, this.e, ", departureTimeInMillis=", sb);
        sb.append(", arrivalTime=");
        sb.append(this.g);
        sb.append(", stops=");
        sb.append(this.h);
        sb.append(", subpolyline=");
        sb.append(this.i);
        sb.append(", duration=");
        sb.append(this.j);
        sb.append(", sectionId=");
        sb.append(this.k);
        return unr0.r(sb, ", lineId=", this.l, Extension.C_BRAKE);
    }
}
