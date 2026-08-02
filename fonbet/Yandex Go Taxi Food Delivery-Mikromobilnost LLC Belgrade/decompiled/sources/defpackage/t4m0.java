package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class t4m0 {
    public final s4m0 a;
    public final q7m0 b;

    public t4m0(s4m0 s4m0Var, q7m0 q7m0Var) {
        this.a = s4m0Var;
        this.b = q7m0Var;
    }

    public static t4m0 a(t4m0 t4m0Var, s4m0 s4m0Var) {
        q7m0 q7m0Var = t4m0Var.b;
        t4m0Var.getClass();
        return new t4m0(s4m0Var, q7m0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4m0)) {
            return false;
        }
        t4m0 t4m0Var = (t4m0) obj;
        return jl40.l(this.a, t4m0Var.a) && jl40.l(this.b, t4m0Var.b);
    }

    public final int hashCode() {
        s4m0 s4m0Var = this.a;
        int hashCode = (s4m0Var == null ? 0 : s4m0Var.hashCode()) * 31;
        q7m0 q7m0Var = this.b;
        return hashCode + (q7m0Var != null ? q7m0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SavingsAccountCreationState(error=" + this.a + ", progress=" + this.b + Extension.C_BRAKE;
    }

    public t4m0() {
        this(null, null);
    }
}
