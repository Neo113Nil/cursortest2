package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class s8t {
    public final long a;
    public final Set b;

    public s8t(Set set, long j) {
        this.a = j;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8t)) {
            return false;
        }
        s8t s8tVar = (s8t) obj;
        return this.a == s8tVar.a && jl40.l(this.b, s8tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Result(organizationId=" + this.a + ", folderIds=" + this.b + Extension.C_BRAKE;
    }
}
