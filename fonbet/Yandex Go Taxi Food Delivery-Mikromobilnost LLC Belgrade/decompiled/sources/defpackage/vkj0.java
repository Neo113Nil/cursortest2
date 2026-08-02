package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vkj0 implements xlj0 {
    public final String a;
    public final int b;
    public final HapticEffect c;

    public vkj0(String str, int i, HapticEffect hapticEffect) {
        this.a = str;
        this.b = i;
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
        if (!(obj instanceof vkj0)) {
            return false;
        }
        vkj0 vkj0Var = (vkj0) obj;
        return jl40.l(this.a, vkj0Var.a) && this.b == vkj0Var.b && this.c == vkj0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "CompoundGluedRequirementOptionClicked(requirementName=", this.a, ", optionIndex=", ", hapticEffect=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
