package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vnk0 {
    public final int a;
    public final kdc b;
    public final boolean c;
    public final Long d;
    public final Long e;
    public final jtq0 f;
    public final boolean g;

    public vnk0(int i, kdc kdcVar, boolean z, Long l, Long l2, jtq0 jtq0Var, boolean z2) {
        this.a = i;
        this.b = kdcVar;
        this.c = z;
        this.d = l;
        this.e = l2;
        this.f = jtq0Var;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnk0)) {
            return false;
        }
        vnk0 vnk0Var = (vnk0) obj;
        return this.a == vnk0Var.a && jl40.l(this.b, vnk0Var.b) && this.c == vnk0Var.c && jl40.l(this.d, vnk0Var.d) && jl40.l(this.e, vnk0Var.e) && jl40.l(this.f, vnk0Var.f) && this.g == vnk0Var.g;
    }

    public final int hashCode() {
        int e = unr0.e(smw0.d(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        Long l = this.d;
        int hashCode = (e + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((hashCode + (l2 != null ? l2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBar(timeInterval=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", shouldIncrease=");
        sb.append(this.c);
        sb.append(", finishTime=");
        sb.append(this.d);
        sb.append(", startTime=");
        sb.append(this.e);
        sb.append(", serverClock=");
        sb.append(this.f);
        sb.append(", isLoading=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }
}
