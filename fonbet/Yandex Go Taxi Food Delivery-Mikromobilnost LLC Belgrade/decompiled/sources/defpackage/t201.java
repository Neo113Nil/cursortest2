package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class t201 {
    public final zzs a;
    public final boolean b;
    public final double c;
    public final long d;

    public t201(zzs zzsVar, boolean z, double d, long j) {
        this.a = zzsVar;
        this.b = z;
        this.c = d;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t201)) {
            return false;
        }
        t201 t201Var = (t201) obj;
        return jl40.l(this.a, t201Var.a) && this.b == t201Var.b && Double.compare(this.c, t201Var.c) == 0 && this.d == t201Var.d;
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        return Long.hashCode(this.d) + unr0.a(unr0.e((zzsVar == null ? 0 : zzsVar.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackerResult(geoPoint=");
        sb.append(this.a);
        sb.append(", isAbortFutureUpdates=");
        sb.append(this.b);
        sb.append(", direction=");
        sb.append(this.c);
        return g8e.l(this.d, ", date=", Extension.C_BRAKE, sb);
    }

    public /* synthetic */ t201(boolean z) {
        this(null, z, 0.0d, 0L);
    }
}
