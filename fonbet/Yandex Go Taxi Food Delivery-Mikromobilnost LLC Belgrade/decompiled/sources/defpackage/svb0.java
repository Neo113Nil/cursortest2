package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

/* loaded from: classes7.dex */
public final class svb0 {
    public final float a;
    public final PinState b;

    public svb0(float f, PinState pinState) {
        this.a = f;
        this.b = pinState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svb0)) {
            return false;
        }
        svb0 svb0Var = (svb0) obj;
        return Float.compare(this.a, svb0Var.a) == 0 && this.b == svb0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Bound(zoom=" + this.a + ", state=" + this.b + Extension.C_BRAKE;
    }
}
