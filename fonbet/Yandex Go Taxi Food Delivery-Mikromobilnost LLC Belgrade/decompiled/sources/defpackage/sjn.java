package defpackage;

import java.net.URI;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;

/* loaded from: classes4.dex */
public final class sjn {
    public final URI a;
    public final Token b;

    public sjn(URI uri, Token token) {
        this.a = uri;
        this.b = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjn)) {
            return false;
        }
        sjn sjnVar = (sjn) obj;
        return this.a.equals(sjnVar.a) && this.b.equals(sjnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EbsSessionData(ebsLocation=" + this.a + ", sessionId=" + this.b + Extension.C_BRAKE;
    }
}
