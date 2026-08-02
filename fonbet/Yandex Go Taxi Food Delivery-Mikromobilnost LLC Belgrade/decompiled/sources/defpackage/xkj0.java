package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xkj0 implements xlj0 {
    public final HapticEffect a;

    public xkj0(HapticEffect hapticEffect) {
        this.a = hapticEffect;
    }

    @Override // defpackage.xlj0
    public final HapticEffect a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xkj0) && this.a == ((xkj0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CostCenterClicked(hapticEffect=" + this.a + Extension.C_BRAKE;
    }
}
