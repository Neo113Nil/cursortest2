package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class skj0 implements xlj0 {
    public final String a;
    public final String b;
    public final String c;
    public final HapticEffect d;

    public skj0(String str, String str2, String str3, HapticEffect hapticEffect) {
        this.a = str;
        this.b = str2;
        this.c = str3;
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
        if (!(obj instanceof skj0)) {
            return false;
        }
        skj0 skj0Var = (skj0) obj;
        return jl40.l(this.a, skj0Var.a) && jl40.l(this.b, skj0Var.b) && jl40.l(this.c, skj0Var.c) && this.d == skj0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("AltChoiceDeeplinkClicked(deeplink=", this.a, ", tariffClass=", this.b, ", verticalId=");
        v.append(this.c);
        v.append(", hapticEffect=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
