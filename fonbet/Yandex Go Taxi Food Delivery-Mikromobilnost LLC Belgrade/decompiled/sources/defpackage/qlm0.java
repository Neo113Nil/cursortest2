package defpackage;

import com.yandex.mobile.drive.scan.ScanMode$Passport$PassportPage;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class qlm0 extends slm0 {
    public final ScanMode$Passport$PassportPage a;
    public final boolean b;

    public qlm0(ScanMode$Passport$PassportPage scanMode$Passport$PassportPage, boolean z) {
        this.a = scanMode$Passport$PassportPage;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlm0)) {
            return false;
        }
        qlm0 qlm0Var = (qlm0) obj;
        return this.a == qlm0Var.a && this.b == qlm0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Passport(page=" + this.a + ", preCheckPhoto=" + this.b + Extension.C_BRAKE;
    }
}
