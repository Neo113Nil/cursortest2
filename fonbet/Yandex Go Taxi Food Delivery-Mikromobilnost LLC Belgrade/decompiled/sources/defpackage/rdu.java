package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rdu implements sdu {
    public final String a;
    public final aau b;
    public final xo40 c;

    public rdu(String str, aau aauVar, xo40 xo40Var) {
        this.a = str;
        this.b = aauVar;
        this.c = xo40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdu)) {
            return false;
        }
        rdu rduVar = (rdu) obj;
        return jl40.l(this.a, rduVar.a) && jl40.l(this.b, rduVar.b) && jl40.l(this.c, rduVar.c);
    }

    @Override // defpackage.rcx0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MulticlassHeaderUiState(id=" + this.a + ", headerInfoUiState=" + this.b + ", mapUiState=" + this.c + Extension.C_BRAKE;
    }
}
