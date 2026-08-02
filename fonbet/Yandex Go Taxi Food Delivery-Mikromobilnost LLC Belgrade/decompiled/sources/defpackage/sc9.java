package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sc9 {
    public final rr51 a;

    public sc9(rr51 rr51Var) {
        this.a = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sc9) && jl40.l(this.a, ((sc9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChangePaymentMethodEntity(divData=" + this.a + Extension.C_BRAKE;
    }
}
