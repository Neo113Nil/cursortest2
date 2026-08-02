package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class us70 implements xs70 {
    public final String a;
    public final long b;

    public us70(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.xs70
    public final String a() {
        return this.a;
    }

    @Override // defpackage.xs70
    public final boolean b() {
        return false;
    }

    @Override // defpackage.xs70
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us70)) {
            return false;
        }
        us70 us70Var = (us70) obj;
        return jl40.l(this.a, us70Var.a) && this.b == us70Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("Logistics(orderId=", this.a, ", loadingTimeoutMs=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
