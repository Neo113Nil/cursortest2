package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.AccessDeniedEsiaVerificationEbsException;

/* loaded from: classes4.dex */
public final class rf implements ys11 {
    public final AccessDeniedEsiaVerificationEbsException a;

    public rf(AccessDeniedEsiaVerificationEbsException accessDeniedEsiaVerificationEbsException) {
        this.a = accessDeniedEsiaVerificationEbsException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rf) && jl40.l(this.a, ((rf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReturnEvent(error=" + this.a + Extension.C_BRAKE;
    }
}
