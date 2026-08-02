package defpackage;

import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class q370 {
    public final Object a;

    public q370(b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return q370.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((q370) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.p("OpaqueData(data=", Extension.C_BRAKE, this.a);
    }
}
