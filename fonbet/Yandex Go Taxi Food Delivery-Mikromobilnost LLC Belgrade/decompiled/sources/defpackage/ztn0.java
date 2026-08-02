package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ztn0 {
    public final n3o0 a;

    public /* synthetic */ ztn0(n3o0 n3o0Var) {
        this.a = n3o0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ztn0) {
            return jl40.l(this.a, ((ztn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        n3o0 n3o0Var = this.a;
        if (n3o0Var == null) {
            return 0;
        }
        return n3o0Var.hashCode();
    }

    public final String toString() {
        return "ScootersInsuranceSuggestPayload(scootersOfferInsurance=" + this.a + Extension.C_BRAKE;
    }
}
