package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class scg0 implements tcg0 {
    public final y6g0 a;

    public scg0(y6g0 y6g0Var) {
        this.a = y6g0Var;
    }

    public final y6g0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof scg0) && jl40.l(this.a, ((scg0) obj).a);
    }

    public final int hashCode() {
        y6g0 y6g0Var = this.a;
        if (y6g0Var == null) {
            return 0;
        }
        return y6g0Var.hashCode();
    }

    public final String toString() {
        return "QrNotHandledEffect(errorMessage=" + this.a + Extension.C_BRAKE;
    }
}
