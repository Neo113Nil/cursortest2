package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zdw0 implements kew0 {
    public final tdw0 a;
    public final boolean b;

    public zdw0(boolean z, tdw0 tdw0Var) {
        this.a = tdw0Var;
        this.b = z;
    }

    @Override // defpackage.kew0
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdw0)) {
            return false;
        }
        zdw0 zdw0Var = (zdw0) obj;
        return jl40.l(this.a, zdw0Var.a) && this.b == zdw0Var.b;
    }

    @Override // defpackage.kew0
    public final tdw0 getMode() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Hidden(mode=" + this.a + ", isHapticEnabled=" + this.b + Extension.C_BRAKE;
    }
}
