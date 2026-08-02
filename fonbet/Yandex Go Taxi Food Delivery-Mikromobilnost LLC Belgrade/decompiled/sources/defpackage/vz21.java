package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vz21 implements xz21 {
    public final ty21 a;

    public vz21(ty21 ty21Var) {
        this.a = ty21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vz21) && jl40.l(this.a, ((vz21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InputValid(info=" + this.a + Extension.C_BRAKE;
    }
}
