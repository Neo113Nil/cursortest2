package defpackage;

import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class xqo {
    public final boolean a;
    public final c b;

    public xqo(boolean z, c cVar) {
        this.a = z;
        this.b = cVar;
    }

    public final c a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqo)) {
            return false;
        }
        xqo xqoVar = (xqo) obj;
        return this.a == xqoVar.a && jl40.l(this.b, xqoVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        c cVar = this.b;
        return hashCode + (cVar == null ? 0 : cVar.a.hashCode());
    }

    public final String toString() {
        return "CachedFeatureToggle(enabled=" + this.a + ", data=" + this.b + Extension.C_BRAKE;
    }
}
