package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qlj0 implements xlj0 {
    public final String a;
    public final HapticEffect b;

    public qlj0(String str, HapticEffect hapticEffect) {
        this.a = str;
        this.b = hapticEffect;
    }

    @Override // defpackage.xlj0
    public final HapticEffect a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlj0)) {
            return false;
        }
        qlj0 qlj0Var = (qlj0) obj;
        return jl40.l(this.a, qlj0Var.a) && this.b == qlj0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffRuleClicked(deeplink=" + this.a + ", hapticEffect=" + this.b + Extension.C_BRAKE;
    }
}
