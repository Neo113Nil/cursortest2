package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class ykm0 {
    public static final xkm0 Companion = new xkm0();
    public final rsd0 a;
    public final rsd0 b;

    public /* synthetic */ ykm0(int i, rsd0 rsd0Var, rsd0 rsd0Var2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, wkm0.a.getDescriptor());
            throw null;
        }
        this.a = rsd0Var;
        this.b = rsd0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ykm0.class != obj.getClass()) {
            return false;
        }
        ykm0 ykm0Var = (ykm0) obj;
        return jl40.l(this.a, ykm0Var.a) && jl40.l(this.b, ykm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScaleAnimationSettings(start=" + this.a + ", end=" + this.b + Extension.C_BRAKE;
    }
}
