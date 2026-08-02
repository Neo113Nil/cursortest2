package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class uwr {
    public final String a;
    public final String b;
    public final boolean c;

    public uwr(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwr)) {
            return false;
        }
        uwr uwrVar = (uwr) obj;
        return jl40.l(this.a, uwrVar.a) && jl40.l(this.b, uwrVar.b) && this.c == uwrVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("FolderItemUiState(id=", this.a, ", name=", this.b, ", isExcluded="), this.c, Extension.C_BRAKE);
    }
}
