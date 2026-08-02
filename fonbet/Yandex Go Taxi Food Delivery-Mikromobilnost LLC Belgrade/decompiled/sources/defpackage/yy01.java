package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class yy01 {
    public static final xy01 Companion = new xy01();
    public final rsd0 a;
    public final rsd0 b;

    public /* synthetic */ yy01(int i, rsd0 rsd0Var, rsd0 rsd0Var2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, wy01.a.getDescriptor());
            throw null;
        }
        this.a = rsd0Var;
        this.b = rsd0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yy01.class != obj.getClass()) {
            return false;
        }
        yy01 yy01Var = (yy01) obj;
        return jl40.l(this.a, yy01Var.a) && jl40.l(this.b, yy01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TranslationAnimationSettings(start=" + this.a + ", end=" + this.b + Extension.C_BRAKE;
    }
}
