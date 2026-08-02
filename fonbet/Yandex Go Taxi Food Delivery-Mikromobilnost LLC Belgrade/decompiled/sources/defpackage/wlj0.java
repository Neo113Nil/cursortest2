package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wlj0 implements xlj0 {
    public final String a;
    public final HapticEffect b;

    public wlj0(String str, HapticEffect hapticEffect) {
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
        if (!(obj instanceof wlj0)) {
            return false;
        }
        wlj0 wlj0Var = (wlj0) obj;
        return jl40.l(this.a, wlj0Var.a) && this.b == wlj0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UsualRequirementClicked(name=" + this.a + ", hapticEffect=" + this.b + Extension.C_BRAKE;
    }
}
