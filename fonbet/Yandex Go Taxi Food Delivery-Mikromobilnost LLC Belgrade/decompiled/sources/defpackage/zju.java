package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class zju {
    public final Map a;

    public zju() {
        this(b.f());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zju) && jl40.l(this.a, ((zju) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("HireDriverDeeplink(queryParams=", Extension.C_BRAKE, this.a);
    }

    public zju(Map map) {
        this.a = map;
    }
}
