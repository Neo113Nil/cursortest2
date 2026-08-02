package defpackage;

import com.yandex.messaging.auth.AuthEnvironment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class wl3 {
    public final AuthEnvironment a;
    public final long b;

    public wl3(AuthEnvironment authEnvironment, long j) {
        this.a = authEnvironment;
        this.b = j;
    }

    public final AuthEnvironment a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl3)) {
            return false;
        }
        wl3 wl3Var = (wl3) obj;
        return this.a == wl3Var.a && this.b == wl3Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthUid(environment=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
