package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zw3 {
    public final mr3 a;

    public zw3(mr3 mr3Var) {
        this.a = mr3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zw3) && jl40.l(this.a, ((zw3) obj).a);
    }

    public final int hashCode() {
        mr3 mr3Var = this.a;
        if (mr3Var == null) {
            return 0;
        }
        return mr3Var.hashCode();
    }

    public final String toString() {
        return "AutoTopupPrefillEntity(autofund=" + this.a + Extension.C_BRAKE;
    }
}
