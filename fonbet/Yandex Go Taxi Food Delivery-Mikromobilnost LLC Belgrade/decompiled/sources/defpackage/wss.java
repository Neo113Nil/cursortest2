package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class wss {
    public final Map a = b.f();
    public final String b = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wss)) {
            return false;
        }
        wss wssVar = (wss) obj;
        return jl40.l(this.a, wssVar.a) && jl40.l(this.b, wssVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GameCenterRequestData(headers=" + this.a + ", cookies=" + this.b + Extension.C_BRAKE;
    }
}
