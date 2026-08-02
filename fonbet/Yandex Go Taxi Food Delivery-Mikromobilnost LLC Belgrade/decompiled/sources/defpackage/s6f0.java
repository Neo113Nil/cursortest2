package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class s6f0 {
    public final boolean a;
    public final boolean b;

    public s6f0(int i) {
        this.a = true;
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6f0)) {
            return false;
        }
        s6f0 s6f0Var = (s6f0) obj;
        return this.a == s6f0Var.a && this.b == s6f0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("Config(pushOutputLocationsToBus=", ", ensureOutputLocationMonotonicity=", Extension.C_BRAKE, this.a, this.b);
    }

    public s6f0() {
        this(0);
    }
}
