package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qn40 {
    public final String a;
    public final boolean b;
    public final HapticEffect c;

    public qn40(HapticEffect hapticEffect, String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = hapticEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn40)) {
            return false;
        }
        qn40 qn40Var = (qn40) obj;
        return jl40.l(this.a, qn40Var.a) && this.b == qn40Var.b && this.c == qn40Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = oo31.l("MultiTariffOptionClicked(tariffClass=", this.a, ", isChecked=", ", hapticEffect=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
