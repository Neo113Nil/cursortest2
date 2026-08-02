package defpackage;

import com.yandex.mobile.drive.scan.ScanMode$Selfie$SelfieWith;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class rlm0 extends slm0 {
    public final ScanMode$Selfie$SelfieWith a;
    public final boolean b;

    public rlm0(ScanMode$Selfie$SelfieWith scanMode$Selfie$SelfieWith, boolean z) {
        this.a = scanMode$Selfie$SelfieWith;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlm0)) {
            return false;
        }
        rlm0 rlm0Var = (rlm0) obj;
        return this.a == rlm0Var.a && this.b == rlm0Var.b;
    }

    public final int hashCode() {
        ScanMode$Selfie$SelfieWith scanMode$Selfie$SelfieWith = this.a;
        return Boolean.hashCode(this.b) + ((scanMode$Selfie$SelfieWith == null ? 0 : scanMode$Selfie$SelfieWith.hashCode()) * 31);
    }

    public final String toString() {
        return "Selfie(with=" + this.a + ", preCheckPhoto=" + this.b + Extension.C_BRAKE;
    }
}
