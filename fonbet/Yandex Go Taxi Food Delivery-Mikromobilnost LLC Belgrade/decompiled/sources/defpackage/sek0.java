package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sek0 implements vek0 {
    public final String a;
    public final nsz b;
    public final long c;
    public final int d;

    public sek0(String str, nsz nszVar, long j, int i) {
        this.a = str;
        this.b = nszVar;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sek0)) {
            return false;
        }
        sek0 sek0Var = (sek0) obj;
        return jl40.l(this.a, sek0Var.a) && this.b.equals(sek0Var.b) && this.c == sek0Var.c && this.d == sek0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qv10.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Animation(id=");
        sb.append(this.a);
        sb.append(", lottieComposition=");
        sb.append(this.b);
        sb.append(", delay=");
        vfc.y(sb, this.c, ", repeatCount=", this.d);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
