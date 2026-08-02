package defpackage;

import java.util.AbstractList;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class x2f0 implements z2f0 {
    public final Map a;
    public final List b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Integer h;

    public x2f0(Map map, AbstractList abstractList, String str, long j, long j2, long j3, long j4, Integer num) {
        this.a = map;
        this.b = abstractList;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2f0)) {
            return false;
        }
        x2f0 x2f0Var = (x2f0) obj;
        return this.a.equals(x2f0Var.a) && jl40.l(this.b, x2f0Var.b) && jl40.l(this.c, x2f0Var.c) && this.d == x2f0Var.d && this.e == x2f0Var.e && this.f == x2f0Var.f && this.g == x2f0Var.g && jl40.l(this.h, x2f0Var.h);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int c2 = qv10.c(qv10.c(qv10.c(qv10.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        Integer num = this.h;
        return c2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Animated(items=");
        sb.append(this.a);
        sb.append(", keyframes=");
        sb.append(this.b);
        sb.append(", accessibilityText=");
        ly3.y(this.d, this.c, ", hideDelay=", sb);
        x4e.A(this.e, ", hideDuration=", ", showDelay=", sb);
        sb.append(this.f);
        x4e.A(this.g, ", showDuration=", ", repeatCount=", sb);
        return oo31.j(sb, this.h, Extension.C_BRAKE);
    }
}
