package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class q3o0 implements p3o0 {
    public final boolean a;

    public q3o0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3o0) && this.a == ((q3o0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("ScootersOfferLoadingResult(isInsuranceAvailable=", Extension.C_BRAKE, this.a);
    }
}
