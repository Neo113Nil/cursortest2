package defpackage;

import flex.animation.player.interpolator.InterpolationType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class uy01 extends tg2 {
    public final String a;
    public final long b;
    public final long c;
    public final InterpolationType d;
    public final yy01 e;

    public uy01(String str, long j, long j2, InterpolationType interpolationType, yy01 yy01Var) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = interpolationType;
        this.e = yy01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy01)) {
            return false;
        }
        uy01 uy01Var = (uy01) obj;
        return jl40.l(this.a, uy01Var.a) && this.b == uy01Var.b && this.c == uy01Var.c && this.d == uy01Var.d && jl40.l(this.e, uy01Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("TranslationAnimation(type=", this.a, ", duration=", this.b);
        x4e.A(this.c, ", delay=", ", interpolator=", l);
        l.append(this.d);
        l.append(", translation=");
        l.append(this.e);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
