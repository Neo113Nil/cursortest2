package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vdu {
    public final String a;
    public final String b;

    public vdu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdu)) {
            return false;
        }
        vdu vduVar = (vdu) obj;
        return this.a.equals(vduVar.a) && this.b.equals(vduVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("HeaderUiState(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
