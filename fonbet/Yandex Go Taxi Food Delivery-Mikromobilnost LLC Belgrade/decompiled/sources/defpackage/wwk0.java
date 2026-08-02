package defpackage;

import flex.animation.player.interpolator.InterpolationType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class wwk0 extends tg2 {
    public final String a;
    public final long b;
    public final long c;
    public final InterpolationType d;
    public final axk0 e;

    public wwk0(String str, long j, long j2, InterpolationType interpolationType, axk0 axk0Var) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = interpolationType;
        this.e = axk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwk0)) {
            return false;
        }
        wwk0 wwk0Var = (wwk0) obj;
        return jl40.l(this.a, wwk0Var.a) && this.b == wwk0Var.b && this.c == wwk0Var.c && this.d == wwk0Var.d && jl40.l(this.e, wwk0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("RotationAnimation(type=", this.a, ", duration=", this.b);
        x4e.A(this.c, ", delay=", ", interpolator=", l);
        l.append(this.d);
        l.append(", rotation=");
        l.append(this.e);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
