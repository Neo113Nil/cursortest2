package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s05 implements t05 {
    public final lur0 a;

    public s05(lur0 lur0Var) {
        this.a = lur0Var;
    }

    public final lur0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s05) && jl40.l(this.a, ((s05) obj).a);
    }

    public final int hashCode() {
        lur0 lur0Var = this.a;
        if (lur0Var == null) {
            return 0;
        }
        return lur0Var.hashCode();
    }

    public final String toString() {
        return "Loading(shimmerTimerStatus=" + this.a + Extension.C_BRAKE;
    }
}
