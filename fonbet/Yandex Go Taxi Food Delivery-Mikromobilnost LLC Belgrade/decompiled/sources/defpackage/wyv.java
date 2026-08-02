package defpackage;

import com.yandex.xplat.payment.sdk.ButtonNameForAnalytics;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class wyv extends czv {
    public final boolean a;
    public final ButtonNameForAnalytics b;

    public wyv(boolean z, ButtonNameForAnalytics buttonNameForAnalytics) {
        this.a = z;
        this.b = buttonNameForAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyv)) {
            return false;
        }
        wyv wyvVar = (wyv) obj;
        return this.a == wyvVar.a && this.b == wyvVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ButtonAvailable(isAvailable=" + this.a + ", input=" + this.b + Extension.C_BRAKE;
    }
}
