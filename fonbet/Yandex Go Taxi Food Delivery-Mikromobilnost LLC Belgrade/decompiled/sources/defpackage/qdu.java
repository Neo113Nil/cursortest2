package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qdu implements sdu {
    public final String a;
    public final aau b;
    public final y9u c;

    public qdu(String str, aau aauVar, y9u y9uVar) {
        this.a = str;
        this.b = aauVar;
        this.c = y9uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdu)) {
            return false;
        }
        qdu qduVar = (qdu) obj;
        return jl40.l(this.a, qduVar.a) && jl40.l(this.b, qduVar.b) && this.c.equals(qduVar.c);
    }

    @Override // defpackage.rcx0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CarHeaderUiState(id=" + this.a + ", headerInfoUiState=" + this.b + ", carImageUiState=" + this.c + Extension.C_BRAKE;
    }
}
