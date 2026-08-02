package defpackage;

import android.view.animation.Interpolator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class v0z0 {
    public final String a;
    public final long b;
    public final long c;
    public final Interpolator d;

    public v0z0(String str, long j, long j2, Interpolator interpolator) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = interpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0z0)) {
            return false;
        }
        v0z0 v0z0Var = (v0z0) obj;
        return jl40.l(this.a, v0z0Var.a) && this.b == v0z0Var.b && this.c == v0z0Var.c && jl40.l(this.d, v0z0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int c = qv10.c(qv10.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        Interpolator interpolator = this.d;
        return c + (interpolator != null ? interpolator.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = x4e.l("AnimationHolder(text=", this.a, ", animationDelayInMillis=", this.b);
        x4e.A(this.c, ", animationDurationInMillis=", ", animationInterpolator=", l);
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
