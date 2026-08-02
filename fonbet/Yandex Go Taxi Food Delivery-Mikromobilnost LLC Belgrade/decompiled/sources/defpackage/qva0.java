package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qva0 extends cj3 {
    public final long c;

    public qva0(long j) {
        super(5, "Время получения нового токена", "passport_token_request_performance", g8e.z("duration_ms", String.valueOf(j)), false);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qva0) && this.c == ((qva0) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return qv10.k(this.c, "PassportTokenRequest(durationMs=", Extension.C_BRAKE);
    }
}
