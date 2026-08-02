package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class q7t {
    public final long a;
    public final String b;
    public final String c;
    public final int d;

    public q7t(String str, String str2, int i, long j) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7t)) {
            return false;
        }
        q7t q7tVar = (q7t) obj;
        return this.a == q7tVar.a && jl40.l(this.b, q7tVar.b) && jl40.l(this.c, q7tVar.c) && this.d == q7tVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + unr0.b(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder k = x4e.k("CustomFolderInfo(organizationId=", this.a, ", folderId=", this.b);
        k.append(", name=");
        k.append(this.c);
        k.append(", sortOrder=");
        k.append(this.d);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
