package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qp30 implements up30 {
    public final y830 a;

    public qp30(y830 y830Var) {
        this.a = y830Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qp30) && jl40.l(this.a, ((qp30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LoadInitData(config=" + this.a + Extension.C_BRAKE;
    }
}
