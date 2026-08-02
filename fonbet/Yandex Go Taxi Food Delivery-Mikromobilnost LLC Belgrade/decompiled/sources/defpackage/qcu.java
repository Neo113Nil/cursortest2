package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class qcu {
    public final String a;
    public final String b;
    public final fdu c;

    public qcu(String str, String str2, fdu fduVar) {
        this.a = str;
        this.b = str2;
        this.c = fduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcu)) {
            return false;
        }
        qcu qcuVar = (qcu) obj;
        return this.a.equals(qcuVar.a) && this.b.equals(qcuVar.b) && jl40.l(this.c, qcuVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        fdu fduVar = this.c;
        return b + (fduVar == null ? 0 : fduVar.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ButtonUiState(title=", this.a, ", contentDescription=", this.b, ", action=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
