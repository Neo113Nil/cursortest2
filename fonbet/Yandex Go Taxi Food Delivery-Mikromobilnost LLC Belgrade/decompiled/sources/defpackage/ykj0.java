package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ykj0 implements xlj0 {
    public final String a;
    public final HapticEffect b;

    public ykj0(String str, HapticEffect hapticEffect) {
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
        if (!(obj instanceof ykj0)) {
            return false;
        }
        ykj0 ykj0Var = (ykj0) obj;
        return jl40.l(this.a, ykj0Var.a) && this.b == ykj0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryCommentCourierClicked(tariffClass=" + this.a + ", hapticEffect=" + this.b + Extension.C_BRAKE;
    }
}
