package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zkj0 implements xlj0 {
    public final boolean a;
    public final String b;
    public final HapticEffect c;

    public zkj0(HapticEffect hapticEffect, String str, boolean z) {
        this.a = z;
        this.b = str;
        this.c = hapticEffect;
    }

    @Override // defpackage.xlj0
    public final HapticEffect a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkj0)) {
            return false;
        }
        zkj0 zkj0Var = (zkj0) obj;
        return this.a == zkj0Var.a && jl40.l(this.b, zkj0Var.b) && this.c == zkj0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = ly3.v("DeliveryDoorToDoorClicked(isChecked=", ", tariffClass=", this.b, ", hapticEffect=", this.a);
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
