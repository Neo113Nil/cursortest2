package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tkj0 implements xlj0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final HapticEffect e;

    public tkj0(String str, String str2, String str3, String str4, HapticEffect hapticEffect) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hapticEffect;
    }

    @Override // defpackage.xlj0
    public final HapticEffect a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkj0)) {
            return false;
        }
        tkj0 tkj0Var = (tkj0) obj;
        return jl40.l(this.a, tkj0Var.a) && jl40.l(this.b, tkj0Var.b) && jl40.l(this.c, tkj0Var.c) && jl40.l(this.d, tkj0Var.d) && this.e == tkj0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("AltChoiceRedirectClicked(redirectTariffClass=", this.a, ", redirectOptionKey=", this.b, ", tariffClass=");
        g8e.D(v, this.c, ", verticalId=", this.d, ", hapticEffect=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
