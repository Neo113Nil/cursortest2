package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class u0n0 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof u0n0) {
            return this.a == ((u0n0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("ScootersBduiScreenPayload(closeOnDocumentFailure=", Extension.C_BRAKE, this.a);
    }
}
