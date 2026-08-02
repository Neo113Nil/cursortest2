package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class swi0 {
    public final long a;
    public final String b;
    public final String c;

    public swi0(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swi0)) {
            return false;
        }
        swi0 swi0Var = (swi0) obj;
        return this.a == swi0Var.a && jl40.l(this.b, swi0Var.b) && jl40.l(this.c, swi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return unr0.r(x4e.k("RemoveChatFromFolderIncludedParams(organizationId=", this.a, ", folderId=", this.b), ", chatId=", this.c, Extension.C_BRAKE);
    }
}
