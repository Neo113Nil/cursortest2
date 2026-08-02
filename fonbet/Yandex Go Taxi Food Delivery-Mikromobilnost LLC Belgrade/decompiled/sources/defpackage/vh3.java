package defpackage;

import com.yandex.messaging.auth.AuthEnvironment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vh3 {
    public final AuthEnvironment a;
    public final AuthEnvironment b;

    public vh3(AuthEnvironment authEnvironment, AuthEnvironment authEnvironment2) {
        this.a = authEnvironment;
        this.b = authEnvironment2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh3)) {
            return false;
        }
        vh3 vh3Var = (vh3) obj;
        return this.a == vh3Var.a && this.b == vh3Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        AuthEnvironment authEnvironment = this.b;
        return hashCode + (authEnvironment == null ? 0 : authEnvironment.hashCode());
    }

    public final String toString() {
        return "AuthAccountFilter(primaryEnvironment=" + this.a + ", secondaryTeamEnvironment=" + this.b + Extension.C_BRAKE;
    }
}
