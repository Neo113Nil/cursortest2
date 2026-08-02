package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class x400 {
    public final long a;
    public final Set b;

    public x400(Set set, long j) {
        this.a = j;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x400)) {
            return false;
        }
        x400 x400Var = (x400) obj;
        return this.a == x400Var.a && this.b.equals(x400Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MainFolderEntity(organizationId=" + this.a + ", excludedFolderIds=" + this.b + Extension.C_BRAKE;
    }
}
