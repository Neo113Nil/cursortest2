package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class tuy0 {
    public final long a;
    public final long b;

    public tuy0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final List a() {
        return scc.g(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tuy0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return zkb1.b(a(), ((tuy0) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "TexturePlayerIds(playerId=", ", textureId="));
    }
}
