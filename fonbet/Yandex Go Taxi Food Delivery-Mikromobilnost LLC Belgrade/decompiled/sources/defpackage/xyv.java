package defpackage;

import com.yandex.xplat.payment.sdk.ButtonNameForAnalytics;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class xyv extends czv {
    public final ButtonNameForAnalytics a;

    public xyv(ButtonNameForAnalytics buttonNameForAnalytics) {
        this.a = buttonNameForAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xyv) && this.a == ((xyv) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonPressed(input=" + this.a + Extension.C_BRAKE;
    }
}
