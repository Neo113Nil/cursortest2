package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vwr {
    public final String a;
    public final long b;

    public vwr(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwr)) {
            return false;
        }
        vwr vwrVar = (vwr) obj;
        return jl40.l(this.a, vwrVar.a) && this.b == vwrVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("FolderKey(folderId=", this.a, ", organizationId=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
