package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zj0 extends ltp {
    public final ArrayList c;
    public final ArrayList d;
    public final float e;
    public final float f;

    public zj0(ArrayList arrayList, ArrayList arrayList2) {
        this.c = arrayList;
        this.d = arrayList2;
        float f = 360;
        float f2 = ((0.0f % f) + f) % f;
        this.e = f2;
        this.f = (float) Math.toRadians(f2);
    }

    @Override // defpackage.ltp
    public final Shader b(long j) {
        double d = 2;
        float sqrt = (float) Math.sqrt(((float) Math.pow(nmq.d(j), d)) + ((float) Math.pow(nmq.b(j), d)));
        float acos = (float) Math.acos(nmq.d(j) / sqrt);
        float f = this.e;
        float f2 = this.f;
        float abs = Math.abs(((float) Math.cos(((f <= 90.0f || f >= 180.0f) && (f <= 270.0f || f >= 360.0f)) ? f2 - acos : (3.1415927f - f2) - acos)) * sqrt) / 2;
        double d2 = f2;
        float cos = ((float) Math.cos(d2)) * abs;
        float sin = abs * ((float) Math.sin(d2));
        return w1g.b(enj.h(a4g.y(j), swf.i(-cos, sin)), enj.h(a4g.y(j), swf.i(cos, -sin)), this.c, this.d, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj0)) {
            return false;
        }
        zj0 zj0Var = (zj0) obj;
        return this.c.equals(zj0Var.c) && this.d.equals(zj0Var.d) && this.e == zj0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + eta.a(dfi.b(this.d, this.c.hashCode() * 31, 31), this.e, 31);
    }

    public final String toString() {
        return "AngledLinearGradient(colors=" + this.c + ", stops=" + this.d + ", angle=" + this.e + ", tileMode=" + ivf.N(0) + ")";
    }
}
