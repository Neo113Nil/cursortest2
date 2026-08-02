package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qe31 {
    public final String a;
    public final int b;

    public qe31(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe31)) {
            return false;
        }
        qe31 qe31Var = (qe31) obj;
        return jl40.l(this.a, qe31Var.a) && this.b == qe31Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "VerticalIdWithIndexUiState(verticalId=", this.a, ", verticalIndex=", Extension.C_BRAKE);
    }
}
