package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x021 {
    public final String a;
    public final String b;

    public x021(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x021)) {
            return false;
        }
        x021 x021Var = (x021) obj;
        return this.a.equals(x021Var.a) && this.b.equals(x021Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("UniversalQrScannerQrNotSupportedUiState(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
