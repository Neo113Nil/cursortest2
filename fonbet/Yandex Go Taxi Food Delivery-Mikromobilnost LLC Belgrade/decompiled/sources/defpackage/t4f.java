package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class t4f extends u4f {
    public final g720 a;
    public final String b;
    public final long c;
    public final String d = "Messaging.Arguments.Key.FolderDialog.Edit";

    public t4f(g720 g720Var, String str, long j) {
        this.a = g720Var;
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.d;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4f)) {
            return false;
        }
        t4f t4fVar = (t4f) obj;
        return jl40.l(this.a, t4fVar.a) && jl40.l(this.b, t4fVar.b) && this.c == t4fVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditFolder(source=");
        sb.append(this.a);
        sb.append(", folderId=");
        sb.append(this.b);
        sb.append(", organizationId=");
        return oyr.n(this.c, Extension.C_BRAKE, sb);
    }
}
