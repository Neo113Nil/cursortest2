package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vka0 implements yka0 {
    public final g4a0 a;

    public vka0(g4a0 g4a0Var) {
        this.a = g4a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vka0) && jl40.l(this.a, ((vka0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Initialized(paymentMethod=" + this.a + Extension.C_BRAKE;
    }
}
