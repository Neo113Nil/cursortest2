package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class t940 implements w940 {
    public final c7s0 a;

    public t940(c7s0 c7s0Var) {
        this.a = c7s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t940) && jl40.l(this.a, ((t940) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LoadInitData(showModalInfoAction=" + this.a + Extension.C_BRAKE;
    }
}
