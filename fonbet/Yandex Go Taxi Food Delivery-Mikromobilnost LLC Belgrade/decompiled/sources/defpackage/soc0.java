package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class soc0 {
    public static final soc0 d = new soc0(b.f(), false, null);
    public final Map a;
    public final boolean b;
    public final c c;

    public soc0(Map map, boolean z, c cVar) {
        this.a = map;
        this.b = z;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soc0)) {
            return false;
        }
        soc0 soc0Var = (soc0) obj;
        return this.a.equals(soc0Var.a) && this.b == soc0Var.b && jl40.l(this.c, soc0Var.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        c cVar = this.c;
        return e + (cVar == null ? 0 : cVar.a.hashCode());
    }

    public final String toString() {
        return "PlaquePayload(metricContext=" + this.a + ", enabledMarkSeenPlaque=" + this.b + ", seenContext=" + this.c + Extension.C_BRAKE;
    }
}
