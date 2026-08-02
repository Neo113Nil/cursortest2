package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wdu {
    public final qau a;
    public final f9u b;
    public final qcu c;
    public final String d;

    public wdu(qau qauVar, f9u f9uVar, qcu qcuVar, String str) {
        this.a = qauVar;
        this.b = f9uVar;
        this.c = qcuVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdu)) {
            return false;
        }
        wdu wduVar = (wdu) obj;
        return jl40.l(this.a, wduVar.a) && this.b.equals(wduVar.b) && jl40.l(this.c, wduVar.c) && jl40.l(this.d, wduVar.d);
    }

    public final int hashCode() {
        qau qauVar = this.a;
        int b = unr0.b((qauVar == null ? 0 : qauVar.hashCode()) * 31, 31, this.b.a);
        qcu qcuVar = this.c;
        return this.d.hashCode() + ((b + (qcuVar != null ? qcuVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "HeaderUiState(leadUiState=" + this.a + ", bodyUiState=" + this.b + ", trailUiState=" + this.c + ", contentDescription=" + this.d + Extension.C_BRAKE;
    }
}
