package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class xm21 {
    public static final xm21 f = new xm21(null, null, null, null, null);
    public final wm21 a;
    public final vm21 b;
    public final Float c;
    public final Integer d;
    public final Float e;

    public xm21(wm21 wm21Var, vm21 vm21Var, Float f2, Integer num, Float f3) {
        this.a = wm21Var;
        this.b = vm21Var;
        this.c = f2;
        this.d = num;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm21)) {
            return false;
        }
        xm21 xm21Var = (xm21) obj;
        return jl40.l(this.a, xm21Var.a) && jl40.l(this.b, xm21Var.b) && jl40.l(this.c, xm21Var.c) && jl40.l(this.d, xm21Var.d) && jl40.l(this.e, xm21Var.e);
    }

    public final int hashCode() {
        wm21 wm21Var = this.a;
        int hashCode = (wm21Var == null ? 0 : wm21Var.hashCode()) * 31;
        vm21 vm21Var = this.b;
        int hashCode2 = (hashCode + (vm21Var == null ? 0 : vm21Var.hashCode())) * 31;
        Float f2 = this.c;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Float f3 = this.e;
        return hashCode4 + (f3 != null ? f3.hashCode() : 0);
    }

    public final String toString() {
        return "MotionMagSnapshot(motion=" + this.a + ", magnetometer=" + this.b + ", pressureHpa=" + this.c + ", pressureAccuracySensorStatus=" + this.d + ", stepCounterTotal=" + this.e + Extension.C_BRAKE;
    }
}
