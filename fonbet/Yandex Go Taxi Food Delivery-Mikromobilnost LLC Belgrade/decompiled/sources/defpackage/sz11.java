package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sz11 {
    public final String a;
    public final String b;
    public final String c;

    public sz11(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz11)) {
            return false;
        }
        sz11 sz11Var = (sz11) obj;
        return this.a.equals(sz11Var.a) && this.b.equals(sz11Var.b) && this.c.equals(sz11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("UniversalQrScannerCameraPermissionUiState(title=", this.a, ", subtitle=", this.b, ", settingButtonText="), this.c, Extension.C_BRAKE);
    }
}
