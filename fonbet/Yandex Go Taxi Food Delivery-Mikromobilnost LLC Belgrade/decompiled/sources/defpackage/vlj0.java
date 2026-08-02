package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vlj0 implements xlj0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final HapticEffect d;

    public vlj0(String str, String str2, boolean z, HapticEffect hapticEffect) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = hapticEffect;
    }

    @Override // defpackage.xlj0
    public final HapticEffect a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlj0)) {
            return false;
        }
        vlj0 vlj0Var = (vlj0) obj;
        return jl40.l(this.a, vlj0Var.a) && jl40.l(this.b, vlj0Var.b) && this.c == vlj0Var.c && this.d == vlj0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("UsualGluedRequirementOptionClicked(requirementName=", this.a, ", optionName=", this.b, ", isChecked=");
        v.append(this.c);
        v.append(", hapticEffect=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
