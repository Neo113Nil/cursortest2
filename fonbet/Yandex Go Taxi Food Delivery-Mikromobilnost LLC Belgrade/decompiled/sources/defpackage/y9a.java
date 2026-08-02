package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y9a implements jaa {
    public final uj9 a;

    public y9a(uj9 uj9Var) {
        this.a = uj9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9a) && jl40.l(this.a, ((y9a) obj).a);
    }

    public final int hashCode() {
        uj9 uj9Var = this.a;
        if (uj9Var == null) {
            return 0;
        }
        return uj9Var.hashCode();
    }

    public final String toString() {
        return "OnButtonAction(action=" + this.a + Extension.C_BRAKE;
    }
}
