package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vs70 implements xs70 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;

    public vs70(long j, String str, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.xs70
    public final String a() {
        return this.a;
    }

    @Override // defpackage.xs70
    public final boolean b() {
        return true;
    }

    @Override // defpackage.xs70
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs70)) {
            return false;
        }
        vs70 vs70Var = (vs70) obj;
        return jl40.l(this.a, vs70Var.a) && this.b == vs70Var.b && jl40.l(this.c, vs70Var.c) && jl40.l(this.d, vs70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder l = x4e.l("Scooters(orderId=", this.a, ", loadingTimeoutMs=", this.b);
        g8e.D(l, ", scooterNumber=", this.c, ", offerId=", this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
